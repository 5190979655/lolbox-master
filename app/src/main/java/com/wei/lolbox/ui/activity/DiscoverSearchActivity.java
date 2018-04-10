package com.wei.lolbox.ui.activity;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.bigkoo.pickerview.OptionsPickerView;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.orhanobut.logger.Logger;
import com.wei.lolbox.Application;
import com.wei.lolbox.R;
import com.wei.lolbox.base.BaseActivity;
import com.wei.lolbox.base.BaseClient;
import com.wei.lolbox.base.BasePresenter;
import com.wei.lolbox.base.BaseView;
import com.wei.lolbox.config.Config;
import com.wei.lolbox.dao.PlayerCacheDao;
import com.wei.lolbox.dao.ServicerDao;
import com.wei.lolbox.model.discover.Player;
import com.wei.lolbox.model.discover.PlayerCache;
import com.wei.lolbox.model.discover.Servicer;
import com.wei.lolbox.presenter.discover.SearchPlayerPresenter;
import com.wei.lolbox.ui.adapter.discover.HeroSearchPlayerCacheAdapter;

import org.greenrobot.greendao.query.QueryBuilder;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.OnClick;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * 作者：赵若位
 * 时间：2017/12/13
 * 邮箱：1070138445@qq.com
 * 功能：搜索召唤师
 */

public class DiscoverSearchActivity extends BaseActivity<SearchPlayerPresenter> implements BaseView
{
    @Bind(R.id.layout_title)
    TextView mLayoutTitle;
    @Bind(R.id.searchName)
    EditText mSearchName;
    @Bind(R.id.searchService)
    TextView mSearchService;
    @Bind(R.id.clearBtn)
    TextView mClearBtn;
    @Bind(R.id.searchUser)
    RecyclerView mSearchUser;

    //服务器缓存
    private ServicerDao mDao;
    private List<Servicer> mServicers;

    private OptionsPickerView mPickerView;
    private List<String> mString;
    private int mPosition;//选中的服务器大区标志，默认为：0


    private HeroSearchPlayerCacheAdapter mAdapter;//本地缓存搜索过的召唤师适配器
    private PlayerCacheDao mCacheDao;//本地数据库

    private Dialog mDialog;//删除本地缓存列表弹窗


    @Override
    protected SearchPlayerPresenter createPresenter()
    {
        return new SearchPlayerPresenter(this);
    }

    @Override
    protected int getResourceId()
    {
        return R.layout.activity_discover_search;
    }


    @Override
    public void initView()
    {
        super.initView();
        mLayoutTitle.setText("多玩饭盒");
        mDao = Application.mSession.getServicerDao();
        mServicers = mDao.loadAll();
        mAdapter = new HeroSearchPlayerCacheAdapter(this);
        mSearchUser.setLayoutManager(new LinearLayoutManager(this));
        mSearchUser.setAdapter(mAdapter);
        mCacheDao = Application.mSession.getPlayerCacheDao();
        mAdapter.update(mCacheDao.loadAll());
        mAdapter.setOnItemClickListener(new HeroSearchPlayerCacheAdapter.OnItemClickListener()
        {
            @Override
            public void click(View mView, PlayerCache mCache, int position)
            {
                mPresenter.loadingData(mCache.getUserName(), mCache.getServiceName());
            }
        });


        mDialog = new Dialog(this, R.style.Dialog);
        View layout = LayoutInflater.from(this).inflate(R.layout.dialog_delete_player, null,false);
        mDialog.setContentView(layout);
        TextView mOK = layout.findViewById(R.id.dialog_ok);
        TextView mCancle = layout.findViewById(R.id.dialog_cancel);
        mOK.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                mCacheDao.deleteAll();
                mAdapter.update(mCacheDao.loadAll());
                mDialog.dismiss();
            }
        });
        mCancle.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                mDialog.dismiss();
            }
        });

        mPickerView = new OptionsPickerView.Builder(this, new OptionsPickerView.OnOptionsSelectListener()
        {
            @Override
            public void onOptionsSelect(int options1, int options2, int options3, View v)
            {
                mSearchService.setText(mString.get(options1));
                mPosition = options1;
            }
        }).setSubmitText("确定")//确定按钮文字
                .setCancelText("取消")//取消按钮文字
                .setTitleText("大区列表")//标题
                .setSubCalSize(18)//确定和取消文字大小
                .setTitleSize(20)//标题文字大小
                .setContentTextSize(26)//滚轮文字大小
                .setOutSideCancelable(false)//点击外部dismiss default true
                .build();//是否显示为对话框样式.build();
    }


    @Override
    public void initData()
    {
        super.initData();
        mStateView.showContent();
        //本地没有服务器列表的缓存，则请求网络
        if (mServicers == null || mServicers.size() == 0)
        {
            getServicers();
        } else
        {
            setPickerView();
        }
    }

    @OnClick({R.id.layout_finish, R.id.searchService, R.id.searchBtn, R.id.clearBtn})
    public void onViewClicked(View view)
    {
        switch (view.getId())
        {
            case R.id.layout_finish:
                finish();
                break;
            case R.id.searchService:
                closeKeyboard();
                if (mServicers == null || mServicers.size() == 0)
                {
                    getServicers();
                    Toast.makeText(this, "召唤师大区获取失败~", Toast.LENGTH_SHORT).show();
                    return;
                }
                mPickerView.show();
                break;
            case R.id.searchBtn:
                if (mSearchName.getText().toString().equals(""))
                {
                    Toast.makeText(this, "请输入召唤师名称~", Toast.LENGTH_SHORT).show();
                    return;
                }
                mPresenter.loadingData(mSearchName.getText().toString(), mServicers.get(mPosition).getAlias());
                break;
            case R.id.clearBtn:
                mDialog.show();
                break;
        }
    }

    /**
     * 获取搜索用户的服务器信息信息
     */
    private void getServicers()
    {
        OkHttpClient mClient = BaseClient.getInstance().getClient();
        Request mRequest = new Request.Builder()
                .url(Config.DISCOVER_SEARCH_USER)
                .build();
        Call mCall = mClient.newCall(mRequest);
        mCall.enqueue(new Callback()
        {
            @Override
            public void onFailure(Call call, IOException e)
            {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException
            {
                String mString = response.body().string();
                try
                {
                    JSONObject mJson = new JSONObject(mString);
                    if (mJson.getInt("code") == 200)
                    {
                        Gson mGson = new Gson();
                        List<Servicer> list = mGson.fromJson(mJson.getJSONArray("data").toString(),
                                new TypeToken<List<Servicer>>()
                                {
                                }.getType());
                        if (list == null || list.size() == 0)
                        {
                            return;
                        }
                        mServicers.clear();
                        mServicers.addAll(list);
                        mDao.insertOrReplaceInTx(list);
                        runOnUiThread(new Runnable()
                        {
                            @Override
                            public void run()
                            {
                                setPickerView();
                            }
                        });
                    }
                } catch (JSONException mE)
                {
                    mE.printStackTrace();
                }
            }
        });
    }


    //绑定三级联动的View和data
    private void setPickerView()
    {
        if (mServicers == null || mServicers.size() == 0 || mPickerView == null)
        {
            return;
        }
        if (mString == null)
        {
            mString = new ArrayList<>();
        }
        mString.clear();
        for (Servicer s : mServicers)
        {
            mString.add(s.getAlias() + " " + s.getServer_name());
        }
        mPickerView.setPicker(mString);
    }

    @Override
    public void showError(String e)
    {
        Toast.makeText(this, "召唤师不存在，请检查~", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showData(Object o)
    {
        Player mPlayer = (Player) o;
        PlayerCache mCache = new PlayerCache((long) (mCacheDao.loadAll().size()-1),mPlayer.getPn(),mPlayer.getGame_zone().getAlias(),mPlayer.getGame_zone().getServer_name());
        if (updateCache(mCache))
        {
            mAdapter.update(mCache);
        }

        Intent it = new Intent(this, DiscoverPlayerActivity.class);
        it.putExtra("DiscoverPlayerActivity", mPlayer);
        startActivity(it);
    }


    //如果软键盘没有关闭 则关闭
    private void closeKeyboard()
    {
        View view = getWindow().peekDecorView();
        if (view != null)
        {
            InputMethodManager mManager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
            mManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }


    //查询成功，更新本地缓存
    private boolean updateCache(PlayerCache mCache)
    {
        QueryBuilder<PlayerCache> mBuilder = mCacheDao.queryBuilder();
        mBuilder.where(PlayerCacheDao.Properties.UserName.eq(mCache.getUserName()));
        mBuilder.where(PlayerCacheDao.Properties.ServiceName.eq(mCache.getServiceName()));
        mBuilder.where(PlayerCacheDao.Properties.ServiceId.eq(mCache.getServiceId()));
        List<PlayerCache> list = mBuilder.build().list();
        if (list == null || list.size() == 0)
        {
            mCacheDao.insertOrReplaceInTx(mCache);
            return true;
        }else
        {
            return false;
        }
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        if (mDialog.isShowing())
        {
            mDialog.dismiss();
        }
    }
}

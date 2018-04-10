package com.wei.lolbox.ui.activity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.TextView;

import com.google.gson.Gson;
import com.wei.lolbox.R;
import com.wei.lolbox.base.BaseActivity;
import com.wei.lolbox.base.BaseClient;
import com.wei.lolbox.base.BasePresenter;
import com.wei.lolbox.config.Config;
import com.wei.lolbox.model.discover.Player;
import com.wei.lolbox.model.discover.PlayerListBean;
import com.wei.lolbox.ui.adapter.ViewPagerAdapter;
import com.wei.lolbox.ui.fragment.DiscoverPlayerFragment;
import com.wei.lolbox.utils.ScreenUtils;

import org.greenrobot.eventbus.EventBus;

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
 * 时间：2017/12/14
 * 邮箱：1070138445@qq.com
 * 功能：召唤师查询详情
 */

public class DiscoverPlayerActivity extends BaseActivity
{

    @Bind(R.id.layout_title)
    TextView mLayoutTitle;
    @Bind(R.id.tv_combat)
    TextView mTvCombat;
    @Bind(R.id.tv_hero)
    TextView mTvHero;
    @Bind(R.id.mains)
    ViewPager mMains;

    private Drawable mDrawable;//标题黄色下划线
    private ViewPagerAdapter mAdapter;
    private List<Fragment> mList;


    @Override

    protected BasePresenter createPresenter()
    {
        return null;
    }

    @Override
    protected int getResourceId()
    {
        return R.layout.activity_discover_player;
    }

    @Override
    public void initView()
    {
        super.initView();
        Intent it = getIntent();
        Player mPlayer = it.getParcelableExtra("DiscoverPlayerActivity");
        mList = new ArrayList<>();
        mList.add(DiscoverPlayerFragment.getIntent(0));
        mList.add(DiscoverPlayerFragment.getIntent(1));
        mLayoutTitle.setText(mPlayer.getPn());
        getPlayerData(mPlayer.getGame_zone().getPinyin(), mPlayer.getUser_id());
        if (mDrawable == null)
        {
            mDrawable = getResources().getDrawable(R.drawable.shape_discover_player_tv_pressed);
            int[] mScreen = ScreenUtils.getScreen(this);
            mDrawable.setBounds(0, 0, mScreen[0] / 2, 4);
        }
        mAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        mMains.setAdapter(mAdapter);
        mMains.addOnPageChangeListener(new ViewPager.OnPageChangeListener()
        {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels)
            {

            }

            @Override
            public void onPageSelected(int position)
            {
                showCheckTextView(position);
            }

            @Override
            public void onPageScrollStateChanged(int state)
            {

            }
        });
        mAdapter.update(mList);
        showCheckTextView(0);
        mStateView.showContent();
    }


    //标题的选择
    private void showCheckTextView(int position)
    {
        mTvCombat.setTextColor(Color.parseColor("#c5c5c5"));
        mTvCombat.setCompoundDrawables(null, null, null, null);
        mTvHero.setTextColor(Color.parseColor("#c5c5c5"));
        mTvHero.setCompoundDrawables(null, null, null, null);
        switch (position)
        {
            case 0:
                mTvCombat.setTextColor(getResources().getColor(R.color.main));
                mTvCombat.setCompoundDrawables(null, null, null, mDrawable);
                break;
            case 1:
                mTvHero.setTextColor(getResources().getColor(R.color.main));
                mTvHero.setCompoundDrawables(null, null, null, mDrawable);
                break;
        }
        mMains.setCurrentItem(position);
    }


    @OnClick({R.id.layout_finish, R.id.tv_combat, R.id.tv_hero})
    public void onViewClicked(View view)
    {
        switch (view.getId())
        {
            case R.id.layout_finish:
                finish();
                break;
            case R.id.tv_combat:
                showCheckTextView(0);
                break;
            case R.id.tv_hero:
                showCheckTextView(1);
                break;
        }
    }

    //查询召唤师最近的对战记录和英雄熟练度
    private void getPlayerData(String service, long userId)
    {
        OkHttpClient mClient = BaseClient.getInstance().getClient();
        Request mRequest = new Request.Builder()
                .url(Config.BASE_DISCOVER + "api/v3/player/" + service + "/" + userId + "/")
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
                Gson mGson = new Gson();
                PlayerListBean mData = mGson.fromJson(mString, PlayerListBean.class);
                EventBus.getDefault().post(mData);
            }
        });
    }

}

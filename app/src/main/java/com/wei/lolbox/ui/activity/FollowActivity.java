package com.wei.lolbox.ui.activity;

import android.graphics.Color;
import android.graphics.drawable.AnimationDrawable;
import android.os.Build;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.github.nukc.stateview.StateView;
import com.orhanobut.logger.Logger;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnLoadmoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;
import com.wei.lolbox.R;
import com.wei.lolbox.base.BaseActivity;
import com.wei.lolbox.base.BaseView;
import com.wei.lolbox.config.Config;
import com.wei.lolbox.model.follow.Follow;
import com.wei.lolbox.model.follow.User;
import com.wei.lolbox.presenter.follow.FollowPresenter;
import com.wei.lolbox.ui.adapter.follow.FollowAdapter;
import com.wei.lolbox.ui.adapter.follow.FollowUserAdapter;
import com.wei.lolbox.utils.StatusBarUtils;

import java.util.List;

import butterknife.Bind;
import butterknife.OnClick;

/**
 * 作者：赵若位
 * 时间：2017/12/6
 * 邮箱：1070138445@qq.com
 * 功能：
 */

public class FollowActivity extends BaseActivity<FollowPresenter> implements BaseView
{
    @Bind(R.id.ed_search)
    EditText mEdSearch;
    @Bind(R.id.mains)
    RecyclerView mMains;
    @Bind(R.id.layout)
    SmartRefreshLayout mLayout;
    @Bind(R.id.loading_top)
    ImageView mLoadingTop;

    private RecyclerView.Adapter mAdapter;

    private int position = 0;
    private static final int POSITION_AUTHOR = 0;//搜索主播列表
    private static final int POSITION_USER = 1;//搜索用户列表


    @Override
    protected FollowPresenter createPresenter()
    {
        return new FollowPresenter(this);
    }

    @Override
    protected int getResourceId()
    {
        return R.layout.activity_follow;
    }

    @Override
    public void initView()
    {
        super.initView();
        setStatusBarColor();
//        initStatView(false);
        mMains.setLayoutManager(new LinearLayoutManager(this));
        mAdapter = new FollowAdapter(this);
        mMains.setAdapter(mAdapter);

        mTopLoading = (AnimationDrawable) mLoadingTop.getDrawable();

        //下拉刷新
        mLayout.setOnRefreshListener(new OnRefreshListener()
        {
            @Override
            public void onRefresh(final RefreshLayout layout)
            {
                if (!mTopLoading.isRunning())
                {
                    mTopLoading.start();
                }
                initData();
                mLayout.getLayout().postDelayed(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        layout.finishRefresh();
                        layout.resetNoMoreData();
                        stopLoading();
                    }
                }, Config.SPLASH_DELAY_TIME);
            }

        });

    }


    @Override
    public void initData()
    {
        super.initData();

        switch (position)
        {
            case POSITION_AUTHOR:
                mPresenter.loadingAuthorData();//加载主播列表
                break;
            case POSITION_USER:
                if (mEdSearch.getText().toString().equals(""))//加载搜索用户列表
                {
                    return;
                }
                mPresenter.loadingUSerData(mEdSearch.getText().toString());
                break;
        }

    }

    @OnClick({R.id.finish, R.id.tv_search})
    public void onViewClicked(View view)
    {
        switch (view.getId())
        {
            case R.id.finish:
                finish();
                break;
            case R.id.tv_search:
                if (mEdSearch.getText().toString().equals(""))
                {
                    return;
                }
                position = POSITION_USER;
                mAdapter = new FollowUserAdapter(this);
                mMains.setAdapter(mAdapter);
                mPresenter.loadingUSerData(mEdSearch.getText().toString());
                break;
        }
    }

    @Override
    public void showError(String e)
    {
        mStateView.showRetry();
    }

    @Override
    public void showData(Object o)
    {
        if (position == POSITION_AUTHOR)
        {
            List<Follow.DataBean.CategoriesBean> list = (List<Follow.DataBean.CategoriesBean>) o;
            ((FollowAdapter) mAdapter).update(list);
            mStateView.showContent();

        } else if (position == POSITION_USER)
        {
            User mData = (User) o;

            if (mData.getArticles() == null&&mData.getMediaAccounts() == null)
            {
                mStateView.showEmpty();
            }else
            {
                ((FollowUserAdapter) mAdapter).update(mData, mEdSearch.getText().toString());
                mStateView.showContent();
            }
        }
    }

    //适配Android状态栏为白色时候，顶部的透明度和图标黑化
    private void setStatusBarColor()
    {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M)//6.0系统
        {
            getWindow().getDecorView().setSystemUiVisibility(
                    View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);

            getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            getWindow().clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            getWindow().setStatusBarColor(StatusBarUtils.calculateStatusColor(Color.WHITE, 0));

        } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP)//5.0系统
        {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            getWindow().clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            getWindow().setStatusBarColor(StatusBarUtils.calculateStatusColor(Color.WHITE, 80));
        } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT)//4.4
        {
            StatusBarUtils.setColor(this, Color.WHITE, 80);
        }
    }

}

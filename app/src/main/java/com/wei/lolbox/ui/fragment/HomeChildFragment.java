package com.wei.lolbox.ui.fragment;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.orhanobut.logger.Logger;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnLoadmoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshLoadmoreListener;
import com.wei.lolbox.R;
import com.wei.lolbox.base.BaseFragment;
import com.wei.lolbox.base.BasePresenter;
import com.wei.lolbox.base.BaseView;
import com.wei.lolbox.config.Config;
import com.wei.lolbox.model.home.HomeTitle;
import com.wei.lolbox.model.home.HomeVideo;
import com.wei.lolbox.model.home.Player;
import com.wei.lolbox.presenter.home.HomeVideoPresenter;
import com.wei.lolbox.presenter.home.PlayerPresenter;
import com.wei.lolbox.ui.adapter.home.HomeVideoAdapter;
import com.wei.lolbox.ui.adapter.home.PlayerAdapter;
import com.wei.lolbox.utils.BaseHandler;
import com.zhy.autolayout.utils.AutoUtils;

import java.util.List;

import butterknife.Bind;

/**
 * 作者：赵若位
 * 时间：2017/12/22
 * 邮箱：1070138445@qq.com
 * 功能：推荐，热门，英雄联盟，搞笑，舞蹈，二次元，游戏，军事，娱乐，王者荣耀，球求大作战，科技，我的世界。。。
 */

public class HomeChildFragment extends BaseFragment<BasePresenter> implements BaseView
{

    @Bind(R.id.mains)
    RecyclerView mMains;
    @Bind(R.id.layout)
    SmartRefreshLayout mLayout;
    @Bind(R.id.loading_top)
    ImageView mLoadingTop;
    @Bind(R.id.loading_bottom)
    ImageView mLoadingBottom;


    private RecyclerView.Adapter mAdapter;


    private HomeTitle mHomeTag;//当前页面的标签

    private int mType;//判断当前刷新的类型：0是下拉 1是上拉加载更多

    //
    public static Fragment newIntent(HomeTitle home)
    {
        HomeChildFragment mFragment = new HomeChildFragment();
        Bundle mBundle = new Bundle();
        mBundle.putParcelable("HomeChildFragment",home);
        mFragment.setArguments(mBundle);
        return mFragment;
    }

    @Override
    protected BasePresenter createPresenter()
    {
        return mPresenter;
    }

    @Override
    protected int getResounrceId()
    {
        return R.layout.fragment_home_child;
    }


    @Override
    public void initView(View rootView)
    {
        super.initView(rootView);
        mHomeTag = getArguments().getParcelable("HomeChildFragment");
        mMains.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        if (mHomeTag.getName().equals("直播"))
        {

            mPresenter = new PlayerPresenter(this);
            mAdapter = new PlayerAdapter(getActivity());

        } else
        {
            mPresenter = new HomeVideoPresenter(this);
            mAdapter = new HomeVideoAdapter(getActivity());

            View layout = View.inflate(getActivity(), R.layout.layout_home_video_header, null);
            TextView mView = layout.findViewById(R.id.search);
            AutoUtils.autoSize(layout);
            ((HomeVideoAdapter) mAdapter).addHeaderView(layout);
            mView.setText(mHomeTag.getName());
        }
        mMains.setAdapter(mAdapter);

        mTopLoading = (AnimationDrawable) mLoadingTop.getDrawable();
        mBottomLoading = (AnimationDrawable) mLoadingBottom.getDrawable();



        mLayout.setOnRefreshLoadmoreListener(new OnRefreshLoadmoreListener()
        {
            @Override
            public void onRefresh(final RefreshLayout layout)
            {
                if (!mTopLoading.isRunning())
                {
                    mTopLoading.start();
                }
                mType = 0;
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

            @Override
            public void onLoadmore(final RefreshLayout layout)
            {
                if (!mBottomLoading.isRunning())
                {
                    mBottomLoading.start();
                }
                mType = 1;
                initData();
                mLayout.getLayout().postDelayed(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        layout.finishLoadmore();
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
        if (mHomeTag.getName().equals("直播"))
        {
            ((PlayerPresenter) mPresenter).loadingData();
        } else
        {
            ((HomeVideoPresenter) mPresenter).loadingData(mHomeTag);
        }
    }

    @Override
    public void showError(String e)
    {
        mStateView.showRetry();
        Logger.e(e);
    }

    @Override
    public void showData(Object o)
    {

        if (mHomeTag.getName().equals("直播"))
        {
            List<Player.PLayerListBean> list = (List<Player.PLayerListBean>) o;
            ((PlayerAdapter) mAdapter).update(list, mType);
        } else
        {
            List<HomeVideo> list = (List<HomeVideo>) o;
            ((HomeVideoAdapter) mAdapter).update(list, mType);
        }
        mStateView.showContent();
    }



}

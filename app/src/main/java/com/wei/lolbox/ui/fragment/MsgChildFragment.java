package com.wei.lolbox.ui.fragment;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

import com.orhanobut.logger.Logger;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnRefreshLoadmoreListener;
import com.wei.lolbox.Application;
import com.wei.lolbox.R;
import com.wei.lolbox.base.BaseFragment;
import com.wei.lolbox.base.BaseView;
import com.wei.lolbox.config.Config;
import com.wei.lolbox.dao.TopHeaderDao;
import com.wei.lolbox.model.msg.CharmingPhoto;
import com.wei.lolbox.model.msg.JiongPhoto;
import com.wei.lolbox.model.msg.Match;
import com.wei.lolbox.model.msg.MsgTitle;
import com.wei.lolbox.model.msg.Top;
import com.wei.lolbox.model.msg.TopHeader;
import com.wei.lolbox.model.msg.Videoes;
import com.wei.lolbox.model.msg.Wallpaper;
import com.wei.lolbox.presenter.msg.MsgChildPresenter;
import com.wei.lolbox.ui.adapter.msg.CharmingAdapter;
import com.wei.lolbox.ui.adapter.msg.JiongAdapter;
import com.wei.lolbox.ui.adapter.msg.MatchAdapter;
import com.wei.lolbox.ui.adapter.msg.TopAdapter;
import com.wei.lolbox.ui.adapter.msg.VideoAdapter;
import com.wei.lolbox.ui.adapter.msg.WallpaperAdapter;
import com.wei.lolbox.utils.BannerImageLoader;
import com.youth.banner.Banner;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;

/**
 * 作者：赵若位
 * 时间：2017/11/30
 * 邮箱：1070138445@qq.com
 * 功能：
 */

public class MsgChildFragment extends BaseFragment<MsgChildPresenter> implements BaseView
{

    @Bind(R.id.mains)
    RecyclerView mMains;
    @Bind(R.id.layout)
    SmartRefreshLayout mLayout;
    @Bind(R.id.loading_top)
    ImageView mLoadingTop;
    @Bind(R.id.loading_bottom)
    ImageView mLoadingBottom;

    private MsgTitle mBean = null;
    private RecyclerView.Adapter mAdapter = null;
    private Banner mBanner;


    private static int mType;//上拉或者下拉的标志
    private int p = 1;//当前数据的页面数目


    //外部传值进入Fragment
    public static Fragment newIntent(MsgTitle bean)
    {
        MsgChildFragment mFragment = new MsgChildFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("title", bean);
        mFragment.setArguments(bundle);
        return mFragment;
    }


    @Override
    protected MsgChildPresenter createPresenter()
    {
        return new MsgChildPresenter(this);
    }

    @Override
    protected int getResounrceId()
    {
        return R.layout.fragment_msg_child;
    }


    @Override
    public void initView(View rootView)
    {
        super.initView(rootView);
        if (getArguments() != null)
        {
            mBean = getArguments().getParcelable("title");
            switch (mBean.getName())
            {
                case "头条":
                    mMains.setLayoutManager(new LinearLayoutManager(getActivity()));
                    mAdapter = new TopAdapter(getActivity());
                    if (mBanner == null)
                    {
                        View layout = View.inflate(getActivity(), R.layout.layout_msg_top_banner, null);
                        mBanner = layout.findViewById(R.id.layout_banner);
                        mBanner.setImageLoader(new BannerImageLoader());
                        ((TopAdapter)mAdapter).setHeader(layout);
                    }
                    break;
                case "视频":
                    mMains.setLayoutManager(new LinearLayoutManager(getActivity()));
                    mAdapter = new VideoAdapter(getActivity());
                    break;
                case "赛事":
                    mMains.setLayoutManager(new LinearLayoutManager(getActivity()));
                    mAdapter = new MatchAdapter(getActivity());
                    break;
                case "靓照":
                    mMains.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
                    mAdapter = new CharmingAdapter(getActivity());
                    break;
                case "囧图":
                    mMains.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
                    mAdapter = new JiongAdapter(getActivity());
                    break;
                case "壁纸":
                    mMains.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
                    mAdapter = new WallpaperAdapter(getActivity());
                    break;
                default:
                    break;
            }
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
        if (mBean != null)
        {
            switch (mType)
            {
                case 0://下拉刷新
                    mPresenter.loadingData(mBean, 1);
                    break;
                case 1://上啦加载更多:
                    p++;
                    mPresenter.loadingData(mBean, p);
                    break;
            }
        }
    }

    @Override
    public void onStart()
    {
        super.onStart();
        if (mBanner != null)
        {
            mBanner.startAutoPlay();
        }
    }

    @Override
    public void onStop()
    {
        super.onStop();
        if (mBanner != null)
        {
            mBanner.stopAutoPlay();
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
        switch (mBean.getName())
        {
            case "头条":
                List<Top> mTopList = (List<Top>) o;
                ((TopAdapter) mAdapter).update(mTopList, mType);
                List<TopHeader> list = Application.mSession.getTopHeaderDao().loadAll();
                if (list != null && list.size() != 0)
                {
                    mBanner.setImages(list);
                    mBanner.start();
                }
                break;
            case "视频":
                List<Videoes> mVideoesList = (List<Videoes>) o;
                ((VideoAdapter) mAdapter).update(mVideoesList, mType);
                break;
            case "赛事":
                List<Match> mMatchList = (List<Match>) o;
                ((MatchAdapter) mAdapter).update(mMatchList, mType);
                break;
            case "靓照":
                List<CharmingPhoto> mCharmingPhotoList = (List<CharmingPhoto>) o;
                ((CharmingAdapter) mAdapter).update(mCharmingPhotoList, mType);
                break;
            case "囧图":
                List<JiongPhoto> mJiongPhotoList = (List<JiongPhoto>) o;
                ((JiongAdapter) mAdapter).update(mJiongPhotoList, mType);
                break;
            case "壁纸":
                List<Wallpaper> mWallpaperList = (List<Wallpaper>) o;
                ((WallpaperAdapter) mAdapter).update(mWallpaperList, mType);
                break;
        }
        mStateView.showContent();
    }
}

package com.wei.lolbox.ui.activity;

import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.github.nukc.stateview.StateView;
import com.orhanobut.logger.Logger;
import com.shuyu.gsyvideoplayer.listener.StandardVideoAllCallBack;
import com.shuyu.gsyvideoplayer.video.base.GSYVideoPlayer;
import com.wei.lolbox.R;
import com.wei.lolbox.base.BaseActivity;
import com.wei.lolbox.base.BaseView;
import com.wei.lolbox.model.home.HomeVideo;
import com.wei.lolbox.presenter.home.HomeListVideoPresenter;
import com.wei.lolbox.ui.adapter.home.HomeListVideoAdapter;
import com.wei.lolbox.utils.ListVideoPlayerUtils;
import com.wei.lolbox.utils.StatusBarUtils;
import com.zhy.autolayout.AutoFrameLayout;

import java.util.List;

import butterknife.Bind;

/**
 * 作者：赵若位
 * 时间：2018/1/9
 * 邮箱：1070138445@qq.com
 * 功能：视频列表
 */

public class HomeListVideoActivity extends BaseActivity<HomeListVideoPresenter> implements BaseView
{
    @Bind(R.id.mains)
    RecyclerView mMains;
    @Bind(R.id.fullView)
    AutoFrameLayout mFullView;

    private HomeListVideoAdapter mAdapter;//适配器
    private ListVideoPlayerUtils mUtils;
    private HomeVideo mData;//列表第一组数据

    private boolean mFull = false;


    @Override
    protected HomeListVideoPresenter createPresenter()
    {
        return new HomeListVideoPresenter(this);
    }

    @Override
    protected int getResourceId()
    {
        return R.layout.activity_home_list_video;
    }


    @Override
    public void initView()
    {
        super.initView();
        StatusBarUtils.setColorNoTranslucent(this,getResources().getColor(R.color.black));
        mData = getIntent().getParcelableExtra("HomeListVideoActivity");
        final LinearLayoutManager mManager = new LinearLayoutManager(this);
        mMains.setLayoutManager(mManager);
        mAdapter = new HomeListVideoAdapter(this);
        mMains.setAdapter(mAdapter);
        mAdapter.setManager(mManager);

        mUtils = new ListVideoPlayerUtils(this);
        mUtils.setFullViewContainer(mFullView);
        mUtils.setHideStatusBar(true);
        mUtils.setAutoRotation(true);
        mAdapter.setUtil(mUtils);

        mAdapter.update(mData);//加载默认的第一条数据

        //监听视频播放进度
        mUtils.getGsyVideoPlayer().setStandardVideoAllCallBack(new StandardVideoAllCallBack()
        {
            @Override
            public void onPrepared(String url, Object... objects)
            {
            }

            @Override
            public void onClickStartIcon(String url, Object... objects)
            {

            }

            @Override
            public void onClickStartError(String url, Object... objects)
            {

            }

            @Override
            public void onClickStop(String url, Object... objects)
            {

            }

            @Override
            public void onClickStopFullscreen(String url, Object... objects)
            {

            }

            @Override
            public void onClickResume(String url, Object... objects)
            {

            }

            @Override
            public void onClickResumeFullscreen(String url, Object... objects)
            {

            }

            @Override
            public void onClickSeekbar(String url, Object... objects)
            {

            }

            @Override
            public void onClickSeekbarFullscreen(String url, Object... objects)
            {

            }

            @Override
            public void onAutoComplete(String url, Object... objects)
            {
                int mPosition = mUtils.getPlayPosition();//当前视频播放的位置
                if (mPosition == mAdapter.getItemCount())
                {
                    return;
                }
                mPosition++;
                mAdapter.moveThePosition(mPosition, true);
            }

            @Override
            public void onEnterFullscreen(String url, Object... objects)
            {

            }

            @Override
            public void onQuitFullscreen(String url, Object... objects)
            {

            }

            @Override
            public void onQuitSmallWidget(String url, Object... objects)
            {

            }

            @Override
            public void onEnterSmallWidget(String url, Object... objects)
            {

            }

            @Override
            public void onTouchScreenSeekVolume(String url, Object... objects)
            {

            }

            @Override
            public void onTouchScreenSeekPosition(String url, Object... objects)
            {

            }

            @Override
            public void onTouchScreenSeekLight(String url, Object... objects)
            {

            }

            @Override
            public void onPlayError(String url, Object... objects)
            {

            }

            @Override
            public void onClickStartThumb(String url, Object... objects)
            {

            }

            @Override
            public void onClickBlank(String url, Object... objects)
            {

            }

            @Override
            public void onClickBlankFullscreen(String url, Object... objects)
            {

            }
        });

        //滑动视频列表自动播放
        mMains.addOnScrollListener(new RecyclerView.OnScrollListener()
        {
            int first, last;

            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState)
            {
                super.onScrollStateChanged(recyclerView, newState);
                switch (newState)
                {
                    case RecyclerView.SCROLL_STATE_IDLE://静止的时候开始加载
                        if (mManager.findViewByPosition(first) != null &&
                                mManager.findViewByPosition(first).findViewById(R.id.item_player) != null)
                        {
                            AutoFrameLayout mItemPlayer = mManager.findViewByPosition(first).findViewById(R.id.item_player);
                            int[] location = new int[2];
                            mItemPlayer.getLocationOnScreen(location);
                            int mHeight = mItemPlayer.getHeight();
                            if (location[1] >= -mHeight / 2)//播放第一段视频
                            {
                                mAdapter.moveThePosition(first);
                            } else
                            {
                                mAdapter.moveThePosition(first + 1);
                            }
                        }
                        break;
                }
            }

            //自动播放
            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy)
            {
                super.onScrolled(recyclerView, dx, dy);
                first = mManager.findFirstVisibleItemPosition();
                last = mManager.findLastVisibleItemPosition();
            }
        });

    }

    @Override
    public void initData()
    {
        super.initData();
        mPresenter.loadingData(mData.getId());
    }

    @Override
    public void showError(String e)
    {
        mStateView.showRetry();
    }

    @Override
    public void showData(Object o)
    {
        List<HomeVideo> mVideo = (List<HomeVideo>) o;
        mAdapter.update(mVideo);
        mStateView.showContent();
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        if (mUtils != null)
        {
            mUtils.getGsyVideoPlayer().getCurrentPlayer().onVideoPause();
        }
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        if (mUtils != null)
        {
            mUtils.getGsyVideoPlayer().getCurrentPlayer().onVideoResume();
        }
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig)
    {
        super.onConfigurationChanged(newConfig);
        //如果旋转了就全屏
        if (newConfig.orientation != ActivityInfo.SCREEN_ORIENTATION_USER)
        {
            mFull = false;
        } else
        {
            mFull = true;
        }

    }

    @Override
    public void onBackPressed()
    {
        //先返回正常状态
        if (mFull)
        {
            mUtils.resolveFullBtn();
            return;
        }
        super.onBackPressed();
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        mUtils.releaseVideoPlayer();
        GSYVideoPlayer.releaseAllVideos();
    }

}

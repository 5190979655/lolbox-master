package com.wei.lolbox.utils;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;

import com.shuyu.gsyvideoplayer.utils.GSYVideoType;
import com.shuyu.gsyvideoplayer.video.StandardGSYVideoPlayer;
import com.shuyu.gsyvideoplayer.video.base.GSYBaseVideoPlayer;
import com.shuyu.gsyvideoplayer.video.base.GSYVideoView;
import com.wei.lolbox.R;
import com.zhy.autolayout.AutoRelativeLayout;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 作者：赵若位
 * 时间：2018/1/9
 * 邮箱：1070138445@qq.com
 * 功能：视频播放器
 */

public class VideoPlayer extends StandardGSYVideoPlayer
{
    @Bind(R.id.surface_container)
    AutoRelativeLayout mSurfaceContainer;
    @Bind(R.id.thumb)//封面
            RelativeLayout mThumb;
    @Bind(R.id.bottom_start)//底部开始按钮
            ImageView mBottomStart;
    @Bind(R.id.current)//播放进度
            TextView mCurrent;
    @Bind(R.id.fullscreen)//全屏按钮
            ImageView mFullscreen;
    @Bind(R.id.total)//总时间
            TextView mTotal;
    @Bind(R.id.progress)//播放进度条
            SeekBar mProgress;
    @Bind(R.id.layout_bottom)//底部功能区域
            AutoRelativeLayout mLayoutBottom;

    private String mUrls;//播放视频地址

    private int mType = 0;

    public VideoPlayer(Context context, Boolean fullFlag)
    {
        super(context, fullFlag);
    }

    public VideoPlayer(Context context)
    {
        super(context);
    }

    public VideoPlayer(Context context, AttributeSet attrs)
    {
        super(context, attrs);
    }


    @Override
    public int getLayoutId()
    {
        return R.layout.layout_video_player;
    }

    @Override
    protected void init(Context context)
    {
        super.init(context);
        ButterKnife.bind(this);
    }


    @Override
    public void onAutoCompletion()
    {
        super.onAutoCompletion();
        setBottomStartType();
    }

    @Override
    public void onCompletion()
    {
        super.onCompletion();
        setBottomStartType();
    }

    @Override
    public GSYBaseVideoPlayer startWindowFullscreen(Context context, boolean actionBar, boolean statusBar)
    {
        VideoPlayer mPlayer = (VideoPlayer) super.startWindowFullscreen(context, actionBar, statusBar);
        mPlayer.mType = 3;
        mPlayer.resolveTypeUI();
        return mPlayer;
    }

    @Override
    public void onError(int what, int extra)
    {
        super.onError(what, extra);
        setBottomStartType();
    }

    @Override
    public void onVideoPause()
    {
        super.onVideoPause();
        setBottomStartType();
    }

    @Override
    public void onVideoResume()
    {
        super.onVideoResume();
        setBottomStartType();
    }

    @Override
    public void onPrepared()
    {
        super.onPrepared();
        setBottomStartType();
    }

    public void setUrls(String url)
    {
        if (url == null || url.equals(""))
        {
            return;
        }
        mUrls = url;
        setUp(url, false, null);
    }


    /**
     * 设置底部的播放按钮
     */
    protected void setBottomStartType()
    {
        if (getCurrentState() == GSYVideoView.CURRENT_STATE_PAUSE
                || getCurrentState() == GSYVideoView.CURRENT_STATE_AUTO_COMPLETE
                || getCurrentState() == GSYVideoView.CURRENT_STATE_ERROR)
        {
            mBottomStart.setBackgroundResource(R.drawable.vhuya_play_icon);
        } else
        {
            mBottomStart.setBackgroundResource(R.drawable.vhuya_pause_icon);
        }
    }

    @Override
    protected void clickStartIcon()
    {
        super.clickStartIcon();
        setBottomStartType();
    }


    /**
     * 显示比例
     * 注意，GSYVideoType.setShowType是全局静态生效，除非重启APP。
     */
    private void resolveTypeUI()
    {
        if (!mHadPlay)
        {
            return;
        }
        if (mType == 1)
        {
            GSYVideoType.setShowType(GSYVideoType.SCREEN_TYPE_16_9);
        } else if (mType == 2)
        {
            GSYVideoType.setShowType(GSYVideoType.SCREEN_TYPE_4_3);
        } else if (mType == 3)
        {
            GSYVideoType.setShowType(GSYVideoType.SCREEN_TYPE_FULL);
        } else if (mType == 4)
        {
            GSYVideoType.setShowType(GSYVideoType.SCREEN_MATCH_FULL);
        } else if (mType == 0)
        {
            GSYVideoType.setShowType(GSYVideoType.SCREEN_TYPE_DEFAULT);
        }
        changeTextureViewShowType();
        if (mTextureView != null)
            mTextureView.requestLayout();
    }

    @OnClick({R.id.bottom_start})
    public void onViewClicked(View view)
    {
        switch (view.getId())
        {
            case R.id.bottom_start:
                if (mUrls == null || mUrls.equals(""))
                {
                    return;
                }
                clickStartIcon();
                setBottomStartType();
                break;

        }
    }

    public ImageView getBottomStart()
    {
        return mBottomStart;
    }
}

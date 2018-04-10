package com.wei.lolbox.base;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.github.nukc.stateview.StateView;
import com.wei.lolbox.R;
import com.wei.lolbox.ui.activity.MainActivity;
import com.wei.lolbox.utils.StatusBarUtils;
import com.zhy.autolayout.AutoLayoutActivity;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import butterknife.ButterKnife;

/**
 * 作者：赵若位
 * 时间：2017/11/28
 * 邮箱：1070138445@qq.com
 * 功能：
 */

public abstract class BaseActivity<T extends BasePresenter> extends AutoLayoutActivity
{

    protected T mPresenter;
    private static long mPreTime;
    private static Activity mCurrentActivity;// 对所有activity进行管理
    public static List<Activity> mActivities = new LinkedList<Activity>();
    protected Bundle savedInstanceState;
    protected StateView mStateView;
    protected AnimationDrawable mTopLoading;//下拉刷新帧动画容器
    protected AnimationDrawable mBottomLoading;//上拉加载更多帧动画布局

    protected abstract T createPresenter();

    protected abstract int getResourceId();

    @Override
    public final void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        this.savedInstanceState = savedInstanceState;
        //初始化的时候将其添加到集合中
        synchronized (mActivities)
        {
            mActivities.add(this);
        }
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);//设置Activity不允许横屏
        mPresenter = createPresenter();
        setContentView(getResourceId());
        StatusBarUtils.setColorNoTranslucent(this, getResources().getColor(R.color.main));
        ButterKnife.bind(this);
        initStatView(true);
        mStateView.showLoading();
        initView();
        initData();
    }

    //初始化加载页面
    public void initStatView(boolean isHide)
    {
        mStateView = StateView.inject(this, isHide);
        mStateView.setLoadingResource(R.layout.layout_loading);
        mStateView.setEmptyResource(R.layout.layout_empty);
        mStateView.setRetryResource(R.layout.layout_error);
        mStateView.setOnInflateListener(new StateView.OnInflateListener()
        {
            @Override
            public void onInflate(int viewType, View view)
            {
                switch (viewType)
                {
                    case StateView.LOADING://加载动画
                        ViewGroup loading = (ViewGroup) view;
                        ImageView mLoading = loading.findViewById(R.id.loading);
                        AnimationDrawable mDrawable = (AnimationDrawable) mLoading.getDrawable();
                        mDrawable.start();
                        break;
                    case StateView.RETRY:
                        ViewGroup retry = (ViewGroup) view;
                        TextView mRetry = retry.findViewById(R.id.tv);
                        SpannableString string = new SpannableString("内容加载失败，点击重新加载");
                        ForegroundColorSpan mColorLeft = new ForegroundColorSpan(Color.parseColor("#9c9c9c"));
                        ForegroundColorSpan mColorRight = new ForegroundColorSpan(Color.parseColor("#fbad3e"));
                        string.setSpan(mColorLeft, 0, 6, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
                        string.setSpan(mColorRight, 7, string.length(), Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
                        mRetry.setText(string);
                        mRetry.setOnClickListener(new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                initData();
                            }
                        });
                }
            }
        });

    }


    public void initView()
    {
    }

    public void initData()
    {
    }


    @Override
    protected void onResume()
    {
        super.onResume();
        mCurrentActivity = this;
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        mCurrentActivity = null;
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();

        //销毁的时候从集合中移除
        synchronized (mActivities)
        {
            mActivities.remove(this);
        }

        if (mPresenter != null)
        {
            mPresenter.unSubscrible();
        }

        stopLoading();
    }


    /**
     * 退出应用的方法
     */
    public static void exitApp()
    {
        ListIterator<Activity> iterator = mActivities.listIterator();
        while (iterator.hasNext())
        {
            Activity next = iterator.next();
            next.finish();
        }
    }

    public static Activity getCurrentActivity()
    {
        return mCurrentActivity;
    }

    /**
     * 统一退出控制
     */
    @Override
    public void onBackPressed()
    {
        if (mCurrentActivity instanceof MainActivity)
        {
            //如果是主页面
            if (System.currentTimeMillis() - mPreTime > 2000)
            {
                Toast.makeText(this, "再次按返回键关闭", Toast.LENGTH_SHORT).show();
                mPreTime = System.currentTimeMillis();
                return;
            }
        }
        super.onBackPressed();// finish()
    }

    //停止加载动画
    protected void stopLoading()
    {
        if (mTopLoading != null && mTopLoading.isRunning())
        {
            mTopLoading.stop();
        }
        if (mBottomLoading != null && mBottomLoading.isRunning())
        {
            mBottomLoading.stop();
        }
    }

}

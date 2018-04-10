package com.wei.lolbox.base;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.github.nukc.stateview.StateView;
import com.wei.lolbox.R;

import butterknife.ButterKnife;

/**
 * 作者：赵若位
 * 时间：2017/11/28
 * 邮箱：1070138445@qq.com
 * 功能：
 */

public abstract class BaseFragment<T extends BasePresenter> extends Fragment
{
    protected T mPresenter;
    private View rootView;
    protected StateView mStateView;//用于显示加载中、网络异常，空布局、内容布局
    protected Activity mActivity;
    protected boolean isUIVisible;//UI是否可被用户看见
    protected boolean isUICreated;//UI是否已被初始化完成
    protected AnimationDrawable mTopLoading;//下拉刷新帧动画容器
    protected AnimationDrawable mBottomLoading;//上拉加载更多帧动画布局


    protected abstract T createPresenter();

    protected abstract int getResounrceId();


    @Override
    public void setUserVisibleHint(boolean isVisibleToUser)
    {
        super.setUserVisibleHint(isVisibleToUser);
        if (isVisibleToUser)
        {
            isUIVisible = true;
            loadingData();
        } else
        {
            isUIVisible = false;
        }
    }

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        mPresenter = createPresenter();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState)
    {
        super.onViewCreated(view, savedInstanceState);
        isUICreated = true;
        loadingData();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        rootView = inflater.inflate(getResounrceId(), container, false);
        ButterKnife.bind(this, rootView);
        initStatView();
        mStateView.showLoading();
        initView(rootView);
        return rootView;
    }

    private void loadingData()
    {
        if (isUIVisible && isUICreated)
        {
            initData();
            isUIVisible = false;
            isUICreated = false;
        }
    }

    /**
     * StateView的根布局，默认是整个界面，如果需要变换可以重写此方法
     */
    public View getStateViewRoot()
    {
        return rootView;
    }

    @Override
    public void onAttach(Context context)
    {
        super.onAttach(context);
        mActivity = (Activity) context;
    }

    /**
     * 初始化一些view
     *
     * @param rootView
     */
    public void initView(View rootView)
    {
    }

    /**
     * 初始化数据
     */
    public void initData()
    {

    }

    private void initStatView()
    {
        mStateView = StateView.inject(getStateViewRoot());
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
                                mStateView.showLoading();
                                initData();
                            }
                        });
                }
            }
        });

    }


    @Override
    public void onDestroyView()
    {
        super.onDestroyView();
        isUICreated = false;
        isUIVisible = false;
        ButterKnife.unbind(this);
    }

    @Override
    public void onDestroy()
    {
        super.onDestroy();
        if (mPresenter != null)
        {
            mPresenter.unSubscrible();
            mPresenter = null;
        }
        rootView = null;
        stopLoading();
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

package com.wei.lolbox.ui.fragment;

import android.content.Intent;
import android.view.View;

import com.wei.lolbox.R;
import com.wei.lolbox.base.BaseFragment;
import com.wei.lolbox.base.BasePresenter;
import com.wei.lolbox.ui.activity.FollowActivity;

import butterknife.OnClick;

/**
 * 作者：赵若位
 * 时间：2017/11/29
 * 邮箱：1070138445@qq.com
 * 功能：
 */

public class FollowFragment extends BaseFragment
{
    @Override
    protected BasePresenter createPresenter()
    {
        return null;
    }

    @Override
    protected int getResounrceId()
    {
        return R.layout.fragment_follow;
    }

    @Override
    public void initView(View rootView)
    {
        super.initView(rootView);
        mStateView.showContent();
    }

    @OnClick({R.id.post, R.id.follow, R.id.follow_add})
    public void onViewClicked(View view)
    {
        switch (view.getId())
        {
            case R.id.post:
                break;
            case R.id.follow:
                startActivity();
                break;
            case R.id.follow_add:
                startActivity();
                break;
        }
    }


    /**
     * 跳转到主播详细列表
     */
    private void startActivity()
    {
        Intent it = new Intent(getActivity(), FollowActivity.class);
        startActivity(it);
    }
}

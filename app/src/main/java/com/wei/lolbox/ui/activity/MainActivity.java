package com.wei.lolbox.ui.activity;

import android.graphics.Color;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.wei.lolbox.R;
import com.wei.lolbox.base.BaseActivity;
import com.wei.lolbox.base.BasePresenter;
import com.wei.lolbox.ui.fragment.DiscoverFragment;
import com.wei.lolbox.ui.fragment.FollowFragment;
import com.wei.lolbox.ui.fragment.HomeFragment;
import com.wei.lolbox.ui.fragment.MsgFragment;
import com.wei.lolbox.utils.StatusBarUtils;

import butterknife.Bind;
import butterknife.OnClick;

/**
 * 作者：赵若位
 * 时间：2017/11/28
 * 邮箱：1070138445@qq.com
 * 功能：
 */

public class MainActivity extends BaseActivity
{
    @Bind(R.id.drawer)
    DrawerLayout mDrawer;
    @Bind(R.id.header)
    ImageView mHeader;
    @Bind(R.id.icon_home)
    ImageView mIconHome;
    @Bind(R.id.tv_home)
    TextView mTvHome;
    @Bind(R.id.icon_msg)
    ImageView mIconMsg;
    @Bind(R.id.tv_msg)
    TextView mTvMsg;
    @Bind(R.id.icon_follow)
    ImageView mIconFollow;
    @Bind(R.id.tv_follow)
    TextView mTvFollow;
    @Bind(R.id.icon_discover)
    ImageView mIconDiscover;
    @Bind(R.id.tv_discover)
    TextView mTvDiscover;
    @Bind(R.id.left_header)
    ImageView mLeftHeader;
    @Bind(R.id.left_nickname)
    TextView mLeftNickname;
    @Bind(R.id.left_setting)
    ImageView mLeftSetting;
    @Bind(R.id.left_mall)
    TextView mLeftMall;


    private FragmentManager mManager;
    private HomeFragment mHomeFragment;
    private MsgFragment mMsgFragment;
    private FollowFragment mFollowFragment;
    private DiscoverFragment mDiscoverFragment;

    @Override
    protected BasePresenter createPresenter()
    {
        return null;
    }

    @Override
    protected int getResourceId()
    {
        return R.layout.activity_main;
    }


    @Override
    public void initView()
    {
        super.initView();
        StatusBarUtils.setColorForDrawerLayout(this,
                (DrawerLayout) findViewById(R.id.drawer), getResources().getColor(R.color.main), 0);


        if (mManager == null)
        {
            mManager = getSupportFragmentManager();
        }
        showFragment(0);
        mStateView.showContent();
    }


    //根据Position加载Fragment
    private void showFragment(int position)
    {
        showIcon(position);
        FragmentTransaction ft = mManager.beginTransaction();
        hideFragment(ft);
        switch (position)
        {
            case 0:
                if (mHomeFragment != null)
                {
                    ft.show(mHomeFragment);
                } else
                {
                    mHomeFragment = new HomeFragment();
                    ft.add(R.id.fragments, mHomeFragment);
                }
                break;
            case 1:
                if (mMsgFragment != null)
                {
                    ft.show(mMsgFragment);
                } else
                {
                    mMsgFragment = new MsgFragment();
                    ft.add(R.id.fragments, mMsgFragment);
                }
                break;
            case 2:
                if (mFollowFragment != null)
                {
                    ft.show(mFollowFragment);
                } else
                {
                    mFollowFragment = new FollowFragment();
                    ft.add(R.id.fragments, mFollowFragment);
                }
                break;
            case 3:
                if (mDiscoverFragment != null)
                {
                    ft.show(mDiscoverFragment);
                } else
                {
                    mDiscoverFragment = new DiscoverFragment();
                    ft.add(R.id.fragments, mDiscoverFragment);
                }
                break;
        }
        ft.commit();
    }

    //隐藏不需要显示的Fragment
    private void hideFragment(FragmentTransaction ft)
    {
        if (mHomeFragment != null)
        {
            ft.hide(mHomeFragment);
        }

        if (mMsgFragment != null)
        {
            ft.hide(mMsgFragment);
        }

        if (mFollowFragment != null)
        {
            ft.hide(mFollowFragment);
        }

        if (mDiscoverFragment != null)
        {
            ft.hide(mDiscoverFragment);
        }
    }

    //根据点击Icon变换背景颜色
    private void showIcon(int position)
    {
        mIconHome.setBackgroundResource(R.drawable.main_tab_video_normal);
        mIconMsg.setBackgroundResource(R.drawable.main_tab_news_normal);
        mIconFollow.setBackgroundResource(R.drawable.main_tab_follow_normal);
        mIconDiscover.setBackgroundResource(R.drawable.main_tab_discover_normal);
        mTvHome.setTextColor(Color.parseColor("#424242"));
        mTvDiscover.setTextColor(Color.parseColor("#424242"));
        mTvMsg.setTextColor(Color.parseColor("#424242"));
        mTvFollow.setTextColor(Color.parseColor("#424242"));

        switch (position)
        {
            case 0:
                mIconHome.setBackgroundResource(R.drawable.main_tab_video_active);
                mTvHome.setTextColor(getResources().getColor(R.color.main));
                break;
            case 1:
                mIconMsg.setBackgroundResource(R.drawable.main_tab_news_active);
                mTvMsg.setTextColor(getResources().getColor(R.color.main));
                break;
            case 2:
                mIconFollow.setBackgroundResource(R.drawable.main_tab_follow_active);
                mTvFollow.setTextColor(getResources().getColor(R.color.main));
                break;
            case 3:
                mIconDiscover.setBackgroundResource(R.drawable.main_tab_discover_active);
                mTvDiscover.setTextColor(getResources().getColor(R.color.main));
                break;
        }
    }


    @OnClick({R.id.header, R.id.home, R.id.msg, R.id.follow, R.id.discover, R.id.left_header, R.id.left_nickname, R.id.left_setting, R.id.left_mall, R.id.left_friend, R.id.left_group, R.id.left_fav, R.id.left_download})
    public void onViewClicked(View view)
    {
        switch (view.getId())
        {
            case R.id.header:
                mDrawer.openDrawer(Gravity.LEFT);
                break;
            case R.id.home:
                showFragment(0);
                break;
            case R.id.msg:
                showFragment(1);
                break;
            case R.id.follow:
                showFragment(2);
                break;
            case R.id.discover:
                showFragment(3);
                break;
            case R.id.left_header:
                break;
            case R.id.left_nickname:
                break;
            case R.id.left_setting:
                break;
            case R.id.left_mall:
                break;
            case R.id.left_friend:
                break;
            case R.id.left_group:
                break;
            case R.id.left_fav:
                break;
            case R.id.left_download:
                break;
        }


    }
}

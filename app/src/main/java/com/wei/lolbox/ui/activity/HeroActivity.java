package com.wei.lolbox.ui.activity;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.TextView;

import com.wei.lolbox.R;
import com.wei.lolbox.base.BaseActivity;
import com.wei.lolbox.base.BasePresenter;
import com.wei.lolbox.ui.fragment.HeroAllFragment;
import com.wei.lolbox.ui.fragment.HeroFreeFragment;

import butterknife.Bind;
import butterknife.OnClick;

/**
 * 作者：赵若位
 * 时间：2017/12/9
 * 邮箱：1070138445@qq.com
 * 功能：发现-英雄界面
 * 1.周免英雄
 * 2.全部英雄
 */

public class HeroActivity extends BaseActivity
{
    @Bind(R.id.layout_title)
    TextView mLayoutTitle;
    @Bind(R.id.tv_free)
    TextView mTvFree;
    @Bind(R.id.tv_free_line)
    TextView mTvFreeLine;
    @Bind(R.id.tv_all)
    TextView mTvAll;
    @Bind(R.id.tv_all_line)
    TextView mTvAllLine;

    private HeroFreeFragment mFreeFragment;
    private HeroAllFragment mAllFragment;
    private FragmentManager mManager;

    @Override
    protected BasePresenter createPresenter()
    {
        return null;
    }

    @Override
    protected int getResourceId()
    {
        return R.layout.activity_hero;
    }

    @Override
    public void initView()
    {
        super.initView();
        mLayoutTitle.setText("英雄");
        mManager = getSupportFragmentManager();
        showFragment(0);
        mStateView.showContent();
    }

    @OnClick({R.id.layout_finish, R.id.hero_free, R.id.hero_all})
    public void onViewClicked(View view)
    {
        switch (view.getId())
        {
            case R.id.layout_finish:
                finish();
                break;
            case R.id.hero_free:
                showFragment(0);
                break;
            case R.id.hero_all:
                showFragment(1);
                break;
        }
    }

    //显示需要的Fragment
    private void showFragment(int position)
    {
        FragmentTransaction ft = mManager.beginTransaction();
        hideFragment(ft);
        setBackground(position);
        switch (position)
        {
            case 0:
                if (mFreeFragment != null)
                {
                    ft.show(mFreeFragment);
                }else
                {
                    mFreeFragment = new HeroFreeFragment();
                    ft.add(R.id.fragments, mFreeFragment);
                }
                break;
            case 1:
                if (mAllFragment != null)
                {
                    ft.show(mAllFragment);
                }else
                {
                    mAllFragment = new HeroAllFragment();
                    ft.add(R.id.fragments, mAllFragment);
                }
                break;
        }
        ft.commit();
    }

    //隐藏不需要的Fragment
    private void hideFragment(FragmentTransaction ft)
    {
        if (mFreeFragment != null)
        {
            ft.hide(mFreeFragment);
        }
        if (mAllFragment != null)
        {
            ft.hide(mAllFragment);
        }
    }


    //设置选中的标题背景
    private void setBackground(int position)
    {
        mTvFree.setTextColor(getResources().getColor(R.color.color9));
        mTvFreeLine.setBackgroundResource(R.color.white);
        mTvAll.setTextColor(getResources().getColor(R.color.color9));
        mTvAllLine.setBackgroundResource(R.color.white);
        switch (position)
        {
            case 0:
                mTvFree.setTextColor(getResources().getColor(R.color.main));
                mTvFreeLine.setBackgroundResource(R.color.main);
                break;
            case 1:
                mTvAll.setTextColor(getResources().getColor(R.color.main));
                mTvAllLine.setBackgroundResource(R.color.main);
                break;
        }
    }


}

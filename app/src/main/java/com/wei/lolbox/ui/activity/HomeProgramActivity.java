package com.wei.lolbox.ui.activity;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.wei.lolbox.R;
import com.wei.lolbox.base.BaseActivity;
import com.wei.lolbox.base.BasePresenter;
import com.wei.lolbox.ui.adapter.home.HomeProgramAdapter;
import com.wei.lolbox.utils.StatusBarUtils;

import butterknife.Bind;

/**
 * 作者：赵若位
 * 时间：2018/1/17
 * 邮箱：1070138445@qq.com
 * 功能：
 */

public class HomeProgramActivity extends BaseActivity
{

    @Bind(R.id.mains)
    RecyclerView mMains;

    private HomeProgramAdapter mAdapter;


    @Override
    protected BasePresenter createPresenter()
    {
        return null;
    }

    @Override
    protected int getResourceId()
    {
        return R.layout.activity_home_program;
    }


    @Override
    public void initView()
    {
        super.initView();
        StatusBarUtils.setColor(this, getResources().getColor(R.color.white));
        GridLayoutManager mManager = new GridLayoutManager(this, 4);
        mMains.setLayoutManager(mManager);
        mAdapter = new HomeProgramAdapter(this);
        mMains.setAdapter(mAdapter);
        mStateView.showContent();
        mAdapter.update();
    }


}

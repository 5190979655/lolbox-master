package com.wei.lolbox.ui.fragment;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.orhanobut.logger.Logger;
import com.wei.lolbox.R;
import com.wei.lolbox.base.BaseFragment;
import com.wei.lolbox.base.BaseView;
import com.wei.lolbox.model.discover.HeroListBean;
import com.wei.lolbox.model.discover.Heroes;
import com.wei.lolbox.presenter.discover.HeroFreePresenter;
import com.wei.lolbox.ui.adapter.discover.HeroFreeAdapter;

import java.util.List;

import butterknife.Bind;

/**
 * 作者：赵若位
 * 时间：2017/12/9
 * 邮箱：1070138445@qq.com
 * 功能：周免英雄
 */

public class HeroFreeFragment extends BaseFragment<HeroFreePresenter> implements BaseView
{
    @Bind(R.id.mains)
    RecyclerView mMains;

    private HeroFreeAdapter mAdapter;

    @Override
    protected HeroFreePresenter createPresenter()
    {
        return new HeroFreePresenter(this);
    }

    @Override
    protected int getResounrceId()
    {
        return R.layout.fragment_hero_free;
    }

    @Override
    public void initView(View rootView)
    {
        super.initView(rootView);
        GridLayoutManager mManager = new GridLayoutManager(getActivity(), 2);
        mMains.setLayoutManager(mManager);
        mAdapter = new HeroFreeAdapter(getActivity());
        mMains.setAdapter(mAdapter);
        isUIVisible = true;
    }

    @Override
    public void initData()
    {
        super.initData();
        mPresenter.loadingData();
    }

    @Override
    public void showError(String e)
    {
        mStateView.showRetry();
    }

    @Override
    public void showData(Object o)
    {
        List<Heroes> list = (List<Heroes>) o;
        mAdapter.update(list);
        mStateView.showContent();
    }
}

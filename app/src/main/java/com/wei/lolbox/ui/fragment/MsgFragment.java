package com.wei.lolbox.ui.fragment;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.wei.lolbox.R;
import com.wei.lolbox.base.BaseFragment;
import com.wei.lolbox.base.BaseView;
import com.wei.lolbox.model.msg.MsgTitle;
import com.wei.lolbox.presenter.msg.MsgTitlePresenter;
import com.wei.lolbox.ui.adapter.ViewPagerAdapter;
import com.wei.lolbox.ui.adapter.msg.TitleAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;

/**
 * 作者：赵若位
 * 时间：2017/11/29
 * 邮箱：1070138445@qq.com
 * 功能：
 */

public class MsgFragment extends BaseFragment<MsgTitlePresenter> implements BaseView
{
    @Bind(R.id.title)
    RecyclerView mTitle;
    @Bind(R.id.child)
    ViewPager mChild;

    private ViewPagerAdapter mPagerAdapter;//ViewPager适配器
    private TitleAdapter mAdapter;//RecyclerView适配器

    @Override
    protected MsgTitlePresenter createPresenter()
    {
        return new MsgTitlePresenter(this);
    }

    @Override
    protected int getResounrceId()
    {
        return R.layout.fragment_msg;
    }

    @Override
    public void initView(View rootView)
    {
        super.initView(rootView);
        final GridLayoutManager mManager = new GridLayoutManager(getActivity(), 1, GridLayoutManager.HORIZONTAL, false);
        mTitle.setLayoutManager(mManager);
        mPagerAdapter = new ViewPagerAdapter(getChildFragmentManager());
        mAdapter = new TitleAdapter(getActivity());
        mChild.setAdapter(mPagerAdapter);
        mTitle.setAdapter(mAdapter);
        mAdapter.setOnItemClickListener(new TitleAdapter.OnItemClickListener()
        {
            @Override
            public void onItemClickListener(View mView, MsgTitle bean, int position)
            {
                mChild.setCurrentItem(position);
                mManager.scrollToPosition(position);
            }
        });

        mChild.addOnPageChangeListener(new ViewPager.OnPageChangeListener()
        {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels)
            {

            }

            @Override
            public void onPageSelected(int position)
            {
                mAdapter.moveToPosition(position);
                mManager.scrollToPosition(position);
            }

            @Override
            public void onPageScrollStateChanged(int state)
            {

            }
        });
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
        List<MsgTitle> list = (List<MsgTitle>) o;
        List<Fragment> mList = new ArrayList<>();
        for (MsgTitle data : list)
        {
            mList.add(MsgChildFragment.newIntent(data));
        }

        mPagerAdapter.update(mList);
        mAdapter.update(list);
        mStateView.showContent();
    }
}

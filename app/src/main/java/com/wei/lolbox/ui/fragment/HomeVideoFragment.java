package com.wei.lolbox.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.wei.lolbox.Application;
import com.wei.lolbox.R;
import com.wei.lolbox.base.BaseFragment;
import com.wei.lolbox.base.BaseView;
import com.wei.lolbox.dao.HomeTitleDao;
import com.wei.lolbox.model.EventMsg;
import com.wei.lolbox.model.home.HomeTitle;
import com.wei.lolbox.presenter.home.HomeTitlePresenter;
import com.wei.lolbox.ui.activity.HomeProgramActivity;
import com.wei.lolbox.ui.adapter.home.HomeViewPagerAdapter;
import com.wei.lolbox.ui.adapter.home.VideoTitleAdapter;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.OnClick;

/**
 * 作者：赵若位
 * 时间：2017/12/22
 * 邮箱：1070138445@qq.com
 * 功能：
 */

public class HomeVideoFragment extends BaseFragment<HomeTitlePresenter> implements BaseView
{
    @Bind(R.id.title)
    RecyclerView mTitle;
    @Bind(R.id.mains)
    ViewPager mMains;

    private LinearLayoutManager mManager;
    private VideoTitleAdapter mTitleAdapter;
    private List<HomeTitle> mList;
    private HomeViewPagerAdapter mAdapter;
    private HomeTitleDao mDao;

    @Override
    protected HomeTitlePresenter createPresenter()
    {
        return new HomeTitlePresenter(this);
    }

    @Override
    protected int getResounrceId()
    {
        return R.layout.fragment_home_video;
    }

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        EventBus.getDefault().register(this);
    }

    @Override
    public void initView(View rootView)
    {
        super.initView(rootView);
        mManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        mTitle.setLayoutManager(mManager);
        mList = new ArrayList<>();
        mTitleAdapter = new VideoTitleAdapter(getActivity());
        mAdapter = new HomeViewPagerAdapter(getChildFragmentManager());
        mTitle.setAdapter(mTitleAdapter);
        mMains.setAdapter(mAdapter);
        //RecyclerView Item点击监听
        mTitleAdapter.setOnItemClickListener(new VideoTitleAdapter.OnItemClickListener()
        {
            @Override
            public void click(View mView, HomeTitle mHomeTitle, int position)
            {
                mMains.setCurrentItem(position);
            }
        });

        mMains.addOnPageChangeListener(new ViewPager.OnPageChangeListener()
        {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels)
            {

            }

            @Override
            public void onPageSelected(int position)
            {
                mTitleAdapter.moveToPosition(mManager, position);
            }

            @Override
            public void onPageScrollStateChanged(int state)
            {

            }
        });

    }

    @Override
    public void initData()
    {
        super.initData();
        mDao = Application.mSession.getHomeTitleDao();

        List<HomeTitle> listAll = mDao.loadAll();//总数据源
        if (listAll == null || listAll.size() == 0)
        {
            mPresenter.loadingData();
        } else
        {
            List<HomeTitle> list = mDao.queryBuilder()//当前可见的数据源
                    .where(HomeTitleDao.Properties.IsVisiable.eq(true))
                    .build()
                    .list();
            setContent(list);
        }

    }


    @OnClick({R.id.check})
    public void onViewClicked(View view)
    {
        switch (view.getId())
        {
            case R.id.check:
                Intent intent = new Intent(getActivity(), HomeProgramActivity.class);
                startActivity(intent);
                break;
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void subcrible(EventMsg msg)
    {
        if (msg.getClassName().equals("HomeVideoFragment"))
        {
            HomeTitle data = (HomeTitle) msg.getT();
            switch (msg.getMsgCode())
            {
                case 201://HomeProgramAdapter中选择好频道，跳转到具体的频道
                    int position = queryTag(data.getName());
                    if (position >= 0)
                    {
                        mTitleAdapter.moveToPosition(mManager, position);
                        mMains.setCurrentItem(position);
                    }
                    break;
                case 202://移除子类
                    int indic = queryTag(data.getName());
                    if (indic == mMains.getCurrentItem())
                    {
                        mTitleAdapter.moveToPosition(mManager,0);
                    }
                    mList.remove(indic);
                    mTitleAdapter.notifyItemRemoved(indic);
                    mAdapter.deleteFragment(data);
                    mMains.setAdapter(mAdapter);
                    break;
                case 203://添加子类
                    mList.add(data);
                    mTitleAdapter.notifyItemInserted(mList.size() - 1);
                    mAdapter.addFragment(data);
                    mMains.setAdapter(mAdapter);
                    break;
            }
        }
    }

    /**
     * 在当前的标题List中查询name == tag的标题位置
     *
     * @param tag
     * @return
     */
    private int queryTag(String tag)
    {
        if (mList == null || mList.size() == 0)
        {
            return -1;
        }
        for (int i = 0; i < mList.size(); i++)
        {
            if (mList.get(i).getName().equals(tag))
            {
                return i;
            }
        }
        return -1;
    }


    @Override
    public void showError(String e)
    {
        mStateView.showRetry();
    }

    @Override
    public void showData(Object o)
    {
        List<HomeTitle> list = (List<HomeTitle>) o;
        if (list == null || list.size() == 0)
        {
            mStateView.showEmpty();
            return;
        }
        setContent(list);
    }


    /**
     * 根据顶部标题的数据条目来设置子类HomeChildFragment的数目以及类型
     *
     * @param list list ！=null && list.size()!=0
     */
    private void setContent(List<HomeTitle> list)
    {
        mList.clear();
        mList.add(new HomeTitle("推荐", 0, null, true));
        mList.add(new HomeTitle("热门", 0, null, true));
        mList.addAll(list);
        mTitleAdapter.update(mList);
//        List<Fragment> mFragments = new ArrayList<>();
//        for (HomeTitle data : mList)
//        {
//            mFragments.add(HomeChildFragment.newIntent(data.getName()));
//        }
        mAdapter.update(mList);
        mStateView.showContent();
    }


    @Override
    public void onDestroy()
    {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }
}

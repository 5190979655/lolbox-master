package com.wei.lolbox.ui.fragment;

import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.TextView;

import com.wei.lolbox.R;
import com.wei.lolbox.base.BaseFragment;
import com.wei.lolbox.base.BasePresenter;
import com.wei.lolbox.model.home.HomeTitle;
import com.wei.lolbox.ui.adapter.ViewPagerAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.OnClick;

/**
 * 作者：赵若位
 * 时间：2017/11/29
 * 邮箱：1070138445@qq.com
 * 功能：
 */

public class HomeFragment extends BaseFragment
{

    @Bind(R.id.video)
    TextView mVideo;
    @Bind(R.id.player)
    TextView mPlayer;
    @Bind(R.id.mains)
    ViewPager mMains;

    private ViewPagerAdapter mAdapter;
    private List<Fragment> mList;

    @Override
    protected BasePresenter createPresenter()
    {
        return null;
    }

    @Override
    protected int getResounrceId()
    {
        return R.layout.fragment_home;
    }


    @Override
    public void initView(View rootView)
    {
        super.initView(rootView);
        showTitle(0);
        mAdapter = new ViewPagerAdapter(getChildFragmentManager());
        mMains.setAdapter(mAdapter);
        mList = new ArrayList<>();
        mList.add(new HomeVideoFragment());
        mList.add(HomeChildFragment.newIntent(new HomeTitle("直播", 0, null, true)));
        mAdapter.update(mList);

        mMains.addOnPageChangeListener(new ViewPager.OnPageChangeListener()
        {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels)
            {

            }

            @Override
            public void onPageSelected(int position)
            {
                showTitle(position);
            }

            @Override
            public void onPageScrollStateChanged(int state)
            {

            }
        });
        mStateView.showContent();
    }


    //更新顶部Title
    private void showTitle(int position)
    {
        mVideo.setTextColor(Color.parseColor("#ffd79e"));
        mPlayer.setTextColor(Color.parseColor("#ffd79e"));
        switch (position)
        {
            case 0:
                mVideo.setTextColor(getResources().getColor(R.color.white));
                break;
            case 1:
                mPlayer.setTextColor(getResources().getColor(R.color.white));
                break;
        }
    }

    @OnClick({R.id.video, R.id.player})
    public void onViewClicked(View view)
    {
        switch (view.getId())
        {
            case R.id.video:
                showTitle(0);
                mMains.setCurrentItem(0);
                break;
            case R.id.player:
                showTitle(1);
                mMains.setCurrentItem(1);
                break;
        }
    }
}

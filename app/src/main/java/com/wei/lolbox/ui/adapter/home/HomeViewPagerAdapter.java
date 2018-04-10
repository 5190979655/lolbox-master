package com.wei.lolbox.ui.adapter.home;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;

import com.wei.lolbox.model.home.HomeTitle;
import com.wei.lolbox.ui.fragment.HomeChildFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * 作者：赵若位
 * 时间：2018/2/6
 * 邮箱：1070138445@qq.com
 * 功能：
 */

public class HomeViewPagerAdapter extends FragmentStatePagerAdapter
{
    private List<HomeTitle> mList;
    private long baseId = 0;


    public HomeViewPagerAdapter(FragmentManager fm)
    {
        super(fm);
        mList = new ArrayList<>();
    }


    public void update(List<HomeTitle> list)
    {
        if (list == null || list.size() == 0)
        {
            return;
        }
        mList.clear();
        mList.addAll(list);
        notifyDataSetChanged();
    }

    public void addFragment(HomeTitle home)
    {
        if (home == null)
        {
            return;
        }
        mList.add(home);
        notifyDataSetChanged();
    }

    public void deleteFragment(HomeTitle home)
    {
        if (home == null)
        {
            return;
        }
        mList.remove(home);
        notifyDataSetChanged();
    }


    @Override
    public Fragment getItem(int position)
    {
        return HomeChildFragment.newIntent(mList.get(position));
    }

    @Override
    public int getCount()
    {
        return mList == null ? 0 : mList.size();
    }

    @Override
    public int getItemPosition(Object object)
    {
        return PagerAdapter.POSITION_NONE;
    }

}

package com.wei.lolbox.ui.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;

import java.util.ArrayList;
import java.util.List;

/**
 * 作者：赵若位
 * 时间：2017/11/30
 * 邮箱：1070138445@qq.com
 * 功能：咨询页面ViewPager适配器
 */

public class ViewPagerAdapter extends FragmentPagerAdapter
{
    private List<Fragment> mList;


    public ViewPagerAdapter(FragmentManager fm)
    {
        super(fm);
        mList = new ArrayList<>();
    }


    //更新数据
    public void update(List<Fragment> list)
    {
        if (list == null || list.size() == 0)
        {
            return;
        }
        mList.clear();
        mList.addAll(list);
        notifyDataSetChanged();
    }


    @Override
    public Fragment getItem(int position)
    {
        return mList.get(position);
    }

    @Override
    public int getCount()
    {
        return mList == null?0:mList.size();
    }
}

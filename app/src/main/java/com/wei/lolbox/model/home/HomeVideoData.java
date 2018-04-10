package com.wei.lolbox.model.home;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * 作者：赵若位
 * 时间：2018/1/17
 * 邮箱：1070138445@qq.com
 * 功能：
 */

public class HomeVideoData<T>
{
    /**
     * articles : []
     * next : 1
     * timeline : 329174
     */

    private int next;
    private int timeline;
    @SerializedName("articles")
    private List<T> list;

    public int getNext()
    {
        return next;
    }

    public void setNext(int mNext)
    {
        next = mNext;
    }

    public int getTimeline()
    {
        return timeline;
    }

    public void setTimeline(int mTimeline)
    {
        timeline = mTimeline;
    }

    public List<T> getList()
    {
        return list;
    }

    public void setList(List<T> mList)
    {
        list = mList;
    }
}

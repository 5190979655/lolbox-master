package com.wei.lolbox.model.follow;

import com.google.gson.annotations.SerializedName;
import com.wei.lolbox.model.home.HomeVideo;

import java.util.List;

/**
 * 作者：赵若位
 * 时间：2017/12/7
 * 邮箱：1070138445@qq.com
 * 功能：
 */

public class Author
{
    private int next;
    private int timeline;
    @SerializedName("articles")
    private List<HomeVideo> articles;

    public int getNext()
    {
        return next;
    }

    public void setNext(int next)
    {
        this.next = next;
    }

    public int getTimeline()
    {
        return timeline;
    }

    public void setTimeline(int timeline)
    {
        this.timeline = timeline;
    }

    public List<HomeVideo> getArticles()
    {
        return articles;
    }

    public void setArticles(List<HomeVideo> articles)
    {
        this.articles = articles;
    }
}

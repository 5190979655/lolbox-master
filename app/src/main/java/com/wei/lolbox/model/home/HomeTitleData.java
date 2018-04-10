package com.wei.lolbox.model.home;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * 作者：赵若位
 * 时间：2018/1/17
 * 邮箱：1070138445@qq.com
 * 功能：
 */

public class HomeTitleData
{
    @SerializedName("customIds")
    private List<Integer> customIds;


    @SerializedName("roots")
    private List<HomeTitle> roots;

    public List<Integer> getCustomIds()
    {
        return customIds;
    }

    public void setCustomIds(List<Integer> mCustomIds)
    {
        customIds = mCustomIds;
    }

    public List<HomeTitle> getRoots()
    {
        return roots;
    }

    public void setRoots(List<HomeTitle> mRoots)
    {
        roots = mRoots;
    }
}

package com.wei.lolbox.model.discover;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * 作者：赵若位
 * 时间：2017/12/9
 * 邮箱：1070138445@qq.com
 * 功能：
 */

public class HeroListBean
{
    @SerializedName("champion_list")
    private List<Heroes> champion_list;

    public List<Heroes> getChampion_list()
    {
        return champion_list;
    }

    public void setChampion_list(List<Heroes> champion_list)
    {
        this.champion_list = champion_list;
    }
}

package com.wei.lolbox.model.discover;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

/**
 * 作者：赵若位
 * 时间：2017/12/13
 * 邮箱：1070138445@qq.com
 * 功能：搜索召唤师大区服务器
 */
@Entity
public class Servicer
{
    /**
     * pinyin : dx1
     * area_id : 1
     * server_name : 电信一
     * alias : 艾欧尼亚
     */

    private String pinyin;
    private int area_id;
    private String server_name;
    @Id
    private String alias;

    @Generated(hash = 315861334)
    public Servicer(String pinyin, int area_id, String server_name, String alias)
    {
        this.pinyin = pinyin;
        this.area_id = area_id;
        this.server_name = server_name;
        this.alias = alias;
    }

    @Generated(hash = 489604298)
    public Servicer()
    {
    }

    public String getPinyin()
    {
        return pinyin;
    }

    public void setPinyin(String pinyin)
    {
        this.pinyin = pinyin;
    }

    public int getArea_id()
    {
        return area_id;
    }

    public void setArea_id(int area_id)
    {
        this.area_id = area_id;
    }

    public String getServer_name()
    {
        return server_name;
    }

    public void setServer_name(String server_name)
    {
        this.server_name = server_name;
    }

    public String getAlias()
    {
        return alias;
    }

    public void setAlias(String alias)
    {
        this.alias = alias;
    }
}

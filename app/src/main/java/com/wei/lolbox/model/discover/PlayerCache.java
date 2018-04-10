package com.wei.lolbox.model.discover;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

/**
 * 作者：赵若位
 * 时间：2017/12/17
 * 邮箱：1070138445@qq.com
 * 功能：搜索的召唤师缓存在本地的数据模型
 */
@Entity
public class PlayerCache
{
    @Id(autoincrement = true)
    private Long id;//主键
    private String userName;
    private String serviceName;
    private String serviceId;

    @Generated(hash = 507794147)
    public PlayerCache(Long id, String userName, String serviceName,
                       String serviceId)
    {
        this.id = id;
        this.userName = userName;
        this.serviceName = serviceName;
        this.serviceId = serviceId;
    }



    @Generated(hash = 1795878605)
    public PlayerCache()
    {
    }

    public Long getId()
    {
        return this.id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getUserName()
    {
        return this.userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public String getServiceName()
    {
        return this.serviceName;
    }

    public void setServiceName(String serviceName)
    {
        this.serviceName = serviceName;
    }

    public String getServiceId()
    {
        return this.serviceId;
    }

    public void setServiceId(String serviceId)
    {
        this.serviceId = serviceId;
    }


}

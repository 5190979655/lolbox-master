package com.wei.lolbox.model.discover;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Transient;

import java.util.List;

import org.greenrobot.greendao.annotation.Generated;

/**
 * 作者：赵若位
 * 时间：2017/12/11
 * 邮箱：1070138445@qq.com
 * 功能：
 */
@Entity
public class HeroPosition
{
    /**
     * position : adc
     * position_in_cn : ADC
     * roles : ["marksman"]
     */

    @Id
    private Long id;
    private String position_in_cn;
    @NotNull
    private String name;
    @Transient
    private List<String> roles;

    @Generated(hash = 724886714)
    public HeroPosition(Long id, String position_in_cn, @NotNull String name)
    {
        this.id = id;
        this.position_in_cn = position_in_cn;
        this.name = name;
    }

    @Generated(hash = 1842385175)
    public HeroPosition()
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

    public String getPosition_in_cn()
    {
        return this.position_in_cn;
    }

    public void setPosition_in_cn(String position_in_cn)
    {
        this.position_in_cn = position_in_cn;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }


}

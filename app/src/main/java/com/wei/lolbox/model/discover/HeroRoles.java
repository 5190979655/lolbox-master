package com.wei.lolbox.model.discover;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;

/**
 * 作者：赵若位
 * 时间：2017/12/11
 * 邮箱：1070138445@qq.com
 * 功能：
 */
@Entity
public class HeroRoles
{
    /**
     * role : marksman
     * role_in_cn : 射手
     * desc : 远程物理伤害，依赖前期发
     */

    @Id
    private Long id;
    private String role_in_cn;
    @NotNull
    private String name;
    private String role;
    private String desc;

    @Generated(hash = 602626645)
    public HeroRoles(Long id, String role_in_cn, @NotNull String name, String role,
                     String desc)
    {
        this.id = id;
        this.role_in_cn = role_in_cn;
        this.name = name;
        this.role = role;
        this.desc = desc;
    }

    @Generated(hash = 1818068553)
    public HeroRoles()
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

    public String getRole_in_cn()
    {
        return this.role_in_cn;
    }

    public void setRole_in_cn(String role_in_cn)
    {
        this.role_in_cn = role_in_cn;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getRole()
    {
        return this.role;
    }

    public void setRole(String role)
    {
        this.role = role;
    }

    public String getDesc()
    {
        return this.desc;
    }

    public void setDesc(String desc)
    {
        this.desc = desc;
    }


}

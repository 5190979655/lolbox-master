package com.wei.lolbox.model.discover;

import com.google.gson.annotations.SerializedName;
import com.wei.lolbox.dao.DaoSession;
import com.wei.lolbox.dao.HeroPositionDao;
import com.wei.lolbox.dao.HeroRolesDao;
import com.wei.lolbox.dao.HeroesDao;

import org.greenrobot.greendao.DaoException;
import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.JoinProperty;
import org.greenrobot.greendao.annotation.ToMany;
import org.greenrobot.greendao.annotation.Transient;

import java.util.List;

/**
 * 作者：赵若位
 * 时间：2017/12/9
 * 邮箱：1070138445@qq.com
 * 功能：英雄属性
 * 英雄头像：http://static.lolbox.duowan.com/images/champions/LeeSin_40x40.jpg
 */
@Entity
public class Heroes
{
    /**
     * display_name : 德玛西亚之翼
     * gold : 6300
     * roles : [{"role":"marksman","role_in_cn":"射手","desc":"远程物理伤害，依赖前期发"},{"role":"fighter","role_in_cn":"战士","desc":"输出 或 肉，介于 marksman 和 tank 之间"}]
     * title : 奎因
     * coupon : 4500
     * positions : [{"position":"adc","position_in_cn":"ADC","roles":["marksman"]}]
     * pqwer : [{"img_url":"http://static.lolbox.duowan.com/images/pqwer/Quinn_q.png","name":"炫目攻势","key":"q","desc":"奎因唤出华洛，来标记一名敌人并遮蔽其视野，然后对目标附近区域内的所有敌人造成伤害。"},{"img_url":"http://static.lolbox.duowan.com/images/pqwer/Quinn_w.png","name":"敏锐感知","key":"w","desc":"在奎因攻击了一名易损目标后，被动地为奎因提供攻击速度和移动速度加成。主动激活可以让华洛驱散周围一大片区域的战争迷雾。"},{"img_url":"http://static.lolbox.duowan.com/images/pqwer/Quinn_e.png","name":"旋翔掠杀","key":"e","desc":"奎因冲向一名敌人，造成物理伤害，并减少目标的移动速度。在接触到目标的同时，她会向后空翻，暂时打断目标的行动，并在接近她最大攻击距离的地方着陆。"},{"img_url":"http://static.lolbox.duowan.com/images/pqwer/Quinn_r.png","name":"深入敌后","key":"r","desc":"奎因和华洛联成一体并以极高的速度进行移动。"},{"img_url":"http://static.lolbox.duowan.com/images/pqwer/Quinn_p.png","name":"侵扰","key":"p","desc":"华洛会周期性地将敌人标记为易损状态。奎因对易损目标的第一次普通攻击将造成额外物理伤害。"}]
     * id : 133
     * name : Quinn
     */

    @Id
    private String name;
    private String display_name;
    private String gold;
    private String title;
    private String coupon;
    private int id;

    @SerializedName("roles")
    @ToMany(referencedJoinProperty = "name")
    private List<HeroRoles> roles;

    @SerializedName("positions")
    @ToMany(referencedJoinProperty = "name")
    private List<HeroPosition> positions;

    @Transient
    private List<PqwerBean> pqwer;
    /**
     * Used to resolve relations
     */
    @Generated(hash = 2040040024)
    private transient DaoSession daoSession;
    /**
     * Used for active entity operations.
     */
    @Generated(hash = 19121711)
    private transient HeroesDao myDao;


    @Generated(hash = 2016940898)
    public Heroes(String name, String display_name, String gold, String title, String coupon, int id)
    {
        this.name = name;
        this.display_name = display_name;
        this.gold = gold;
        this.title = title;
        this.coupon = coupon;
        this.id = id;
    }


    @Generated(hash = 1840993215)
    public Heroes()
    {
    }


    public String getName()
    {
        return this.name;
    }


    public void setName(String name)
    {
        this.name = name;
    }


    public String getDisplay_name()
    {
        return this.display_name;
    }


    public void setDisplay_name(String display_name)
    {
        this.display_name = display_name;
    }


    public String getGold()
    {
        return this.gold;
    }


    public void setGold(String gold)
    {
        this.gold = gold;
    }


    public String getTitle()
    {
        return this.title;
    }


    public void setTitle(String title)
    {
        this.title = title;
    }


    public String getCoupon()
    {
        return this.coupon;
    }


    public void setCoupon(String coupon)
    {
        this.coupon = coupon;
    }


    public int getId()
    {
        return this.id;
    }


    public void setId(int id)
    {
        this.id = id;
    }


    /**
     * To-many relationship, resolved on first access (and after reset).
     * Changes to to-many relations are not persisted, make changes to the target entity.
     */
    @Generated(hash = 534741664)
    public List<HeroRoles> getRoles()
    {
        if (roles == null)
        {
            final DaoSession daoSession = this.daoSession;
            if (daoSession == null)
            {
                throw new DaoException("Entity is detached from DAO context");
            }
            HeroRolesDao targetDao = daoSession.getHeroRolesDao();
            List<HeroRoles> rolesNew = targetDao._queryHeroes_Roles(name);
            synchronized (this)
            {
                if (roles == null)
                {
                    roles = rolesNew;
                }
            }
        }
        return roles;
    }


    /**
     * Resets a to-many relationship, making the next get call to query for a fresh result.
     */
    @Generated(hash = 254386649)
    public synchronized void resetRoles()
    {
        roles = null;
    }


    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#delete(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 128553479)
    public void delete()
    {
        if (myDao == null)
        {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.delete(this);
    }


    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#refresh(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 1942392019)
    public void refresh()
    {
        if (myDao == null)
        {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.refresh(this);
    }


    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#update(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 713229351)
    public void update()
    {
        if (myDao == null)
        {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.update(this);
    }


    /**
     * called by internal mechanisms, do not call yourself.
     */
    @Generated(hash = 684147187)
    public void __setDaoSession(DaoSession daoSession)
    {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getHeroesDao() : null;
    }


    /**
     * To-many relationship, resolved on first access (and after reset).
     * Changes to to-many relations are not persisted, make changes to the target entity.
     */
    @Generated(hash = 1538415849)
    public List<HeroPosition> getPositions()
    {
        if (positions == null)
        {
            final DaoSession daoSession = this.daoSession;
            if (daoSession == null)
            {
                throw new DaoException("Entity is detached from DAO context");
            }
            HeroPositionDao targetDao = daoSession.getHeroPositionDao();
            List<HeroPosition> positionsNew = targetDao._queryHeroes_Positions(name);
            synchronized (this)
            {
                if (positions == null)
                {
                    positions = positionsNew;
                }
            }
        }
        return positions;
    }


    /**
     * Resets a to-many relationship, making the next get call to query for a fresh result.
     */
    @Generated(hash = 1228876919)
    public synchronized void resetPositions()
    {
        positions = null;
    }


    public static class PqwerBean
    {
        /**
         * img_url : http://static.lolbox.duowan.com/images/pqwer/Quinn_q.png
         * name : 炫目攻势
         * key : q
         * desc : 奎因唤出华洛，来标记一名敌人并遮蔽其视野，然后对目标附近区域内的所有敌人造成伤害。
         */

        private String img_url;
        private String name;
        private String key;
        private String desc;

        public String getImg_url()
        {
            return img_url;
        }

        public void setImg_url(String img_url)
        {
            this.img_url = img_url;
        }

        public String getName()
        {
            return name;
        }

        public void setName(String name)
        {
            this.name = name;
        }

        public String getKey()
        {
            return key;
        }

        public void setKey(String key)
        {
            this.key = key;
        }

        public String getDesc()
        {
            return desc;
        }

        public void setDesc(String desc)
        {
            this.desc = desc;
        }
    }
}
package com.wei.lolbox.model.home;

import android.os.Parcel;
import android.os.Parcelable;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Transient;

/**
 * 作者：赵若位
 * 时间：2017/12/23
 * 邮箱：1070138445@qq.com
 * 功能：
 */
@Entity
public class HomeTitle implements Parcelable
{

    /**
     * icon : http://screenshot.dwstatic.com/ojiastoreimage/0e7b528021c79b1eb7053626f6fdf93d_size165x165_len5036.png
     * id : 173
     * lv : 3
     * name : 英雄联盟
     * parentId : 33
     * score : 70
     */

    @Id
    private String name;
    private int id;
    private String icon;
    private boolean isVisiable;//当前布局是否可见
    @Transient
    private int lv;
    @Transient
    private int parentId;
    @Transient
    private int score;

    @Generated(hash = 2035318321)
    public HomeTitle(String name, int id, String icon, boolean isVisiable)
    {
        this.name = name;
        this.id = id;
        this.icon = icon;
        this.isVisiable = isVisiable;
    }

    @Generated(hash = 869810785)
    public HomeTitle()
    {
    }

    protected HomeTitle(Parcel in)
    {
        name = in.readString();
        id = in.readInt();
        icon = in.readString();
        isVisiable = in.readByte() != 0;
        lv = in.readInt();
        parentId = in.readInt();
        score = in.readInt();
    }

    public static final Creator<HomeTitle> CREATOR = new Creator<HomeTitle>()
    {
        @Override
        public HomeTitle createFromParcel(Parcel in)
        {
            return new HomeTitle(in);
        }

        @Override
        public HomeTitle[] newArray(int size)
        {
            return new HomeTitle[size];
        }
    };

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getId()
    {
        return this.id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getIcon()
    {
        return this.icon;
    }

    public void setIcon(String icon)
    {
        this.icon = icon;
    }

    public boolean getIsVisiable()
    {
        return this.isVisiable;
    }

    public void setIsVisiable(boolean isVisiable)
    {
        this.isVisiable = isVisiable;
    }


    @Override
    public int describeContents()
    {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags)
    {
        dest.writeString(name);
        dest.writeInt(id);
        dest.writeString(icon);
        dest.writeByte((byte) (isVisiable ? 1 : 0));
        dest.writeInt(lv);
        dest.writeInt(parentId);
        dest.writeInt(score);
    }
}

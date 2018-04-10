package com.wei.lolbox.model.msg;

import android.os.Parcel;
import android.os.Parcelable;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * 作者：赵若位
 * 时间：2018/1/15
 * 邮箱：1070138445@qq.com
 * 功能：
 */
@Entity
public class MsgTitle implements Parcelable
{

    /**
     * type : newsWithHeader
     * tag : headlineNews
     * name : 头条
     */
    @Id
    private String name;
    private String type;
    private String tag;

    protected MsgTitle(Parcel in)
    {
        type = in.readString();
        tag = in.readString();
        name = in.readString();
    }

    @Generated(hash = 1424858793)
    public MsgTitle(String name, String type, String tag) {
        this.name = name;
        this.type = type;
        this.tag = tag;
    }

    @Generated(hash = 2114976090)
    public MsgTitle() {
    }


    public static final Creator<MsgTitle> CREATOR = new Creator<MsgTitle>()
    {
        @Override
        public MsgTitle createFromParcel(Parcel in)
        {
            return new MsgTitle(in);
        }

        @Override
        public MsgTitle[] newArray(int size)
        {
            return new MsgTitle[size];
        }
    };

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public String getTag()
    {
        return tag;
    }

    public void setTag(String tag)
    {
        this.tag = tag;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public int describeContents()
    {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags)
    {
        dest.writeString(type);
        dest.writeString(tag);
        dest.writeString(name);
    }
}

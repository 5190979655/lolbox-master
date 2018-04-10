package com.wei.lolbox.model.discover;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/**
 * 作者：赵若位
 * 时间：2017/12/13
 * 邮箱：1070138445@qq.com
 * 功能：
 */

public class Player implements Parcelable
{


    /**
     * box_score : 6473
     * user_id : 2933069831
     * level : 30
     * rank : 5
     * game_zone : {"pinyin":"dx9","area_id":13,"server_name":"电信九","alias":"裁决之地"}
     * tier : 2
     * pn : 你爹临死前嘱托我
     * league_points : 0
     * icon : 0
     */

    private int box_score;
    private long user_id;
    private int level;
    private int rank;
    @SerializedName("game_zone")
    private GameZoneBean game_zone;
    private int tier;
    private String pn;
    private int league_points;
    private int icon;

    protected Player(Parcel in)
    {
        box_score = in.readInt();
        user_id = in.readLong();
        level = in.readInt();
        rank = in.readInt();
        game_zone = in.readParcelable(GameZoneBean.class.getClassLoader());
        tier = in.readInt();
        pn = in.readString();
        league_points = in.readInt();
        icon = in.readInt();
    }

    public static final Creator<Player> CREATOR = new Creator<Player>()
    {
        @Override
        public Player createFromParcel(Parcel in)
        {
            return new Player(in);
        }

        @Override
        public Player[] newArray(int size)
        {
            return new Player[size];
        }
    };

    public int getBox_score()
    {
        return box_score;
    }

    public void setBox_score(int box_score)
    {
        this.box_score = box_score;
    }

    public long getUser_id()
    {
        return user_id;
    }

    public void setUser_id(long user_id)
    {
        this.user_id = user_id;
    }

    public int getLevel()
    {
        return level;
    }

    public void setLevel(int level)
    {
        this.level = level;
    }

    public int getRank()
    {
        return rank;
    }

    public void setRank(int rank)
    {
        this.rank = rank;
    }

    public GameZoneBean getGame_zone()
    {
        return game_zone;
    }

    public void setGame_zone(GameZoneBean game_zone)
    {
        this.game_zone = game_zone;
    }

    public int getTier()
    {
        return tier;
    }

    public void setTier(int tier)
    {
        this.tier = tier;
    }

    public String getPn()
    {
        return pn;
    }

    public void setPn(String pn)
    {
        this.pn = pn;
    }

    public int getLeague_points()
    {
        return league_points;
    }

    public void setLeague_points(int league_points)
    {
        this.league_points = league_points;
    }

    public int getIcon()
    {
        return icon;
    }

    public void setIcon(int icon)
    {
        this.icon = icon;
    }

    @Override
    public int describeContents()
    {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags)
    {
        dest.writeInt(box_score);
        dest.writeLong(user_id);
        dest.writeInt(level);
        dest.writeInt(rank);
        dest.writeParcelable(game_zone, flags);
        dest.writeInt(tier);
        dest.writeString(pn);
        dest.writeInt(league_points);
        dest.writeInt(icon);
    }

    public static class GameZoneBean implements Parcelable
    {
        /**
         * pinyin : dx9
         * area_id : 13
         * server_name : 电信九
         * alias : 裁决之地
         */

        private String pinyin;
        private int area_id;
        private String server_name;
        private String alias;

        protected GameZoneBean(Parcel in)
        {
            pinyin = in.readString();
            area_id = in.readInt();
            server_name = in.readString();
            alias = in.readString();
        }

        public static final Creator<GameZoneBean> CREATOR = new Creator<GameZoneBean>()
        {
            @Override
            public GameZoneBean createFromParcel(Parcel in)
            {
                return new GameZoneBean(in);
            }

            @Override
            public GameZoneBean[] newArray(int size)
            {
                return new GameZoneBean[size];
            }
        };

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

        @Override
        public int describeContents()
        {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags)
        {
            dest.writeString(pinyin);
            dest.writeInt(area_id);
            dest.writeString(server_name);
            dest.writeString(alias);
        }
    }
}

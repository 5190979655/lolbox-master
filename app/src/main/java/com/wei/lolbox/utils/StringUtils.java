package com.wei.lolbox.utils;

import com.orhanobut.logger.Logger;
import com.wei.lolbox.config.Config;

/**
 * 作者：赵若位
 * 时间：2017/12/4
 * 邮箱：1070138445@qq.com
 * 功能：
 */

public class StringUtils
{

    /**
     * 截取commentUrl中的字符
     * @param url
     * @return
     */
    public static String getMsgDetailUrl(String url)
    {
        if (url.equals("") || url.isEmpty())
        {
            return "";
        }
        int position = url.indexOf("&");
        return Config.BASE_DETAIL + url.substring(0, position) + ".html";
    }


    /**
     * 替换英雄请求接口中的name，制作出正确的英雄头像地址
     * @param name
     * @return
     */
    public static String getHeroHeader(String name)
    {
        if (name.equals("") || name.isEmpty())
        {
            return "";
        }

       return Config.DISCOVER_HERO_HEADER.replace("name", name);
    }

    /**
     * 根据英雄id制作出英雄技能详细地址
     * @param id
     * @return
     */
    public static String getHeroDetail(int id)
    {
        return Config.DISCOVER_HERO_DETAIL.replace("HEROID", String.valueOf(id));
    }


    /**
     * 根据召唤师头像id，制作出召唤师头像地址
     * @param icon
     * @return
     */
    public static String getPlayerIcon(int icon)
    {
        String icons = Config.DISCOVER_PLAYER_ICON.replace("IconID", String.valueOf(icon));
        return icons;
    }


    /**
     * 根据服务器的时间转化成游戏时间
     * 小时+8个小时
     * ===》 2017-11-11T08:49:42
     * ===》11月11日 16：49
     * @param time
     * @return
     */
    public static String getPlayGameTime(String time)
    {
        if (time == null || time.equals(""))
        {
            return null;
        }
        String month = time.substring(5, 7);
        String day = time.substring(8, 10);
        String hour = time.substring(11, 13);
        String minute = time.substring(14, 16);
        int hours = Integer.valueOf(hour) + 8;
        return month + "月" + day + "日" + hours + ":" + minute;
    }

}

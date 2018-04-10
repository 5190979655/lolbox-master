package com.wei.lolbox.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 作者：赵若位
 * 时间：2017/12/3
 * 邮箱：1070138445@qq.com
 * 功能：
 */

public class TimeUtils
{
    /**
     * 将时间戳转换成指定格式的时间
     *
     * @param time 时间戳
     * @return
     */
    public static String getTimes(String time)
    {
        SimpleDateFormat sdr = new SimpleDateFormat("MM-dd HH:mm");
        @SuppressWarnings("unused")
        long lcc = Long.valueOf(time);
        int i = Integer.parseInt(time);
        String times = sdr.format(new Date(i * 1000L));
        return times;
    }


    /**
     * 获取当前时间的时间戳
     * @return
     */
    public static String getLongTimes()
    {
        long time = System.currentTimeMillis() / 1000;
        String str = String.valueOf(time);
        return str;
    }
}

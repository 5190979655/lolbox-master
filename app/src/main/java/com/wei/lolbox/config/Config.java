package com.wei.lolbox.config;

import android.content.Context;
import android.widget.Toast;

import com.wei.lolbox.Application;

/**
 * 作者：赵若位
 * 时间：2017/11/28
 * 邮箱：1070138445@qq.com
 * 功能：APP一些常用的配置
 */

public class Config
{
    public static final int SUCCESS = 200;//操作成功返回码

    //SplashActivity参数
    public static final int SPLASH_DELAY_TIME = 1500;//APP启动延迟时间
    public static final String BASE_URL = "https://api-svideo.duowan.com/";
    public static final String update_token = BASE_URL + "auth/guest.do?ver=430&os=2&channel=duowan&uid=" + Application.Uid +//更新设备存储的uid和token
            "&token=" + Application.Token;


    //Home
    public static final String BASE_HOME = "http://idx.3g.yy.com/";//首页-直播基地址


    //资讯Msg
    public static final String BASE_MSG = "http://box.dwstatic.com/";
    public static final String BASE_DETAIL = "http://lol.duowan.com/";
    public static final String PHOTO_COMMENT = "http://www.duowan.com/mComment/index.html?domain=lolbox.duowan.com&title=&from=boxApp&url=/photoId/";//靓照 囧图 壁纸图片评论


    //发现Discover
    public static final String BASE_DISCOVER = "http://api.lolbox.duowan.com/";
    public static final String DISCOVER_HERO_HEADER = "http://static.lolbox.duowan.com/images/champions/name_120x120.jpg";//英雄头像
    public static final String DISCOVER_HERO_ALL = "http://static.lolbox.duowan.com/";//所有英雄请求地址
    public static final String DISCOVER_HERO_DETAIL = "http://webpd.mbox.duowan.com/m/?page=hero-index&hero_id=HEROID&version=4.3";
    public static final String DISCOVER_SEARCH_USER = BASE_DISCOVER + "api/v2/game/gameZones/";
    public static final String DISCOVER_PLAYER_ICON = "http://static.lolbox.duowan.com/images/profile_icons/IconID.jpg ";//召唤师头像
    public static final String DISCOVER_NO_RANK = "http://static.lolbox.duowan.com/images/rank/0_50x50.png";//无段位的图像
    public static final String DISCOVER_COMBAT_URL = "http://webpd.mbox.duowan.com/m/?page=match-detail&version=4.3";//查询召唤师某一局的对局详情
    public static final String DISCOVER_GAME = "http://game.11h5.com/?chid=995&version=4.3";//游戏中心


    public static final String[] DISCOVER_HERO_SEARCH_TYPE = {"全部", "新手", "战士", "法师", "刺客", "坦克", "辅助", "射手"};
    public static final String[] DISCOVER_HERO_SEARCH_POSITION = {"全部", "上单", "中单", "ADC", "打野", "辅助"};
    public static final String[] DISCOVER_HERO_SEARCH_ORDER = {"默认", "金币", "点券", "字母"};
    public static final String[] DISOVER_HERO_MONEY_RMB = {"1000", "1500", "2000", "2500", "3000", "3500", "4000", "4500"};
    public static final String[] DISOVER_HERO_MONEY_GLOD = {"450", "1350", "3150", "4800", "6300"};


    /**
     * 展示我的联系方式
     * @param mContext
     */
    public static void showToast(Context mContext)
    {
        if (mContext == null)
        {
            return;
        }
        Toast.makeText(mContext, "小主有什么好的想法或者疑惑，可以联系我~", Toast.LENGTH_SHORT).show();
    }



}

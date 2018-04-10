package com.wei.lolbox.service.discover;

import com.wei.lolbox.model.discover.HeroListBean;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * 作者：赵若位
 * 时间：2017/12/9
 * 邮箱：1070138445@qq.com
 * 功能：
 */

public interface DiscoverService
{

    //查询周免英雄
    @GET("api/v2/champion/free/")
    Observable<HeroListBean> getHeroFreeService();

    //查询所有英雄
    @GET("images/champions.json?ver=430&os=2&channel=duowan")
    Observable<HeroListBean> getHeroAllService(@Query("uid") String uid, @Query("token") String token);


    //查询召唤师
    @GET("api/v3/player/search/?wsSecret=2d906fa0696c245de0cc98295d5f51fb")
    Observable<String> getPlayerService(@Query("player_name_list")String userName,@Query("game_zone")String zone);
}

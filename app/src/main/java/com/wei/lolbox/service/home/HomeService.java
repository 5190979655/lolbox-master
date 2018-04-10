package com.wei.lolbox.service.home;

import com.wei.lolbox.base.BaseModel;
import com.wei.lolbox.model.home.HomeTitle;
import com.wei.lolbox.model.home.HomeTitleData;
import com.wei.lolbox.model.home.HomeVideo;
import com.wei.lolbox.model.home.HomeVideoData;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * 作者：赵若位
 * 时间：2017/12/23
 * 邮箱：1070138445@qq.com
 * 功能：
 */

public interface HomeService
{
    //直播主播列表获取
    @GET("hezi/nav/index/idx?os=hezi&osVersion=5.0.0&ver=433&os=2&channel=duowan")
    Observable<String> getPlayerService(@Query("uid") String uid, @Query("token") String token);

    //视屏顶部标题栏数据接口
    @GET("tag/mine.do?ver=433&os=2&channel=duowan")
    Observable<BaseModel<HomeTitleData>> getVideoTitleService(@Query("uid") String uid, @Query("token") String token);

    //推荐
    @GET("rArticle/getNew.do?ver=433&os=2&channel=duowan")
    Observable<BaseModel<HomeVideoData<HomeVideo>>> getRecommendService(@Query("uid") String uid, @Query("token") String token);

    //热门
    @GET("article/getHot.do?page=&ver=433&os=2&channel=duowan")
    Observable<BaseModel<HomeVideoData<HomeVideo>>> getHotService(@Query("uid") String uid, @Query("token") String token);


    //lol dnf 搞笑 舞蹈and so on
    @GET("article/getByTagId.do?ver=433&os=2&channel=duowan")
    Observable<BaseModel<HomeVideoData<HomeVideo>>> getOtherService(@Query("tagId") String tag, @Query("uid") String uid, @Query("token") String token);


    //TODO 这里可以优化一下
    //视频详情列表
    @GET("rArticle/getRelated.do?ver=433&os=2&channel=duowan")
    Observable<String> getListVideoService(@Query("articleId") String articleId,
                                           @Query("uid") String uid,
                                           @Query("token") String token);
}

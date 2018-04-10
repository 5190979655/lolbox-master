package com.wei.lolbox.service.follow;

import com.wei.lolbox.base.BaseModel;
import com.wei.lolbox.model.follow.Follow;
import com.wei.lolbox.model.follow.Author;
import com.wei.lolbox.model.follow.User;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * 作者：赵若位
 * 时间：2017/12/6
 * 邮箱：1070138445@qq.com
 * 功能：
 */

public interface FollowService
{
    //获取关注列表
    @GET("ma/recommend.do?ver=430&os=2&channel=duowan")
    Observable<Follow> getFollowService(@Query("uid") String uid, @Query("token") String token);

    //单个主播详情
    @GET("article/getMaNew.do?ver=430&os=2&channel=duowan")
    Observable<BaseModel<Author>> getAuthorService(@Query("targetUid") long targetUid, @Query("uid") String uid, @Query("token") String token);


    //搜索单个用户和视频
    @GET("home/search.do?ver=430&os=2&channel=duowan")
    Observable<BaseModel<User>> getUserService(@Query("keyword") String word, @Query("uid") String uid, @Query("token") String token);
}

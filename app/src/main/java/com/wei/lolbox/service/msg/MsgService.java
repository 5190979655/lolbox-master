package com.wei.lolbox.service.msg;

import com.wei.lolbox.model.msg.CharmingPhoto;
import com.wei.lolbox.model.msg.JiongPhoto;
import com.wei.lolbox.model.msg.Match;
import com.wei.lolbox.model.msg.MsgChildModel;
import com.wei.lolbox.model.msg.PhotoDetailModel;
import com.wei.lolbox.model.msg.Top;
import com.wei.lolbox.model.msg.Videoes;
import com.wei.lolbox.model.msg.Wallpaper;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * 作者：赵若位
 * 时间：2017/12/3
 * 邮箱：1070138445@qq.com
 * 功能：资讯
 */

public interface MsgService
{

    //顶部标题
    @GET("apiNewsList.php?action=c")
    Observable<String> getTitleService();


    //头条
    @GET("apiNewsList.php?action=l&")
    Observable<MsgChildModel<Top>> getTopService(@Query("newsTag") String newsTag, @Query("p") int p);

    //视频
    @GET("apiNewsList.php?action=l&")
    Observable<MsgChildModel<Videoes>> getVideoService(@Query("newsTag") String newsTag, @Query("p") int p);

    //赛事
    @GET("apiNewsList.php?action=l&")
    Observable<MsgChildModel<Match>> getMatchService(@Query("newsTag") String newsTag, @Query("p") int p);

    //靓照
    @GET("apiAlbum.php?action=l&ver=430&os=2&channel=duowan")
    Observable<MsgChildModel<CharmingPhoto>> getCharmingService(@Query("albumsTag") String tag, @Query("p") int p,
                                                                @Query("uid") String uid, @Query("token") String token);

    //囧图
    @GET("apiAlbum.php?action=l&ver=430&os=2&channel=duowan")
    Observable<MsgChildModel<JiongPhoto>> getJiongService(@Query("albumsTag") String tag, @Query("p") int p,
                                                          @Query("uid") String uid, @Query("token") String token);

    //壁纸
    @GET("apiAlbum.php?action=l&ver=430&os=2&channel=duowan")
    Observable<MsgChildModel<Wallpaper>> getWallpaperService(@Query("albumsTag") String tag, @Query("p") int page,
                                                             @Query("uid") String uid, @Query("token") String token);

    //摘片详情
    @GET("apiAlbum.php?action=d&ver=430&os=2&channel=duowan")
    Observable<PhotoDetailModel> getPhotoDetailService(@Query("albumId") String albumId, @Query("uid") String uid, @Query("token") String token);
}

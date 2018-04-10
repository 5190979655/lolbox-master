package com.wei.lolbox.presenter.msg;

import android.util.Log;

import com.google.gson.Gson;
import com.orhanobut.logger.Logger;
import com.wei.lolbox.Application;
import com.wei.lolbox.base.BaseClient;
import com.wei.lolbox.base.BasePresenter;
import com.wei.lolbox.base.BaseView;
import com.wei.lolbox.config.Config;
import com.wei.lolbox.dao.CharmingPhotoDao;
import com.wei.lolbox.dao.JiongPhotoDao;
import com.wei.lolbox.dao.MatchDao;
import com.wei.lolbox.dao.TopDao;
import com.wei.lolbox.dao.TopHeaderDao;
import com.wei.lolbox.dao.VideoesDao;
import com.wei.lolbox.dao.WallpaperDao;
import com.wei.lolbox.model.msg.CharmingPhoto;
import com.wei.lolbox.model.msg.JiongPhoto;
import com.wei.lolbox.model.msg.Match;
import com.wei.lolbox.model.msg.MsgChildModel;
import com.wei.lolbox.model.msg.MsgTitle;
import com.wei.lolbox.model.msg.Top;
import com.wei.lolbox.model.msg.TopHeader;
import com.wei.lolbox.model.msg.Videoes;
import com.wei.lolbox.model.msg.Wallpaper;
import com.wei.lolbox.service.msg.MsgService;

import java.util.List;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;
import rx.Subscriber;
import rx.functions.Func1;

/**
 * 作者：赵若位
 * 时间：2018/1/13
 * 邮箱：1070138445@qq.com
 * 功能：
 */

public class MsgChildPresenter extends BasePresenter<BaseView>
{

    public MsgChildPresenter(BaseView mView)
    {
        super(mView);
    }


    public void loadingData(MsgTitle tag, final int p)
    {
        Observable o = null;
        Subscriber s = null;
        MsgService mService = BaseClient.getInstance().getRetrofit(Config.BASE_MSG).create(MsgService.class);
        switch (tag.getName())
        {
            case "头条":
                final TopDao mTopDao = Application.mSession.getTopDao();
                final TopHeaderDao mHeaderDao = Application.mSession.getTopHeaderDao();

                /**
                 * 这个地方非常操蛋，因为BaseClient里面封装了添加头的Client
                 * 导致请求的结果里面没有顶部Banner的数据
                 * 所以这个地方必须重新封装一个Retrofit的实例
                 */
                Retrofit mRetrofit = new Retrofit.Builder()
                        .baseUrl(Config.BASE_MSG)
                        .addConverterFactory(GsonConverterFactory.create())
                        .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                        .build();
                o = mRetrofit.create(MsgService.class).getTopService(tag.getTag(), p)
                        .map(new Func1<MsgChildModel<Top>, List<Top>>()
                        {
                            @Override
                            public List<Top> call(MsgChildModel<Top> model)
                            {
                                List<TopHeader> header = model.getHeaderline();
                                if (header != null && p == 1 && header.size() != 0)
                                {
                                    mHeaderDao.insertOrReplaceInTx(header);
                                }
                                return model.getData();
                            }
                        });
                s = new Subscriber<List<Top>>()
                {
                    @Override
                    public void onCompleted()
                    {

                    }

                    @Override
                    public void onError(Throwable e)
                    {
                        List<Top> list = mTopDao.loadAll();
                        if (list == null || list.size() == 0)
                        {
                            mView.showError(e.getMessage());
                        } else
                        {
                            mView.showData(list);
                        }
                    }

                    @Override
                    public void onNext(List<Top> data)
                    {
                        if (data != null && data.size() != 0)
                        {
                            mView.showData(data);
                            if (p == 1)
                            {
                                mTopDao.insertOrReplaceInTx(data);
                            }
                        }
                    }

                };
                break;
            case "视频":
                final VideoesDao mVideoesDao = Application.mSession.getVideoesDao();
                o = mService.getVideoService(tag.getTag(), p)
                        .map(new Func1<MsgChildModel<Videoes>, List<Videoes>>()
                        {
                            @Override
                            public List<Videoes> call(MsgChildModel<Videoes> model)
                            {
                                return model.getData();
                            }
                        });
                s = new Subscriber<List<Videoes>>()
                {
                    @Override
                    public void onCompleted()
                    {

                    }

                    @Override
                    public void onError(Throwable e)
                    {
                        List<Videoes> list = mVideoesDao.loadAll();
                        if (list == null || list.size() == 0)
                        {
                            mView.showError(e.getMessage());
                        } else
                        {
                            mView.showData(list);
                        }
                    }

                    @Override
                    public void onNext(List<Videoes> data)
                    {
                        if (data != null && data.size() != 0)
                        {
                            mView.showData(data);
                            if (p == 1)
                            {
                                mVideoesDao.insertOrReplaceInTx(data);
                            }
                        }
                    }

                };
                break;
            case "赛事":
                final MatchDao mMatchDao = Application.mSession.getMatchDao();
                o = mService.getMatchService(tag.getTag(), p)
                        .map(new Func1<MsgChildModel<Match>, List<Match>>()
                        {
                            @Override
                            public List<Match> call(MsgChildModel<Match> model)
                            {
                                return model.getData();
                            }

                        });
                s = new Subscriber<List<Match>>()
                {
                    @Override
                    public void onCompleted()
                    {

                    }

                    @Override
                    public void onError(Throwable e)
                    {
                        List<Match> list = mMatchDao.loadAll();
                        if (list == null || list.size() == 0)
                        {
                            mView.showError(e.getMessage());
                        } else
                        {
                            mView.showData(list);
                        }
                    }

                    @Override
                    public void onNext(List<Match> data)
                    {
                        if (data != null && data.size() != 0)
                        {
                            mView.showData(data);
                            if (p == 1)
                            {
                                mMatchDao.insertOrReplaceInTx(data);
                            }
                        }
                    }

                };
                break;
            case "靓照":
                final CharmingPhotoDao mCharmingPhotoDao = Application.mSession.getCharmingPhotoDao();
                o = mService.getCharmingService(tag.getTag(), p, Application.Uid, Application.Token)
                        .map(new Func1<MsgChildModel<CharmingPhoto>, List<CharmingPhoto>>()
                        {
                            @Override
                            public List<CharmingPhoto> call(MsgChildModel<CharmingPhoto> model)
                            {
                                return model.getData();
                            }

                        });
                s = new Subscriber<List<CharmingPhoto>>()
                {
                    @Override
                    public void onCompleted()
                    {

                    }

                    @Override
                    public void onError(Throwable e)
                    {
                        List<CharmingPhoto> list = mCharmingPhotoDao.loadAll();
                        if (list == null || list.size() == 0)
                        {
                            mView.showError(e.getMessage());
                        } else
                        {
                            mView.showData(list);
                        }
                    }

                    @Override
                    public void onNext(List<CharmingPhoto> data)
                    {
                        if (data != null && data.size() != 0)
                        {
                            mView.showData(data);
                            if (p == 1)
                            {
                                mCharmingPhotoDao.insertOrReplaceInTx(data);
                            }
                        }
                    }

                };
                break;
            case "囧图":
                final JiongPhotoDao mJiongPhotoDao = Application.mSession.getJiongPhotoDao();
                o = mService.getJiongService(tag.getTag(), p, Application.Uid, Application.Token)
                        .map(new Func1<MsgChildModel<JiongPhoto>, List<JiongPhoto>>()
                        {
                            @Override
                            public List<JiongPhoto> call(MsgChildModel<JiongPhoto> model)
                            {
                                return model.getData();
                            }
                        });
                s = new Subscriber<List<JiongPhoto>>()
                {
                    @Override
                    public void onCompleted()
                    {

                    }

                    @Override
                    public void onError(Throwable e)
                    {
                        List<JiongPhoto> list = mJiongPhotoDao.loadAll();
                        if (list == null || list.size() == 0)
                        {
                            mView.showError(e.getMessage());
                        } else
                        {
                            mView.showData(list);
                        }
                    }

                    @Override
                    public void onNext(List<JiongPhoto> data)
                    {
                        if (data != null && data.size() != 0)
                        {
                            mView.showData(data);
                            if (p == 1)
                            {
                                mJiongPhotoDao.insertOrReplaceInTx(data);
                            }
                        }
                    }
                };
                break;
            case "壁纸":
                final WallpaperDao mWallpaperDao = Application.mSession.getWallpaperDao();
                o = mService.getWallpaperService(tag.getTag(), p, Application.Uid, Application.Token)
                        .map(new Func1<MsgChildModel<Wallpaper>, List<Wallpaper>>()
                        {
                            @Override
                            public List<Wallpaper> call(MsgChildModel<Wallpaper> model)
                            {
                                return model.getData();
                            }

                        });
                s = new Subscriber<List<Wallpaper>>()
                {
                    @Override
                    public void onCompleted()
                    {

                    }

                    @Override
                    public void onError(Throwable e)
                    {
                        List<Wallpaper> list = mWallpaperDao.loadAll();
                        if (list == null || list.size() == 0)
                        {
                            mView.showError(e.getMessage());
                        } else
                        {
                            mView.showData(list);
                        }
                    }

                    @Override
                    public void onNext(List<Wallpaper> data)
                    {
                        if (data != null && data.size() != 0)
                        {
                            mView.showData(data);
                            if (p == 1)
                            {
                                mWallpaperDao.insertOrReplaceInTx(data);
                            }
                        }
                    }
                };
                break;
        }
        addSubscrible(o, s);
    }


}

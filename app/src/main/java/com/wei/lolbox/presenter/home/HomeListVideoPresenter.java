package com.wei.lolbox.presenter.home;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.wei.lolbox.Application;
import com.wei.lolbox.base.BaseClient;
import com.wei.lolbox.base.BasePresenter;
import com.wei.lolbox.base.BaseView;
import com.wei.lolbox.config.Config;
import com.wei.lolbox.model.home.HomeVideo;
import com.wei.lolbox.service.home.HomeService;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

import rx.Subscriber;
import rx.functions.Func1;

/**
 * 作者：赵若位
 * 时间：2018/1/9
 * 邮箱：1070138445@qq.com
 * 功能：
 */

public class HomeListVideoPresenter extends BasePresenter<BaseView>
{

    public HomeListVideoPresenter(BaseView mView)
    {
        super(mView);
    }


    public void loadingData(String id)
    {
        addSubscrible(BaseClient.getInstance().getRetrofit(Config.BASE_URL).create(HomeService.class)
                        .getListVideoService(id, Application.Uid, Application.Token)
                        .map(new Func1<String, List<HomeVideo>>()
                        {
                            @Override
                            public List<HomeVideo> call(String mS)
                            {
                                try
                                {

                                    JSONObject mJson = new JSONObject(mS);
                                    if (mJson.getInt("code") == 0)//请求成功
                                    {
                                        String articles = mJson.getJSONObject("data").getJSONArray("articles").toString();
                                        Gson mGson = new Gson();
                                        List<HomeVideo> mVideos = mGson.fromJson(articles, new TypeToken<List<HomeVideo>>()
                                        {
                                        }.getType());
                                        return mVideos;
                                    }

                                } catch (JSONException mE)
                                {
                                    mE.printStackTrace();
                                    return null;
                                }
                                return null;
                            }

                        })
                        .map(new Func1<List<HomeVideo>, List<HomeVideo>>()
                        {
                            @Override
                            public List<HomeVideo> call(List<HomeVideo> mVideos)
                            {
                                for (HomeVideo data : mVideos)
                                {
                                    data.setAccountName(data.getAccount().getName());
                                    data.setAccountImg(data.getAccount().getImg());
                                    if (data.getVideoInfo().getUrls() != null &&
                                            data.getVideoInfo().getUrls().size() != 0)
                                    {
                                        data.setUrl_video(data.getVideoInfo().getUrls().get(0));
                                    }
                                }
                                return mVideos;
                            }
                        }),
                new Subscriber<List<HomeVideo>>()
                {
                    @Override
                    public void onCompleted()
                    {

                    }

                    @Override
                    public void onError(Throwable e)
                    {
                        mView.showError(e.getMessage());
                    }

                    @Override
                    public void onNext(List<HomeVideo> mVideos)
                    {
                        mView.showData(mVideos);
                    }
                });
    }
}

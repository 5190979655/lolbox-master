package com.wei.lolbox.presenter.discover;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.wei.lolbox.base.BaseClient;
import com.wei.lolbox.base.BasePresenter;
import com.wei.lolbox.base.BaseView;
import com.wei.lolbox.config.Config;
import com.wei.lolbox.model.discover.Player;
import com.wei.lolbox.service.discover.DiscoverService;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

import rx.Subscriber;

/**
 * 作者：赵若位
 * 时间：2017/12/13
 * 邮箱：1070138445@qq.com
 * 功能：
 */

public class SearchPlayerPresenter extends BasePresenter<BaseView>
{
    public SearchPlayerPresenter(BaseView mView)
    {
        super(mView);
    }


    public void loadingData(String name, String zone)
    {
        addSubscrible(BaseClient.getInstance().getRetrofit(Config.BASE_DISCOVER).create(DiscoverService.class)
                .getPlayerService(name, zone), new Subscriber<String>()
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
            public void onNext(String s)
            {
                try
                {
                    JSONObject json = new JSONObject(s);
                    if (json.getJSONArray("player_list") != null)
                    {
                        Gson mGson = new Gson();
                        List<Player> list = mGson.fromJson(json.getJSONArray("player_list").toString(),
                                new TypeToken<List<Player>>()
                                {
                                }.getType());
                        mView.showData(list.get(0));
                    } else
                    {
                        mView.showError("json is null");
                    }
                } catch (JSONException mE)
                {
                    mE.printStackTrace();
                }
            }
        });
    }
}

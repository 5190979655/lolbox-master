package com.wei.lolbox.presenter.home;

import com.google.gson.Gson;
import com.wei.lolbox.Application;
import com.wei.lolbox.base.BaseClient;
import com.wei.lolbox.base.BasePresenter;
import com.wei.lolbox.base.BaseView;
import com.wei.lolbox.config.Config;
import com.wei.lolbox.model.home.Player;
import com.wei.lolbox.service.home.HomeService;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

import rx.Subscriber;
import rx.functions.Func1;

/**
 * 作者：赵若位
 * 时间：2017/12/23
 * 邮箱：1070138445@qq.com
 * 功能：
 */

public class PlayerPresenter extends BasePresenter<BaseView>
{

    public PlayerPresenter(BaseView mView)
    {
        super(mView);
    }


    public void loadingData()
    {
        addSubscrible(BaseClient.getInstance().getRetrofit(Config.BASE_HOME)
                        .create(HomeService.class).getPlayerService(Application.Uid, Application.Token)
                        .map(new Func1()
                        {
                            @Override
                            public Object call(Object o)
                            {
                                String str = (String) o;
                                try
                                {
                                    JSONObject json = new JSONObject(str);
                                    int code = json.getInt("code");
                                    if (code == 0)//有数据
                                    {
                                        String data = json.getJSONArray("data").get(0).toString();
                                        Gson mGson = new Gson();
                                        Player mPlayer = mGson.fromJson(data, Player.class);
                                        return mPlayer.getData();
                                    }
                                } catch (JSONException mE)
                                {
                                    mE.printStackTrace();
                                    return null;
                                }
                                return null;
                            }
                        }),
                new Subscriber<List<Player.PLayerListBean>>()
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
                    public void onNext(List<Player.PLayerListBean> list)
                    {
                        mView.showData(list);
                    }

                });
    }
}

package com.wei.lolbox.presenter.msg;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.wei.lolbox.Application;
import com.wei.lolbox.base.BaseClient;
import com.wei.lolbox.base.BasePresenter;
import com.wei.lolbox.base.BaseView;
import com.wei.lolbox.config.Config;
import com.wei.lolbox.dao.MsgTitleDao;
import com.wei.lolbox.model.msg.MsgTitle;
import com.wei.lolbox.service.msg.MsgService;

import java.util.List;

import rx.Subscriber;
import rx.functions.Func1;

/**
 * 作者：赵若位
 * 时间：2018/1/10
 * 邮箱：1070138445@qq.com
 * 功能：
 */

public class MsgTitlePresenter extends BasePresenter<BaseView>
{

    private MsgTitleDao mDao;

    public MsgTitlePresenter(BaseView mView)
    {
        super(mView);
        mDao = Application.mSession.getMsgTitleDao();
    }


    public void loadingData()
    {
        addSubscrible(BaseClient.getInstance().getRetrofit(Config.BASE_MSG).create(MsgService.class)
                .getTitleService()
                .map(new Func1<String, List<MsgTitle>>()
                {
                    @Override
                    public List<MsgTitle> call(String mS)
                    {
                        Gson mGson = new Gson();
                        List<MsgTitle> list = mGson.fromJson(mS, new TypeToken<List<MsgTitle>>()
                        {
                        }.getType());
                        return list;
                    }

                }), new Subscriber<List<MsgTitle>>()
        {
            @Override
            public void onCompleted()
            {

            }

            @Override
            public void onError(Throwable e)
            {
                List<MsgTitle> list = mDao.loadAll();
                if (list == null || list.size() == 0)
                {
                    mView.showError(e.getMessage());
                } else
                {
                    mView.showData(list);
                }
            }

            @Override
            public void onNext(List<MsgTitle> list)
            {
                mView.showData(list);
                mDao.insertOrReplaceInTx(list);
            }

        });
    }
}

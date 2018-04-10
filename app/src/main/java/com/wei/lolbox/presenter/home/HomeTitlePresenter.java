package com.wei.lolbox.presenter.home;

import com.wei.lolbox.Application;
import com.wei.lolbox.base.BaseClient;
import com.wei.lolbox.base.BaseModel;
import com.wei.lolbox.base.BasePresenter;
import com.wei.lolbox.base.BaseView;
import com.wei.lolbox.config.Config;
import com.wei.lolbox.dao.HomeTitleDao;
import com.wei.lolbox.model.home.HomeTitle;
import com.wei.lolbox.model.home.HomeTitleData;
import com.wei.lolbox.service.home.HomeService;

import java.util.List;

import rx.Subscriber;
import rx.functions.Func1;

/**
 * 作者：赵若位
 * 时间：2017/12/23
 * 邮箱：1070138445@qq.com
 * 功能：
 */

public class HomeTitlePresenter extends BasePresenter<BaseView>
{
    private HomeTitleDao mDao;

    public HomeTitlePresenter(BaseView mView)
    {
        super(mView);
        mDao = Application.mSession.getHomeTitleDao();
    }


    public void loadingData()
    {
        addSubscrible(BaseClient.getInstance().getRetrofit(Config.BASE_URL).create(HomeService.class)
                .getVideoTitleService(Application.Uid, Application.Token)
                .map(new Func1<BaseModel<HomeTitleData>, List<HomeTitle>>()
                {
                    @Override
                    public List<HomeTitle> call(BaseModel<HomeTitleData> model)
                    {
                        if (model.getCode() == 0)
                        {
                            List<HomeTitle> data = model.getData().getRoots();
                            for (HomeTitle title : data)
                            {
                                title.setIsVisiable(true);
                            }
                            mDao.insertOrReplaceInTx(data);
                            return data;
                        }
                        return null;
                    }
                }), new Subscriber<List<HomeTitle>>()
        {
            @Override
            public void onCompleted()
            {

            }

            @Override
            public void onError(Throwable e)
            {
                List<HomeTitle> list = mDao.loadAll();
                if (list == null || list.size() == 0)
                {
                    mView.showError(e.getMessage());
                } else
                {
                    mView.showData(list);
                }
            }

            @Override
            public void onNext(List<HomeTitle> data)
            {
                mView.showData(data);
            }
        });
    }
}

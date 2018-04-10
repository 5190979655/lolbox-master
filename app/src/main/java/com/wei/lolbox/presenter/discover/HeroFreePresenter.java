package com.wei.lolbox.presenter.discover;

import com.wei.lolbox.base.BaseClient;
import com.wei.lolbox.base.BasePresenter;
import com.wei.lolbox.base.BaseView;
import com.wei.lolbox.config.Config;
import com.wei.lolbox.model.discover.HeroListBean;
import com.wei.lolbox.service.discover.DiscoverService;

import rx.Subscriber;

/**
 * 作者：赵若位
 * 时间：2017/12/9
 * 邮箱：1070138445@qq.com
 * 功能：
 */

public class HeroFreePresenter extends BasePresenter<BaseView>
{
    public HeroFreePresenter(BaseView mView)
    {
        super(mView);
    }


    public void loadingData()
    {
        addSubscrible(BaseClient.getInstance().getRetrofit(Config.BASE_DISCOVER).create(DiscoverService.class)
                .getHeroFreeService(), new Subscriber<HeroListBean>()
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
            public void onNext(HeroListBean mHeroListBean)
            {
                mView.showData(mHeroListBean.getChampion_list());
            }


        });
    }
}

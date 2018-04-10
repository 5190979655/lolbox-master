package com.wei.lolbox.presenter.discover;

import com.wei.lolbox.Application;
import com.wei.lolbox.base.BaseClient;
import com.wei.lolbox.base.BasePresenter;
import com.wei.lolbox.base.BaseView;
import com.wei.lolbox.config.Config;
import com.wei.lolbox.dao.DaoSession;
import com.wei.lolbox.dao.HeroPositionDao;
import com.wei.lolbox.dao.HeroRolesDao;
import com.wei.lolbox.dao.HeroesDao;
import com.wei.lolbox.model.discover.HeroListBean;
import com.wei.lolbox.model.discover.HeroPosition;
import com.wei.lolbox.model.discover.HeroRoles;
import com.wei.lolbox.model.discover.Heroes;
import com.wei.lolbox.service.discover.DiscoverService;

import java.util.List;

import rx.Subscriber;

/**
 * 作者：赵若位
 * 时间：2017/12/9
 * 邮箱：1070138445@qq.com
 * 功能：
 */

public class HeroAllPresenter extends BasePresenter<BaseView>
{

    private DaoSession mSession;
    private HeroesDao mDao;
    private HeroRolesDao mHeroRolesDao;
    private HeroPositionDao mHeroPositionDao;

    public HeroAllPresenter(BaseView mView)
    {
        super(mView);
        mSession = Application.mSession;
        mDao = mSession.getHeroesDao();
        mHeroRolesDao = mSession.getHeroRolesDao();
        mHeroPositionDao = mSession.getHeroPositionDao();
    }

    public void loadingData()
    {
        addSubscrible(BaseClient.getInstance().getRetrofit(Config.DISCOVER_HERO_ALL).create(DiscoverService.class)
                .getHeroAllService(Application.Uid, Application.Token), new Subscriber<HeroListBean>()
        {
            @Override
            public void onCompleted()
            {

            }

            @Override
            public void onError(Throwable e)
            {
                List<Heroes> mList = mDao.loadAll();
                if (mList.size() == 0)
                {
                    mView.showError(e.getMessage());
                } else
                {
                    mView.showData(mList);
                }
            }

            @Override
            public void onNext(HeroListBean mHeroListBean)
            {
                List<Heroes> mList = mHeroListBean.getChampion_list();
                mView.showData(mList);
                mDao.insertOrReplaceInTx(mList);
                for (int i = 0; i < mList.size(); i++)
                {
                    List<HeroRoles> mRoles = mList.get(i).getRoles();
                    for (int j = 0; j < mRoles.size(); j++)
                    {
                        mRoles.get(j).setName(mList.get(i).getName());
                    }
                    mHeroRolesDao.insertOrReplaceInTx(mRoles);

                    List<HeroPosition> mPositions = mList.get(i).getPositions();
                    for (int j = 0; j < mPositions.size(); j++)
                    {
                        mPositions.get(j).setName(mList.get(i).getName());
                    }
                   mHeroPositionDao.insertOrReplaceInTx(mPositions);
                }


            }
        });
    }
}

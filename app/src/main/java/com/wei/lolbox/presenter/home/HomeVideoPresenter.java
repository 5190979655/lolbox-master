package com.wei.lolbox.presenter.home;

import com.wei.lolbox.Application;
import com.wei.lolbox.base.BaseClient;
import com.wei.lolbox.base.BaseModel;
import com.wei.lolbox.base.BasePresenter;
import com.wei.lolbox.base.BaseView;
import com.wei.lolbox.config.Config;
import com.wei.lolbox.dao.HomeVideoDao;
import com.wei.lolbox.model.home.HomeTitle;
import com.wei.lolbox.model.home.HomeVideo;
import com.wei.lolbox.model.home.HomeVideoData;
import com.wei.lolbox.service.home.HomeService;

import org.greenrobot.greendao.query.QueryBuilder;

import java.util.List;

import rx.Observable;
import rx.Subscriber;
import rx.functions.Func1;

/**
 * 作者：赵若位
 * 时间：2017/12/24
 * 邮箱：1070138445@qq.com
 * 功能：
 */

public class HomeVideoPresenter extends BasePresenter<BaseView>
{
    private HomeVideoDao mHomeVideoDao;

    public HomeVideoPresenter(BaseView mView)
    {
        super(mView);
    }


    public void loadingData(final HomeTitle tag)
    {
        mHomeVideoDao = Application.mSession.getHomeVideoDao();
        HomeService mService = BaseClient.getInstance().getRetrofit(Config.BASE_URL).create(HomeService.class);
        Observable o = null;
        if (tag.getName().equals("推荐"))
        {
            o = mService.getRecommendService(Application.Uid, Application.Token);

        } else if (tag.getName().equals("热门"))
        {
            o = mService.getHotService(Application.Uid, Application.Token);

        } else
        {

            o = mService.getOtherService(String.valueOf(tag.getId()), Application.Uid, Application.Token);
        }

        addSubscrible(o.map(new Func1<BaseModel<HomeVideoData<HomeVideo>>, List<HomeVideo>>()
        {
            @Override
            public List<HomeVideo> call(BaseModel<HomeVideoData<HomeVideo>> model)
            {
                if (model.getCode() == 0)
                {
                    List<HomeVideo> data = model.getData().getList();
                    return translate(data, tag.getName());
                }
                return null;
            }
        }), new Subscriber<List<HomeVideo>>()
        {
            @Override
            public void onCompleted()
            {

            }

            @Override
            public void onError(Throwable e)
            {
                QueryBuilder<HomeVideo> mBuilder = mHomeVideoDao.queryBuilder();
                mBuilder.where(HomeVideoDao.Properties.Tag.eq(tag.getName()));
                List<HomeVideo> list = mBuilder.build().list();
                if (list == null || list.size() == 0)
                {
                    mView.showError(e.getMessage());
                } else
                {
                    mView.showData(list);
                }
            }

            @Override
            public void onNext(List<HomeVideo> data)
            {
                mView.showData(data);
                mHomeVideoDao.insertOrReplaceInTx(data);
            }
        });
    }


    /**
     * 填补模型中的一些数据
     *
     * @param list
     * @param tag
     * @return
     */
    private List<HomeVideo> translate(List<HomeVideo> list, String tag)
    {
        for (HomeVideo mVideo : list)
        {
            mVideo.setAccountName(mVideo.getAccount().getName());
            mVideo.setAccountImg(mVideo.getAccount().getImg());
            mVideo.setTag(tag);
            if (mVideo.getVideoInfo() != null && mVideo.getVideoInfo().getUrls() != null &&
                    mVideo.getVideoInfo().getUrls().size() != 0)
            {
                mVideo.setUrl_video(mVideo.getVideoInfo().getUrls().get(0));
            } else
            {
                mVideo.setUrl_video("");
            }
        }
        return list;
    }
}

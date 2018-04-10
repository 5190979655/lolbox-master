package com.wei.lolbox.presenter.follow;

import com.wei.lolbox.Application;
import com.wei.lolbox.base.BaseClient;
import com.wei.lolbox.base.BaseModel;
import com.wei.lolbox.base.BasePresenter;
import com.wei.lolbox.base.BaseView;
import com.wei.lolbox.config.Config;
import com.wei.lolbox.model.follow.Author;
import com.wei.lolbox.model.follow.User;
import com.wei.lolbox.model.home.HomeVideo;
import com.wei.lolbox.service.follow.FollowService;

import java.util.List;

import rx.Subscriber;
import rx.functions.Func1;

/**
 * 作者：赵若位
 * 时间：2017/12/7
 * 邮箱：1070138445@qq.com
 * 功能：
 */

public class AuthorPresenter extends BasePresenter<BaseView>
{

    public AuthorPresenter(BaseView mView)
    {
        super(mView);
    }


    public void loadingData(long targetUid)
    {
        addSubscrible(BaseClient.getInstance().getRetrofit(Config.BASE_URL).create(FollowService.class)
                        .getAuthorService(targetUid, Application.Uid, Application.Token)
                        .map(new Func1<BaseModel<Author>, List<HomeVideo>>()
                        {
                            @Override
                            public List<HomeVideo> call(BaseModel<Author> model)
                            {
                                List<HomeVideo> list = model.getData().getArticles();
                                return translate(list);
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
                    public void onNext(List<HomeVideo> data)
                    {
                        mView.showData(data);
                    }
                });
    }


    private List<HomeVideo>  translate(List<HomeVideo> list)
    {
        if (list == null || list.size() == 0)
        {
            return null;
        }
        for (HomeVideo data : list)
        {
            data.setAccountImg(data.getAccount().getImg());
            data.setAccountName(data.getAccount().getName());

            if (data.getVideoInfo() != null
                    && data.getVideoInfo().getUrls() != null
                    && data.getVideoInfo().getUrls().size() != 0)
            {
                data.setUrl_video(data.getVideoInfo().getUrls().get(0));
            }
        }
        return list;
    }


}

package com.wei.lolbox.presenter.follow;

import com.wei.lolbox.Application;
import com.wei.lolbox.base.BaseClient;
import com.wei.lolbox.base.BaseModel;
import com.wei.lolbox.base.BasePresenter;
import com.wei.lolbox.base.BaseView;
import com.wei.lolbox.config.Config;
import com.wei.lolbox.model.follow.Follow;
import com.wei.lolbox.model.follow.User;
import com.wei.lolbox.model.home.HomeVideo;
import com.wei.lolbox.service.follow.FollowService;

import java.util.List;

import rx.Subscriber;
import rx.functions.Func1;

/**
 * 作者：赵若位
 * 时间：2017/12/6
 * 邮箱：1070138445@qq.com
 * 功能：
 */

public class FollowPresenter extends BasePresenter<BaseView>
{

    public FollowPresenter(BaseView mView)
    {
        super(mView);
    }


    public void loadingAuthorData()
    {
        addSubscrible(BaseClient.getInstance().getRetrofit(Config.BASE_URL).create(FollowService.class).
                getFollowService(Application.Uid, Application.Token), new Subscriber<Follow>()
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
            public void onNext(Follow mVideoPlayer)
            {
                mView.showData(mVideoPlayer.getData().getCategories());
            }

        });
    }


    public void loadingUSerData(String word)
    {
        addSubscrible(BaseClient.getInstance().getRetrofit(Config.BASE_URL).create(FollowService.class)
                .getUserService(word, Application.Uid, Application.Token)
                .map(new Func1<BaseModel<User>,User>()
                {
                    @Override
                    public User call(BaseModel<User> model)
                    {
                        List<HomeVideo> list = model.getData().getArticles();
                        translate(list);
                        return model.getData();
                    }
                }),
                new Subscriber<User>()
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
            public void onNext(User mUser)
            {
                mView.showData(mUser);
            }
        });
    }


    private List<HomeVideo> translate(List<HomeVideo> list)
    {
        if (list == null || list.size() == 0)
        {
            return null;
        }
        for (HomeVideo data : list)
        {
            data.setAccountName(data.getAccount().getName());
            data.setAccountImg(data.getAccount().getImg());
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

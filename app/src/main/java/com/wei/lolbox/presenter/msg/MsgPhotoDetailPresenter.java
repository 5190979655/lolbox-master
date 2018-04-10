package com.wei.lolbox.presenter.msg;

import com.wei.lolbox.Application;
import com.wei.lolbox.base.BaseClient;
import com.wei.lolbox.base.BasePresenter;
import com.wei.lolbox.base.BaseView;
import com.wei.lolbox.config.Config;
import com.wei.lolbox.model.msg.MsgChildModel;
import com.wei.lolbox.model.msg.PhotoDetailModel;
import com.wei.lolbox.service.msg.MsgService;

import java.util.List;

import rx.Subscriber;
import rx.functions.Func1;

/**
 * 作者：赵若位
 * 时间：2018/1/15
 * 邮箱：1070138445@qq.com
 * 功能：
 */

public class MsgPhotoDetailPresenter extends BasePresenter<BaseView>
{
    public MsgPhotoDetailPresenter(BaseView mView)
    {
        super(mView);
    }

    public void loadingData(String albumId)
    {
        addSubscrible(BaseClient.getInstance().getRetrofit(Config.BASE_MSG).create(MsgService.class)
                        .getPhotoDetailService(albumId, Application.Uid, Application.Token)
                        .map(new Func1<PhotoDetailModel, List<PhotoDetailModel.Pictures>>()
                        {

                            @Override
                            public List<PhotoDetailModel.Pictures> call(PhotoDetailModel model)
                            {
                                return model.getPictures();
                            }
                        }),
                new Subscriber<List<PhotoDetailModel.Pictures>>()
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
                    public void onNext(List<PhotoDetailModel.Pictures> data)
                    {
                        mView.showData(data);
                    }

                });
    }

}

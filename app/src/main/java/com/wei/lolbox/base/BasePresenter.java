package com.wei.lolbox.base;

import rx.Observable;
import rx.Scheduler;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import rx.subscriptions.CompositeSubscription;

/**
 * 作者：赵若位
 * 时间：2017/11/28
 * 邮箱：1070138445@qq.com
 * 功能：
 */

public class BasePresenter<V>
{

    public V mView;
    private CompositeSubscription mSubscription;


    public BasePresenter(V mView)
    {
        attchView(mView);
    }


    public void attchView(V mView)
    {
        this.mView = mView;
    }


    public void addSubscrible(Observable o, Subscriber s)
    {
        if (mSubscription == null)
        {
            mSubscription = new CompositeSubscription();
        }
        mSubscription.add(
                o.subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread()).subscribe(s)
        );
    }


    public void unSubscrible()
    {
        if (mSubscription != null && mSubscription.hasSubscriptions())
        {
            mSubscription.unsubscribe();
        }
    }

}

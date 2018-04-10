package com.wei.lolbox.base;


import com.google.gson.GsonBuilder;
import com.orhanobut.logger.Logger;
import com.wei.lolbox.Application;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

/**
 * 作者：赵若位
 * 时间：2017/10/12 18:19
 * 功能：
 */

public class BaseClient
{
    private static BaseClient mBaseRetrofit;
    private OkHttpClient mClient;
    private Retrofit mRetrofit;

    private BaseClient()
    {
    }

    public OkHttpClient getClient()
    {
        mClient = new OkHttpClient.Builder()
                .addInterceptor(mLogInterceptor)//添加log拦截器
                .addInterceptor(mHeaderInterceptor)
                .connectTimeout(10, TimeUnit.SECONDS)
                .readTimeout(20, TimeUnit.SECONDS)
                .build();
        return mClient;
    }

    //
    public Retrofit getRetrofit(String base_url)
    {
        mRetrofit = new Retrofit.Builder()
                .baseUrl(base_url)
                .addConverterFactory(ScalarsConverterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(new GsonBuilder().create()))
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())//支持RxJava
                .client(getClient())
                .build();
        return mRetrofit;
    }

    //单例模式
    public static BaseClient getInstance()
    {
        if (mBaseRetrofit == null)
        {
            synchronized (BaseClient.class)
            {
                if (mBaseRetrofit == null)
                {
                    mBaseRetrofit = new BaseClient();
                }
            }
        }
        return mBaseRetrofit;
    }


    /**
     * 日志拦截器
     */
    private Interceptor mLogInterceptor = new Interceptor()
    {
        @Override
        public Response intercept(Chain chain) throws IOException
        {
            Request request = chain.request();
            long startTime = System.currentTimeMillis();
            okhttp3.Response response = chain.proceed(chain.request());
            long endTime = System.currentTimeMillis();
            long duration = endTime - startTime;
            okhttp3.MediaType mediaType = response.body().contentType();
            String content = response.body().string();
            Logger.json(content);
            return response.newBuilder()
                    .body(okhttp3.ResponseBody.create(mediaType, content))
                    .build();
        }
    };


    //添加Cookie
    private Interceptor mHeaderInterceptor = new Interceptor()
    {
        @Override
        public Response intercept(Chain chain) throws IOException
        {
            Request.Builder builder = chain.request().newBuilder();
            builder.addHeader("Dw-Guid", Application.Cookie_Guid);
            builder.addHeader("Dw-Ua", Application.Cookie_Ua);
            return chain.proceed(builder.build());
        }
    };
}

package com.wei.lolbox.base;

import com.google.gson.annotations.SerializedName;


/**
 * 作者：赵若位
 * 时间：2018/1/17
 * 邮箱：1070138445@qq.com
 * 功能：
 */

public class BaseModel<T>
{

    /**
     * code : 0
     * data : {}
     * result : 1
     */

    private int code;
    @SerializedName("data")
    private T data;
    private int result;


    public int getCode()
    {
        return code;
    }

    public void setCode(int mCode)
    {
        code = mCode;
    }

    public T getData()
    {
        return data;
    }

    public void setData(T mData)
    {
        data = mData;
    }

    public int getResult()
    {
        return result;
    }

    public void setResult(int mResult)
    {
        result = mResult;
    }
}


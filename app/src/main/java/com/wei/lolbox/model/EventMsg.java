package com.wei.lolbox.model;

/**
 * 作者：赵若位
 * 时间：2017/12/16
 * 邮箱：1070138445@qq.com
 * 功能：
 */

public class EventMsg<T>
{


    private String className;
    private int msgCode;
    private T t;

    public EventMsg(String mClassName, int mMsgCode)
    {
        className = mClassName;
        msgCode = mMsgCode;
    }

    public EventMsg(String mClassName, int mMsgCode, T mT)
    {
        className = mClassName;
        msgCode = mMsgCode;
        t = mT;
    }

    public String getClassName()
    {
        return className;
    }

    public void setClassName(String mClassName)
    {
        className = mClassName;
    }

    public int getMsgCode()
    {
        return msgCode;
    }

    public void setMsgCode(int mMsgCode)
    {
        msgCode = mMsgCode;
    }

    public T getT()
    {
        return t;
    }

    public void setT(T mT)
    {
        t = mT;
    }
}

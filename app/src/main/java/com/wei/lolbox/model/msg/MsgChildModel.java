package com.wei.lolbox.model.msg;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * 作者：赵若位
 * 时间：2018/1/15
 * 邮箱：1070138445@qq.com
 * 功能：
 */

public class MsgChildModel<T>
{


    /**
     * totalRecord : 32105
     * totalPage : 1285
     * data : []
     * rs : true
     * msg :
     * order : time
     * pageSize : 25
     * pageNum : 1
     * pictures:
     * headerline : []
     */
    private String totalRecord;
    private int totalPage;
    private boolean rs;
    private String msg;
    private String order;
    private int pageSize;
    private int pageNum;

    @SerializedName("data")
    private List<T> data;

    @SerializedName("headerline")
    private List<TopHeader> headerline;

    @SerializedName("pictures")
    private List<T> pictures;

    public String getTotalRecord()
    {
        return totalRecord;
    }

    public void setTotalRecord(String mTotalRecord)
    {
        totalRecord = mTotalRecord;
    }

    public int getTotalPage()
    {
        return totalPage;
    }

    public void setTotalPage(int mTotalPage)
    {
        totalPage = mTotalPage;
    }

    public boolean isRs()
    {
        return rs;
    }

    public void setRs(boolean mRs)
    {
        rs = mRs;
    }

    public String getMsg()
    {
        return msg;
    }

    public void setMsg(String mMsg)
    {
        msg = mMsg;
    }

    public String getOrder()
    {
        return order;
    }

    public void setOrder(String mOrder)
    {
        order = mOrder;
    }

    public int getPageSize()
    {
        return pageSize;
    }

    public void setPageSize(int mPageSize)
    {
        pageSize = mPageSize;
    }

    public int getPageNum()
    {
        return pageNum;
    }

    public void setPageNum(int mPageNum)
    {
        pageNum = mPageNum;
    }

    public List<T> getData()
    {
        return data;
    }

    public void setData(List<T> mData)
    {
        data = mData;
    }

    public List<TopHeader> getHeaderline()
    {
        return headerline;
    }

    public void setHeaderline(List<TopHeader> mHeaderline)
    {
        headerline = mHeaderline;
    }

    public List<T> getPictures()
    {
        return pictures;
    }

    public void setPictures(List<T> mPictures)
    {
        pictures = mPictures;
    }
}

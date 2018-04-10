package com.wei.lolbox.base;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.zhy.autolayout.utils.AutoUtils;

import butterknife.ButterKnife;

/**
 * 作者：赵若位
 * 时间：2017/12/17
 * 邮箱：1070138445@qq.com
 * 功能：
 */

public class BaseEmptyViewHolder extends RecyclerView.ViewHolder
{

    public BaseEmptyViewHolder(View itemView)
    {
        super(itemView);
        AutoUtils.autoSize(itemView);
        ButterKnife.bind(this,itemView);
    }
}

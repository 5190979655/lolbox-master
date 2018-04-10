package com.wei.lolbox.utils;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.wei.lolbox.model.msg.TopHeader;
import com.wei.lolbox.ui.activity.MsgDetailWebActivity;
import com.youth.banner.loader.ImageLoader;

/**
 * 作者：赵若位
 * 时间：2018/1/16
 * 邮箱：1070138445@qq.com
 * 功能：
 */

public class BannerImageLoader extends ImageLoader
{
    @Override
    public void displayImage(final Context context, Object path, ImageView imageView)
    {

        //Picasso 加载图片简单用法
        final TopHeader mHeader = (TopHeader) path;
        Picasso.with(context.getApplicationContext())
                .load(mHeader.getPhoto())
                .resize(320, 170)
                .centerCrop()
                .into(imageView);


        imageView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent it = new Intent(context.getApplicationContext(), MsgDetailWebActivity.class);
                String url = StringUtils.getMsgDetailUrl(mHeader.getCommentUrl());
                it.putExtra("url", url);
                it.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);
                context.startActivity(it);
            }
        });
    }
}

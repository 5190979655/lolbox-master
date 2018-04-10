package com.wei.lolbox.ui.adapter.msg;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.orhanobut.logger.Logger;
import com.squareup.picasso.Picasso;
import com.wei.lolbox.R;
import com.wei.lolbox.model.msg.PhotoDetailModel;
import com.wei.lolbox.utils.ScreenUtils;
import com.zhy.autolayout.utils.AutoUtils;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * 作者：赵若位
 * 时间：2017/12/4
 * 邮箱：1070138445@qq.com
 * 功能：靓照 囧图，壁纸图片详情
 */

public class PhotoDetailAdapter extends RecyclerView.Adapter<PhotoDetailAdapter.ViewHolder>
{


    private Context mContext;
    private List<PhotoDetailModel.Pictures> mList;
    private int[] mScreen;


    //
    public PhotoDetailAdapter(Context mContext)
    {
        this.mContext = mContext.getApplicationContext();
        mList = new ArrayList<>();
        mScreen = ScreenUtils.getScreen(mContext);
    }


    public void update(List<PhotoDetailModel.Pictures> list)
    {
        if (list == null || list.size() == 0)
        {
            return;
        }

        mList.clear();
        mList.addAll(list);
        notifyDataSetChanged();
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View layout = LayoutInflater.from(mContext).inflate(R.layout.item_msg_detail_photo, parent, false);
        ViewHolder holder = new ViewHolder(layout);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position)
    {
        final PhotoDetailModel.Pictures data = mList.get(position);

        /*************************加载图片********************************************/
        int mWidth = data.getFileWidth();
        int mHeight = data.getFileHeight();
        ViewGroup.LayoutParams mParams = holder.mItemImage.getLayoutParams();

        if (mWidth >= mHeight)
        {
            mParams.width = ViewGroup.LayoutParams.MATCH_PARENT;
            mParams.height = mScreen[0] * mHeight / mWidth;
        } else
        {
           int height =  mScreen[1] * (1 - 88 / 1280);
            mParams.width = height * mWidth / mHeight;
            mParams.height = ViewGroup.LayoutParams.MATCH_PARENT;
        }

        holder.mItemImage.setLayoutParams(mParams);
        Picasso.with(mContext)
                .load(data.getUrl())
                .resize(mWidth, mHeight)
                .centerCrop()
                .into(holder.mItemImage);
    }

    @Override
    public int getItemCount()
    {
        return mList == null ? 0 : mList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder
    {

        @Bind(R.id.item_image)
        ImageView mItemImage;

        public ViewHolder(View itemView)
        {
            super(itemView);
            AutoUtils.autoSize(itemView);
            ButterKnife.bind(this, itemView);
        }
    }


}

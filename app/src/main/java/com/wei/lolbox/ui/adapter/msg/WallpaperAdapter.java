package com.wei.lolbox.ui.adapter.msg;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.wei.lolbox.R;
import com.wei.lolbox.model.msg.Wallpaper;
import com.wei.lolbox.ui.activity.MsgDetailPictureActivity;
import com.wei.lolbox.utils.ScreenUtils;
import com.zhy.autolayout.utils.AutoUtils;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * 作者：赵若位
 * 时间：2017/12/3
 * 邮箱：1070138445@qq.com
 * 功能：
 */

public class WallpaperAdapter extends RecyclerView.Adapter<WallpaperAdapter.ViewHolder>
{

    private Context mContext;
    private List<Wallpaper> mList;
    private int mWidth = 0;

    public WallpaperAdapter(Context mContext)
    {
        this.mContext = mContext.getApplicationContext();
        mList = new ArrayList<>();
        int[] mScreen = ScreenUtils.getScreen(mContext);
        mWidth = (mScreen[0] / 2) - 16;
    }

    public void update(List<Wallpaper> list, int type)
    {
        if (list == null || list.size() == 0)
        {
            return;
        }
        switch (type)
        {
            case 0:
                mList.clear();
                mList.addAll(list);
                notifyDataSetChanged();
                break;
            case 1:
                int mSize = mList.size();
                mList.addAll(list);
                notifyItemRangeInserted(mSize, mList.size() - 1);
                break;
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View layout = LayoutInflater.from(mContext).inflate(R.layout.item_msg_wallpaper, parent, false);
        ViewHolder holder = new ViewHolder(layout);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position)
    {

        ViewGroup.LayoutParams mParams = holder.mItemImage.getLayoutParams();
        mParams.width = mWidth;
        mParams.height = mWidth * mList.get(position).getCoverHeight() / mList.get(position).getCoverWidth();
        holder.mItemImage.setLayoutParams(mParams);


        Picasso.with(mContext)
                .load(mList.get(position).getCoverUrl())
                .fit()
                .centerCrop()
                .into(holder.mItemImage);

        holder.mItemNumber.setText("共" + mList.get(position).getPicsum() + "张");
        holder.mItemDescript.setText(mList.get(position).getTitle());

        holder.itemView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent it = new Intent(mContext, MsgDetailPictureActivity.class);
                it.putExtra("MsgDetailPictureActivity", mList.get(position).getGalleryId());
                it.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);
                mContext.startActivity(it);
            }
        });
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
        @Bind(R.id.item_number)
        TextView mItemNumber;
        @Bind(R.id.item_descript)
        TextView mItemDescript;

        public ViewHolder(View itemView)
        {
            super(itemView);
            AutoUtils.autoSize(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}

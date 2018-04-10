package com.wei.lolbox.ui.adapter.home;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.wei.lolbox.R;
import com.wei.lolbox.base.BaseEmptyViewHolder;
import com.wei.lolbox.config.Config;
import com.wei.lolbox.model.home.Player;
import com.zhy.autolayout.utils.AutoUtils;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * 作者：赵若位
 * 时间：2017/12/23
 * 邮箱：1070138445@qq.com
 * 功能：首页-直播-适配器
 */

public class PlayerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>
{


    private Context mContext;
    private List<Player.PLayerListBean> mList;

    private static final int TYPE_HEAD = 0;//下拉刷新
    private static final int TYPE_FOOTER = 1;//上拉加载更多
    private static final int TYPE_EMPTY = 2;//空数据页面

    //
    public PlayerAdapter(Context mContext)
    {
        this.mContext = mContext.getApplicationContext();
        mList = new ArrayList<>();
    }

    /**
     * 更新数据
     *
     * @param list     新的数据源
     * @param position 更新数据的位置
     */
    public void update(List<Player.PLayerListBean> list, int position)
    {
        if (list == null || list.size() == 0)
        {
            return;
        }

        switch (position)
        {
            case TYPE_HEAD:
                mList.clear();
                mList.addAll(list);
                notifyDataSetChanged();
                break;
            case TYPE_FOOTER:
                int mSize = mList.size();
                mList.addAll(list);
                notifyItemRangeInserted(mSize - 1, list.size());
                break;
        }
    }


    @Override
    public int getItemViewType(int position)
    {
        if (mList == null||mList.size() == 0) return TYPE_EMPTY;
        return TYPE_FOOTER;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View layout = null;
        RecyclerView.ViewHolder holder = null;
        switch (viewType)
        {
            case TYPE_EMPTY:
                layout = LayoutInflater.from(mContext).inflate(R.layout.item_follow_empty, parent, false);
                holder = new BaseEmptyViewHolder(layout);
                break;
            case TYPE_FOOTER:
                layout = LayoutInflater.from(mContext).inflate(R.layout.item_home_player, parent, false);
                holder = new NormalViewHolder(layout);
                break;
        }
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position)
    {
        if (getItemId(position) == TYPE_EMPTY) return;
        if (holder instanceof NormalViewHolder)
        {
            Picasso.with(mContext)
                    .load(mList.get(position).getThumb())
                    .resize(260, 220)
                    .centerCrop()
                    .into(((NormalViewHolder) holder).mItemImage);

            ((NormalViewHolder) holder).mItemTitle.setText(mList.get(position).getDesc());

            Drawable mDrawable = mContext.getResources().getDrawable(R.drawable.fanhe_icon_video_times);
            mDrawable.setBounds(0, 0, 30, 28);
            ((NormalViewHolder) holder).mItemNumber.setCompoundDrawables(mDrawable, null, null, null);
            ((NormalViewHolder) holder).mItemNumber.setText(mList.get(position).getUsers());
            holder.itemView.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    Config.showToast(mContext);
                }
            });
        }
    }

    @Override
    public int getItemCount()
    {
        return mList == null ? 0 : mList.size();
    }





    public class NormalViewHolder extends RecyclerView.ViewHolder
    {
        @Bind(R.id.item_image)
        ImageView mItemImage;
        @Bind(R.id.item_title)
        TextView mItemTitle;
        @Bind(R.id.item_number)
        TextView mItemNumber;

        public NormalViewHolder(View itemView)
        {
            super(itemView);
            AutoUtils.autoSize(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}

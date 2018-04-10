package com.wei.lolbox.ui.adapter.discover;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.wei.lolbox.R;
import com.wei.lolbox.model.discover.PlayerCache;
import com.zhy.autolayout.utils.AutoUtils;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * 作者：赵若位
 * 时间：2017/12/17
 * 邮箱：1070138445@qq.com
 * 功能：
 */

public class HeroSearchPlayerCacheAdapter extends RecyclerView.Adapter<HeroSearchPlayerCacheAdapter.ViewHolder>
{

    private Context mContext;
    private List<PlayerCache> mList;
    private OnItemClickListener mListener;

    public HeroSearchPlayerCacheAdapter(Context mContext)
    {
        this.mContext = mContext.getApplicationContext();
        mList = new ArrayList<>();
    }


    //刷新整个数据
    public void update(List<PlayerCache> list)
    {
        mList.clear();
        mList.addAll(list);
        notifyDataSetChanged();
    }


    //刷新单个数据
    public void update(PlayerCache cache)
    {
        if (cache == null)
        {
            return;
        }
        mList.add(cache);
        notifyItemChanged(mList.size() - 1);
    }

    public void setOnItemClickListener(OnItemClickListener listener)
    {
        this.mListener = listener;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View layout = LayoutInflater.from(mContext).inflate(R.layout.item_discover_search_player_cache, parent, false);
        ViewHolder holder = new ViewHolder(layout);
        return holder;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position)
    {
        PlayerCache data = mList.get(position);
        holder.mItemName.setText(data.getUserName());
        holder.mItemTitle.setText(data.getServiceName() + "  " + data.getServiceId());

        holder.itemView.setTag(data);
        holder.itemView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                mListener.click(v, (PlayerCache) holder.itemView.getTag(), position);
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
        @Bind(R.id.item_name)
        TextView mItemName;
        @Bind(R.id.item_title)
        TextView mItemTitle;

        public ViewHolder(View itemView)
        {
            super(itemView);
            AutoUtils.autoSize(itemView);
            ButterKnife.bind(this, itemView);
        }
    }


    public interface OnItemClickListener
    {
        void click(View mView, PlayerCache mCache, int position);
    }
}


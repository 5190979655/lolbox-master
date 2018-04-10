package com.wei.lolbox.ui.adapter.discover;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.wei.lolbox.R;
import com.zhy.autolayout.utils.AutoUtils;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * 作者：赵若位
 * 时间：2017/12/11
 * 邮箱：1070138445@qq.com
 * 功能：
 */

public class HeroSearchMoneyChildAdapter extends RecyclerView.Adapter<HeroSearchMoneyChildAdapter.ViewHolder>
{

    private Context mContext;
    private String[] mList;
    private int lastPosition = -1;
    private int mCount = -1;
    private OnItemClickListener mListener;


    //
    public HeroSearchMoneyChildAdapter(Context mContext,int count)
    {
        this.mContext = mContext.getApplicationContext();
        mList = new String[]{};
        this.mCount = count;
    }

    /**
     * 更新数据
     * @param list
     */
    public void update(String[] list)
    {
        if (list == null || list.length == 0)
        {
            return;
        }
        this.mList = list;
        notifyDataSetChanged();
    }


    public void setPosition(int i)
    {
        lastPosition = i;
        notifyDataSetChanged();
    }


    public void setOnItemClickListener( OnItemClickListener listener)
    {
        this.mListener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View layout = LayoutInflater.from(mContext).inflate(R.layout.item_discover_hero_search_type, parent, false);
        ViewHolder holder = new ViewHolder(layout);
        return holder;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position)
    {
        holder.mItemTitle.setText(mList[position]);

        holder.itemView.setTag(mList[position]);
        holder.itemView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                lastPosition = position;
                mListener.click(v, (String) holder.itemView.getTag(), mCount,position);
                notifyDataSetChanged();
            }
        });

        if (lastPosition == position)
        {
            holder.mItemTitle.setBackgroundResource(R.drawable.shape_follow_hero_tv_pressed);
            holder.mItemTitle.setTextColor(mContext.getResources().getColor(R.color.white));
        } else
        {
            holder.mItemTitle.setBackgroundResource(R.drawable.shape_follow_hero_tv_normal);
            holder.mItemTitle.setTextColor(Color.parseColor("#808080"));
        }
    }

    @Override
    public int getItemCount()
    {
        return mList == null ? 0 : mList.length;
    }


    public class ViewHolder extends RecyclerView.ViewHolder
    {
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
        void click(View mView, String s, int count,int position);
    }
}


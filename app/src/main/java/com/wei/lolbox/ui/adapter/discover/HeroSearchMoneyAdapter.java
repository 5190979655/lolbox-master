package com.wei.lolbox.ui.adapter.discover;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.wei.lolbox.R;
import com.wei.lolbox.config.Config;
import com.zhy.autolayout.utils.AutoUtils;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * 作者：赵若位
 * 时间：2017/12/11
 * 邮箱：1070138445@qq.com
 * 功能：
 */

public class HeroSearchMoneyAdapter extends RecyclerView.Adapter<HeroSearchMoneyAdapter.ViewHolder>
{

    private Context mContext;
    private List<String[]> mList;
    private List<HeroSearchMoneyChildAdapter> mObjects;
    private OnItemClickListener mListener;

    //
    public HeroSearchMoneyAdapter(Context mContext)
    {
        this.mContext = mContext.getApplicationContext();
        mList = new ArrayList<>();
        mObjects = new ArrayList<>();

    }

    /**
     * 更新数据
     */
    public void update()
    {
        mList.clear();
        mList.add(new String[]{"全部"});
        mList.add(Config.DISOVER_HERO_MONEY_RMB);
        mList.add(Config.DISOVER_HERO_MONEY_GLOD);
        notifyDataSetChanged();
    }

    public void setOnItemClickListener(OnItemClickListener listener)
    {
        this.mListener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View layout = LayoutInflater.from(mContext).inflate(R.layout.item_discover_hero_search_money, parent, false);
        ViewHolder holder = new ViewHolder(layout);
        return holder;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position)
    {
        if (position == 0)
        {
            holder.mItemTitle.setVisibility(View.GONE);

        } else if (position == getItemCount() - 1)
        {
            holder.mItemTitle.setText("金币");
        } else
        {
            holder.mItemTitle.setText("点券");
        }

        GridLayoutManager manager = new GridLayoutManager(mContext, 4);
        holder.mItemChild.setLayoutManager(manager);
        final HeroSearchMoneyChildAdapter adapter = new HeroSearchMoneyChildAdapter(mContext, position);
        holder.mItemChild.setAdapter(adapter);
        adapter.update(mList.get(position));
        if (position == 0)
        {
            adapter.setPosition(0);
        }
        mObjects.add(adapter);

        adapter.setOnItemClickListener(new HeroSearchMoneyChildAdapter.OnItemClickListener()
        {
            @Override
            public void click(View mView, String s, int count, int p)
            {
                for (int i = 0; i < mObjects.size(); i++)
                {
                    HeroSearchMoneyChildAdapter mAdapter = mObjects.get(i);
                    mAdapter.setPosition(-1);
                    if (count == i)
                    {
                        mAdapter.setPosition(p);
                    }
                }
                mListener.onClick(s,count);
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
        @Bind(R.id.item_title)
        TextView mItemTitle;
        @Bind(R.id.item_child)
        RecyclerView mItemChild;

        public ViewHolder(View itemView)
        {
            super(itemView);
            AutoUtils.autoSize(itemView);
            ButterKnife.bind(this, itemView);
        }
    }


    public interface OnItemClickListener
    {
        void onClick(String s, int count);
    }

}

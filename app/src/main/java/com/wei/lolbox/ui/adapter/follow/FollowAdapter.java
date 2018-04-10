package com.wei.lolbox.ui.adapter.follow;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.orhanobut.logger.Logger;
import com.squareup.picasso.Picasso;
import com.wei.lolbox.R;
import com.wei.lolbox.model.follow.Follow;
import com.zhy.autolayout.utils.AutoUtils;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * 作者：赵若位
 * 时间：2017/12/6
 * 邮箱：1070138445@qq.com
 * 功能：关注列表适配器
 */

public class FollowAdapter extends RecyclerView.Adapter<FollowAdapter.ViewHolder>
{

    private Context mContext;
    private List<Follow.DataBean.CategoriesBean> mList;


    //
    public FollowAdapter(Context context)
    {
        this.mContext = context.getApplicationContext();
        mList = new ArrayList<>();
    }


    /**
     * 更新数据
     *
     * @param list
     */
    public void update(List<Follow.DataBean.CategoriesBean> list)
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
        View layout = LayoutInflater.from(mContext).inflate(R.layout.item_follow, parent, false);
        ViewHolder holder = new ViewHolder(layout);
        return holder;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position)
    {
        final List<Follow.DataBean.CategoriesBean.MediaAccountsBean> mAccounts = mList.get(position).getMediaAccounts();
        final int mSize = mAccounts.size();//该条数据源的长度
        holder.mItemTitle.setText(mList.get(position).getName());
        GridLayoutManager mManager = new GridLayoutManager(mContext, 4);

        holder.mItemChild.setLayoutManager(mManager);
        final FollowChildAdapter mAdapter = new FollowChildAdapter(mContext);
        holder.mItemChild.setAdapter(mAdapter);


        if (mSize > 8 && mList.get(position).getCid() < 0)//显示所有列表
        {
            holder.mItemIcon.setImageResource(R.drawable.fanhe_icon_up);
            holder.mItemIcon.setVisibility(View.VISIBLE);
            mAdapter.update(mAccounts);

        }else
        {
            if (mSize > 8)
            {
                holder.mItemIcon.setImageResource(R.drawable.fanhe_icon_down);
                holder.mItemIcon.setVisibility(View.VISIBLE);
                mAdapter.update(mAccounts.subList(0, 8));
            }else
            {
                holder.mItemIcon.setVisibility(View.GONE);
                mAdapter.update(mAccounts);
            }
        }

        holder.mItemIcon.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (mSize > 8 && mList.get(position).getCid() >= 0)//有超过8条数据并且处于隐藏状态,点击就展开数据
                {
                    mAdapter.addData(mAccounts.subList(8, mSize));
                    holder.mItemIcon.setImageResource(R.drawable.fanhe_icon_up);
                    mList.get(position).setCid(-1);
                }else
                {
                    mAdapter.hideData();
                    holder.mItemIcon.setImageResource(R.drawable.fanhe_icon_down);
                    mList.get(position).setCid(1);
                }
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
        @Bind(R.id.item_icon)
        ImageView mItemIcon;
        @Bind(R.id.item_child)
        RecyclerView mItemChild;

        public ViewHolder(View itemView)
        {
            super(itemView);
            AutoUtils.autoSize(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

}

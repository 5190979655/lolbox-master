package com.wei.lolbox.ui.adapter.follow;

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
import com.wei.lolbox.model.follow.Follow;
import com.wei.lolbox.ui.activity.FollowAuthorActivity;
import com.wei.lolbox.utils.RoundTransform;
import com.zhy.autolayout.utils.AutoUtils;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * 作者：赵若位
 * 时间：2017/12/6
 * 邮箱：1070138445@qq.com
 * 功能：
 */

public class FollowChildAdapter extends RecyclerView.Adapter<FollowChildAdapter.ViewHolder>
{


    private Context mContext;
    private List<Follow.DataBean.CategoriesBean.MediaAccountsBean> mList;

    //
    public FollowChildAdapter(Context mContext)
    {
        this.mContext = mContext.getApplicationContext();
        mList = new ArrayList<>();
    }

    /**
     * Flush all data
     * @param list the data of list
     */
    public void update(List<Follow.DataBean.CategoriesBean.MediaAccountsBean> list)
    {
        if (list == null || list.size() == 0)
        {
            return;
        }
        mList.clear();
        mList.addAll(list);
        notifyDataSetChanged();
    }

    /**
     * 当数据源多于8条时，展开剩下的所有数据
     * @param list
     */
    public void addData(List<Follow.DataBean.CategoriesBean.MediaAccountsBean> list)
    {
        if (list == null || list.size() == 0)
        {
            return;
        }
        int mSize = mList.size();
        mList.addAll(list);
        notifyItemRangeInserted(mSize,list.size());
    }

    /**
     * 当数据源多余8条时 隐藏8条之后的数据
     */
    public void hideData()
    {
        if (mList == null || mList.size() <= 8)
        {
            return;
        }
        int mSize = mList.size();
        for (int i = mSize - 1; i >= 8; i--)
        {
            mList.remove(i);
        }
        notifyItemRangeRemoved(8, mSize - 1);
    }




    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View layout = LayoutInflater.from(mContext).inflate(R.layout.item_follow_child, parent, false);
        ViewHolder holder = new ViewHolder(layout);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position)
    {
        holder.mItemTitle.setText(mList.get(position).getName());
        Picasso.with(mContext)
                .load(mList.get(position).getImg())
                .transform(new RoundTransform(20))
                .fit()
                .centerCrop()
                .into(holder.mItemImage);

        holder.itemView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                Intent it = new Intent(mContext, FollowAuthorActivity.class);
                it.putExtra("FollowAuthorActivity", mList.get(position).getUid());
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
        @Bind(R.id.item_title)
        TextView mItemTitle;


        public ViewHolder(View itemView)
        {
            super(itemView);
            AutoUtils.autoSize(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}


package com.wei.lolbox.ui.adapter.follow;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;
import com.wei.lolbox.R;
import com.wei.lolbox.model.follow.Author;
import com.wei.lolbox.model.home.HomeVideo;
import com.wei.lolbox.ui.activity.HomeListVideoActivity;
import com.wei.lolbox.utils.CircleTransform;
import com.wei.lolbox.utils.NetUtils;
import com.zhy.autolayout.utils.AutoUtils;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * 作者：赵若位
 * 时间：2017/12/7
 * 邮箱：1070138445@qq.com
 * 功能：
 */

public class FollowAuthorAdapter extends RecyclerView.Adapter<FollowAuthorAdapter.ViewHolder>
{


    private Context mContext;
    private List<HomeVideo> mList;


    //
    public FollowAuthorAdapter(Context mContext)
    {
        this.mContext = mContext.getApplicationContext();
        mList = new ArrayList<>();
    }

    /**
     * 更新数据
     * @param list
     */
    public void update(List<HomeVideo> list)
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
        View layout = LayoutInflater.from(mContext).inflate(R.layout.item_follow_author, parent, false);
        ViewHolder holder = new ViewHolder(layout);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position)
    {
        final HomeVideo data = mList.get(position);
        Picasso.with(mContext)
                .load(data.getCover())
                .fit()
                .centerCrop()
                .into(holder.mItemImage);

        Picasso.with(mContext)
                .load(data.getAccountImg())
                .transform(new CircleTransform())
                .fit()
                .centerCrop()
                .into(holder.mItemHeader);

        holder.mItemTitle.setText(data.getTitle());
        holder.mItemTime.setText(data.getPlayCount()+"");
        holder.mItemAuthor.setText(data.getAccountName());

        holder.itemView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (!NetUtils.isNetConnected(mContext))
                {
                    Toast.makeText(mContext, mContext.getString(R.string.string_nonet), Toast.LENGTH_LONG).show();
                    return;
                }
                Intent it = new Intent(mContext, HomeListVideoActivity.class);
                it.putExtra("HomeListVideoActivity", data);
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
        @Bind(R.id.item_header)
        ImageView mItemHeader;
        @Bind(R.id.item_time)
        TextView mItemTime;
        @Bind(R.id.item_author)
        TextView mItemAuthor;
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

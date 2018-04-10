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
import com.wei.lolbox.model.msg.Videoes;
import com.wei.lolbox.ui.activity.MsgDetailWebActivity;
import com.wei.lolbox.utils.RoundTransform;
import com.wei.lolbox.utils.StringUtils;
import com.wei.lolbox.utils.TimeUtils;
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

public class VideoAdapter extends RecyclerView.Adapter<VideoAdapter.TopViewHolder>
{

    private Context mContext;
    private List<Videoes> mList;

    public VideoAdapter(Context mContext)
    {
        this.mContext = mContext.getApplicationContext();
        mList = new ArrayList<>();
    }

    /**
     * 更新数据
     *
     * @param list 刷新的数据源
     * @param type 刷新的类型
     */
    public void update(List<Videoes> list, int type)
    {
        if (list == null || list.size() == 0)
        {
            return;
        }

        switch (type)
        {
            case 0://下拉刷新
                mList.clear();
                mList.addAll(list);
                notifyDataSetChanged();
                break;
            case 1://上啦加载更多
                int mSize = mList.size();
                mList.addAll(list);
                notifyItemRangeInserted(mSize, mList.size() - 1);
                break;
        }

    }

    @Override
    public TopViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View layout = LayoutInflater.from(mContext).inflate(R.layout.item_msg_match, parent, false);
        TopViewHolder holder = new TopViewHolder(layout);
        return holder;
    }

    @Override
    public void onBindViewHolder(TopViewHolder holder, final int position)
    {
        Picasso.with(mContext)
                .load(mList.get(position).getPhoto())
                .transform(new RoundTransform(10))
                .resize(176, 132)
                .centerCrop()
                .into(holder.mItemImage);

        holder.mItemTitle.setText(mList.get(position).getTitle());
        holder.mItemDescript.setText(mList.get(position).getContent());
        holder.mItemRead.setText("阅读" + mList.get(position).getReadCount());
        String time = TimeUtils.getTimes(mList.get(position).getTime());
        holder.mItemTime.setText(time);

        holder.itemView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent it = new Intent(mContext, MsgDetailWebActivity.class);
                String url = StringUtils.getMsgDetailUrl(mList.get(position).getCommentUrl());
                it.putExtra("url", url);
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


    public class TopViewHolder extends RecyclerView.ViewHolder
    {
        @Bind(R.id.item_image)
        ImageView mItemImage;
        @Bind(R.id.item_title)
        TextView mItemTitle;
        @Bind(R.id.item_descript)
        TextView mItemDescript;
        @Bind(R.id.item_read)
        TextView mItemRead;
        @Bind(R.id.item_time)
        TextView mItemTime;

        public TopViewHolder(View itemView)
        {
            super(itemView);
            AutoUtils.autoSize(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}

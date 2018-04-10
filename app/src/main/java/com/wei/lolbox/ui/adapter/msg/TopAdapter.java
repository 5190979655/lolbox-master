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
import com.wei.lolbox.model.msg.Top;
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
 * 功能：资讯-头条适配器
 */

public class TopAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>
{

    private Context mContext;
    private List<Top> mList;
    private View mHeader;

    private static final int TYPE_NORMAL = 1;//主体数据部分
    private static final int TYPE_HEADER = -1;//顶部View部分

    public TopAdapter(Context mContext)
    {
        this.mContext = mContext.getApplicationContext();
        mList = new ArrayList<>();
    }

    /**
     * 更新数据
     *
     * @param list
     */
    public void update(List<Top> list, int type)
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

    public View getHeader()
    {
        return mHeader;
    }

    public void setHeader(View mView)
    {
        this.mHeader = mView;
        notifyItemChanged(0);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        RecyclerView.ViewHolder holder = null;
        switch (viewType)
        {
            case TYPE_HEADER:
                holder = new HeaderViewHolder(mHeader);
                break;
            case TYPE_NORMAL:
                View layout = LayoutInflater.from(mContext).inflate(R.layout.item_msg_top, parent, false);
                holder = new ViewHolder(layout);
                break;
        }
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position)
    {
        if (getItemViewType(position) == TYPE_HEADER) return;

        final Top data = mList.get(getRealPosition(holder));
        Picasso.with(mContext)
                .load(data.getPhoto())
                .transform(new RoundTransform(10))
                .resize(176, 132)
                .centerCrop()
                .into(((ViewHolder) holder).mItemImage);

        ((ViewHolder) holder).mItemTitle.setText(data.getTitle());
        ((ViewHolder) holder).mItemDescript.setText(data.getContent());
        ((ViewHolder) holder).mItemRead.setText("阅读" + data.getReadCount());
        String time = TimeUtils.getTimes(data.getTime());
        ((ViewHolder) holder).mItemTime.setText(time);


        holder.itemView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent it = new Intent(mContext, MsgDetailWebActivity.class);
                String url = StringUtils.getMsgDetailUrl(data.getCommentUrl());
                it.putExtra("url", url);
                it.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);
                mContext.startActivity(it);
            }
        });
    }

    @Override
    public int getItemViewType(int position)
    {
        if (mHeader != null && position == 0) return TYPE_HEADER;
        return TYPE_NORMAL;
    }


    @Override
    public int getItemCount()
    {
        return mHeader == null ? mList.size() : mList.size() - 1;
    }

    //点击事件传递的位置
    private int getRealPosition(RecyclerView.ViewHolder holder)
    {
        int position = holder.getLayoutPosition();
        return mHeader == null ? position : position - 1;
    }


    //顶部
    public class HeaderViewHolder extends RecyclerView.ViewHolder
    {
        public HeaderViewHolder(View itemView)
        {
            super(itemView);
            AutoUtils.autoSize(itemView);
            ButterKnife.bind(this, itemView);
        }
    }


    //主体
    public class ViewHolder extends RecyclerView.ViewHolder
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

        public ViewHolder(View itemView)
        {
            super(itemView);
            AutoUtils.autoSize(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}

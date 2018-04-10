package com.wei.lolbox.ui.adapter.home;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.wei.lolbox.R;
import com.wei.lolbox.model.home.HomeTitle;
import com.zhy.autolayout.utils.AutoUtils;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * 作者：赵若位
 * 时间：2017/12/23
 * 邮箱：1070138445@qq.com
 * 功能：
 */

public class VideoTitleAdapter extends RecyclerView.Adapter<VideoTitleAdapter.ViewHolder>
{

    private Context mContext;
    private List<HomeTitle> mList;
    private int lastPosition;
    private OnItemClickListener mListener;

    public VideoTitleAdapter(Context context)
    {
        mContext = context.getApplicationContext();
        mList = new ArrayList<>();
    }

    //更新数据
    public void update(List<HomeTitle> list)
    {
        if (list == null || list.size() == 0)
        {
            return;
        }
//        mList.clear();
//        mList.addAll(list);

        this.mList = list;
        notifyDataSetChanged();
    }



    public void moveToPosition(LinearLayoutManager mManager, int position)
    {
        if (lastPosition == position)
        {
            return;
        }
        lastPosition = position;
        notifyDataSetChanged();
        if (mManager != null)
        {
            mManager.scrollToPosition(position);
        }
    }

    public void setOnItemClickListener(OnItemClickListener listener)
    {
        this.mListener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View layout = LayoutInflater.from(mContext).inflate(R.layout.item_home_title, parent, false);
        ViewHolder holder = new ViewHolder(layout);
        return holder;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position)
    {
        holder.mItemTitle.setText(mList.get(position).getName());

        holder.itemView.setTag(mList.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (lastPosition == position)
                {
                    return;
                }

                mListener.click(v, (HomeTitle) holder.itemView.getTag(), position);
                lastPosition = position;
                notifyDataSetChanged();
            }
        });


        if (lastPosition == position)
        {
            holder.mItemTitle.setTextColor(mContext.getResources().getColor(R.color.main));
        } else
        {
            holder.mItemTitle.setTextColor(Color.parseColor("#999999"));
        }
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

        public ViewHolder(View itemView)
        {
            super(itemView);
            AutoUtils.autoSize(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

    public interface OnItemClickListener
    {
        void click(View mView, HomeTitle mHomeTitle, int position);
    }

}

package com.wei.lolbox.ui.adapter.msg;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.wei.lolbox.R;
import com.wei.lolbox.model.msg.MsgTitle;
import com.wei.lolbox.utils.ScreenUtils;
import com.zhy.autolayout.utils.AutoUtils;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * 作者：赵若位
 * 时间：2017/11/30
 * 邮箱：1070138445@qq.com
 * 功能：
 */

public class TitleAdapter extends RecyclerView.Adapter<TitleAdapter.ViewHolder>
{

    private Context mContext;
    private List<MsgTitle> mList;
    private int lastPosition = 0;//记录上一次选中的位置
    private OnItemClickListener mListener;
    public static RelativeLayout.LayoutParams mParams = null;


    public TitleAdapter(Context mContext)
    {
        this.mContext = mContext.getApplicationContext();
        mList = new ArrayList<>();
        int[] mScreen = ScreenUtils.getScreen(mContext);
        int width = mScreen[0];
        mParams = new RelativeLayout.LayoutParams(width / 5, ViewGroup.LayoutParams.WRAP_CONTENT);
    }

    //更新刷新数据
    public void update(List<MsgTitle> list)
    {
        if (list == null || list.size() == 0)
        {
            return;
        }

        mList.clear();
        mList.addAll(list);
        notifyDataSetChanged();
    }

    //点击事件
    public void setOnItemClickListener(OnItemClickListener listener)
    {
        this.mListener = listener;
    }




    public void moveToPosition(int position)
    {
        if (lastPosition == position)
        {
            return;
        }
        lastPosition = position;
        notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View layout = LayoutInflater.from(mContext).inflate(R.layout.item_msg_title, parent, false);
        ViewHolder holder = new ViewHolder(layout);
        return holder;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position)
    {
        if (mParams != null)
        {
            holder.itemView.setLayoutParams(mParams);
        }

        holder.mItemTitle.setTextColor(Color.parseColor("#c5c5c5"));
        holder.mItemTitle.setText(mList.get(position).getName());
        holder.mItemLine.setBackgroundColor(mContext.getResources().getColor(R.color.white));


        holder.itemView.setTag(mList.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                int mPosition = holder.getLayoutPosition();
                if (lastPosition == mPosition)
                {
                    return;
                }
                lastPosition = mPosition;
                notifyDataSetChanged();
//                mListener.onItemClickListener(v, mList.get(position), lastPosition);
                mListener.onItemClickListener(v, (MsgTitle) holder.itemView.getTag(), lastPosition);

            }
        });

        if (lastPosition == position)//被选中
        {
            holder.mItemLine.setBackgroundColor(mContext.getResources().getColor(R.color.main));
            holder.mItemTitle.setTextColor(mContext.getResources().getColor(R.color.main));
        } else
        {
            holder.mItemLine.setBackgroundColor(mContext.getResources().getColor(R.color.white));
            holder.mItemTitle.setTextColor(Color.parseColor("#c5c5c5"));
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
        @Bind(R.id.item_line)
        TextView mItemLine;

        public ViewHolder(View itemView)
        {
            super(itemView);
            AutoUtils.autoSize(itemView);
            ButterKnife.bind(this, itemView);
        }
    }


    public interface OnItemClickListener
    {
        void onItemClickListener(View mView, MsgTitle bean, int position);
    }

}

package com.wei.lolbox.ui.adapter.home;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;
import com.wei.lolbox.R;
import com.wei.lolbox.base.BaseEmptyViewHolder;
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
 * 时间：2017/12/24
 * 邮箱：1070138445@qq.com
 * 功能：
 */

public class HomeVideoAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>
{

    private Context mContext;
    private List<HomeVideo> mList;
    private static final int TYPE_HEADER = 0;//头部
    private static final int TYPE_NORMAL = 1;//内容
    private static final int TYPE_EMPTY = -1;//空内容页面


    private View mHeaderView;//头部布局


    public HomeVideoAdapter(Context mContext)
    {
        this.mContext = mContext.getApplicationContext();
        mList = new ArrayList<>();
    }


    //更新数据
    public void update(List<HomeVideo> list, int position)
    {
        if (list == null || list.size() == 0)
        {
            return;
        }

        switch (position)
        {
            case TYPE_HEADER://下拉刷新
                mList.clear();
                mList.addAll(list);
                notifyDataSetChanged();
                break;
            case TYPE_NORMAL://上拉加载更多
                int mSize = mList.size();
                mList.addAll(list);
                notifyItemRangeInserted(mSize - 1, list.size());
                break;
        }
    }


    //添加头部
    public void addHeaderView(View mView)
    {
        mHeaderView = mView;
        notifyItemChanged(0);
    }

    //获取头部View
    public View getHeaderView()
    {
        return mHeaderView;
    }


    @Override
    public int getItemViewType(int position)
    {
        if (mHeaderView == null) return TYPE_NORMAL;
        if (mList == null || mList.size() == 0) return TYPE_EMPTY;
        if (position == 0) return TYPE_HEADER;
        return TYPE_NORMAL;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        if (mHeaderView != null && viewType == TYPE_HEADER) return new HeaderHolder(mHeaderView);
        View layout;
        RecyclerView.ViewHolder holder = null;
        switch (viewType)
        {
            case TYPE_EMPTY:
                layout = LayoutInflater.from(mContext).inflate(R.layout.item_follow_empty, parent, false);
                holder = new BaseEmptyViewHolder(layout);
                break;
            case TYPE_NORMAL:
                layout = LayoutInflater.from(mContext).inflate(R.layout.item_home_video, parent, false);
                holder = new ViewHolder(layout);
                break;
        }
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position)
    {
        if (getItemViewType(position) == TYPE_HEADER) return;
        if (getItemViewType(position) == TYPE_EMPTY) return;

        int mPosition = getRealPosition(holder);
        if (holder instanceof ViewHolder)
        {
            final HomeVideo mVideo = mList.get(mPosition);
            Picasso.with(mContext)
                    .load(mVideo.getCover())
                    .resize(320, 180)
                    .centerCrop()
                    .into(((ViewHolder) holder).mItemImage);
            Picasso.with(mContext)
                    .load(mVideo.getAccountImg())
                    .resize(60, 60)
                    .transform(new CircleTransform())
                    .centerCrop()
                    .into(((ViewHolder) holder).mItemHeader);

            ((ViewHolder) holder).mItemTitle.setText(mVideo.getAccountName());
            ((ViewHolder) holder).mItemDescript.setText(mVideo.getTitle());
            ((ViewHolder) holder).mItemNumber.setText(mVideo.getPlayCount());

            Drawable mDrawable = mContext.getResources().getDrawable(R.drawable.fanhe_icon_video_times);
            mDrawable.setBounds(0, 0, 30, 28);
            ((ViewHolder) holder).mItemNumber.setCompoundDrawables(mDrawable, null, null, null);

            //跳转到视频详情
            ((ViewHolder) holder).itemView.setOnClickListener(new View.OnClickListener()
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
                    it.putExtra("HomeListVideoActivity", mVideo);
                    it.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);
                    mContext.startActivity(it);
                }
            });
        }
    }


    @Override
    public int getItemCount()
    {
        return mHeaderView == null ? mList.size() : mList.size() + 1;
    }


    //点击事件传递的位置
    private int getRealPosition(RecyclerView.ViewHolder holder)
    {
        int mPosition = holder.getLayoutPosition();
        return mHeaderView == null ? mPosition : mPosition - 1;
    }


    //适配GridLayoutManager
    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView)
    {
        super.onAttachedToRecyclerView(recyclerView);
        RecyclerView.LayoutManager managers = recyclerView.getLayoutManager();
        if (managers instanceof GridLayoutManager)
        {
            final GridLayoutManager mManager = (GridLayoutManager) managers;
            (mManager).setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup()
            {
                @Override
                public int getSpanSize(int position)
                {
                    return (getItemViewType(position) == TYPE_HEADER ||
                            getItemViewType(position) == TYPE_EMPTY) ? mManager.getSpanCount() : 1;
                }
            });
        }
    }


    @Override
    public void onViewAttachedToWindow(RecyclerView.ViewHolder holder)
    {
        super.onViewAttachedToWindow(holder);
        ViewGroup.LayoutParams mParams = holder.itemView.getLayoutParams();
        if (mParams != null && mParams instanceof StaggeredGridLayoutManager.LayoutParams)
        {
            StaggeredGridLayoutManager.LayoutParams lp = (StaggeredGridLayoutManager.LayoutParams) mParams;
            lp.setFullSpan(holder.getLayoutPosition() == 0);
        }
    }

    public class HeaderHolder extends RecyclerView.ViewHolder
    {

        public HeaderHolder(View itemView)
        {
            super(itemView);
            AutoUtils.autoSize(itemView);
            ButterKnife.bind(this, itemView);
        }
    }


    public class ViewHolder extends RecyclerView.ViewHolder
    {
        @Bind(R.id.item_image)
        ImageView mItemImage;
        @Bind(R.id.item_number)
        TextView mItemNumber;
        @Bind(R.id.item_header)
        ImageView mItemHeader;
        @Bind(R.id.item_title)
        TextView mItemTitle;
        @Bind(R.id.item_descript)
        TextView mItemDescript;

        public ViewHolder(View itemView)
        {
            super(itemView);
            AutoUtils.autoSize(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}

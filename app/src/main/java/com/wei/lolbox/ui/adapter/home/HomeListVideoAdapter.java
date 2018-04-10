package com.wei.lolbox.ui.adapter.home;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.orhanobut.logger.Logger;
import com.squareup.picasso.Picasso;
import com.wei.lolbox.R;
import com.wei.lolbox.config.Config;
import com.wei.lolbox.model.home.HomeVideo;
import com.wei.lolbox.utils.BaseHandler;
import com.wei.lolbox.utils.CircleTransform;
import com.wei.lolbox.utils.ListVideoPlayerUtils;
import com.zhy.autolayout.AutoFrameLayout;
import com.zhy.autolayout.utils.AutoUtils;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * 作者：赵若位
 * 时间：2018/1/9
 * 邮箱：1070138445@qq.com
 * 功能：
 */

public class HomeListVideoAdapter extends RecyclerView.Adapter<HomeListVideoAdapter.ViewHolder>
{
    private Context mContext;
    private List<HomeVideo> mList;
    private ListVideoPlayerUtils mUtil;
    private int lastPosition;//上一次视频播放的位置
    private LinearLayoutManager mManager;
    private BaseHandler mHandler;
    public static final String TAG = "HomeListVideoAdapter";

    //
    public HomeListVideoAdapter(Context context)
    {
        this.mContext = context;
        mList = new ArrayList<>();
        mHandler = new BaseHandler();
    }

    //刷新单个数据
    public void update(HomeVideo data)
    {
        if (data == null)
        {
            return;
        }
        mList.add(data);
        notifyItemChanged(mList.size() - 1);
    }

    //刷新一组数据
    public void update(List<HomeVideo> data)
    {
        if (data == null || data.size() == 0)
        {
            return;
        }
        int start = mList.size();
        mList.addAll(data);
        notifyItemRangeChanged(start - 1, mList.size() - 1);
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View layout = LayoutInflater.from(mContext).inflate(R.layout.item_home_list_video, parent, false);
        ViewHolder holder = new ViewHolder(layout);
        return holder;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position)
    {
        HomeVideo data = mList.get(position);
        //头像加载
        Picasso.with(mContext)
                .load(data.getAccountImg())
                .transform(new CircleTransform())
                .resize(50, 50)
                .centerCrop().into(holder.mItemHeader);
        holder.mItemAuthor.setText(data.getAccountName());
        holder.mItemDescript.setText(data.getTitle());
        //开始播放
        holder.mItemStart.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                moveThePosition(holder.getLayoutPosition(), false);
            }
        });
        //关注
        holder.mItemFollow.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Config.showToast(mContext.getApplicationContext());
            }
        });



        //开始播放
        if (holder.getLayoutPosition() == lastPosition)//开始播放
        {
            holder.mItemStart.setVisibility(View.GONE);
            mUtil.releaseVideoPlayer();
            mUtil.setPlayPositionAndTag(lastPosition, TAG);
            mUtil.addVideoPlayer(lastPosition, null, TAG, holder.mItemPlayer, holder.mItemStart);
            if (data.getUrl_video() == null || data.getUrl_video().equals(""))
            {
                Toast.makeText(mContext, "视频地址错误！", Toast.LENGTH_SHORT).show();
            } else
            {
                mUtil.startPlay(data.getUrl_video());
            }

        } else
        {
            Picasso.with(mContext)
                    .load(data.getCover())
                    .resize(320, 180)
                    .centerCrop()
                    .into(holder.mThumbView);
            holder.mItemPlayer.removeAllViews();
            holder.mItemPlayer.addView(holder.mThumbView);
            holder.mItemStart.setVisibility(View.VISIBLE);
        }
    }

    @Override
    public int getItemCount()
    {
        return mList == null ? 0 : mList.size();
    }

    //设置旋转工具类
    public void setUtil(ListVideoPlayerUtils util)
    {
        if (util == null)
        {
            return;
        }
        this.mUtil = util;
    }


    //设置RecyclerView的Manager
    public void setManager(LinearLayoutManager manager)
    {
        if (manager == null)
        {
            return;
        }
        this.mManager = manager;
    }


    /**
     * RecyclerView跳转到指定的位置
     * @param position 具体的位置
     * @param type 是否开启Toast消息弹窗
     */
    public void moveThePosition(final int position, boolean type)
    {
        if (lastPosition == position)
        {
            return;
        }
        if (type)
        {
            Toast.makeText(mContext, "即将播放下一个视频~", Toast.LENGTH_SHORT).show();
            mHandler.postDelayed(new Runnable()
            {
                @Override
                public void run()
                {
                    int mPosition = lastPosition;
                    lastPosition = position;
                    notifyItemChanged(mPosition);
                    notifyItemChanged(lastPosition);
                    if (mManager != null)
                    {
                        mManager.scrollToPositionWithOffset(lastPosition, 0);
                    }
                }
            }, 2000);
        } else
        {
            int mPosition = lastPosition;
            lastPosition = position;
            notifyItemChanged(mPosition);
            notifyItemChanged(lastPosition);
            if (mManager != null)
            {
                mManager.scrollToPositionWithOffset(lastPosition, 0);
            }
        }
    }


    /**
     * RecyclerView跳转到指定的位置
     * @param position
     */
    public void moveThePosition(int position)
    {
        if (lastPosition == position)
        {
            return;
        }
        int mPosition = lastPosition;
        lastPosition = position;
        notifyItemChanged(lastPosition);
        notifyItemChanged(mPosition);
    }


    public class ViewHolder extends RecyclerView.ViewHolder
    {
        @Bind(R.id.item_header)
        ImageView mItemHeader;
        @Bind(R.id.item_author)
        TextView mItemAuthor;
        @Bind(R.id.item_follow)
        TextView mItemFollow;
        @Bind(R.id.item_player)
        AutoFrameLayout mItemPlayer;
        @Bind(R.id.item_start)
        ImageView mItemStart;
        @Bind(R.id.item_descript)
        TextView mItemDescript;
        @Bind(R.id.item_up)
        ImageView mItemUp;
        @Bind(R.id.item_down)
        ImageView mItemDown;
        @Bind(R.id.item_msg)
        ImageView mItemMsg;
        @Bind(R.id.item_like)
        ImageView mItemLike;
        @Bind(R.id.item_download)
        ImageView mItemDownload;
        @Bind(R.id.item_danmu)
        ImageView mItemDanmu;
        @Bind(R.id.item_write)
        ImageView mItemWrite;

        ImageView mThumbView;//封面

        public ViewHolder(View itemView)
        {
            super(itemView);
            AutoUtils.autoSize(itemView);
            ButterKnife.bind(this, itemView);
            mThumbView = new ImageView(mContext);
            mThumbView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
    }
}

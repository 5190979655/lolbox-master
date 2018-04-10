package com.wei.lolbox.ui.adapter.follow;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.wei.lolbox.R;
import com.wei.lolbox.model.follow.User;
import com.wei.lolbox.model.home.HomeVideo;
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

public class FollowUserAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>
{


    private Context mContext;
    private List<Object> mList;
    private String title;//搜索字段


    private static final int POSITION_USER = 1;//用户
    private static final int POSITION_VIDEO = 2;//视频

    private UserChildAdapter mUserAdapter;
    private VideoChildAdapter mVideoAdapter;


    //
    public FollowUserAdapter(Context mContext)
    {
        this.mContext = mContext.getApplicationContext();
        mList = new ArrayList<>();
    }


    /**
     * 更新数据
     *
     * @param data
     */
    public void update(User data, String t)
    {
        this.title = t;
        if (data == null)
        {
            return;
        }
        mList.clear();
        if (data.getMediaAccounts() != null && data.getMediaAccounts().size() != 0)
        {
            mList.add(data.getMediaAccounts());
            if (mUserAdapter == null)
            {
                mUserAdapter = new UserChildAdapter(mContext);
            }
        }
        if (data.getArticles() != null && data.getArticles().size() != 0)
        {
            mList.add(data.getArticles());
            if (mVideoAdapter == null)
            {
                mVideoAdapter = new VideoChildAdapter(mContext);
            }
        }
        if (mList.size() == 0)
        {
            return;
        }
        notifyDataSetChanged();
    }

    @Override
    public int getItemViewType(int position)
    {
        switch (mList.size())
        {
            case 1:
                Object o = mList.get(0);
                if (((List)o).get(0) instanceof User.MediaAccountsBean)
                {
                    return POSITION_USER;
                } else if (((List) o).get(0) instanceof HomeVideo)
                {
                    return POSITION_VIDEO;
                }
                break;
            case 2:
                if (position == 0)
                {
                    return POSITION_USER;
                }else
                {
                    return POSITION_VIDEO;
                }
        }
        return -1;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int type)
    {
        View layout = null;
        RecyclerView.ViewHolder holder = null;
        switch (type)
        {
            case POSITION_USER:
                layout = LayoutInflater.from(mContext).inflate(R.layout.item_follow_user, parent, false);
                holder = new UserViewHolder(layout);
                break;
            case POSITION_VIDEO:
                layout = LayoutInflater.from(mContext).inflate(R.layout.item_follow_video, parent, false);
                holder = new VideoViewHolder(layout);
                break;
        }
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position)
    {
        if (holder instanceof UserViewHolder)
        {
            GridLayoutManager mManager = new GridLayoutManager(mContext, 4);
            ((UserViewHolder) holder).mItemChild.setLayoutManager(mManager);
            ((UserViewHolder) holder).mItemChild.setAdapter(mUserAdapter);
            mUserAdapter.update((List<User.MediaAccountsBean>) mList.get(0));
            ((UserViewHolder) holder).mItemMore.setText("搜索更多“" + title + "”用户");

        } else if (holder instanceof VideoViewHolder)
        {
            GridLayoutManager mManager = new GridLayoutManager(mContext, 2);
            ((VideoViewHolder) holder).mItemChild.setLayoutManager(mManager);
            ((VideoViewHolder) holder).mItemChild.setAdapter(mVideoAdapter);
            mVideoAdapter.update((List<HomeVideo>) mList.get(1));
            ((VideoViewHolder) holder).mItemMore.setText("搜索更多“" + title + "”视频");

        }
    }

    @Override
    public int getItemCount()
    {
        return mList == null ? 0 : mList.size();
    }


    //用户
    public class UserViewHolder extends RecyclerView.ViewHolder
    {
        @Bind(R.id.item_child)
        RecyclerView mItemChild;
        @Bind(R.id.item_more)
        TextView mItemMore;

        public UserViewHolder(View itemView)
        {
            super(itemView);
            AutoUtils.autoSize(itemView);
            ButterKnife.bind(this, itemView);
        }
    }


    public class VideoViewHolder extends RecyclerView.ViewHolder
    {
        @Bind(R.id.item_child)
        RecyclerView mItemChild;
        @Bind(R.id.item_more)
        TextView mItemMore;

        public VideoViewHolder(View itemView)
        {
            super(itemView);
            AutoUtils.autoSize(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

}

package com.wei.lolbox.ui.adapter.home;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.wei.lolbox.Application;
import com.wei.lolbox.R;
import com.wei.lolbox.dao.HomeTitleDao;
import com.wei.lolbox.model.EventMsg;
import com.wei.lolbox.model.home.HomeTitle;
import com.wei.lolbox.utils.CircleTransform;
import com.zhy.autolayout.utils.AutoUtils;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.greendao.query.QueryBuilder;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * 作者：赵若位
 * 时间：2018/1/17
 * 邮箱：1070138445@qq.com
 * 功能：
 */

public class HomeProgramAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>
{

    private Context mContext;
    private List<HomeTitle> mList;//数据源
    private int title_second;//第二个标题的位置
    private boolean isLongCheck;//当前是否是长按选择状态下
    private boolean isChanged;//是否当前的排序有所改变
    private HomeTitleDao mDao;


    private static final int TYPE_HEADER = -1;//标题
    private static final int TYPE_NORMAL = 1;//主体

    public HomeProgramAdapter(Context context)
    {
        this.mContext = context;
        mList = new ArrayList<>();
        mDao = Application.mSession.getHomeTitleDao();
    }

    //更新数据
    public void update()
    {
        List<HomeTitle> list_visible = upDateVisiable(true);
        List<HomeTitle> list_gone = upDateVisiable(false);
        if ((list_visible == null && list_gone == null) ||
                (list_visible.size() == 0 && list_gone.size() == 0))
        {
            return;
        }
        mList.clear();
        if (list_visible != null && list_visible.size() != 0)
        {
            mList.add(null);
            mList.addAll(list_visible);
        }

        mList.add(null);

        if (list_gone != null && list_gone.size() != 0)
        {
            mList.addAll(list_gone);
        }
        notifyDataSetChanged();
    }


    @Override
    public int getItemViewType(int position)
    {
        if (position == 0 || position == title_second) return TYPE_HEADER;
        return TYPE_NORMAL;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int type)
    {
        View layout = null;
        RecyclerView.ViewHolder holder = null;
        switch (type)
        {
            case TYPE_HEADER:
                layout = LayoutInflater.from(mContext).inflate(R.layout.item_home_program_title, parent, false);
                holder = new HeaderViewHolder(layout);
                break;
            case TYPE_NORMAL:
                layout = LayoutInflater.from(mContext).inflate(R.layout.item_home_program_normal, parent, false);
                holder = new ViewHolder(layout);
                break;
        }
        return holder;
    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, final int position)
    {
        if (holder instanceof HeaderViewHolder)//标题
        {

            if (position == 0)
            {
                ((HeaderViewHolder) holder).mItemClose.setVisibility(View.VISIBLE);
                ((HeaderViewHolder) holder).mItemLine.setVisibility(View.VISIBLE);
                ((HeaderViewHolder) holder).mItemTitle.setText("我的频道");
                ((HeaderViewHolder) holder).mItemClose.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        if (mContext instanceof Activity)
                        {
                            ((Activity) mContext).finish();
                        }
                    }
                });



                ((HeaderViewHolder) holder).mItemComplete.setText("完成");

                if (isChanged)
                {
                    ((HeaderViewHolder) holder).mItemComplete.setVisibility(View.VISIBLE);
                    if (isLongCheck)
                    {
                        ((HeaderViewHolder) holder).mItemComplete.setText("编辑");
                    } else
                    {
                        ((HeaderViewHolder) holder).mItemComplete.setText("完成");
                    }
                } else
                {
                    ((HeaderViewHolder) holder).mItemComplete.setVisibility(View.GONE);
                }
            } else
            {
                ((HeaderViewHolder) holder).mItemTitle.setText("其他频道");
            }

        } else
        {

            Picasso.with(mContext)
                    .load(mList.get(position).getIcon())
                    .resize(96, 96)
                    .transform(new CircleTransform())
                    .centerCrop()
                    .into(((ViewHolder) holder).mItemImage);
            ((ViewHolder) holder).mItemTitle.setText(mList.get(position).getName());
            if (position > 0 && position < title_second)
            {
                ((ViewHolder) holder).mItemIcon.setImageResource(R.drawable.icon_del);
            } else
            {
                ((ViewHolder) holder).mItemIcon.setImageResource(R.drawable.icon_add);
            }

            if (isLongCheck)
            {
                ((ViewHolder) holder).mItemIcon.setVisibility(View.VISIBLE);
            } else
            {
                ((ViewHolder) holder).mItemIcon.setVisibility(View.GONE);
            }


            //*****************************点击事件的操作*********************************************//
            /**
             * Item长按监听事件
             * 1.已经选中的Item右上角是减号icon
             * 2.未选中的Item右上角是加号icon
             */
            holder.itemView.setOnLongClickListener(new View.OnLongClickListener()
            {
                @Override
                public boolean onLongClick(View v)
                {
                    isLongCheck = !isLongCheck;
                    notifyDataSetChanged();
                    return true;
                }
            });

            /**
             * Item点击监听事件
             * 1.如果长按的状态为False：
             *   i.已经选中的Item会关闭该页面，跳转到HomeChildFragment页面
             *   ii.未选中的Item会直接飞到已选中的集合中，修改数据库数据
             * 2.如果长按的状态为True：
             *   i.已经选中的Item会直接飞到未选中的Item集合中，修改数据库的数据
             *   ii.未选中的Item会直接飞到选中的集合中，修改数据库的数据
             */
            holder.itemView.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    int mPosition = holder.getLayoutPosition();
                    HomeTitle data = mList.get(mPosition);

                    if (data.getIsVisiable())
                    {
                        if (isLongCheck)
                        {
                            data.setIsVisiable(!data.getIsVisiable());
                            mDao.update(data);
                            mList.remove(mPosition);
                            mList.add(title_second, data);
                            notifyItemMoved(mPosition, title_second);
                            notifyItemChanged(title_second);
                            upDateVisiable(true);
                            isChanged = true;
                            notifyItemChanged(0);

                            //移除该条目
                            EventBus.getDefault().post
                                    (
                                            new EventMsg<HomeTitle>("HomeVideoFragment", 202, data)
                                    );
                        } else
                        {
                            //跳转到具体的HomeChildFragment
                            EventBus.getDefault().post
                                    (
                                            new EventMsg<HomeTitle>("HomeVideoFragment", 201, data)
                                    );
                            if (mContext instanceof Activity)
                            {
                                ((Activity) mContext).finish();
                            }
                        }

                    } else
                    {
                        data.setIsVisiable(!data.getIsVisiable());
                        mDao.update(data);
                        mList.remove(mPosition);
                        mList.add(title_second, data);
                        notifyItemMoved(mPosition, title_second);
                        notifyItemChanged(title_second);
                        upDateVisiable(true);
                        isChanged = true;
                        notifyItemChanged(0);

                        //新增该条目
                        EventBus.getDefault().post
                                (
                                        new EventMsg<HomeTitle>("HomeVideoFragment", 203, data)
                                );
                    }


                }
            });
        }
    }


    @Override
    public int getItemCount()
    {
        return mList == null ? 0 : mList.size();
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
                    return getItemViewType(position) == TYPE_HEADER ? mManager.getSpanCount() : 1;
                }
            });
        }
    }


    //主题数据
    public class ViewHolder extends RecyclerView.ViewHolder
    {
        @Bind(R.id.item_image)
        ImageView mItemImage;
        @Bind(R.id.item_icon)
        ImageView mItemIcon;
        @Bind(R.id.item_title)
        TextView mItemTitle;

        public ViewHolder(View itemView)
        {
            super(itemView);
            AutoUtils.autoSize(itemView);
            ButterKnife.bind(this, itemView);
        }
    }


    //顶部标题
    public class HeaderViewHolder extends RecyclerView.ViewHolder
    {

        @Bind(R.id.item_close)
        ImageView mItemClose;
        @Bind(R.id.item_line)
        TextView mItemLine;
        @Bind(R.id.item_title)
        TextView mItemTitle;
        @Bind(R.id.item_complete)
        TextView mItemComplete;

        public HeaderViewHolder(View itemView)
        {
            super(itemView);
            AutoUtils.autoSize(itemView);
            ButterKnife.bind(this, itemView);
        }
    }


    //查询数据库中已选中的标题有几条
    //确定标题二的位置
    private List<HomeTitle> upDateVisiable(boolean isVisiable)
    {
        if (mDao == null)
        {
            return null;
        }

        QueryBuilder<HomeTitle> mBuilder = mDao.queryBuilder();
        mBuilder.where(HomeTitleDao.Properties.IsVisiable.eq(isVisiable));
        List<HomeTitle> list = mBuilder.build().list();
        if (isVisiable)
        {
            title_second = list.size() + 1;
        }
        return list;
    }


}

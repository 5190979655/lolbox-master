package com.wei.lolbox.ui.adapter.discover;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.orhanobut.logger.Logger;
import com.squareup.picasso.Picasso;
import com.wei.lolbox.R;
import com.wei.lolbox.model.discover.Heroes;
import com.wei.lolbox.ui.activity.DiscoverHeroActivity;
import com.wei.lolbox.utils.RoundTransform;
import com.wei.lolbox.utils.StringUtils;
import com.zhy.autolayout.utils.AutoUtils;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * 作者：赵若位
 * 时间：2017/12/9
 * 邮箱：1070138445@qq.com
 * 功能：周免英雄适配器
 */

public class HeroFreeAdapter extends RecyclerView.Adapter<HeroFreeAdapter.ViewHolder>
{

    private Context mContext;
    private List<Heroes> mList;

    //
    public HeroFreeAdapter(Context mContext)
    {
        this.mContext = mContext.getApplicationContext();
        mList = new ArrayList<>();
    }

    /**
     * 更新数据
     *
     * @param list
     */
    public void update(List<Heroes> list)
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
        View layout = LayoutInflater.from(mContext).inflate(R.layout.item_discover_hero_free, parent, false);
        ViewHolder holder = new ViewHolder(layout);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position)
    {
        if (getItemCount() == 0) return;
        Heroes mHeroes = mList.get(position);
        Picasso.with(mContext)
                .load(StringUtils.getHeroHeader(mHeroes.getName()))
                .transform(new RoundTransform(10))
                .resize(120,120)
                .centerCrop().into(holder.mItemImage);
        holder.mItemTitle.setText(mHeroes.getDisplay_name());
        holder.mItemDescript.setText(mHeroes.getTitle());

        if (mHeroes.getPositions() == null || mHeroes.getPositions().size() == 0)
        {
            holder.mItemPosition.setText("未设置");
        }else
        {
            holder.mItemPosition.setText(mHeroes.getPositions().get(0).getPosition_in_cn());
        }

        holder.itemView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent it = new Intent(mContext, DiscoverHeroActivity.class);
                it.putExtra("DiscoverHeroActivity_name", mList.get(position).getDisplay_name());
                it.putExtra("DiscoverHeroActivity_url", StringUtils.getHeroDetail(mList.get(position).getId()));
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
        @Bind(R.id.item_descript)
        TextView mItemDescript;
        @Bind(R.id.item_position)
        TextView mItemPosition;

        public ViewHolder(View itemView)
        {
            super(itemView);
            AutoUtils.autoSize(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}

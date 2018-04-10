package com.wei.lolbox.ui.adapter.discover;

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
 * 功能：
 */

public class HeroAllAdapter extends RecyclerView.Adapter<HeroAllAdapter.ViewHolder>
{

    private Context mContext;
    private List<Heroes> mList;

    //
    public HeroAllAdapter(Context mContext)
    {
        this.mContext = mContext.getApplicationContext();
        mList = new ArrayList<>();
    }


    /**
     * 更新数据
     * @param list
     */
    public void update(List<Heroes> list)
    {
        mList.clear();
        mList.addAll(list);
        notifyDataSetChanged();
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View layout = LayoutInflater.from(mContext).inflate(R.layout.item_discover_hero_all, parent, false);
        ViewHolder holder = new ViewHolder(layout);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position)
    {
        Heroes mHeroes = mList.get(position);
        Picasso.with(mContext)
                .load(StringUtils.getHeroHeader(mHeroes.getName()))
                .resize(120,120)
                .transform(new RoundTransform(10))
//                .fit()
                .centerCrop()
                .into(holder.mItemImage);

        holder.mItemTitle.setText(mHeroes.getTitle());
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

        public ViewHolder(View itemView)
        {
            super(itemView);
            AutoUtils.autoSize(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}

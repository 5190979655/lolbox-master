package com.wei.lolbox.ui.adapter.discover;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.wei.lolbox.R;
import com.wei.lolbox.base.BaseEmptyViewHolder;
import com.wei.lolbox.model.discover.PlayerListBean;
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
 * 时间：2017/12/17
 * 邮箱：1070138445@qq.com
 * 功能：
 */

public class PlayerHeroAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>
{

    private Context mContext;
    private List<PlayerListBean.ListBean.ChampionPerformanceListBean> mList;

    private static final int POSITION_EMPTY = -1;//空页面
    private static final int POSITION_MAIN = 1;//主页面


    public PlayerHeroAdapter(Context mContext)
    {
        this.mContext = mContext.getApplicationContext();
        mList = new ArrayList<>();
    }

    //更新数据
    public void update(List<PlayerListBean.ListBean.ChampionPerformanceListBean> list)
    {
        mList.clear();
        if (list == null || list.size() == 0)
        {
            mList.add(null);
        }else
        {
            mList.addAll(list);
        }
        notifyDataSetChanged();
    }


    @Override
    public int getItemViewType(int position)
    {
        if (mList.get(position) == null)
        {
            return POSITION_EMPTY;
        } else
        {
            return POSITION_MAIN;
        }
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View layout = null;
        RecyclerView.ViewHolder holder = null;
        switch (viewType)
        {
            case POSITION_EMPTY:
                layout = LayoutInflater.from(mContext).inflate(R.layout.item_follow_empty, parent, false);
                holder = new BaseEmptyViewHolder(layout);
                break;
            case POSITION_MAIN:
                layout = LayoutInflater.from(mContext).inflate(R.layout.item_discover_player_hero, parent, false);
                holder = new PlayerHeroAdapter.ViewHolder(layout);
                break;
        }
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position)
    {

        if (holder instanceof PlayerHeroAdapter.ViewHolder)
        {
            PlayerListBean.ListBean.ChampionPerformanceListBean data = mList.get(position);
            Picasso.with(mContext)
                    .load(StringUtils.getHeroHeader(data.getChampion().getName()))
                    .transform(new RoundTransform(10))
                    .resize(110, 110)
                    .centerCrop()
                    .into(((PlayerHeroAdapter.ViewHolder)holder).mItemImage);
            String title = data.getChampion().getTitle();
            String display = data.getChampion().getDisplay_name();
            SpannableString mTitle = new SpannableString(title + " " + display);
            mTitle.setSpan(new AbsoluteSizeSpan(28), 0, title.length() + display.length() + 1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
            mTitle.setSpan(new ForegroundColorSpan(Color.parseColor("#333333")), 0, title.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
            mTitle.setSpan(new ForegroundColorSpan(Color.parseColor("#9a9a9a")), title.length() + 1, title.length() + display.length() + 1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
            ((PlayerHeroAdapter.ViewHolder)holder).mItemTitle.setText(mTitle);

            String times = (int) data.getTimes() + "";
            SpannableString mTimes = new SpannableString("场次:" + times);
            mTimes.setSpan(new AbsoluteSizeSpan(24), 0, 3 + times.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
            mTimes.setSpan(new ForegroundColorSpan(Color.parseColor("#333333")), 0, 3, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
            mTimes.setSpan(new ForegroundColorSpan(Color.parseColor("#9a9a9a")), 3, times.length() + 3, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
            ((PlayerHeroAdapter.ViewHolder)holder).mItemNumber.setText(mTimes);

            String rate = data.getWin_rate() + "%";
            SpannableString mRate = new SpannableString("胜率:" + rate);
            mRate.setSpan(new AbsoluteSizeSpan(24), 0, 3 + rate.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
            mRate.setSpan(new ForegroundColorSpan(Color.parseColor("#333333")), 0, 3, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
            mRate.setSpan(new ForegroundColorSpan(Color.parseColor("#9a9a9a")), 3, rate.length() + 3, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
            ((PlayerHeroAdapter.ViewHolder)holder).mItemRate.setText(mRate);

            holder.itemView.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    Intent it = new Intent(mContext, DiscoverHeroActivity.class);
                    it.putExtra("DiscoverHeroActivity_name", mList.get(position).getChampion().getDisplay_name());
                    it.putExtra("DiscoverHeroActivity_url", StringUtils.getHeroDetail(mList.get(position).getChampion().getId()));
                    it.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);
                    mContext.startActivity(it);
                }
            });
        }
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
        @Bind(R.id.item_number)
        TextView mItemNumber;
        @Bind(R.id.item_rate)
        TextView mItemRate;

        public ViewHolder(View itemView)
        {
            super(itemView);
            AutoUtils.autoSize(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}

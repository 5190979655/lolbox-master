package com.wei.lolbox.ui.adapter.discover;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.wei.lolbox.R;
import com.wei.lolbox.config.Config;
import com.wei.lolbox.model.discover.Player;
import com.wei.lolbox.model.discover.PlayerListBean;
import com.wei.lolbox.ui.activity.DiscoverCombatActivity;
import com.wei.lolbox.utils.CircleTransform;
import com.wei.lolbox.utils.RoundTransform;
import com.wei.lolbox.utils.StringUtils;
import com.zhy.autolayout.utils.AutoUtils;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * 作者：赵若位
 * 时间：2017/12/14
 * 邮箱：1070138445@qq.com
 * 功能：
 */

public class PlayerCombatAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>
{


    private Context mContext;
    private List<PlayerListBean.ListBean.GameRecentListBean> mList;
    private PlayerListBean.ListBean mBean;

    private static final int POSITION_TOP = 0;//顶部title
    private static final int POSITION_MAIN = 1;//主页面

    //
    public PlayerCombatAdapter(Context mContext)
    {
        this.mContext = mContext.getApplicationContext();
        mList = new ArrayList<>();
        mBean = new PlayerListBean.ListBean();
    }

    //更新数据
    public void update(PlayerListBean.ListBean data)
    {
        if (data == null)
        {
            return;
        }
        mList.clear();
        mBean = data;
        mList.addAll(data.getGame_recent_list());
        mList.add(0, null);
        notifyDataSetChanged();
    }


    @Override
    public int getItemViewType(int position)
    {
        if (mList.get(position) == null)
        {
            return POSITION_TOP;
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
            case POSITION_TOP:
                layout = LayoutInflater.from(mContext).inflate(R.layout.item_discover_player_combat_top, parent, false);
                holder = new TopViewHolder(layout);
                break;
            case POSITION_MAIN:
                layout = LayoutInflater.from(mContext).inflate(R.layout.item_discover_player_combat_main, parent, false);
                holder = new MainViewHolder(layout);
                break;
        }
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position)
    {
        if (holder instanceof TopViewHolder)
        {
            Picasso.with(mContext)
                    .load(StringUtils.getPlayerIcon(mBean.getIcon()))
                    .transform(new CircleTransform())
                    .fit().centerCrop().into(((TopViewHolder) holder).mHeader);


            ((TopViewHolder) holder).mLevel.setText(mBean.getLevel() + "");
            ((TopViewHolder) holder).mUserName.setText(mBean.getPn());
            ((TopViewHolder) holder).mAlias.setText(mBean.getGame_zone().getAlias());
            ((TopViewHolder) holder).mScore.setText(mBean.getBox_score() + "");

            ((TopViewHolder) holder).mTvCn.setText(mBean.getTier_rank().getTier().getName_cn() + mBean.getTier_rank().getRank().getName());
            ((TopViewHolder) holder).mWin.setText(mBean.getWin_rate() + "%");
            double rate = mBean.getWin_rate() / 100;
            int mTotal = (int) ((mBean.getTotal_win_aram() + mBean.getTotal_win_bot() + mBean.getTotal_win_normal()) / rate);
            ((TopViewHolder) holder).mTotal.setText(mTotal + "");
            if (mBean.getTier_rank().getUrl_img() == null)
            {
                Picasso.with(mContext)
                        .load(Config.DISCOVER_NO_RANK)
                        .fit()
                        .centerCrop()
                        .into(((TopViewHolder) holder).mImgCn);

            } else
            {
                Picasso.with(mContext)
                        .load(mBean.getTier_rank().getUrl_img())
                        .fit()
                        .centerCrop()
                        .into(((TopViewHolder) holder).mImgCn);
            }

            Drawable mMatchs = mContext.getResources().getDrawable(R.drawable.discover_icon_game_history);
            mMatchs.setBounds(0, 0, 24, 24);
            ((TopViewHolder) holder).mMatch.setCompoundDrawables(mMatchs, null, null, null);

            Drawable mScore = mContext.getResources().getDrawable(R.drawable.discover_icon_game_result_ce);
            mScore.setBounds(0, 0, 50, 50);
            ((TopViewHolder) holder).mScore.setCompoundDrawables(mScore, null, null, null);


        } else if (holder instanceof MainViewHolder)
        {
            Picasso.with(mContext)
                    .load(StringUtils.getHeroHeader(mList.get(position).getChampion().getName()))
                    .transform(new RoundTransform(10))
                    .resize(60, 60)
                    .centerCrop()
                    .into(((MainViewHolder) holder).mItemImage);

            ((MainViewHolder) holder).mItemTitle.setText(mList.get(position).getGame_type().getName_cn());

            if (mList.get(position).isBattle_result())//胜利
            {
                ((MainViewHolder) holder).mItemWin.setBackgroundColor(Color.parseColor("#4be2b2"));
                ((MainViewHolder) holder).mItemWin.setText("胜利");

            } else//失败
            {
                ((MainViewHolder) holder).mItemWin.setBackgroundColor(Color.parseColor("#fa6668"));
                ((MainViewHolder) holder).mItemWin.setText("失败");
            }
            ((MainViewHolder) holder).mItemTime.setText(StringUtils.getPlayGameTime(mList.get(position).getCreated()));


            ((MainViewHolder) holder).itemView.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    Intent it = new Intent(mContext, DiscoverCombatActivity.class);
                    String mUrl = Config.DISCOVER_COMBAT_URL + "&user_id=" + mList.get(position).getUser_id() +
                            "&game_zone=" + mList.get(position).getGame_zone().getPinyin() +
                            "&game_id=" + mList.get(position).getGame_id();
                    it.putExtra("DiscoverCombatActivity", mUrl);
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


    public class TopViewHolder extends RecyclerView.ViewHolder
    {

        @Bind(R.id.header)
        ImageView mHeader;
        @Bind(R.id.level)
        TextView mLevel;
        @Bind(R.id.userName)
        TextView mUserName;
        @Bind(R.id.alias)
        TextView mAlias;
        @Bind(R.id.score)
        TextView mScore;
        @Bind(R.id.img_cn)
        ImageView mImgCn;
        @Bind(R.id.tv_cn)
        TextView mTvCn;
        @Bind(R.id.win)
        TextView mWin;
        @Bind(R.id.total)
        TextView mTotal;
        @Bind(R.id.match)
        TextView mMatch;

        public TopViewHolder(View itemView)
        {
            super(itemView);
            AutoUtils.autoSize(itemView);
            ButterKnife.bind(this, itemView);
        }
    }


    public class MainViewHolder extends RecyclerView.ViewHolder
    {
        @Bind(R.id.item_image)
        ImageView mItemImage;
        @Bind(R.id.item_title)
        TextView mItemTitle;
        @Bind(R.id.item_win)
        TextView mItemWin;
        @Bind(R.id.item_time)
        TextView mItemTime;

        public MainViewHolder(View itemView)
        {
            super(itemView);
            AutoUtils.autoSize(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

}

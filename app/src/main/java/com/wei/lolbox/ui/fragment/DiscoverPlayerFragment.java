package com.wei.lolbox.ui.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.wei.lolbox.R;
import com.wei.lolbox.base.BaseFragment;
import com.wei.lolbox.base.BasePresenter;
import com.wei.lolbox.model.discover.PlayerListBean;
import com.wei.lolbox.ui.adapter.discover.PlayerCombatAdapter;
import com.wei.lolbox.ui.adapter.discover.PlayerHeroAdapter;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * 作者：赵若位
 * 时间：2017/12/14
 * 邮箱：1070138445@qq.com
 * 功能：
 */

public class DiscoverPlayerFragment extends BaseFragment
{

    @Bind(R.id.mains)
    RecyclerView mMains;

    private RecyclerView.Adapter mAdapter;
    private int mPosition;


    public static Fragment getIntent(int position)
    {
        DiscoverPlayerFragment mFragment = new DiscoverPlayerFragment();
        Bundle mBundle = new Bundle();
        mBundle.putInt("DiscoverPlayerFragment", position);
        mFragment.setArguments(mBundle);
        return mFragment;
    }

    @Override
    protected BasePresenter createPresenter()
    {
        return null;
    }

    @Override
    protected int getResounrceId()
    {
        return R.layout.fragment_discover_player;
    }


    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        EventBus.getDefault().register(this);
    }

    @Override
    public void initView(View rootView)
    {
        super.initView(rootView);
        mMains.setLayoutManager(new LinearLayoutManager(getActivity()));
        mPosition = getArguments().getInt("DiscoverPlayerFragment");
        mStateView.showContent();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void updateAdapter(PlayerListBean data)
    {
        switch (mPosition)
        {
            case 0:
                mAdapter = new PlayerCombatAdapter(getActivity());
                mMains.setAdapter(mAdapter);
                ((PlayerCombatAdapter) mAdapter).update(data.getPlayer_list().get(0));
                break;
            case 1:
                mAdapter = new PlayerHeroAdapter(getActivity());
                mMains.setAdapter(mAdapter);
                ((PlayerHeroAdapter) mAdapter).update(data.getPlayer_list().get(0).getChampion_performance_list());
                break;
        }
    }


    @Override
    public void onDestroyView()
    {
        super.onDestroyView();
        EventBus.getDefault().unregister(this);
        ButterKnife.unbind(this);
    }
}

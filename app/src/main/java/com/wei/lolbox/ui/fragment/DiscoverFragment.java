package com.wei.lolbox.ui.fragment;

import android.content.Intent;
import android.view.View;

import com.wei.lolbox.R;
import com.wei.lolbox.base.BaseFragment;
import com.wei.lolbox.base.BasePresenter;
import com.wei.lolbox.config.Config;
import com.wei.lolbox.ui.activity.DiscoverGameActivity;
import com.wei.lolbox.ui.activity.DiscoverSearchActivity;
import com.wei.lolbox.ui.activity.HeroActivity;

import butterknife.OnClick;

/**
 * 作者：赵若位
 * 时间：2017/11/29
 * 邮箱：1070138445@qq.com
 * 功能：
 */

public class DiscoverFragment extends BaseFragment
{
    @Override
    protected BasePresenter createPresenter()
    {
        return null;
    }

    @Override
    protected int getResounrceId()
    {
        return R.layout.fragment_discover;
    }


    @Override
    public void initView(View rootView)
    {
        super.initView(rootView);
        mStateView.showContent();
    }

    @OnClick({R.id.share, R.id.heBar, R.id.dongTai, R.id.hero, R.id.game, R.id.follow_add})
    public void onViewClicked(View view)
    {
        Intent it = null;
        switch (view.getId())
        {
            case R.id.share://分享
                break;
            case R.id.heBar:
                break;
            case R.id.dongTai:
                break;
            case R.id.hero:
                it = new Intent(getActivity(), HeroActivity.class);
                startActivity(it);
                break;
            case R.id.game:
                it = new Intent(getActivity(), DiscoverGameActivity.class);
                it.putExtra("DiscoverGameActivity", Config.DISCOVER_GAME);
                startActivity(it);
                break;
            case R.id.follow_add:
                it = new Intent(getActivity(), DiscoverSearchActivity.class);
                startActivity(it);
                break;
        }
    }
}

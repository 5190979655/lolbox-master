package com.wei.lolbox.ui.activity;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.orhanobut.logger.Logger;
import com.squareup.picasso.Picasso;
import com.wei.lolbox.R;
import com.wei.lolbox.base.BaseActivity;
import com.wei.lolbox.base.BaseView;
import com.wei.lolbox.model.follow.Author;
import com.wei.lolbox.model.home.HomeVideo;
import com.wei.lolbox.presenter.follow.AuthorPresenter;
import com.wei.lolbox.ui.adapter.follow.FollowAuthorAdapter;
import com.wei.lolbox.utils.CircleTransform;

import java.util.List;

import butterknife.Bind;
import butterknife.OnClick;

/**
 * 作者：赵若位
 * 时间：2017/12/7
 * 邮箱：1070138445@qq.com
 * 功能：
 */

public class FollowAuthorActivity extends BaseActivity<AuthorPresenter> implements BaseView
{

    @Bind(R.id.header)
    ImageView mHeader;
    @Bind(R.id.title)
    TextView mTitle;
    @Bind(R.id.author)
    TextView mAuthor;
    @Bind(R.id.mains)
    RecyclerView mMains;

    private FollowAuthorAdapter mAdapter;

    private long targetUid;


    @Override
    protected AuthorPresenter createPresenter()
    {
        return new AuthorPresenter(this);
    }

    @Override
    protected int getResourceId()
    {
        return R.layout.activity_follow_author;
    }

    @Override
    public void initView()
    {
        super.initView();

        GridLayoutManager mManager = new GridLayoutManager(this, 2);
        mMains.setLayoutManager(mManager);
        mAdapter = new FollowAuthorAdapter(this);
        mMains.setAdapter(mAdapter);
        if (targetUid == 0)
        {
            targetUid = getIntent().getLongExtra("FollowAuthorActivity", 0);
        }
    }


    @Override
    public void initData()
    {
        super.initData();
        mPresenter.loadingData(targetUid);
    }

    @OnClick({R.id.finish, R.id.share})
    public void onViewClicked(View view)
    {
        switch (view.getId())
        {
            case R.id.finish:
                finish();
                break;
            case R.id.share:
                break;
        }
    }

    @Override
    public void showError(String e)
    {
        Logger.e(e);
        mStateView.showRetry();
    }

    @Override
    public void showData(Object o)
    {
        List<HomeVideo> list = (List<HomeVideo>) o;
        mAdapter.update(list);

        if (list == null || list.size() == 0)
        {
            return;
        }
        Picasso.with(this)
                .load(list.get(0).getAccountImg())
                .transform(new CircleTransform())
                .fit()
                .centerCrop()
                .into(mHeader);

        mTitle.setText(list.get(0).getAccountName());
        mStateView.showContent();
    }
}

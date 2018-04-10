package com.wei.lolbox.ui.activity;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.PagerSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SnapHelper;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.orhanobut.logger.Logger;
import com.wei.lolbox.R;
import com.wei.lolbox.base.BaseActivity;
import com.wei.lolbox.base.BaseView;
import com.wei.lolbox.config.Config;
import com.wei.lolbox.model.msg.PhotoDetailModel;
import com.wei.lolbox.presenter.msg.MsgPhotoDetailPresenter;
import com.wei.lolbox.ui.adapter.msg.PhotoDetailAdapter;
import com.wei.lolbox.utils.ImageUtils;
import com.wei.lolbox.utils.StatusBarUtils;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.OnClick;

/**
 * 作者：赵若位
 * 时间：2017/12/4
 * 邮箱：1070138445@qq.com
 * 功能：
 */

public class MsgDetailPictureActivity extends BaseActivity<MsgPhotoDetailPresenter> implements BaseView
{
    @Bind(R.id.mains)
    RecyclerView mMains;
    @Bind(R.id.position)
    TextView mPosition;
    @Bind(R.id.descript)
    TextView mDescript;


    private PhotoDetailAdapter mAdapter;
    private String albumId;
    private List<PhotoDetailModel.Pictures> mList;
    private int position;//当前RecyclerView的可见页面
    private ImageUtils mImageUtils;//保存图片到本地的工具类


    @Override
    protected MsgPhotoDetailPresenter createPresenter()
    {
        return new MsgPhotoDetailPresenter(this);
    }

    @Override
    protected int getResourceId()
    {
        return R.layout.activity_msg_detail_photo;
    }

    @Override
    public void initView()
    {
        super.initView();
        StatusBarUtils.setColorNoTranslucent(this,getResources().getColor(R.color.black));
        if (albumId == null)
        {
            albumId = getIntent().getStringExtra("MsgDetailPictureActivity");
        }
        mList = new ArrayList<>();
        mImageUtils = new ImageUtils(this);
        mAdapter = new PhotoDetailAdapter(this);


        final LinearLayoutManager mManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        mMains.setLayoutManager(mManager);
        mMains.setAdapter(mAdapter);
        SnapHelper mHelper = new PagerSnapHelper();
        mHelper.attachToRecyclerView(mMains);

        mMains.addOnScrollListener(new RecyclerView.OnScrollListener()
        {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState)
            {
                super.onScrollStateChanged(recyclerView, newState);
                switch (newState)
                {
                    case RecyclerView.SCROLL_STATE_IDLE:
                        mDescript.setText(mList.get(position).getPicDesc());
                        mPosition.setText((position + 1) + "/" + mList.size());
                        if (position == mList.size() - 1)
                        {
                            Toast.makeText(MsgDetailPictureActivity.this, "已经是最后一张图片~", Toast.LENGTH_LONG).show();
                        }
                        break;
                }
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy)
            {
                super.onScrolled(recyclerView, dx, dy);
                position = mManager.findFirstVisibleItemPosition();
            }
        });


    }

    @Override
    public void initData()
    {
        super.initData();
        mPresenter.loadingData(albumId);
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
        final List<PhotoDetailModel.Pictures> list = (List<PhotoDetailModel.Pictures>) o;
        if (list == null || list.size() == 0)
        {
            mStateView.showEmpty();
            return;
        }
        mList.addAll(list);
        mAdapter.update(list);
        mDescript.setText(list.get(0).getPicDesc());
        mPosition.setText("1/" + list.size());
        mStateView.showContent();
    }

    //验证手机是否有权限
    private boolean requestPermiss()
    {
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) !=
                PackageManager.PERMISSION_GRANTED)
        {
            return false;
        } else
        {
            return true;
        }
    }


    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        mImageUtils.destroy();
    }


    @OnClick({R.id.finish, R.id.share, R.id.download})
    public void onViewClicked(View view)
    {
        switch (view.getId())
        {
            case R.id.finish:
                finish();
                break;
            case R.id.share:
                Intent it = new Intent(this, MsgDetailWebActivity.class);
                it.putExtra("url", Config.PHOTO_COMMENT + mList.get(position).getPicId());
                startActivity(it);
                break;
            case R.id.download:
                if (mList != null && mList.size() != 0 && requestPermiss())
                {
                    mImageUtils.savePicture(mList.get(position).getUrl());
                } else
                {
                    mImageUtils.showDialog(ImageUtils.POSITION_FAIL);
                }
                break;
        }
    }
}

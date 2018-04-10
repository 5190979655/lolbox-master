package com.wei.lolbox.ui.fragment;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.PopupWindow;
import android.widget.TextView;

import com.orhanobut.logger.Logger;
import com.wei.lolbox.Application;
import com.wei.lolbox.R;
import com.wei.lolbox.base.BaseFragment;
import com.wei.lolbox.base.BaseView;
import com.wei.lolbox.config.Config;
import com.wei.lolbox.dao.HeroPositionDao;
import com.wei.lolbox.dao.HeroRolesDao;
import com.wei.lolbox.dao.HeroesDao;
import com.wei.lolbox.model.discover.HeroPosition;
import com.wei.lolbox.model.discover.HeroRoles;
import com.wei.lolbox.model.discover.Heroes;
import com.wei.lolbox.presenter.discover.HeroAllPresenter;
import com.wei.lolbox.ui.adapter.discover.HeroAllAdapter;
import com.wei.lolbox.ui.adapter.discover.HeroSearchMoneyAdapter;
import com.wei.lolbox.ui.adapter.discover.HeroSearchTypeAdapter;
import com.wei.lolbox.utils.ScreenUtils;
import com.zhy.autolayout.AutoRelativeLayout;

import org.greenrobot.greendao.query.QueryBuilder;

import java.util.List;

import butterknife.Bind;
import butterknife.OnClick;

/**
 * 作者：赵若位
 * 时间：2017/12/9
 * 邮箱：1070138445@qq.com
 * 功能：
 */

public class HeroAllFragment extends BaseFragment<HeroAllPresenter> implements BaseView
{
    @Bind(R.id.ed_search)
    EditText mEdSearch;
    @Bind(R.id.heroType)
    TextView mHeroType;
    @Bind(R.id.heroPosition)
    TextView mHeroPosition;
    @Bind(R.id.heroMoney)
    TextView mHeroMoney;
    @Bind(R.id.heroOrder)
    TextView mHeroOrder;
    @Bind(R.id.mains)
    RecyclerView mMains;

    private HeroAllAdapter mAdapter;
    private PopupWindow mWindow;
    private Drawable mNormal;//灰色下划线
    private Drawable mPressed;//白色下划线
    private Drawable mUp;//
    private Drawable mDown;//

    private HeroesDao mDao = null;

    private static int moneyType = 0;//搜索价格的类型 0 全部, 1 点券, 2 金币;

    @Override
    protected HeroAllPresenter createPresenter()
    {
        return new HeroAllPresenter(this);
    }

    @Override
    protected int getResounrceId()
    {
        return R.layout.fragment_hero_all;
    }

    @Override
    public void initView(View rootView)
    {
        super.initView(rootView);
        int[] mScreen = ScreenUtils.getScreen(getActivity());
        mNormal = getResources().getDrawable(R.drawable.shape_discover_hero_all_tv_line_normal);
        mNormal.setBounds(0, 0, mScreen[1] / 4, 2);

        mPressed = getResources().getDrawable(R.drawable.shape_discover_hero_all_tv_line_pressed);
        mPressed.setBounds(0, 0, mScreen[1] / 4, 2);

        mUp = getResources().getDrawable(R.drawable.hero_odds_pull_up);
        mUp.setBounds(0, 0, 24, 24);

        mDown = getResources().getDrawable(R.drawable.hero_odds_pull_down);
        mDown.setBounds(0, 0, 24, 24);

        mHeroType.setCompoundDrawables(null, null, mDown, mNormal);
        mHeroPosition.setCompoundDrawables(null, null, mDown, mNormal);
        mHeroMoney.setCompoundDrawables(null, null, mDown, mNormal);
        mHeroOrder.setCompoundDrawables(null, null, mDown, mNormal);

        GridLayoutManager mManager = new GridLayoutManager(getActivity(), 4);
        mMains.setLayoutManager(mManager);
        mAdapter = new HeroAllAdapter(getActivity());
        mMains.setAdapter(mAdapter);
        mDao = Application.mSession.getHeroesDao();
        isUIVisible = true;
    }

    @Override
    public void initData()
    {
        super.initData();
        List<Heroes> mList = mDao.loadAll();
        if (mList == null || mList.size() == 0)
        {
            mPresenter.loadingData();
        } else
        {
            mAdapter.update(mList);
            mStateView.showContent();
        }
    }

    @OnClick({R.id.tv_search, R.id.heroType, R.id.heroPosition, R.id.heroMoney, R.id.heroOrder})
    public void onViewClicked(View view)
    {
        switch (view.getId())
        {
            case R.id.tv_search:
                if (mEdSearch.getText().toString().equals(""))
                {
                    return;
                }
                query(mEdSearch.getText().toString());
                break;
            case R.id.heroType:
                showWindow(view, Config.DISCOVER_HERO_SEARCH_TYPE);
                break;
            case R.id.heroPosition:
                showWindow(view, Config.DISCOVER_HERO_SEARCH_POSITION);
                break;
            case R.id.heroMoney:
                showWindow(view, null);
                break;
            case R.id.heroOrder:
                showWindow(view, Config.DISCOVER_HERO_SEARCH_ORDER);
                break;
        }
    }

    @Override
    public void showError(String e)
    {
        mStateView.showRetry();
    }

    @Override
    public void showData(Object o)
    {
        List<Heroes> list = (List<Heroes>) o;
        mAdapter.update(list);
        mStateView.showContent();
    }


    /**
     * PopuWindow显示在某个控件的下面
     *
     * @param v 需要PopuWindow在这个控件的下方
     */
    private void showWindow(final View v, String[] type)
    {
        if (mWindow != null && mWindow.isShowing())
        {
            mWindow.dismiss();
            return;
        }
        final TextView mView = (TextView) v;
        mView.setCompoundDrawables(null, null, mUp, mPressed);

        if (v.getTag() != null)
        {
            mWindow = (PopupWindow) v.getTag();
            mWindow.showAsDropDown(v);
            return;
        }
        View layout = LayoutInflater.from(getActivity()).inflate(R.layout.window_discover_hero_search, null);
        int[] location = new int[2];
        v.getLocationOnScreen(location);
        int[] mScreen = ScreenUtils.getScreen(getActivity());
        int mHeight = v.getBottom() - v.getTop();//获取控件的高度
        mWindow = new PopupWindow(layout, AutoRelativeLayout.LayoutParams.MATCH_PARENT, mScreen[1] - location[1] - mHeight, true);
        mWindow.setBackgroundDrawable(new BitmapDrawable());

        mWindow.setOnDismissListener(new PopupWindow.OnDismissListener()
        {
            @Override
            public void onDismiss()
            {

                mView.setCompoundDrawables(null, null, mDown, mNormal);
            }
        });

        RecyclerView mChild = layout.findViewById(R.id.window_child);
        if (v.getId() == R.id.heroMoney)
        {
            LinearLayoutManager mManager = new LinearLayoutManager(getActivity());
            mChild.setLayoutManager(mManager);
            final HeroSearchMoneyAdapter adapter = new HeroSearchMoneyAdapter(getActivity());
            mChild.setAdapter(adapter);
            adapter.update();
            adapter.setOnItemClickListener(new HeroSearchMoneyAdapter.OnItemClickListener()
            {
                @Override
                public void onClick(String s, int count)
                {
                    showText(v, s);
                    moneyType = count;
                    query();
                    if (mWindow != null && mWindow.isShowing())
                    {
                        mWindow.dismiss();
                    }
                }
            });
        } else
        {
            GridLayoutManager manager = new GridLayoutManager(getActivity(), 4);
            mChild.setLayoutManager(manager);
            HeroSearchTypeAdapter adapter = new HeroSearchTypeAdapter(getActivity());
            mChild.setAdapter(adapter);
            adapter.update(type);
            adapter.setOnItemClickListener(new HeroSearchTypeAdapter.OnItemClickListener()
            {
                @Override
                public void click(View mView, String s, int position)
                {
                    showText(v, s);
                    query();
                    if (mWindow != null && mWindow.isShowing())
                    {
                        mWindow.dismiss();
                    }
                }
            });
        }
        v.setTag(mWindow);
        mWindow.showAsDropDown(v);
    }


    /**
     * 给TextView设置下划线和图标
     *
     * @param v
     * @param s
     */
    private void showText(View v, String s)
    {
        TextView mView = (TextView) v;
        switch (v.getId())
        {
            case R.id.heroType:
                if (s.equals("全部"))
                {
                    mView.setText("类型");
                    return;
                }
                break;
            case R.id.heroPosition:
                if (s.equals("全部"))
                {
                    mView.setText("位置");
                    return;
                }
                break;
            case R.id.heroMoney:
                if (s.equals("全部"))
                {
                    mView.setText("价格");
                    return;
                }
                break;
            case R.id.heroOrder:
                if (s.equals("默认"))
                {
                    mView.setText("排序");
                    return;
                }
                break;
        }
        mView.setText(s);

    }


    //根据点击搜索英雄
    private void query()
    {
        QueryBuilder<Heroes> mBuilder = mDao.queryBuilder();
        String mType = mHeroType.getText().toString();
        String mPosition = mHeroPosition.getText().toString();
        String mMoney = mHeroMoney.getText().toString();
        String mOrder = mHeroOrder.getText().toString();

        if (!mType.equals("类型"))
        {
            mBuilder.join(HeroRoles.class, HeroRolesDao.Properties.Name).where(HeroRolesDao.Properties.Role_in_cn.eq(mType));
        }
        if (!mPosition.equals("位置"))
        {
            mBuilder.join(HeroPosition.class, HeroPositionDao.Properties.Name).where(HeroPositionDao.Properties.Position_in_cn.eq(mPosition));
        }
        if (moneyType != 0)
        {
            switch (moneyType)
            {
                case 1://点券
                    mBuilder.where(HeroesDao.Properties.Coupon.eq(mMoney));
                    break;
                case 2://金币
                    mBuilder.where(HeroesDao.Properties.Gold.eq(mMoney));
                    break;
            }
        }

        if (!mOrder.equals("排序"))
        {
            switch (mOrder)
            {
                case "金币":
                    mBuilder.orderAsc(HeroesDao.Properties.Gold);
                    break;
                case "点券":
                    mBuilder.orderAsc(HeroesDao.Properties.Coupon);
                    break;
                case "字母":
                    break;
            }
        }
        List<Heroes> mList = mBuilder.list();
        mAdapter.update(mList);
        Logger.e(mList.size() + "");
    }


    //根据英雄名称搜索英雄
    private void query(String name)
    {
        QueryBuilder<Heroes> mBuilder = mDao.queryBuilder();
        mBuilder.where(HeroesDao.Properties.Display_name.like(name));
        List<Heroes> mList = mBuilder.list();
        Logger.e(mList.size() + "");
        mAdapter.update(mList);
    }


}

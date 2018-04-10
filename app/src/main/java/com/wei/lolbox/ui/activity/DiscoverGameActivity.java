package com.wei.lolbox.ui.activity;

import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.wei.lolbox.R;
import com.wei.lolbox.base.BaseActivity;
import com.wei.lolbox.base.BasePresenter;
import com.zhy.autolayout.AutoRelativeLayout;

import butterknife.Bind;
import butterknife.OnClick;

/**
 * 作者：赵若位
 * 时间：2017/12/21
 * 邮箱：1070138445@qq.com
 * 功能：
 */

public class DiscoverGameActivity extends BaseActivity
{
    @Bind(R.id.layout_title)
    TextView mLayoutTitle;
    @Bind(R.id.layout)
    AutoRelativeLayout mLayout;
    private WebView mWebView;


    private String mUrl;

    @Override
    protected BasePresenter createPresenter()
    {
        return null;
    }

    @Override
    protected int getResourceId()
    {
        return R.layout.activity_discover_game;
    }

    @Override
    public void initView()
    {
        super.initView();
        mLayoutTitle.setText("爱微游-游戏中心");
        if (mUrl == null)
        {
            mUrl = getIntent().getStringExtra("DiscoverGameActivity");
        }

        LinearLayout.LayoutParams mParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT);
        mWebView = new WebView(this.getApplicationContext());
        mWebView.setLayoutParams(mParams);
        mLayout.addView(mWebView);
        mWebView.setOverScrollMode(View.OVER_SCROLL_NEVER);
        mWebView.setVerticalScrollBarEnabled(false);
        mWebView.loadUrl(mUrl);
        mWebView.setWebViewClient(new WebViewClient()
        {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String urls)
            {
                view.loadUrl(urls);
                return true;
            }
        });


        //声明WebSettings子类
        WebSettings webSettings = mWebView.getSettings();

        //如果访问的页面中要与Javascript交互，则webview必须设置支持Javascript
        webSettings.setJavaScriptEnabled(true);


        //设置自适应屏幕，两者合用（下面这两个方法合用）
        webSettings.setUseWideViewPort(true); //将图片调整到适合webview的大小
        webSettings.setLoadWithOverviewMode(true); // 缩放至屏幕的大小

        //缩放操作
        webSettings.setSupportZoom(true); //支持缩放，默认为true。是下面那个的前提。
        webSettings.setBuiltInZoomControls(true); //设置内置的缩放控件。若为false，则该WebView不可缩放
        webSettings.setDisplayZoomControls(false); //隐藏原生的缩放控件

        //其他细节操作
        webSettings.setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK); //关闭webview中缓存
        webSettings.setAllowFileAccess(true); //设置可以访问文件
        webSettings.setJavaScriptCanOpenWindowsAutomatically(true); //支持通过JS打开新窗口
        webSettings.setLoadsImagesAutomatically(true); //支持自动加载图片
        webSettings.setDefaultTextEncodingName("utf-8");//设置编码格式
        mStateView.showContent();
    }


    @OnClick(R.id.layout_finish)
    public void onViewClicked()
    {
        finish();
    }


    @Override
    protected void onDestroy()
    {
        if (mWebView != null)
        {
            mWebView.loadDataWithBaseURL(null, "", "text/html", "utf-8", null);
            mWebView.clearHistory();

            ((ViewGroup) mWebView.getParent()).removeView(mWebView);
            mWebView.destroy();
            mWebView = null;
        }
        super.onDestroy();
    }
}

package com.wei.lolbox.ui.activity;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.view.View;

import com.wei.lolbox.Application;
import com.wei.lolbox.R;
import com.wei.lolbox.base.BaseClient;
import com.wei.lolbox.config.Config;
import com.wei.lolbox.utils.BaseHandler;
import com.wei.lolbox.utils.NetUtils;
import com.wei.lolbox.utils.SharedPreferencesUtils;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class SplashActivity extends Activity
{

    private BaseHandler mHandler = new BaseHandler();

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        //隐藏导航栏
        View mView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_FULLSCREEN;
        mView.setSystemUiVisibility(uiOptions);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);//设置Activity不允许横屏
        setContentView(R.layout.activity_splash);
        requestPermiss();
    }

    //延迟启动主页面
    private void initView()
    {
        mHandler.postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                Intent it = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(it);
                finish();
            }
        }, Config.SPLASH_DELAY_TIME);
    }


    //更新本地的Uid，Token
    private void updateToken()
    {
        RequestBody mBody = new FormBody.Builder()
                .add("network", NetUtils.getNetType(this))
                .add("mobileType", Build.MODEL)
                .add("mobileSign", "7679d0aa-1b40-337a-b849-672942bd7f0b")
                .add("deviceToken", "K7wJBt911TChEPvlhhx6dvx8Gr5KUIHBu/k/0hDMiKX03fRAvlLx9w==")
                .add("mobileBrand", Build.BRAND)
                .add("osVer", Build.VERSION.RELEASE + ":" + Build.VERSION.SDK_INT)
                .build();
        Request mRequest = new Request.Builder()
                .url(Config.update_token)
                .post(mBody)
                .build();
        Call call = BaseClient.getInstance().getClient().newCall(mRequest);
        call.enqueue(new Callback()
        {
            @Override
            public void onFailure(Call call, IOException e)
            {
                initView();
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException
            {
                String string = response.body().string();
                try
                {
                    JSONObject mObj = new JSONObject(string);
                    if (mObj.getInt("code") == 0)
                    {
                        String uid = mObj.getJSONObject("data").getString("uid");
                        String token = mObj.getJSONObject("data").getString("token");
                        if (SharedPreferencesUtils.setToken(SplashActivity.this, uid, token))
                        {
                            Application.Uid = uid;
                            Application.Token = token;
                        }
                    }
                } catch (JSONException mE)
                {
                    mE.printStackTrace();
                }
                initView();
            }
        });
    }


    //获取手机存储的Permiss
    private void requestPermiss()
    {
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE)
                != PackageManager.PERMISSION_GRANTED)
        {
            ActivityCompat.requestPermissions(this,
                    new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, Config.SUCCESS);
        } else
        {
            updateToken();
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults)
    {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == Config.SUCCESS)
        {
            //无论有没有授权成功，都不影响后续操作。
//            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED)//权限获取成功
//            {
//                updateToken();
//            } else//权限获取失败
//            {
//                updateToken();
//            }
            updateToken();
        }
    }
}

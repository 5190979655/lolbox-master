package com.wei.lolbox.utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * 作者：赵若位
 * 时间：2017/12/1
 * 邮箱：1070138445@qq.com
 * 功能：
 */

public class SharedPreferencesUtils
{

    //获取xml存储的Uid Token
    public static String[] getToken(Context mContext)
    {
        SharedPreferences mPreferences = mContext.getApplicationContext().getSharedPreferences(mContext.getPackageName(), Context.MODE_PRIVATE);
        String mUid = mPreferences.getString("uid", "");
        String mToken = mPreferences.getString("token", "");
        return new String[]{mUid, mToken};
    }


    //读取存储的Token和uid
    public static boolean setToken(Context mContext,String uid, String token)
    {
        SharedPreferences mPreferences = mContext.getApplicationContext().getSharedPreferences(mContext.getPackageName(), Context.MODE_PRIVATE);
        SharedPreferences.Editor mEditor = mPreferences.edit();
        mEditor.putString("uid", uid);
        mEditor.putString("token", token);
        return mEditor.commit();
    }
}

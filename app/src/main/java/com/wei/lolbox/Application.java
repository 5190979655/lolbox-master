package com.wei.lolbox;

import com.facebook.stetho.Stetho;
import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.Logger;
import com.wei.lolbox.dao.DaoMaster;
import com.wei.lolbox.dao.DaoSession;
import com.wei.lolbox.utils.SharedPreferencesUtils;
import com.zhy.autolayout.config.AutoLayoutConifg;

import org.greenrobot.greendao.database.Database;

/**
 * 作者：赵若位
 * 时间：2017/11/28
 * 邮箱：1070138445@qq.com
 * 功能：
 */

public class Application extends android.app.Application
{
    //网络请求Cookie
    public static String Cookie_Guid;
    public static String Cookie_Ua;
    public static String Uid = "";
    public static String Token = "";

    //数据库对象
    public static DaoSession mSession = null;


    @Override
    public void onCreate()
    {
        super.onCreate();
//        //Fresco
//        ImagePipelineConfig config = ImagePipelineConfig.newBuilder(this)
//                .setDownsampleEnabled(true)
//                .build();
//        Fresco.initialize(this, config);
        //Android
        AutoLayoutConifg.getInstance().useDeviceSize();
        //Log打印日志
        Logger.addLogAdapter(new AndroidLogAdapter());
        //数据库调试
        Stetho.initializeWithDefaults(this);

        initData();
        initGreenDao();
    }

    private void initGreenDao()
    {
        DaoMaster.OpenHelper mHelper = new DaoMaster.DevOpenHelper(this, getPackageName()+".db", null);
        Database mDb = mHelper.getWritableDb();
        mSession = new DaoMaster(mDb).newSession();
    }

    private void initData()
    {
        Cookie_Guid = "";
        Cookie_Ua = "lolbox&4.3-430&adr&duowan&social";
        String[] mStr = SharedPreferencesUtils.getToken(this);
        Uid = mStr[0];
        Token = mStr[1];
    }
}

package com.wei.lolbox.utils;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Environment;
import android.os.Looper;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;

import com.orhanobut.logger.Logger;
import com.wei.lolbox.R;
import com.wei.lolbox.config.Config;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * 作者：赵若位
 * 时间：2017/12/4
 * 邮箱：1070138445@qq.com
 * 功能：手机保存图片至本地
 */

public class ImageUtils
{
    private Context mContext;
    private Dialog mDialog;

    public static final int POSITION_SUCCE = 1;//保存图片成功
    public static final int POSITION_FAIL = -1;//保存图片失败

    //
    public ImageUtils(AppCompatActivity mActivity)
    {
        mContext = mActivity.getApplicationContext();
        mDialog = new Dialog(mActivity, R.style.Dialog);
        mDialog.setCanceledOnTouchOutside(false);
        mDialog.setOwnerActivity(mActivity);
    }

    /**
     * 从网络下载图片保存到系统相册
     * 1.验证是否有读取手机的权限；否 直接返回，不予请求网络
     * 2.保存图片到系统相册
     *
     * @param url 图片地址
     */
    public void savePicture(String url)
    {
        String fileName = Environment.getExternalStorageDirectory().getAbsolutePath() + "/" + mContext.getPackageName() + "/image_cache";
        Logger.e(fileName);
        if (!Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED))
        {
            showDialog(POSITION_FAIL);
        }
        final File files = new File(fileName);
        if (!files.exists())
        {
            files.mkdirs();
        }
        final File mFile = new File(files, TimeUtils.getLongTimes() + ".jpg");
        if (!mFile.exists())
        {
            try
            {
                mFile.createNewFile();
            } catch (IOException mE)
            {
                mE.printStackTrace();
            }
        }
        Request mRequest = new Request.Builder()
                .url(url)
                .build();
        Call mCall = new OkHttpClient().newCall(mRequest);
        mCall.enqueue(new Callback()
        {
            @Override
            public void onFailure(Call call, IOException e)
            {
                showDialog(POSITION_FAIL);
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException
            {
                byte[] bytes = response.body().bytes();
                Bitmap mBitmap = BitmapFactory.decodeByteArray(bytes, 0, bytes.length);
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(mFile));
                mBitmap.compress(Bitmap.CompressFormat.JPEG, 80, bos);
                bos.flush();
                bos.close();
                MediaStore.Images.Media.insertImage(mContext.getContentResolver(),
                        mFile.getAbsolutePath(), mFile.getName(), null);
                mContext.sendBroadcast(new Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE, Uri.parse("file://" + mFile.getAbsolutePath())));
                showDialog(POSITION_SUCCE);
            }
        });
    }


    /**
     * 图片保存成功或者失败 弹窗提醒
     */
    public void showDialog(int position)
    {
        View layout = null;
        if (position == POSITION_SUCCE)
        {
            layout = LayoutInflater.from(mContext).inflate(R.layout.dialog_save_image_succe, null, false);

        } else if (position == POSITION_FAIL)
        {
            layout = LayoutInflater.from(mContext).inflate(R.layout.dialog_save_image_fail, null, false);
        }
        mDialog.setContentView(layout);
        mDialog.getOwnerActivity().runOnUiThread(new Runnable()
        {
            @Override
            public void run()
            {
                mDialog.show();
            }
        });
        new BaseHandler(mContext.getMainLooper()).postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                mDialog.dismiss();
            }
        }, Config.SPLASH_DELAY_TIME);
    }


    //关闭Dialog
    public void destroy()
    {
        if (mDialog != null && mDialog.isShowing())
        {
            mDialog.dismiss();
        }
    }

}

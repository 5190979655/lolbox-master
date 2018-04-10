package com.wei.lolbox.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

import com.squareup.picasso.Transformation;

/**
 * 作者：赵若位
 * 时间：2017/12/3
 * 邮箱：1070138445@qq.com
 * 功能：
 */

public class RoundTransform implements Transformation
{
    private int radius;//圆角值

    public RoundTransform(int radius)
    {
        this.radius = radius;
    }

    @Override
    public Bitmap transform(Bitmap source)
    {
//        int width = source.getWidth();
//        int height = source.getHeight();
//        //画板
//        Bitmap bitmap = Bitmap.createBitmap(width, height, source.getConfig());
//        Paint paint = new Paint();
//        Canvas canvas = new Canvas(bitmap);//创建同尺寸的画布
//        paint.setAntiAlias(true);//画笔抗锯齿
//        paint.setShader(new BitmapShader(source, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP));
//        //画圆角背景
//        RectF rectF = new RectF(new Rect(0, 0, width, height));//赋值
//        canvas.drawRoundRect(rectF, radius, radius, paint);//画圆角矩形
//        //
//        paint.setFilterBitmap(true);
//        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
//        canvas.drawBitmap(source, 0, 0, paint);
//        source.recycle();//释放
//
//        return bitmap;


        //获取宽,高
        int width = source.getWidth();
        int height = source.getHeight();
        Bitmap.Config config = source.getConfig() != null ? source.getConfig() : Bitmap.Config.ARGB_8888;
//创建一张可以操作的正方形图片的位图
        Bitmap bitmap = Bitmap.createBitmap(width, height, config);
//创建一个画布Canvas
        Canvas canvas = new Canvas(bitmap);
//创建画笔
        Paint paint = new Paint();
        BitmapShader shader = new BitmapShader(source, BitmapShader.TileMode.CLAMP, BitmapShader.TileMode.CLAMP);
        paint.setShader(shader);
        paint.setAntiAlias(true);
        canvas.drawRoundRect(new RectF(0, 0, width, height), radius, radius, paint);
        source.recycle();
        return bitmap;

    }

    @Override
    public String key()
    {
        return "round : radius = " + radius;
    }
}

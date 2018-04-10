package com.wei.lolbox.model.home;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Transient;

import java.util.List;
import org.greenrobot.greendao.annotation.Generated;

/**
 * 作者：赵若位
 * 时间：2017/12/24
 * 邮箱：1070138445@qq.com
 * 功能：
 */
@Entity()
public class HomeVideo implements Parcelable
{
    /**
     * audit : 1
     * cover : http://w2.dwstatic.com/s1_dwstatic/duowanvideo/20171223/22/5746204.jpg?imageview/2/w/480
     * createTime : 1514041440000
     * gifCover : http://w2.dwstatic.com/s1_dwstatic/duowanvideo/20171223/22/5746204.jpg
     * height : 540
     * id : 161941
     * len : 360495
     * mAccount : {"id":4733,"img":"http://s1.dwstatic.com/vhuya/avatar/16/05/200_200/e0e69e5397df16528788ce54137027d0.jpg?t=1472007902","name":"长歌是大腿","uid":1605639526}
     * momId : 6502758467485636569
     * playCount : 145482
     * title : 起小点TOP10:冰晶凤凰雪雨世界任翱翔
     * videoId : 8669847
     * videoInfo : {"height":540,"len":360.495,"screenshot":"http://vimg.dwstatic.com/1751/8669847/3.jpg","urls":["http://funbox-w6.dwstatic.com/79/4/1751/8669847-99-1514041062.mp4","http://funbox-w6.dwstatic.com/87/11/1751/8669847-99-1514041062.mp4"],"videoId":8669847,"videoName":"8669847-99-1514041062.mp4","videoUrls":[{"definition":"流畅","isDefault":0,"urls":["http://funbox-w6.dwstatic.com/79/6/1751/8669847-98-1514041062.mp4","http://funbox-w6.dwstatic.com/88/8/1751/8669847-98-1514041062.mp4"]},{"definition":"标清","isDefault":1,"urls":["http://funbox-w6.dwstatic.com/79/4/1751/8669847-99-1514041062.mp4","http://funbox-w6.dwstatic.com/87/11/1751/8669847-99-1514041062.mp4"]},{"definition":"超清","isDefault":0,"urls":["http://funbox-w6.dwstatic.com/87/12/1751/8669847-100-1514041062.mp4","http://funbox-w6.dwstatic.com/88/10/1751/8669847-100-1514041062.mp4"]}],"width":960}
     * width : 960
     */

    @Id
    private String id;
    private String tag;//视频属类
    private int audit;
    private String cover;
    private long createTime;
    private String gifCover;
    private String accountName;//作者名称
    private String accountImg;//作者头像
    private String url_video;//视频地址
    private int height;
    private String len;
    @Transient
    private MAccountBean mAccount;
    private long momId;
    private String playCount;
    private String title;
    private int videoId;
    @SerializedName("videoInfo")
    @Transient
    private VideoInfoBean videoInfo;
    private int width;


    @Generated(hash = 1557398350)
    public HomeVideo(String id, String tag, int audit, String cover, long createTime, String gifCover, String accountName, String accountImg, String url_video, int height, String len, long momId, String playCount, String title, int videoId, int width) {
        this.id = id;
        this.tag = tag;
        this.audit = audit;
        this.cover = cover;
        this.createTime = createTime;
        this.gifCover = gifCover;
        this.accountName = accountName;
        this.accountImg = accountImg;
        this.url_video = url_video;
        this.height = height;
        this.len = len;
        this.momId = momId;
        this.playCount = playCount;
        this.title = title;
        this.videoId = videoId;
        this.width = width;
    }

    @Generated(hash = 2125211174)
    public HomeVideo() {
    }


    protected HomeVideo(Parcel in)
    {
        id = in.readString();
        tag = in.readString();
        audit = in.readInt();
        cover = in.readString();
        createTime = in.readLong();
        gifCover = in.readString();
        accountName = in.readString();
        accountImg = in.readString();
        url_video = in.readString();
        height = in.readInt();
        len = in.readString();
        mAccount = in.readParcelable(MAccountBean.class.getClassLoader());
        momId = in.readLong();
        playCount = in.readString();
        title = in.readString();
        videoId = in.readInt();
        videoInfo = in.readParcelable(VideoInfoBean.class.getClassLoader());
        width = in.readInt();
    }

    public static final Creator<HomeVideo> CREATOR = new Creator<HomeVideo>()
    {
        @Override
        public HomeVideo createFromParcel(Parcel in)
        {
            return new HomeVideo(in);
        }

        @Override
        public HomeVideo[] newArray(int size)
        {
            return new HomeVideo[size];
        }
    };

    public String getId()
    {
        return id;
    }

    public void setId(String mId)
    {
        id = mId;
    }

    public String getTag()
    {
        return tag;
    }

    public void setTag(String mTag)
    {
        tag = mTag;
    }

    public int getAudit()
    {
        return audit;
    }

    public void setAudit(int mAudit)
    {
        audit = mAudit;
    }

    public String getCover()
    {
        return cover;
    }

    public void setCover(String mCover)
    {
        cover = mCover;
    }

    public long getCreateTime()
    {
        return createTime;
    }

    public void setCreateTime(long mCreateTime)
    {
        createTime = mCreateTime;
    }

    public String getGifCover()
    {
        return gifCover;
    }

    public void setGifCover(String mGifCover)
    {
        gifCover = mGifCover;
    }

    public String getAccountName()
    {
        return accountName;
    }

    public void setAccountName(String mAccountName)
    {
        accountName = mAccountName;
    }

    public String getAccountImg()
    {
        return accountImg;
    }

    public void setAccountImg(String mAccountImg)
    {
        accountImg = mAccountImg;
    }

    public String getUrl_video()
    {
        return url_video;
    }

    public void setUrl_video(String mUrl_video)
    {
        url_video = mUrl_video;
    }

    public int getHeight()
    {
        return height;
    }

    public void setHeight(int mHeight)
    {
        height = mHeight;
    }

    public String getLen()
    {
        return len;
    }

    public void setLen(String mLen)
    {
        len = mLen;
    }

    public MAccountBean getAccount()
    {
        return mAccount;
    }

    public void setAccount(MAccountBean mAccount)
    {
        this.mAccount = mAccount;
    }

    public long getMomId()
    {
        return momId;
    }

    public void setMomId(long mMomId)
    {
        momId = mMomId;
    }

    public String getPlayCount()
    {
        return playCount;
    }

    public void setPlayCount(String mPlayCount)
    {
        playCount = mPlayCount;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String mTitle)
    {
        title = mTitle;
    }

    public int getVideoId()
    {
        return videoId;
    }

    public void setVideoId(int mVideoId)
    {
        videoId = mVideoId;
    }

    public VideoInfoBean getVideoInfo()
    {
        return videoInfo;
    }

    public void setVideoInfo(VideoInfoBean mVideoInfo)
    {
        videoInfo = mVideoInfo;
    }

    public int getWidth()
    {
        return width;
    }

    public void setWidth(int mWidth)
    {
        width = mWidth;
    }

    @Override
    public int describeContents()
    {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags)
    {
        dest.writeString(id);
        dest.writeString(tag);
        dest.writeInt(audit);
        dest.writeString(cover);
        dest.writeLong(createTime);
        dest.writeString(gifCover);
        dest.writeString(accountName);
        dest.writeString(accountImg);
        dest.writeString(url_video);
        dest.writeInt(height);
        dest.writeString(len);
        dest.writeParcelable(mAccount, flags);
        dest.writeLong(momId);
        dest.writeString(playCount);
        dest.writeString(title);
        dest.writeInt(videoId);
        dest.writeParcelable(videoInfo, flags);
        dest.writeInt(width);
    }

    public static class MAccountBean implements Parcelable
    {
        /**
         * id : 4733
         * img : http://s1.dwstatic.com/vhuya/avatar/16/05/200_200/e0e69e5397df16528788ce54137027d0.jpg?t=1472007902
         * name : 长歌是大腿
         * uid : 1605639526
         */

        private String id;
        private String img;
        private String name;
        private String uid;

        protected MAccountBean(Parcel in)
        {
            id = in.readString();
            img = in.readString();
            name = in.readString();
            uid = in.readString();
        }

        public static final Creator<MAccountBean> CREATOR = new Creator<MAccountBean>()
        {
            @Override
            public MAccountBean createFromParcel(Parcel in)
            {
                return new MAccountBean(in);
            }

            @Override
            public MAccountBean[] newArray(int size)
            {
                return new MAccountBean[size];
            }
        };

        public String getId()
        {
            return id;
        }

        public void setId(String id)
        {
            this.id = id;
        }

        public String getImg()
        {
            return img;
        }

        public void setImg(String img)
        {
            this.img = img;
        }

        public String getName()
        {
            return name;
        }

        public void setName(String name)
        {
            this.name = name;
        }

        public String getUid()
        {
            return uid;
        }

        public void setUid(String uid)
        {
            this.uid = uid;
        }

        @Override
        public int describeContents()
        {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags)
        {
            dest.writeString(id);
            dest.writeString(img);
            dest.writeString(name);
            dest.writeString(uid);
        }
    }

    public static class VideoInfoBean implements Parcelable
    {
        /**
         * height : 540
         * len : 360.495
         * screenshot : http://vimg.dwstatic.com/1751/8669847/3.jpg
         * urls : ["http://funbox-w6.dwstatic.com/79/4/1751/8669847-99-1514041062.mp4","http://funbox-w6.dwstatic.com/87/11/1751/8669847-99-1514041062.mp4"]
         * videoId : 8669847
         * videoName : 8669847-99-1514041062.mp4
         * videoUrls : [{"definition":"流畅","isDefault":0,"urls":["http://funbox-w6.dwstatic.com/79/6/1751/8669847-98-1514041062.mp4","http://funbox-w6.dwstatic.com/88/8/1751/8669847-98-1514041062.mp4"]},{"definition":"标清","isDefault":1,"urls":["http://funbox-w6.dwstatic.com/79/4/1751/8669847-99-1514041062.mp4","http://funbox-w6.dwstatic.com/87/11/1751/8669847-99-1514041062.mp4"]},{"definition":"超清","isDefault":0,"urls":["http://funbox-w6.dwstatic.com/87/12/1751/8669847-100-1514041062.mp4","http://funbox-w6.dwstatic.com/88/10/1751/8669847-100-1514041062.mp4"]}]
         * width : 960
         */

        private int height;
        private double len;
        private String screenshot;
        private int videoId;
        private String videoName;
        private int width;
        @SerializedName("urls")
        private List<String> urls;
        @SerializedName("videoUrls")
        private List<VideoUrlsBean> videoUrls;

        protected VideoInfoBean(Parcel in)
        {
            height = in.readInt();
            len = in.readDouble();
            screenshot = in.readString();
            videoId = in.readInt();
            videoName = in.readString();
            width = in.readInt();
            urls = in.createStringArrayList();
        }

        public static final Creator<VideoInfoBean> CREATOR = new Creator<VideoInfoBean>()
        {
            @Override
            public VideoInfoBean createFromParcel(Parcel in)
            {
                return new VideoInfoBean(in);
            }

            @Override
            public VideoInfoBean[] newArray(int size)
            {
                return new VideoInfoBean[size];
            }
        };

        public int getHeight()
        {
            return height;
        }

        public void setHeight(int height)
        {
            this.height = height;
        }

        public double getLen()
        {
            return len;
        }

        public void setLen(double len)
        {
            this.len = len;
        }

        public String getScreenshot()
        {
            return screenshot;
        }

        public void setScreenshot(String screenshot)
        {
            this.screenshot = screenshot;
        }

        public int getVideoId()
        {
            return videoId;
        }

        public void setVideoId(int videoId)
        {
            this.videoId = videoId;
        }

        public String getVideoName()
        {
            return videoName;
        }

        public void setVideoName(String videoName)
        {
            this.videoName = videoName;
        }

        public int getWidth()
        {
            return width;
        }

        public void setWidth(int width)
        {
            this.width = width;
        }

        public List<String> getUrls()
        {
            return urls;
        }

        public void setUrls(List<String> urls)
        {
            this.urls = urls;
        }

        public List<VideoUrlsBean> getVideoUrls()
        {
            return videoUrls;
        }

        public void setVideoUrls(List<VideoUrlsBean> videoUrls)
        {
            this.videoUrls = videoUrls;
        }

        @Override
        public int describeContents()
        {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags)
        {
            dest.writeInt(height);
            dest.writeDouble(len);
            dest.writeString(screenshot);
            dest.writeInt(videoId);
            dest.writeString(videoName);
            dest.writeInt(width);
            dest.writeStringList(urls);
        }

        public static class VideoUrlsBean
        {
            /**
             * definition : 流畅
             * isDefault : 0
             * urls : ["http://funbox-w6.dwstatic.com/79/6/1751/8669847-98-1514041062.mp4","http://funbox-w6.dwstatic.com/88/8/1751/8669847-98-1514041062.mp4"]
             */

            private String definition;
            private int isDefault;
            private List<String> urls;

            public String getDefinition()
            {
                return definition;
            }

            public void setDefinition(String definition)
            {
                this.definition = definition;
            }

            public int getIsDefault()
            {
                return isDefault;
            }

            public void setIsDefault(int isDefault)
            {
                this.isDefault = isDefault;
            }

            public List<String> getUrls()
            {
                return urls;
            }

            public void setUrls(List<String> urls)
            {
                this.urls = urls;
            }
        }
    }
}

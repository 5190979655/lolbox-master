package com.wei.lolbox.model.follow;

import com.google.gson.annotations.SerializedName;
import com.wei.lolbox.model.home.HomeVideo;

import java.util.List;

/**
 * 作者：赵若位
 * 时间：2017/12/7
 * 邮箱：1070138445@qq.com
 * 功能：
 */

public class User
{

    @SerializedName("articles")
    private List<HomeVideo> articles;
    @SerializedName("mediaAccounts")
    private List<MediaAccountsBean> mediaAccounts;

    public List<HomeVideo> getArticles()
    {
        return articles;
    }

    public void setArticles(List<HomeVideo> articles)
    {
        this.articles = articles;
    }

    public List<MediaAccountsBean> getMediaAccounts()
    {
        return mediaAccounts;
    }

    public void setMediaAccounts(List<MediaAccountsBean> mediaAccounts)
    {
        this.mediaAccounts = mediaAccounts;
    }

//    public static class ArticlesBean
//    {
//        /**
//         * audit : 1
//         * cover : http://s1.dwstatic.com/author-grab/20170803/20/2606288.jpeg?imageview/2/w/480
//         * createTime : 1501771680000
//         * gifCover : http://s1.dwstatic.com/author-grab/20170803/20/2606288.jpeg
//         * height : 360
//         * id : 116079
//         * len : 2702514
//         * mAccount : {"id":93550,"img":"http://screenshot.dwstatic.com/ojiasnsimage/82320a0c1e7cba0e334f49d4688df5e2_len30006.jpg?imageview/0/w/150/h/150/format/jpg","name":"影迷劳拉","uid":2169741497}
//         * momId : 6450060249555862990
//         * playCount : 7168
//         * title : 【约会宝典式轻喜剧】约会专家 15-16 约会么么哒
//         * videoId : 8464707
//         * width : 640
//         * videoInfo : {"height":540,"len":267.293,"screenshot":"http://vimg.dwstatic.com/1719/6411053/3.jpg","urls":["http://funbox-w6.dwstatic.com/83/4/1719/6411053-99-1494655719.mp4","http://funbox-w6.dwstatic.com/87/6/1719/6411053-99-1494655719.mp4"],"videoId":6411053,"videoName":"6411053-99-1494655719.mp4","videoUrls":[{"definition":"流畅","isDefault":0,"urls":["http://funbox-w6.dwstatic.com/87/4/1719/6411053-98-1494655719.mp4","http://funbox-w6.dwstatic.com/89/8/1719/6411053-98-1494655719.mp4"]},{"definition":"标清","isDefault":1,"urls":["http://funbox-w6.dwstatic.com/83/4/1719/6411053-99-1494655719.mp4","http://funbox-w6.dwstatic.com/87/6/1719/6411053-99-1494655719.mp4"]},{"definition":"超清","isDefault":0,"urls":["http://funbox-w6.dwstatic.com/80/2/1719/6411053-100-1494655719.mp4","http://funbox-w6.dwstatic.com/86/4/1719/6411053-100-1494655719.mp4"]}],"width":960}
//         */
//
//        private int audit;
//        private String cover;
//        private long createTime;
//        private String gifCover;
//        private int height;
//        private int id;
//        private int len;
//        private MAccountBean mAccount;
//        private long momId;
//        private int playCount;
//        private String title;
//        private int videoId;
//        private int width;
//        private VideoInfoBean videoInfo;
//
//        public int getAudit()
//        {
//            return audit;
//        }
//
//        public void setAudit(int audit)
//        {
//            this.audit = audit;
//        }
//
//        public String getCover()
//        {
//            return cover;
//        }
//
//        public void setCover(String cover)
//        {
//            this.cover = cover;
//        }
//
//        public long getCreateTime()
//        {
//            return createTime;
//        }
//
//        public void setCreateTime(long createTime)
//        {
//            this.createTime = createTime;
//        }
//
//        public String getGifCover()
//        {
//            return gifCover;
//        }
//
//        public void setGifCover(String gifCover)
//        {
//            this.gifCover = gifCover;
//        }
//
//        public int getHeight()
//        {
//            return height;
//        }
//
//        public void setHeight(int height)
//        {
//            this.height = height;
//        }
//
//        public int getId()
//        {
//            return id;
//        }
//
//        public void setId(int id)
//        {
//            this.id = id;
//        }
//
//        public int getLen()
//        {
//            return len;
//        }
//
//        public void setLen(int len)
//        {
//            this.len = len;
//        }
//
//        public MAccountBean getMAccount()
//        {
//            return mAccount;
//        }
//
//        public void setMAccount(MAccountBean mAccount)
//        {
//            this.mAccount = mAccount;
//        }
//
//        public long getMomId()
//        {
//            return momId;
//        }
//
//        public void setMomId(long momId)
//        {
//            this.momId = momId;
//        }
//
//        public int getPlayCount()
//        {
//            return playCount;
//        }
//
//        public void setPlayCount(int playCount)
//        {
//            this.playCount = playCount;
//        }
//
//        public String getTitle()
//        {
//            return title;
//        }
//
//        public void setTitle(String title)
//        {
//            this.title = title;
//        }
//
//        public int getVideoId()
//        {
//            return videoId;
//        }
//
//        public void setVideoId(int videoId)
//        {
//            this.videoId = videoId;
//        }
//
//        public int getWidth()
//        {
//            return width;
//        }
//
//        public void setWidth(int width)
//        {
//            this.width = width;
//        }
//
//        public VideoInfoBean getVideoInfo()
//        {
//            return videoInfo;
//        }
//
//        public void setVideoInfo(VideoInfoBean videoInfo)
//        {
//            this.videoInfo = videoInfo;
//        }
//
//        public static class MAccountBean
//        {
//            /**
//             * id : 93550
//             * img : http://screenshot.dwstatic.com/ojiasnsimage/82320a0c1e7cba0e334f49d4688df5e2_len30006.jpg?imageview/0/w/150/h/150/format/jpg
//             * name : 影迷劳拉
//             * uid : 2169741497
//             */
//
//            private int id;
//            private String img;
//            private String name;
//            private long uid;
//
//            public int getId()
//            {
//                return id;
//            }
//
//            public void setId(int id)
//            {
//                this.id = id;
//            }
//
//            public String getImg()
//            {
//                return img;
//            }
//
//            public void setImg(String img)
//            {
//                this.img = img;
//            }
//
//            public String getName()
//            {
//                return name;
//            }
//
//            public void setName(String name)
//            {
//                this.name = name;
//            }
//
//            public long getUid()
//            {
//                return uid;
//            }
//
//            public void setUid(long uid)
//            {
//                this.uid = uid;
//            }
//        }
//
//        public static class VideoInfoBean
//        {
//            /**
//             * height : 540
//             * len : 267.293
//             * screenshot : http://vimg.dwstatic.com/1719/6411053/3.jpg
//             * urls : ["http://funbox-w6.dwstatic.com/83/4/1719/6411053-99-1494655719.mp4","http://funbox-w6.dwstatic.com/87/6/1719/6411053-99-1494655719.mp4"]
//             * videoId : 6411053
//             * videoName : 6411053-99-1494655719.mp4
//             * videoUrls : [{"definition":"流畅","isDefault":0,"urls":["http://funbox-w6.dwstatic.com/87/4/1719/6411053-98-1494655719.mp4","http://funbox-w6.dwstatic.com/89/8/1719/6411053-98-1494655719.mp4"]},{"definition":"标清","isDefault":1,"urls":["http://funbox-w6.dwstatic.com/83/4/1719/6411053-99-1494655719.mp4","http://funbox-w6.dwstatic.com/87/6/1719/6411053-99-1494655719.mp4"]},{"definition":"超清","isDefault":0,"urls":["http://funbox-w6.dwstatic.com/80/2/1719/6411053-100-1494655719.mp4","http://funbox-w6.dwstatic.com/86/4/1719/6411053-100-1494655719.mp4"]}]
//             * width : 960
//             */
//
//            private int height;
//            private double len;
//            private String screenshot;
//            private int videoId;
//            private String videoName;
//            private int width;
//            private List<String> urls;
//            private List<VideoUrlsBean> videoUrls;
//
//            public int getHeight()
//            {
//                return height;
//            }
//
//            public void setHeight(int height)
//            {
//                this.height = height;
//            }
//
//            public double getLen()
//            {
//                return len;
//            }
//
//            public void setLen(double len)
//            {
//                this.len = len;
//            }
//
//            public String getScreenshot()
//            {
//                return screenshot;
//            }
//
//            public void setScreenshot(String screenshot)
//            {
//                this.screenshot = screenshot;
//            }
//
//            public int getVideoId()
//            {
//                return videoId;
//            }
//
//            public void setVideoId(int videoId)
//            {
//                this.videoId = videoId;
//            }
//
//            public String getVideoName()
//            {
//                return videoName;
//            }
//
//            public void setVideoName(String videoName)
//            {
//                this.videoName = videoName;
//            }
//
//            public int getWidth()
//            {
//                return width;
//            }
//
//            public void setWidth(int width)
//            {
//                this.width = width;
//            }
//
//            public List<String> getUrls()
//            {
//                return urls;
//            }
//
//            public void setUrls(List<String> urls)
//            {
//                this.urls = urls;
//            }
//
//            public List<VideoUrlsBean> getVideoUrls()
//            {
//                return videoUrls;
//            }
//
//            public void setVideoUrls(List<VideoUrlsBean> videoUrls)
//            {
//                this.videoUrls = videoUrls;
//            }
//
//            public static class VideoUrlsBean
//            {
//                /**
//                 * definition : 流畅
//                 * isDefault : 0
//                 * urls : ["http://funbox-w6.dwstatic.com/87/4/1719/6411053-98-1494655719.mp4","http://funbox-w6.dwstatic.com/89/8/1719/6411053-98-1494655719.mp4"]
//                 */
//
//                private String definition;
//                private int isDefault;
//                private List<String> urls;
//
//                public String getDefinition()
//                {
//                    return definition;
//                }
//
//                public void setDefinition(String definition)
//                {
//                    this.definition = definition;
//                }
//
//                public int getIsDefault()
//                {
//                    return isDefault;
//                }
//
//                public void setIsDefault(int isDefault)
//                {
//                    this.isDefault = isDefault;
//                }
//
//                public List<String> getUrls()
//                {
//                    return urls;
//                }
//
//                public void setUrls(List<String> urls)
//                {
//                    this.urls = urls;
//                }
//            }
//        }
//    }

    public static class MediaAccountsBean
    {
        /**
         * articleCount : 0
         * fansCount : 8927
         * followType : 0
         * id : 57439
         * img : http://video.duowan.com/style/img/editor-avatar.png
         * name : 么么哒
         * tagId : 0
         * uid : 1527118927
         * text : .
         */

        private int articleCount;
        private int fansCount;
        private int followType;
        private int id;
        private String img;
        private String name;
        private int tagId;
        private int uid;
        private String text;

        public int getArticleCount()
        {
            return articleCount;
        }

        public void setArticleCount(int articleCount)
        {
            this.articleCount = articleCount;
        }

        public int getFansCount()
        {
            return fansCount;
        }

        public void setFansCount(int fansCount)
        {
            this.fansCount = fansCount;
        }

        public int getFollowType()
        {
            return followType;
        }

        public void setFollowType(int followType)
        {
            this.followType = followType;
        }

        public int getId()
        {
            return id;
        }

        public void setId(int id)
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

        public int getTagId()
        {
            return tagId;
        }

        public void setTagId(int tagId)
        {
            this.tagId = tagId;
        }

        public int getUid()
        {
            return uid;
        }

        public void setUid(int uid)
        {
            this.uid = uid;
        }

        public String getText()
        {
            return text;
        }

        public void setText(String text)
        {
            this.text = text;
        }
    }
}

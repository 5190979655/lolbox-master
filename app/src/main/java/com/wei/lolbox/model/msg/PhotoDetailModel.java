package com.wei.lolbox.model.msg;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * 作者：赵若位
 * 时间：2018/1/15
 * 邮箱：1070138445@qq.com
 * 功能：
 */

public class PhotoDetailModel
{


    /**
     * galleryId : 136187
     * title : 鍦ｈ癁鑺傚コ鏋狢OS 杩欐尝鐪熺殑涓嶄簭锛�
     * description :
     * picsum : 9
     * clicks : 0
     * created : 1514340452
     * updated : 1514340452
     * commentCount : 1
     * pictures : [{"title":"鍦ｈ癁鑺傚コ鏋狢OS 杩欐尝鐪熺殑涓嶄簭锛� (1)","ding":"30","cai":"9","old":"20","url":"http://s1.dwstatic.com/group1/M00/76/23/576f5101c3c67e6c843059adbab10eee.jpg","source":"http://s1.dwstatic.com/group1/M00/76/23/a5531efe94e1128d5e94f4239f8d0a51.jpg","mp4_url":"","picDesc":"CN锛氬皬蹇冨皬瑷�","picId":"2420060","coverUrl":"http://s1.dwstatic.com/group1/M00/76/23/33e52dbbf1ae668413176ebd93e2aa4a.jpg","fileUrl":null,"fileWidth":960,"fileHeight":640},{"title":"鍦ｈ癁鑺傚コ鏋狢OS 杩欐尝鐪熺殑涓嶄簭锛� (2)","ding":"4","cai":"0","old":"1","url":"http://s1.dwstatic.com/group1/M00/4C/B4/8e6657431566dc1389e55b2abf96b6ee.jpg","source":"http://s1.dwstatic.com/group1/M00/4C/B4/8e6657431566dc1389e55b2abf96b6ee.jpg","mp4_url":"","picDesc":"鍦ｈ癁鑺傚コ鏋狢OS 杩欐尝鐪熺殑涓嶄簭锛�","picId":"2420061","coverUrl":"http://s1.dwstatic.com/group1/M00/4C/B4/6fe35651319ac071a9a52dfca503460d.jpg","fileUrl":null,"fileWidth":"959","fileHeight":"1440"},{"title":"鍦ｈ癁鑺傚コ鏋狢OS 杩欐尝鐪熺殑涓嶄簭锛� (3)","ding":"4","cai":"1","old":"1","url":"http://s1.dwstatic.com/group1/M00/E2/BD/fe5eb336bf92a3b2d43ddd3ec9d15434.jpg","source":"http://s1.dwstatic.com/group1/M00/E2/BD/c5d70f9339606b4723a9d3553ffa79e5.jpg","mp4_url":"","picDesc":"鍦ｈ癁鑺傚コ鏋狢OS 杩欐尝鐪熺殑涓嶄簭锛�","picId":"2420062","coverUrl":"http://s1.dwstatic.com/group1/M00/E2/BD/8999a66a441532f8670dbe247169fb02.jpg","fileUrl":null,"fileWidth":960,"fileHeight":619},{"title":"鍦ｈ癁鑺傚コ鏋狢OS 杩欐尝鐪熺殑涓嶄簭锛� (4)","ding":"2","cai":"0","old":"0","url":"http://s1.dwstatic.com/group1/M00/49/53/24108f0868dea33d7f862f3cbefb303d.jpg","source":"http://s1.dwstatic.com/group1/M00/49/53/5999008f0bddb326069e4f0a804b67ba.jpg","mp4_url":"","picDesc":"鍦ｈ癁鑺傚コ鏋狢OS 杩欐尝鐪熺殑涓嶄簭锛�","picId":"2420063","coverUrl":"http://s1.dwstatic.com/group1/M00/49/53/0c9e6654d670f00d1264fbff9cf73185.jpg","fileUrl":null,"fileWidth":960,"fileHeight":640},{"title":"鍦ｈ癁鑺傚コ鏋狢OS 杩欐尝鐪熺殑涓嶄簭锛� (5)","ding":"2","cai":"0","old":"0","url":"http://s1.dwstatic.com/group1/M00/44/D8/dea9d6aff3f07166c163723723f3e87e.jpg","source":"http://s1.dwstatic.com/group1/M00/44/D8/d76eaa7ec43602f044865367fa32f25d.jpg","mp4_url":"","picDesc":"鍦ｈ癁鑺傚コ鏋狢OS 杩欐尝鐪熺殑涓嶄簭锛�","picId":"2420064","coverUrl":"http://s1.dwstatic.com/group1/M00/44/D8/91f92f6f91d1955ef976bb0b6badd654.jpg","fileUrl":null,"fileWidth":960,"fileHeight":641},{"title":"鍦ｈ癁鑺傚コ鏋狢OS 杩欐尝鐪熺殑涓嶄簭锛� (6)","ding":"3","cai":"0","old":"0","url":"http://s1.dwstatic.com/group1/M00/9D/98/c4f4db3553ec40fde29fe1bec2641803.jpg","source":"http://s1.dwstatic.com/group1/M00/9D/98/c4f4db3553ec40fde29fe1bec2641803.jpg","mp4_url":"","picDesc":"鍦ｈ癁鑺傚コ鏋狢OS 杩欐尝鐪熺殑涓嶄簭锛�","picId":"2420065","coverUrl":"http://s1.dwstatic.com/group1/M00/9D/98/ca6abb33f8591d061d590d13f621c4b9.jpg","fileUrl":null,"fileWidth":"492","fileHeight":"720"},{"title":"鍦ｈ癁鑺傚コ鏋狢OS 杩欐尝鐪熺殑涓嶄簭锛� (7)","ding":"3","cai":"0","old":"0","url":"http://s1.dwstatic.com/group1/M00/4B/63/f056900ac1fc0b3b4b3a4e7749087752.jpg","source":"http://s1.dwstatic.com/group1/M00/4B/63/f056900ac1fc0b3b4b3a4e7749087752.jpg","mp4_url":"","picDesc":"鍦ｈ癁鑺傚コ鏋狢OS 杩欐尝鐪熺殑涓嶄簭锛�","picId":"2420066","coverUrl":"http://s1.dwstatic.com/group1/M00/4B/63/8dea863eeb6df0eed3d9e868cf029edc.jpg","fileUrl":null,"fileWidth":"473","fileHeight":"720"},{"title":"鍦ｈ癁鑺傚コ鏋狢OS 杩欐尝鐪熺殑涓嶄簭锛� (8)","ding":"3","cai":"0","old":"0","url":"http://s1.dwstatic.com/group1/M00/6C/0E/41599b3f0778e45cbf0d1d8834cafaa2.jpg","source":"http://s1.dwstatic.com/group1/M00/6C/0E/41599b3f0778e45cbf0d1d8834cafaa2.jpg","mp4_url":"","picDesc":"鍦ｈ癁鑺傚コ鏋狢OS 杩欐尝鐪熺殑涓嶄簭锛�","picId":"2420067","coverUrl":"http://s1.dwstatic.com/group1/M00/6C/0E/024ffd61cfc4560a63b4d1c9388ab804.jpg","fileUrl":null,"fileWidth":"960","fileHeight":"1437"},{"title":"鍦ｈ癁鑺傚コ鏋狢OS 杩欐尝鐪熺殑涓嶄簭锛� (9)","ding":"2","cai":"1","old":"3","url":"http://s1.dwstatic.com/group1/M00/0A/12/3f5a03ea6cf1a8866a69ec9495a564a9.jpg","source":"http://s1.dwstatic.com/group1/M00/0A/12/3f5a03ea6cf1a8866a69ec9495a564a9.jpg","mp4_url":"","picDesc":"鍦ｈ癁鑺傚コ鏋狢OS 杩欐尝鐪熺殑涓嶄簭锛�","picId":"2420068","coverUrl":"http://s1.dwstatic.com/group1/M00/0A/12/eb45e99bb425f2be9dccc7a3bdf5cb5a.jpg","fileUrl":null,"fileWidth":"484","fileHeight":"720"}]
     */

    private String galleryId;
    private String title;
    private String description;
    private String picsum;
    private String clicks;
    private String created;
    private String updated;
    private String commentCount;
    @SerializedName("pictures")
    private List<Pictures> pictures;

    public String getGalleryId()
    {
        return galleryId;
    }

    public void setGalleryId(String galleryId)
    {
        this.galleryId = galleryId;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getPicsum()
    {
        return picsum;
    }

    public void setPicsum(String picsum)
    {
        this.picsum = picsum;
    }

    public String getClicks()
    {
        return clicks;
    }

    public void setClicks(String clicks)
    {
        this.clicks = clicks;
    }

    public String getCreated()
    {
        return created;
    }

    public void setCreated(String created)
    {
        this.created = created;
    }

    public String getUpdated()
    {
        return updated;
    }

    public void setUpdated(String updated)
    {
        this.updated = updated;
    }

    public String getCommentCount()
    {
        return commentCount;
    }

    public void setCommentCount(String commentCount)
    {
        this.commentCount = commentCount;
    }

    public List<Pictures> getPictures()
    {
        return pictures;
    }

    public void setPictures(List<Pictures> pictures)
    {
        this.pictures = pictures;
    }

    public static class Pictures
    {
        /**
         * title : 鍦ｈ癁鑺傚コ鏋狢OS 杩欐尝鐪熺殑涓嶄簭锛� (1)
         * ding : 30
         * cai : 9
         * old : 20
         * url : http://s1.dwstatic.com/group1/M00/76/23/576f5101c3c67e6c843059adbab10eee.jpg
         * source : http://s1.dwstatic.com/group1/M00/76/23/a5531efe94e1128d5e94f4239f8d0a51.jpg
         * mp4_url :
         * picDesc : CN锛氬皬蹇冨皬瑷�
         * picId : 2420060
         * coverUrl : http://s1.dwstatic.com/group1/M00/76/23/33e52dbbf1ae668413176ebd93e2aa4a.jpg
         * fileUrl : null
         * fileWidth : 960
         * fileHeight : 640
         */

        private String title;
        private String ding;
        private String cai;
        private String old;
        private String url;
        private String source;
        private String mp4_url;
        private String picDesc;
        private String picId;
        private String coverUrl;
        private Object fileUrl;
        private int fileWidth;
        private int fileHeight;

        public String getTitle()
        {
            return title;
        }

        public void setTitle(String title)
        {
            this.title = title;
        }

        public String getDing()
        {
            return ding;
        }

        public void setDing(String ding)
        {
            this.ding = ding;
        }

        public String getCai()
        {
            return cai;
        }

        public void setCai(String cai)
        {
            this.cai = cai;
        }

        public String getOld()
        {
            return old;
        }

        public void setOld(String old)
        {
            this.old = old;
        }

        public String getUrl()
        {
            return url;
        }

        public void setUrl(String url)
        {
            this.url = url;
        }

        public String getSource()
        {
            return source;
        }

        public void setSource(String source)
        {
            this.source = source;
        }

        public String getMp4_url()
        {
            return mp4_url;
        }

        public void setMp4_url(String mp4_url)
        {
            this.mp4_url = mp4_url;
        }

        public String getPicDesc()
        {
            return picDesc;
        }

        public void setPicDesc(String picDesc)
        {
            this.picDesc = picDesc;
        }

        public String getPicId()
        {
            return picId;
        }

        public void setPicId(String picId)
        {
            this.picId = picId;
        }

        public String getCoverUrl()
        {
            return coverUrl;
        }

        public void setCoverUrl(String coverUrl)
        {
            this.coverUrl = coverUrl;
        }

        public Object getFileUrl()
        {
            return fileUrl;
        }

        public void setFileUrl(Object fileUrl)
        {
            this.fileUrl = fileUrl;
        }

        public int getFileWidth()
        {
            return fileWidth;
        }

        public void setFileWidth(int fileWidth)
        {
            this.fileWidth = fileWidth;
        }

        public int getFileHeight()
        {
            return fileHeight;
        }

        public void setFileHeight(int fileHeight)
        {
            this.fileHeight = fileHeight;
        }
    }
}

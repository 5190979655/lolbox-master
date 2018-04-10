package com.wei.lolbox.model.msg;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * 作者：赵若位
 * 时间：2017/12/3
 * 邮箱：1070138445@qq.com
 * 功能：靓照
 */
@Entity
public class CharmingPhoto
{
    /**
     * galleryId : 135979
     * title : 特工狂花有两把枪，你喜欢吗？
     * description :
     * coverUrl : http://s1.dwstatic.com/group1/M00/3B/43/0ae2df932a8c0ffcc9d6f8672efa0587.jpg
     * coverWidth : 195
     * coverHeight : 292
     * created : 1511836409
     * updated : 1511836409
     * picsum : 5
     * commentCount : 0
     * clicks : 0
     * modify_time : 2017-11-28 10:33:30
     * destUrl : http://box.dwstatic.com/unsupport.php?lolboxAction=toAlbumDetail&albumId=135979&type=beautifulWoman
     */

    @Id
    private String galleryId;
    private String title;
    private String description;
    private String coverUrl;
    private int coverWidth;
    private int coverHeight;
    private String created;
    private String updated;
    private String picsum;
    private String commentCount;
    private String clicks;
    private String modify_time;
    private String destUrl;


    @Generated(hash = 1747956607)
    public CharmingPhoto(String galleryId, String title, String description, String coverUrl, int coverWidth,
            int coverHeight, String created, String updated, String picsum, String commentCount, String clicks,
            String modify_time, String destUrl) {
        this.galleryId = galleryId;
        this.title = title;
        this.description = description;
        this.coverUrl = coverUrl;
        this.coverWidth = coverWidth;
        this.coverHeight = coverHeight;
        this.created = created;
        this.updated = updated;
        this.picsum = picsum;
        this.commentCount = commentCount;
        this.clicks = clicks;
        this.modify_time = modify_time;
        this.destUrl = destUrl;
    }

    @Generated(hash = 185552179)
    public CharmingPhoto() {
    }


    public String getGalleryId()
    {
        return this.galleryId;
    }

    public void setGalleryId(String galleryId)
    {
        this.galleryId = galleryId;
    }

    public String getTitle()
    {
        return this.title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getDescription()
    {
        return this.description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getCoverUrl()
    {
        return this.coverUrl;
    }

    public void setCoverUrl(String coverUrl)
    {
        this.coverUrl = coverUrl;
    }

    public int getCoverWidth()
    {
        return this.coverWidth;
    }

    public void setCoverWidth(int coverWidth)
    {
        this.coverWidth = coverWidth;
    }

    public int getCoverHeight()
    {
        return this.coverHeight;
    }

    public void setCoverHeight(int coverHeight)
    {
        this.coverHeight = coverHeight;
    }

    public String getCreated()
    {
        return this.created;
    }

    public void setCreated(String created)
    {
        this.created = created;
    }

    public String getUpdated()
    {
        return this.updated;
    }

    public void setUpdated(String updated)
    {
        this.updated = updated;
    }

    public String getPicsum()
    {
        return this.picsum;
    }

    public void setPicsum(String picsum)
    {
        this.picsum = picsum;
    }

    public String getCommentCount()
    {
        return this.commentCount;
    }

    public void setCommentCount(String commentCount)
    {
        this.commentCount = commentCount;
    }

    public String getClicks()
    {
        return this.clicks;
    }

    public void setClicks(String clicks)
    {
        this.clicks = clicks;
    }

    public String getModify_time()
    {
        return this.modify_time;
    }

    public void setModify_time(String modify_time)
    {
        this.modify_time = modify_time;
    }

    public String getDestUrl()
    {
        return this.destUrl;
    }

    public void setDestUrl(String destUrl)
    {
        this.destUrl = destUrl;
    }


}

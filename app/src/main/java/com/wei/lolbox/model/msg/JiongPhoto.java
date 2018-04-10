package com.wei.lolbox.model.msg;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * 作者：赵若位
 * 时间：2017/12/4
 * 邮箱：1070138445@qq.com
 * 功能：
 */
@Entity
public class JiongPhoto
{

    /**
     * galleryId : 136300
     * title : 今日囧图第2219期：你告诉我这是鸳鸯锅？？？？
     * description :
     * coverUrl : http://s1.dwstatic.com/group1/M00/9B/09/6e51b8370f8a2dc24930c0b9221ab14b.png
     * coverWidth : 195
     * coverHeight : 196
     * created : 1515956588
     * updated : 1515956588
     * picsum : 50
     * commentCount : 392
     * clicks : 0
     * modify_time : 2018-01-15 21:56:38
     * destUrl : http://box.dwstatic.com/unsupport.php?lolboxAction=toAlbumDetail&albumId=136300&type=jiongTu
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



    @Generated(hash = 779147443)
    public JiongPhoto(String galleryId, String title, String description, String coverUrl, int coverWidth, int coverHeight, String created, String updated, String picsum, String commentCount, String clicks, String modify_time, String destUrl) {
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

    @Generated(hash = 1323410159)
    public JiongPhoto() {
    }

   

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

    public String getCoverUrl()
    {
        return coverUrl;
    }

    public void setCoverUrl(String coverUrl)
    {
        this.coverUrl = coverUrl;
    }

    public int getCoverWidth()
    {
        return coverWidth;
    }

    public void setCoverWidth(int coverWidth)
    {
        this.coverWidth = coverWidth;
    }

    public int getCoverHeight()
    {
        return coverHeight;
    }

    public void setCoverHeight(int coverHeight)
    {
        this.coverHeight = coverHeight;
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

    public String getPicsum()
    {
        return picsum;
    }

    public void setPicsum(String picsum)
    {
        this.picsum = picsum;
    }

    public String getCommentCount()
    {
        return commentCount;
    }

    public void setCommentCount(String commentCount)
    {
        this.commentCount = commentCount;
    }

    public String getClicks()
    {
        return clicks;
    }

    public void setClicks(String clicks)
    {
        this.clicks = clicks;
    }

    public String getModify_time()
    {
        return modify_time;
    }

    public void setModify_time(String modify_time)
    {
        this.modify_time = modify_time;
    }

    public String getDestUrl()
    {
        return destUrl;
    }

    public void setDestUrl(String destUrl)
    {
        this.destUrl = destUrl;
    }
}

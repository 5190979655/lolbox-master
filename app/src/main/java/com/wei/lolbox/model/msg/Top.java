package com.wei.lolbox.model.msg;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Transient;
import org.greenrobot.greendao.annotation.Generated;

/**
 * 作者：赵若位
 * 时间：2017/12/3
 * 邮箱：1070138445@qq.com
 * 功能：
 */
@Entity
public class Top
{


    /**
     * id :  9027
     * title : 2018LPL春季赛
     * content : 2018再起航，春季职业联赛战火燃起
     * weight : 60
     * time : 1515984024
     * readCount : 0
     * srcPhoto : http://img.dwstatic.com/lol/1801/379937546803/1515982833452.jpg
     * photo : http://img.dwstatic.com/lol/1801/379937546803/1515982833452.jpg
     * artId : 9025
     * commentSum : 0
     * commentUrl : 1411/279211876566&aid=9027&uniqid=23efe8ecbb3387ca07f109acee2d22c9&gochannel=lol
     * hasVideo : 0
     * destUrl : http://box.dwstatic.com/unsupport.php?newsId=9027&lolboxAction=toNewsTopic&topicId=175
     * type : topic
     * video : a:0:{}
     * ymz_id : null
     */

    @Id
    private String id;
    private String title;
    private String content;
    private String weight;
    private String time;
    private String readCount;
    private String srcPhoto;
    private String photo;
    private String artId;
    private int commentSum;
    private String commentUrl;
    private int hasVideo;
    private String destUrl;
    private String type;
    private String video;
    @Transient
    private Object ymz_id;

    @Generated(hash = 1537340844)
    public Top(String id, String title, String content, String weight, String time, String readCount,
               String srcPhoto, String photo, String artId, int commentSum, String commentUrl,
               int hasVideo, String destUrl, String type, String video)
    {
        this.id = id;
        this.title = title;
        this.content = content;
        this.weight = weight;
        this.time = time;
        this.readCount = readCount;
        this.srcPhoto = srcPhoto;
        this.photo = photo;
        this.artId = artId;
        this.commentSum = commentSum;
        this.commentUrl = commentUrl;
        this.hasVideo = hasVideo;
        this.destUrl = destUrl;
        this.type = type;
        this.video = video;
    }

    @Generated(hash = 640046312)
    public Top()
    {
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getContent()
    {
        return content;
    }

    public void setContent(String content)
    {
        this.content = content;
    }

    public String getWeight()
    {
        return weight;
    }

    public void setWeight(String weight)
    {
        this.weight = weight;
    }

    public String getTime()
    {
        return time;
    }

    public void setTime(String time)
    {
        this.time = time;
    }

    public String getReadCount()
    {
        return readCount;
    }

    public void setReadCount(String readCount)
    {
        this.readCount = readCount;
    }

    public String getSrcPhoto()
    {
        return srcPhoto;
    }

    public void setSrcPhoto(String srcPhoto)
    {
        this.srcPhoto = srcPhoto;
    }

    public String getPhoto()
    {
        return photo;
    }

    public void setPhoto(String photo)
    {
        this.photo = photo;
    }

    public String getArtId()
    {
        return artId;
    }

    public void setArtId(String artId)
    {
        this.artId = artId;
    }

    public int getCommentSum()
    {
        return commentSum;
    }

    public void setCommentSum(int commentSum)
    {
        this.commentSum = commentSum;
    }

    public String getCommentUrl()
    {
        return commentUrl;
    }

    public void setCommentUrl(String commentUrl)
    {
        this.commentUrl = commentUrl;
    }

    public int getHasVideo()
    {
        return hasVideo;
    }

    public void setHasVideo(int hasVideo)
    {
        this.hasVideo = hasVideo;
    }

    public String getDestUrl()
    {
        return destUrl;
    }

    public void setDestUrl(String destUrl)
    {
        this.destUrl = destUrl;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public String getVideo()
    {
        return video;
    }

    public void setVideo(String video)
    {
        this.video = video;
    }

    public Object getYmz_id()
    {
        return ymz_id;
    }

    public void setYmz_id(Object ymz_id)
    {
        this.ymz_id = ymz_id;
    }
}


package com.wei.lolbox.model.msg;

import com.google.gson.annotations.SerializedName;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

import java.util.List;

/**
 * 作者：赵若位
 * 时间：2017/12/3
 * 邮箱：1070138445@qq.com
 * 功能：
 */
@Entity
public class Match
{
    /**
     * id : 63447
     * title : 世界赛战火延续 中韩之争再现全明星
     * content : 2017全明星赛风云再起，LPL能否笑傲群雄？拭目以待！
     * weight : 60
     * time : 1512284923
     * readCount : 21687
     * video : a:0:{}
     * comment_id : 24f465ae5843f5106905c766ca981f71
     * ymz_id : null
     * photo : http://funbox-m1.dwstatic.com/mbox/article_img/shouji_38aba7361ed77b9b48e4596291158405.png
     * srcPhoto : http://img.dwstatic.com/lol/1712/376238911389/1512283811723.png
     * artId : 63447
     * commentSum : 0
     * commentUrl : 1712/376238911389&aid=63447&uniqid=24f465ae5843f5106905c766ca981f71&gochannel=lol
     * hasVideo : 0
     * destUrl : http://box.dwstatic.com/unsupport.php?lolboxAction=toNewsDetail&newsId=63447
     * type : news
     */
    @Id
    private String id;
    private String title;
    private String content;
    private String weight;
    private String time;
    private String readCount;
    private String video;
    private String comment_id;
    private String photo;
    private String srcPhoto;
    private String artId;
    private int commentSum;
    private String commentUrl;
    private int hasVideo;
    private String destUrl;
    private String type;


    @Generated(hash = 1964088825)
    public Match(String id, String title, String content, String weight, String time, String readCount,
            String video, String comment_id, String photo, String srcPhoto, String artId, int commentSum,
            String commentUrl, int hasVideo, String destUrl, String type) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.weight = weight;
        this.time = time;
        this.readCount = readCount;
        this.video = video;
        this.comment_id = comment_id;
        this.photo = photo;
        this.srcPhoto = srcPhoto;
        this.artId = artId;
        this.commentSum = commentSum;
        this.commentUrl = commentUrl;
        this.hasVideo = hasVideo;
        this.destUrl = destUrl;
        this.type = type;
    }

    @Generated(hash = 1834681287)
    public Match() {
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

    public String getVideo()
    {
        return video;
    }

    public void setVideo(String video)
    {
        this.video = video;
    }

    public String getComment_id()
    {
        return comment_id;
    }

    public void setComment_id(String comment_id)
    {
        this.comment_id = comment_id;
    }


    public String getPhoto()
    {
        return photo;
    }

    public void setPhoto(String photo)
    {
        this.photo = photo;
    }

    public String getSrcPhoto()
    {
        return srcPhoto;
    }

    public void setSrcPhoto(String srcPhoto)
    {
        this.srcPhoto = srcPhoto;
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


}

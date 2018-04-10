package com.wei.lolbox.model.msg;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Transient;

import java.util.List;

/**
 * 作者：赵若位
 * 时间：2017/12/3
 * 邮箱：1070138445@qq.com
 * 功能：
 */
@Entity
public class Videoes
{

    /**
     * id : 59251
     * title : 六周年表演赛 周杰伦队vs吴亦凡队
     * content : 周杰伦队：周杰伦，米勒，五五开，威力，余霜。
     * 吴亦凡队：PDD，吴亦凡，娃娃，骚男，pgone。
     * weight : 60
     * time : 1504444639
     * readCount : 132438
     * video : a:1:{i:0;a:1:{s:3:"vid";s:7:"8526205";}}
     * comment_id : 6e8c707aeb15dba424c721155105b020
     * ymz_id : null
     * photo : http://funbox-m1.dwstatic.com/mbox/article_img/shouji_b0221f48b0d4217975f6afd7f0a32fe9.jpg
     * srcPhoto : http://screenshot.dwstatic.com/ojiasnsimage/44f9215588d6d49ef8338e173a0d5d2e_len138093.jpg
     * artId : 59251
     * commentSum : 0
     * commentUrl : 1709/368399839011&aid=59251&uniqid=6e8c707aeb15dba424c721155105b020&gochannel=lol
     * hasVideo : 1
     * videoList : [{"vid":"8526205"}]
     * destUrl : http://box.dwstatic.com/unsupport.php?lolboxAction=videoPlay&vid=8526205
     * type : video
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
    @Transient
    private List<VideoListBeans> videoList;

    @Generated(hash = 945486997)
    public Videoes(String id, String title, String content, String weight, String time, String readCount,
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

    @Generated(hash = 658968185)
    public Videoes() {
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

    public List<VideoListBeans> getVideoList()
    {
        return videoList;
    }

    public void setVideoList(List<VideoListBeans> videoList)
    {
        this.videoList = videoList;
    }

    public static class VideoListBeans
    {
        /**
         * vid : 8526205
         */

        private String vid;

        public String getVid()
        {
            return vid;
        }

        public void setVid(String vid)
        {
            this.vid = vid;
        }
    }


}

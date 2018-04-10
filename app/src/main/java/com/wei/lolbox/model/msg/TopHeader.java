package com.wei.lolbox.model.msg;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * 作者：赵若位
 * 时间：2018/1/16
 * 邮箱：1070138445@qq.com
 * 功能：资讯-头条-Banner
 */
@Entity
public class TopHeader
{

    /**
     * id : 37247
     * weight : 64
     * created : 1465699541
     * photo : http://funbox-m1.dwstatic.com/mbox/article_img/toutiao_222ec55e94b20c38f12c2cc202f3949d.jpg
     * artId : 37247
     * commentSum : 0
     * commentUrl : 1606/329654543016&aid=37247&uniqid=be0b53869b5fc1835e8dc1c1621d01e1&gochannel=lol
     * destUrl : http://box.dwstatic.com/unsupport.php?lolboxAction=toNewsDetail&newsId=37247
     */

    @Id
    private String id;
    private String weight;
    private String created;
    private String photo;
    private String artId;
    private String commentSum;
    private String commentUrl;
    private String destUrl;

    @Generated(hash = 1139971747)
    public TopHeader(String id, String weight, String created, String photo, String artId, String commentSum,
            String commentUrl, String destUrl) {
        this.id = id;
        this.weight = weight;
        this.created = created;
        this.photo = photo;
        this.artId = artId;
        this.commentSum = commentSum;
        this.commentUrl = commentUrl;
        this.destUrl = destUrl;
    }

    @Generated(hash = 613069492)
    public TopHeader() {
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getWeight()
    {
        return weight;
    }

    public void setWeight(String weight)
    {
        this.weight = weight;
    }

    public String getCreated()
    {
        return created;
    }

    public void setCreated(String created)
    {
        this.created = created;
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

    public String getCommentSum()
    {
        return commentSum;
    }

    public void setCommentSum(String commentSum)
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

    public String getDestUrl()
    {
        return destUrl;
    }

    public void setDestUrl(String destUrl)
    {
        this.destUrl = destUrl;
    }
}

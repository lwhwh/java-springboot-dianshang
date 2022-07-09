package com.lwh.shoppingwebsite.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * @Author : lwh
 * @Create : 2022/5/11
 * @Version:2022-05 -11-1
 */
//商品评论
@Entity
@Table
public class CommodityComment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String commentmessage;//评论信息
    private int userid;//用户id
    private Date commentdate;//评论日期
    private int commodityid;//商品id

    //用户信息
    @Transient
    private User user; //用户信息

    //商品回复评论
    @Transient
    private List<CommodityCommentReply> commodityCommentReplies;

    public CommodityComment() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCommentmessage() {
        return commentmessage;
    }

    public void setCommentmessage(String commentmessage) {
        this.commentmessage = commentmessage;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public Date getCommentdate() {
        return commentdate;
    }

    public void setCommentdate(Date commentdate) {
        this.commentdate = commentdate;
    }

    public int getCommodityid() {
        return commodityid;
    }

    public void setCommodityid(int commodityid) {
        this.commodityid = commodityid;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<CommodityCommentReply> getCommodityCommentReplies() {
        return commodityCommentReplies;
    }

    public void setCommodityCommentReplies(List<CommodityCommentReply> commodityCommentReplies) {
        this.commodityCommentReplies = commodityCommentReplies;
    }

    public CommodityComment(int id, String commentmessage, int userid, Date commentdate, int commodityid, User user, List<CommodityCommentReply> commodityCommentReplies) {
        this.id = id;
        this.commentmessage = commentmessage;
        this.userid = userid;
        this.commentdate = commentdate;
        this.commodityid = commodityid;
        this.user = user;
        this.commodityCommentReplies = commodityCommentReplies;
    }
}

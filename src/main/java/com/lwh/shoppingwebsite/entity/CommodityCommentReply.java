package com.lwh.shoppingwebsite.entity;

import com.lwh.shoppingwebsite.util.AjaxResult;

import javax.persistence.*;
import java.util.Date;

/**
 * @Author : lwh
 * @Create : 2022/5/15
 * @Version:2022-05 -15-1
 */
//商品回复评论
@Entity
@Table
public class CommodityCommentReply {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int replyid;

    private int userid;//用户id

    private String commentreply; //商品评论回复信息

    private int commoditycommentidoneid;//依赖一级评论的id

    private Date commentdate;//评论日期

    private int commoditycommentidreplyid;//回复评论的id

    //用户信息
    @Transient
    private User user; //用户信息

    //查询回复的用户评论
    @Transient
    private CommodityCommentReply commodityCommentReply;


    public CommodityCommentReply(int replyid, int userid, String commentreply, int commoditycommentidoneid, Date commentdate, int commoditycommentidreplyid, User user,  CommodityCommentReply commodityCommentReply) {
        this.replyid = replyid;
        this.userid = userid;
        this.commentreply = commentreply;
        this.commoditycommentidoneid = commoditycommentidoneid;
        this.commentdate = commentdate;
        this.commoditycommentidreplyid = commoditycommentidreplyid;
        this.user = user;
        this.commodityCommentReply = commodityCommentReply;
    }

    public int getReplyid() {
        return replyid;
    }

    public void setReplyid(int replyid) {
        this.replyid = replyid;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getCommentreply() {
        return commentreply;
    }

    public void setCommentreply(String commentreply) {
        this.commentreply = commentreply;
    }

    public int getCommoditycommentidoneid() {
        return commoditycommentidoneid;
    }

    public void setCommoditycommentidoneid(int commoditycommentidoneid) {
        this.commoditycommentidoneid = commoditycommentidoneid;
    }

    public Date getCommentdate() {
        return commentdate;
    }

    public void setCommentdate(Date commentdate) {
        this.commentdate = commentdate;
    }

    public int getCommoditycommentidreplyid() {
        return commoditycommentidreplyid;
    }

    public void setCommoditycommentidreplyid(int commoditycommentidreply) {
        this.commoditycommentidreplyid = commoditycommentidreply;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public CommodityCommentReply getCommodityCommentReply() {
        return commodityCommentReply;
    }

    public void setCommodityCommentReply(CommodityCommentReply commodityCommentReply) {
        this.commodityCommentReply = commodityCommentReply;
    }

    public CommodityCommentReply() {
        super();
    }

    @Override
    public String toString() {
        return "CommodityCommentReply{" +
                "replyid=" + replyid +
                ", userid=" + userid +
                ", commentreply='" + commentreply + '\'' +
                ", commoditycommentidoneid=" + commoditycommentidoneid +
                ", commentdate=" + commentdate +
                ", commoditycommentidreplyid=" + commoditycommentidreplyid +
                ", user=" + user +
                '}';
    }
}

package com.lwh.shoppingwebsite.entity;

import javax.persistence.*;

/**
 * @Author : lwh
 * @Create : 2022/2/25
 * @Version:2022-02 -25-1
 */
/*
订单列表类
*/
@Entity
@Table
public class OrderList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int commodityid;//商品id
    private int uid;//用户id
    private String phone;//手机号
    private String address;//地址
    private String oredrnumber="12312312312";//订单编号
    private String orderstate="未完成";//订单状态
    private int paymentstate=0;//付款状态
    private int commentstatus=0;//评论状态
    private String commoditypicture;//图片路径
    private String username;//收货人姓名
    private int count;//订单数量
    private String commodityname;//商品名称
    private double totalprice;//总金额
    private String freightstatus="未收货";//收货状态


    public OrderList() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCommodityid() {
        return commodityid;
    }

    public void setCommodityid(int commodityid) {
        this.commodityid = commodityid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOredrnumber() {
        return oredrnumber;
    }

    public void setOredrnumber(String oredrnumber) {
        this.oredrnumber = oredrnumber;
    }

    public String getOrderstate() {
        return orderstate;
    }

    public void setOrderstate(String orderstate) {
        this.orderstate = orderstate;
    }

    public int getPaymentstate() {
        return paymentstate;
    }

    public void setPaymentstate(int paymentstate) {
        this.paymentstate = paymentstate;
    }

    public int getCommentstatus() {
        return commentstatus;
    }

    public void setCommentstatus(int commentstatus) {
        this.commentstatus = commentstatus;
    }

    public String getCommoditypicture() {
        return commoditypicture;
    }

    public void setCommoditypicture(String commoditypicture) {
        this.commoditypicture = commoditypicture;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getCommodityname() {
        return commodityname;
    }

    public void setCommodityname(String commodityname) {
        this.commodityname = commodityname;
    }

    public double getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(double totalprice) {
        this.totalprice = totalprice;
    }

    public String getFreightstatus() {
        return freightstatus;
    }

    public void setFreightstatus(String freightstatus) {
        this.freightstatus = freightstatus;
    }

    public OrderList(int id, int commodityid, int uid, String phone, String address, String oredrnumber, String orderstate, int paymentstate, int commentstatus, String commoditypicture, String username, int count, String commodityname, double totalprice, String freightstatus) {
        this.id = id;
        this.commodityid = commodityid;
        this.uid = uid;
        this.phone = phone;
        this.address = address;
        this.oredrnumber = oredrnumber;
        this.orderstate = orderstate;
        this.paymentstate = paymentstate;
        this.commentstatus = commentstatus;
        this.commoditypicture = commoditypicture;
        this.username = username;
        this.count = count;
        this.commodityname = commodityname;
        this.totalprice = totalprice;
        this.freightstatus = freightstatus;
    }
}

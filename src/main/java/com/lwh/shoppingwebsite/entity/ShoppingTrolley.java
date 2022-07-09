package com.lwh.shoppingwebsite.entity;

import javax.persistence.*;

/**
 * @Author : lwh
 * @Create : 2022/2/18
 * @Version:2022-02 -18-1
 */
/*
    购物车类
*/
@Entity
@Table
public class ShoppingTrolley {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    private String commodityname;//商品名称
    private String commodityspecification;//商品规格
    private double commodityprice;//商品单价
    private int commoditycount;//商品数量
    private double totalprice;//商品总金额
    private int uid;//用户id
    private int commodityid;//商品id
    private String commoditypicture;//商品图片

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCommodityname() {
        return commodityname;
    }

    public void setCommodityname(String commodityname) {
        this.commodityname = commodityname;
    }

    public String getCommodityspecification() {
        return commodityspecification;
    }

    public void setCommodityspecification(String commodityspecification) {
        this.commodityspecification = commodityspecification;
    }

    public double getCommodityprice() {
        return commodityprice;
    }

    public void setCommodityprice(double commodityprice) {
        this.commodityprice = commodityprice;
    }

    public int getCommoditycount() {
        return commoditycount;
    }

    public void setCommoditycount(int commoditycount) {
        this.commoditycount = commoditycount;
    }

    public double getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(double totalprice) {
        this.totalprice = totalprice;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getCommodityid() {
        return commodityid;
    }

    public void setCommodityid(int commodityid) {
        this.commodityid = commodityid;
    }

    public String getCommoditypicture() {
        return commoditypicture;
    }

    public void setCommoditypicture(String commoditypicture) {
        this.commoditypicture = commoditypicture;
    }

    public ShoppingTrolley(int id, String commodityname, String commodityspecification, double commodityprice, int commoditycount, double totalprice, int uid, int commodityid, String commoditypicture) {
        this.id = id;
        this.commodityname = commodityname;
        this.commodityspecification = commodityspecification;
        this.commodityprice = commodityprice;
        this.commoditycount = commoditycount;
        this.totalprice = totalprice;
        this.uid = uid;
        this.commodityid = commodityid;
        this.commoditypicture = commoditypicture;
    }

    @Override
    public String toString() {
        return "ShoppingTrolley{" +
                "id=" + id +
                ", commodityname='" + commodityname + '\'' +
                ", commodityspecification='" + commodityspecification + '\'' +
                ", commodityprice=" + commodityprice +
                ", commoditycount=" + commoditycount +
                ", totalprice=" + totalprice +
                ", uid=" + uid +
                ", commodityid=" + commodityid +
                ", commoditypicture='" + commoditypicture + '\'' +
                '}';
    }

    public ShoppingTrolley() {
        super();
    }
}

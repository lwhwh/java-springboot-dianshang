package com.lwh.shoppingwebsite.entity;

import javax.persistence.*;

/**
 * @Author : lwh
 * @Create : 2022/2/17
 * @Version:2022-02 -17-1
 */
/*
商品图片类
 */
@Entity
@Table
public class CommodityImg {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String imgurl;
    private int commodityid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public int getCommodityid() {
        return commodityid;
    }

    public void setCommodityid(int commodityid) {
        this.commodityid = commodityid;
    }

    public CommodityImg(int id, String imgurl, int commodityid) {
        this.id = id;
        this.imgurl = imgurl;
        this.commodityid = commodityid;
    }

    public CommodityImg() {
        super();
    }

    @Override
    public String toString() {
        return "CommodityImg{" +
                "id=" + id +
                ", imgurl='" + imgurl + '\'' +
                ", commodityid=" + commodityid +
                '}';
    }
}

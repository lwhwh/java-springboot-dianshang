package com.lwh.shoppingwebsite.entity;

import javax.persistence.*;

/**
 * @Author : lwh
 * @Create : 2022/1/29
 * @Version:2022-01 -29-1
 */
/*
    商品类
 */
@Entity
@Table
public class Commodity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String commodityname;//商品名称
    private double commodityprice;//商品价格
    private String commoditypicture;//商品图片
    private int productclassifytwoid;//商品二级标题id
    private int collectcount;//商品收藏数量

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

    public double getCommodityprice() {
        return commodityprice;
    }

    public void setCommodityprice(double commodityprice) {
        this.commodityprice = commodityprice;
    }

    public String getCommoditypicture() {
        return commoditypicture;
    }

    public void setCommoditypicture(String commoditypicture) {
        this.commoditypicture = commoditypicture;
    }

    public int getProductclassifytwoid() {
        return productclassifytwoid;
    }

    public void setProductclassifytwoid(int productclassifytwoid) {
        this.productclassifytwoid = productclassifytwoid;
    }

    public int getCollectcount() {
        return collectcount;
    }

    public void setCollectcount(int collectcount) {
        this.collectcount = collectcount;
    }

    public Commodity(int id, String commodityname, double commodityprice, String commoditypicture, int productclassifytwoid, int collectcount) {
        this.id = id;
        this.commodityname = commodityname;
        this.commodityprice = commodityprice;
        this.commoditypicture = commoditypicture;
        this.productclassifytwoid = productclassifytwoid;
        this.collectcount = collectcount;
    }

    @Override
    public String toString() {
        return "Commodity{" +
                "id=" + id +
                ", commodityname='" + commodityname + '\'' +
                ", commodityprice=" + commodityprice +
                ", commoditypicture='" + commoditypicture + '\'' +
                ", productclassifytwoid=" + productclassifytwoid +
                ", collectcount=" + collectcount +
                '}';
    }

    public Commodity() {
        super();
    }
}

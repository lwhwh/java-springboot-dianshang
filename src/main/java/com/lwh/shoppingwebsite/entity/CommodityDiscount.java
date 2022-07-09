package com.lwh.shoppingwebsite.entity;

import javax.persistence.*;

/**
 * @Author : lwh
 * @Create : 2022/3/2
 * @Version:2022-03 -02-1
 */
//商品折扣
@Entity
@Table
public class CommodityDiscount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String discountdetail;//折扣详情
    private double discount;//折扣
    private int commodityid;//商品id

    public CommodityDiscount() {
        super();
    }

    public CommodityDiscount(int id, String discountdetail, double discount, int commodityid) {
        this.id = id;
        this.discountdetail = discountdetail;
        this.discount = discount;
        this.commodityid = commodityid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDiscountdetail() {
        return discountdetail;
    }

    public void setDiscountdetail(String discountdetail) {
        this.discountdetail = discountdetail;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public int getCommodityid() {
        return commodityid;
    }

    public void setCommodityid(int commodityid) {
        this.commodityid = commodityid;
    }
}

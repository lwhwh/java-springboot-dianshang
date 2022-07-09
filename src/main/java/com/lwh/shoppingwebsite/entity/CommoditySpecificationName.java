package com.lwh.shoppingwebsite.entity;

import javax.persistence.*;

/**
 * @Author : lwh
 * @Create : 2022/2/13
 * @Version:2022-02 -13-1
 */
/*
    商品规格类
*/
@Entity
@Table
public class CommoditySpecificationName {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String specificationname;//规格名称
    private int commodityspecificationtitleid;//商品规格标题id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSpecificationname() {
        return specificationname;
    }

    public void setSpecificationname(String specificationname) {
        this.specificationname = specificationname;
    }

    public int getCommodityspecificationtitleid() {
        return commodityspecificationtitleid;
    }

    public void setCommodityspecificationtitleid(int commodityspecificationtitleid) {
        this.commodityspecificationtitleid = commodityspecificationtitleid;
    }

    public CommoditySpecificationName(int id, String specificationname, int commodityspecificationtitleid) {
        this.id = id;
        this.specificationname = specificationname;
        this.commodityspecificationtitleid = commodityspecificationtitleid;
    }

    public CommoditySpecificationName() {
        super();
    }
}

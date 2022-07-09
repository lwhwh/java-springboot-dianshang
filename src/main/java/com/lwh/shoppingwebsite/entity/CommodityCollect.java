package com.lwh.shoppingwebsite.entity;

import javax.persistence.*;

/**
 * @Author : lwh
 * @Create : 2022/2/17
 * @Version:2022-02 -17-1
 */
/*
    商品收藏
 */

@Entity
@Table
public class CommodityCollect {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int uid;//用户Id
    private  int commodityid;//商品Id

    public CommodityCollect() {
        super();
    }

    @Override
    public String toString() {
        return "CommodityCollect{" +
                "id=" + id +
                ", uid=" + uid +
                ", commodityid=" + commodityid +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public CommodityCollect(int id, int uid, int commodityid) {
        this.id = id;
        this.uid = uid;
        this.commodityid = commodityid;
    }
}

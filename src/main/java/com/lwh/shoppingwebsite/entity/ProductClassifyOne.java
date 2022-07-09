package com.lwh.shoppingwebsite.entity;

import javax.persistence.*;

/**
 * @Author : lwh
 * @Create : 2022/1/21
 * @Version:2022-01 -21-1
 */
/*
    产品标题分类一级
*/
@Entity
@Table
public class ProductClassifyOne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String routeto;//路由路径
    private String productclassiftitle;//产品标题

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRouteto() {
        return routeto;
    }

    public void setRouteto(String routeto) {
        this.routeto = routeto;
    }

    public String getProductclassiftitle() {
        return productclassiftitle;
    }

    public void setProductclassiftitle(String productclassiftitle) {
        this.productclassiftitle = productclassiftitle;
    }

    public ProductClassifyOne(int id, String routeto, String productclassiftitle) {
        this.id = id;
        this.routeto = routeto;
        this.productclassiftitle = productclassiftitle;
    }

    @Override
    public String toString() {
        return "ProductClassifyOne{" +
                "id=" + id +
                ", routeto='" + routeto + '\'' +
                ", productclassiftitle='" + productclassiftitle + '\'' +
                '}';
    }

    public ProductClassifyOne() {
        super();
    }
}



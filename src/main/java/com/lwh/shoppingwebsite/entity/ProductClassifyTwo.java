package com.lwh.shoppingwebsite.entity;

import javax.persistence.*;

/**
 * @Author : lwh
 * @Create : 2022/1/24
 * @Version:2022-01 -24-1
 */
/*
    产品标题分类二级
*/
@Entity
@Table
public class ProductClassifyTwo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String productclassiftitletwo;//产品分类标题二级
    private int productclassifyoneid;//产品分类一级id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductclassiftitletwo() {
        return productclassiftitletwo;
    }

    public void setProductclassiftitletwo(String productclassiftitletwo) {
        this.productclassiftitletwo = productclassiftitletwo;
    }

    public int getProductclassifyoneid() {
        return productclassifyoneid;
    }

    public void setProductclassifyoneid(int productclassifyoneid) {
        this.productclassifyoneid = productclassifyoneid;
    }

    public ProductClassifyTwo(int id, String productclassiftitletwo, int productclassifyoneid) {
        this.id = id;
        this.productclassiftitletwo = productclassiftitletwo;
        this.productclassifyoneid = productclassifyoneid;
    }

    public ProductClassifyTwo() {
        super();
    }

    @Override
    public String toString() {
        return "ProductClassifyTwo{" +
                "id=" + id +
                ", productclassiftitletwo='" + productclassiftitletwo + '\'' +
                ", productclassifyoneid=" + productclassifyoneid +
                '}';
    }
}

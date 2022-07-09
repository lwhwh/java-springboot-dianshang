package com.lwh.shoppingwebsite.entity;

import javax.persistence.*;
import java.util.List;

/**
 * @Author : lwh
 * @Create : 2022/2/13
 * @Version:2022-02 -13-1
 */
/*
    商品规格名称标题
*/
@Entity
@Table
public class CommoditySpecificationTitle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String specificationtitle;//规格名称标题
    private int commodityid;//商品id

    @Transient
    private List<CommoditySpecificationName> commoditySpecificationNames;//查询规格名字

    public CommoditySpecificationTitle(int id, String specificationtitle, int commodityid, List<CommoditySpecificationName> commoditySpecificationNames) {
        this.id = id;
        this.specificationtitle = specificationtitle;
        this.commodityid = commodityid;
        this.commoditySpecificationNames = commoditySpecificationNames;
    }

    public CommoditySpecificationTitle() {
        super();
    }

    @Override
    public String toString() {
        return "CommoditySpecificationTitle{" +
                "id=" + id +
                ", specificationtitle='" + specificationtitle + '\'' +
                ", commodityid=" + commodityid +
                ", commoditySpecificationNames=" + commoditySpecificationNames.toString() +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSpecificationtitle() {
        return specificationtitle;
    }

    public void setSpecificationtitle(String specificationtitle) {
        this.specificationtitle = specificationtitle;
    }

    public int getCommodityid() {
        return commodityid;
    }

    public void setCommodityid(int commodityid) {
        this.commodityid = commodityid;
    }

    public List<CommoditySpecificationName> getCommoditySpecificationNames() {
        return commoditySpecificationNames;
    }

    public void setCommoditySpecificationNames(List<CommoditySpecificationName> commoditySpecificationNames) {
        this.commoditySpecificationNames = commoditySpecificationNames;
    }
}

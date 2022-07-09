package com.lwh.shoppingwebsite.entity;

import javax.persistence.*;

/**
 * @Author : lwh
 * @Create : 2022/2/28
 * @Version:2022-02 -28-1
 */
/*
    收货人信息类
*/
@Entity
@Table
public class ConsigneeInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String consigneeaddress;//收货地址
    private String consigneename;//收货人姓名
    private String consigneephone;//收货人手机号
    private int uid;//用户id

    public ConsigneeInfo(int id, String consigneeaddress, String consigneename, String consigneephone, int uid) {
        this.id = id;
        this.consigneeaddress = consigneeaddress;
        this.consigneename = consigneename;
        this.consigneephone = consigneephone;
        this.uid = uid;
    }

    @Override
    public String toString() {
        return "ConsigneeInfo{" +
                "id=" + id +
                ", consigneeaddress='" + consigneeaddress + '\'' +
                ", consigneename='" + consigneename + '\'' +
                ", consigneephone='" + consigneephone + '\'' +
                ", uid=" + uid +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getConsigneeaddress() {
        return consigneeaddress;
    }

    public void setConsigneeaddress(String consigneeaddress) {
        this.consigneeaddress = consigneeaddress;
    }

    public String getConsigneename() {
        return consigneename;
    }

    public void setConsigneename(String consigneename) {
        this.consigneename = consigneename;
    }

    public String getConsigneephone() {
        return consigneephone;
    }

    public void setConsigneephone(String consigneephone) {
        this.consigneephone = consigneephone;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public ConsigneeInfo() {
        super();
    }
}

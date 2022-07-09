package com.lwh.shoppingwebsite.dao;

import com.lwh.shoppingwebsite.entity.ConsigneeInfo;
import com.lwh.shoppingwebsite.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @Author : lwh
 * @Create : 2022/2/28
 * @Version:2022-02 -28-1
 */
//收货信息
@Repository
@Mapper
public interface ConsigneeInfoMapper {

    int addconsigneeInfo(User user);//添加收货地址

    ConsigneeInfo queryConsigneeInfouid(Integer uid);//学生id查询收货信息

    int updateConsigneelnfo(ConsigneeInfo consigneeInfo);//修改新的收货地址

    ConsigneeInfo queryConsigneeInfoid(int id);//通过id查询收货地址
}

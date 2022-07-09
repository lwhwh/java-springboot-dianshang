package com.lwh.shoppingwebsite.service;

import com.lwh.shoppingwebsite.entity.ConsigneeInfo;
import com.lwh.shoppingwebsite.util.AjaxResult;

/**
 * @Author : lwh
 * @Create : 2022/2/28
 * @Version:2022-02 -28-1
 */
public interface ConsigneeInfoService {
    ConsigneeInfo queryConsigneeInfoUid(Integer uid);//学生id查询收货信息

    AjaxResult updateConsigneelnfo(ConsigneeInfo consigneeInfo);//修改新的收货地址

}

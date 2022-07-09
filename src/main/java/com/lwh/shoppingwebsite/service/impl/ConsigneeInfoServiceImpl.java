package com.lwh.shoppingwebsite.service.impl;

import com.lwh.shoppingwebsite.dao.ConsigneeInfoMapper;
import com.lwh.shoppingwebsite.entity.ConsigneeInfo;
import com.lwh.shoppingwebsite.service.ConsigneeInfoService;
import com.lwh.shoppingwebsite.util.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author : lwh
 * @Create : 2022/2/28
 * @Version:2022-02 -28-1
 */
@Service
public class ConsigneeInfoServiceImpl implements ConsigneeInfoService {

    @Autowired
    private ConsigneeInfoMapper consigneeInfoMapper;

    //学生id查询收货信息
    @Override
    public ConsigneeInfo queryConsigneeInfoUid(Integer uid) {
        return consigneeInfoMapper.queryConsigneeInfouid(uid);
    }

    //修改新的收货地址
    @Override
    public AjaxResult updateConsigneelnfo(ConsigneeInfo consigneeInfo) {
        AjaxResult ajaxResult = new AjaxResult();
        ConsigneeInfo consigneeInfo1 = consigneeInfoMapper.queryConsigneeInfoid(consigneeInfo.getId());//通过id查询收货地址
        if(consigneeInfo1.getConsigneeaddress().equals(consigneeInfo.getConsigneeaddress())&&
        consigneeInfo1.getConsigneename().equals(consigneeInfo.getConsigneename())&&
        consigneeInfo1.getConsigneephone().equals(consigneeInfo.getConsigneephone())){
            ajaxResult.setMessage("保存成功");
            return ajaxResult;
        }

        if(consigneeInfoMapper.updateConsigneelnfo(consigneeInfo)>0){
            ajaxResult.setMessage("保存成功");
        }else {
            ajaxResult.setMessage("保存失败");
            ajaxResult.setSuccess(false);
        }
        return ajaxResult;
    }
}

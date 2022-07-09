package com.lwh.shoppingwebsite.controller;

import com.lwh.shoppingwebsite.entity.ConsigneeInfo;
import com.lwh.shoppingwebsite.service.ConsigneeInfoService;
import com.lwh.shoppingwebsite.util.AjaxResult;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author : lwh
 * @Create : 2022/2/28
 * @Version:2022-02 -28-1
 */
@Controller
@RequestMapping("/consigneeInfo")
@Api(tags = "/consigneeInfo",description = "这是一个收货信息控制器接口")
public class ConsigneeInfoController {

    @Autowired
    private ConsigneeInfoService consigneeInfoService;

    //学生id查询收货信息
    @RequestMapping("/queryConsigneeInfouid")
    @ResponseBody
    private Object queryConsigneeInfouid(Integer uid){

        ConsigneeInfo consigneeInfo = consigneeInfoService.queryConsigneeInfoUid(uid);//
        return consigneeInfo;
    }

    //修改新的收货地址
    @RequestMapping("/updateConsigneelnfo")
    @ResponseBody
    private AjaxResult updateConsigneelnfo(ConsigneeInfo consigneeInfo){
        AjaxResult ajaxResult = consigneeInfoService.updateConsigneelnfo(consigneeInfo);
        return ajaxResult;
    }
}

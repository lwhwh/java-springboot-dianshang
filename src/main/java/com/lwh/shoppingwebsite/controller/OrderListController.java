package com.lwh.shoppingwebsite.controller;

import com.lwh.shoppingwebsite.entity.OrderList;
import com.lwh.shoppingwebsite.service.OrderListService;
import com.lwh.shoppingwebsite.util.AjaxResult;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author : lwh
 * @Create : 2022/3/9
 * @Version:2022-03 -09-1
 */
@Controller
@RequestMapping("/orderList")
@Api(tags = "/orderList",description = "这是一个订单信息控制器接口")

public class OrderListController {
    @Autowired
    private OrderListService orderListService;

    //查询当前用户的订单
    @RequestMapping("/getOrderListUid")
    @ResponseBody
    private List<OrderList> getOrderListUid(Integer uid,String statetitle){
        List<OrderList> orderLists =orderListService.getOrderListUid(uid,statetitle);//查询当前用户的订单
        return orderLists;
    }

    //删除订单
    @RequestMapping("/delOredrListid")
    @ResponseBody
    private AjaxResult delOredrListid(Integer id){
        AjaxResult ajaxResult = orderListService.delOredrListid(id);//删除订单
        return ajaxResult;
    }
    //修改
    @RequestMapping("/updateOrderList")
    @ResponseBody
    private Object updateOrderList(Integer id,String statetitle){
        AjaxResult ajaxResult = orderListService.updateOrderList(id,statetitle);//修改
        return ajaxResult;
    }

}

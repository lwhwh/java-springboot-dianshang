package com.lwh.shoppingwebsite.service;

import com.lwh.shoppingwebsite.entity.OrderList;
import com.lwh.shoppingwebsite.entity.ShoppingTrolley;
import com.lwh.shoppingwebsite.util.AjaxResult;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Author : lwh
 * @Create : 2022/2/27
 * @Version:2022-02 -27-1
 */
//订单接口
public interface OrderListService {
    AjaxResult addorderList(List<ShoppingTrolley> list, HttpServletRequest request);//添加订单

    List<OrderList> getOrderListUid(Integer uid,String statetitle);//查询当前用户的订单

    AjaxResult delOredrListid(Integer id);//删除订单

    AjaxResult updateOrderList(Integer id, String statetitle);//修改

}

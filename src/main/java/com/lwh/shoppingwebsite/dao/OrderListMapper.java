package com.lwh.shoppingwebsite.dao;

import com.lwh.shoppingwebsite.entity.OrderList;
import com.lwh.shoppingwebsite.entity.ShoppingTrolley;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author : lwh
 * @Create : 2022/2/27
 * @Version:2022-02 -27-1
 */
//订单列表
@Repository
@Mapper
public interface OrderListMapper {
    int addorderList(OrderList orderList);//添加订单

    List<OrderList> getOrderListUid(Integer uid,String statetitle);//查询当前用户的订单

    int delOredrListid(Integer id);//删除订单

    int updateOrderListstate(Integer id,String statetitle);//修改订单状态
}

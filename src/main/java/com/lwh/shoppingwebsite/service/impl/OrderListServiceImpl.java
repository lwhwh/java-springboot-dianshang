package com.lwh.shoppingwebsite.service.impl;

import com.lwh.shoppingwebsite.dao.ConsigneeInfoMapper;
import com.lwh.shoppingwebsite.dao.OrderListMapper;
import com.lwh.shoppingwebsite.entity.ConsigneeInfo;
import com.lwh.shoppingwebsite.entity.OrderList;
import com.lwh.shoppingwebsite.entity.ShoppingTrolley;
import com.lwh.shoppingwebsite.entity.User;
import com.lwh.shoppingwebsite.service.OrderListService;
import com.lwh.shoppingwebsite.util.AjaxResult;
import com.lwh.shoppingwebsite.util.Const;
import com.lwh.shoppingwebsite.util.OrderListNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

/**
 * @Author : lwh
 * @Create : 2022/2/27
 * @Version:2022-02 -27-1
 */
//订单列表
    @Service
public class OrderListServiceImpl implements OrderListService {
        @Autowired
        private OrderListMapper orderListMapper;
        @Autowired
        private ConsigneeInfoMapper consigneeInfoMapper;

        //添加订单
    @Override
    public AjaxResult addorderList(List<ShoppingTrolley> list, HttpServletRequest request) {
        AjaxResult ajaxResult = new AjaxResult();
        OrderList orderList = new OrderList();
        User user = (User) request.getSession().getAttribute(Const.USER);
        ConsigneeInfo consigneeInfo = consigneeInfoMapper.queryConsigneeInfouid(user.getId());

        for (ShoppingTrolley shoppingTrolley:list){
            orderList.setCommodityid(shoppingTrolley.getCommodityid());
            orderList.setPhone(consigneeInfo.getConsigneephone());
            orderList.setUid(user.getId());
            orderList.setUsername(consigneeInfo.getConsigneename());
            orderList.setAddress(consigneeInfo.getConsigneeaddress());
            orderList.setOredrnumber(OrderListNumber.getaccountUtli(new Date(),"yyyyMMddHHmmssSS"));
            orderList.setCommoditypicture(shoppingTrolley.getCommoditypicture());
            String commodityinfo=shoppingTrolley.getCommodityname()+shoppingTrolley.getCommodityspecification();
            orderList.setCommodityname(commodityinfo);
            orderList.setTotalprice(shoppingTrolley.getTotalprice());
            orderList.setCount(shoppingTrolley.getCommoditycount());
            if(orderListMapper.addorderList(orderList)>0){
                ajaxResult.setMessage("结算成功");
            }
        }
        return ajaxResult;
    }

    //查询当前用户的订单
    @Override
    public List<OrderList> getOrderListUid(Integer uid,String statetitle) {
        return orderListMapper.getOrderListUid(uid,statetitle);
    }

    //删除订单
    @Override
    public AjaxResult delOredrListid(Integer id) {
        AjaxResult ajaxResult = new AjaxResult();
        if(orderListMapper.delOredrListid(id)>0){
            ajaxResult.setMessage("删除成功");
        }else {
            ajaxResult.setMessage("删除失败");
            ajaxResult.setSuccess(false);
        }
        return ajaxResult;
    }

    //修改
    @Override
    public AjaxResult updateOrderList(Integer id, String statetitle) {
        AjaxResult ajaxResult = new AjaxResult();
        System.out.println(id);
       if(orderListMapper.updateOrderListstate(id,statetitle)>0){
           if(statetitle.equals("pendingpayment")){
               ajaxResult.setMessage("等待商家确认");
           }
           if(statetitle.equals("Pendinggoods")){
               ajaxResult.setMessage("收货成功");
           }
           if(statetitle.equals("Pendingevaluate")){
               ajaxResult.setMessage("评论成功");
           }
       }
       else {
           ajaxResult.setMessage("网络在偷懒");
           ajaxResult.setSuccess(false);
       }

        return ajaxResult;
    }
}

package com.lwh.shoppingwebsite.controller;

import com.lwh.shoppingwebsite.dao.ShoppingTrolleyMapper;
import com.lwh.shoppingwebsite.entity.ShoppingTrolley;
import com.lwh.shoppingwebsite.service.OrderListService;
import com.lwh.shoppingwebsite.service.ShoppingTrolleyService;
import com.lwh.shoppingwebsite.util.AjaxResult;
import io.swagger.annotations.Api;
import org.aspectj.weaver.loadtime.Aj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author : lwh
 * @Create : 2022/2/19
 * @Version:2022-02 -19-1
 */
@Controller
@RequestMapping("/shoppingtrolley")
@Api(tags = "/shoppingtrolley",description = "这是一个购物车控制器接口")

public class ShoppingTrolleyController {
    @Autowired
    private ShoppingTrolleyService shoppingTrolleyService;
    @Autowired
    private OrderListService orderListService;
    //查询当前用户的购物车
    @RequestMapping("/queryShoppingtrolleyuid")
    @ResponseBody
    private List<ShoppingTrolley> queryshoppingtrolleyuid(Integer uid) {
        List<ShoppingTrolley> list = shoppingTrolleyService.queryshoppingtrolleyuid(uid);
        return list;
    }

    //添加购物车
    @RequestMapping("/addShoppingtrolley")
    @ResponseBody
    private AjaxResult addshoppingtrolley(ShoppingTrolley shoppingTrolley) {
        System.out.println(shoppingTrolley.toString());
        AjaxResult ajaxResult = shoppingTrolleyService.addshoppingtrolley(shoppingTrolley);
        return ajaxResult;
    }

    //删除购物车
    @RequestMapping("/delShoppingtrolley")
    @ResponseBody
    private AjaxResult delShoppingtrolley(Integer shoppingtrolleyId[]) {
        AjaxResult ajaxResult = shoppingTrolleyService.delShoppingtrolley(shoppingtrolleyId);
        return ajaxResult;
    }

    //修改商品数量
    @RequestMapping("/updateShoppingCount")
    @ResponseBody
    private Object updateShoppingCount(ShoppingTrolley shoppingTrolley) {
        System.out.println(shoppingTrolley.toString());
        int i = shoppingTrolleyService.updateShoppingCount(shoppingTrolley);//修改商品数量
        if (i > 0) {
            System.out.println("修改成功了");
            //shoppingTrolleyService.queryshoppingtrolleyuid(shoppingTrolley.getUid())
            return shoppingTrolleyService.queryshoppingtrolleyuidAndId(shoppingTrolley.getUid(), shoppingTrolley.getId());
        } else {
            return null;
        }
    }

    //生成订单列表
    @RequestMapping("/addorder")
    @ResponseBody
    private Object addorder(int[] id,HttpServletRequest request) {
        System.out.println(id.length);
        List<ShoppingTrolley> list = new ArrayList<ShoppingTrolley>();
        for (int i = 0; i < id.length; i++) {
            list.add(shoppingTrolleyService.queryshoppingtrolleyid(id[i]));
        }
       AjaxResult ajaxResult  = orderListService.addorderList(list,request);//添加订单
        return ajaxResult;
    }
}

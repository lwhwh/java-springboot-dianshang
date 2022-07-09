package com.lwh.shoppingwebsite.service;

import com.lwh.shoppingwebsite.entity.ShoppingTrolley;
import com.lwh.shoppingwebsite.util.AjaxResult;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Author : lwh
 * @Create : 2022/2/18
 * @Version:2022-02 -18-1
 */
//购物车
public interface ShoppingTrolleyService {
    List<ShoppingTrolley> queryshoppingtrolleyuid(Integer uid);//查询当前用户的购物车

    AjaxResult addshoppingtrolley(ShoppingTrolley shoppingTrolley);//添加购物车

    AjaxResult delShoppingtrolley(Integer[] shoppingtrolleyId);//删除购物车

    int updateShoppingCount(ShoppingTrolley shoppingTrolley);//修改商品数量

    ShoppingTrolley queryshoppingtrolleyuidAndId(int uid, int id);//查询学生id和当前商品id的物品

   ShoppingTrolley queryshoppingtrolleyid(int id);//多个id查询购物车
}

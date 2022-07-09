package com.lwh.shoppingwebsite.dao;

import com.lwh.shoppingwebsite.entity.ShoppingTrolley;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author : lwh
 * @Create : 2022/2/18
 * @Version:2022-02 -18-1
 */
//购物车
@Repository
@Mapper
public interface ShoppingTrolleyMapper {
    List<ShoppingTrolley> queryshoppingtrolleyuid(Integer uid);//查询当前用户的购物车

    ShoppingTrolley queryUidAndcidAndCommodityspecification(int uid, int commodityid, String commodityspecification);//查询当前购物车是否已经添加了

    int addshoppingtrolley(ShoppingTrolley shoppingTrolley);//添加一个购物车

    int updateshoppingtrolley(double totalprice, int commoditycount, int id);//修改商品数量和价钱

    int delShoppingtrolley(Integer id);//删除购物车

    ShoppingTrolley queryshoppingtrolleyuidAndId(int uid, int id);//查询学生id和当前商品id的物品

    ShoppingTrolley queryshoppingtrolleyid(int id);//多个id查询购物车
}

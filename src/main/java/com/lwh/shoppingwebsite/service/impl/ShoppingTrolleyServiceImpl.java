package com.lwh.shoppingwebsite.service.impl;

import com.lwh.shoppingwebsite.dao.CommodityMapper;
import com.lwh.shoppingwebsite.dao.ShoppingTrolleyMapper;
import com.lwh.shoppingwebsite.entity.Commodity;
import com.lwh.shoppingwebsite.entity.ShoppingTrolley;
import com.lwh.shoppingwebsite.entity.User;
import com.lwh.shoppingwebsite.service.ShoppingTrolleyService;
import com.lwh.shoppingwebsite.util.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Author : lwh
 * @Create : 2022/2/18
 * @Version:2022-02 -18-1
 */
//购物车
@Service
public class ShoppingTrolleyServiceImpl implements ShoppingTrolleyService {
    @Autowired
    private ShoppingTrolleyMapper shoppingTrolleyMapper;
    @Autowired
    private CommodityMapper commodityMapper;
    //查询当前用户的购物车
    @Override
    public List<ShoppingTrolley> queryshoppingtrolleyuid(Integer uid) {
        return shoppingTrolleyMapper.queryshoppingtrolleyuid(uid);
    }

    //添加购物车
    @Override
    public AjaxResult addshoppingtrolley(ShoppingTrolley shoppingTrolley) {
        AjaxResult ajaxResult = new AjaxResult();
        //查询当前购物车是否添加了此商品
        ShoppingTrolley shoppingTrolley1 =
         shoppingTrolleyMapper.queryUidAndcidAndCommodityspecification(shoppingTrolley.getUid(),shoppingTrolley.getCommodityid(),shoppingTrolley.getCommodityspecification());

        if(shoppingTrolley1==null){
            Commodity commodity = commodityMapper.querycommodityId(shoppingTrolley.getCommodityid());
            shoppingTrolley.setCommoditypicture(commodity.getCommoditypicture());
            if(shoppingTrolleyMapper.addshoppingtrolley(shoppingTrolley)>0){
                ajaxResult.setMessage("添加成功");
            }else {
                ajaxResult.setMessage("添加失败");
                ajaxResult.setSuccess(false);
            }
        } else {
            int totalcommoditycount = shoppingTrolley.getCommoditycount()+shoppingTrolley1.getCommoditycount();//同样商品只能加入10个
            //判断这件商品是否有10件
            if(totalcommoditycount>10){
                ajaxResult.setMessage("购物车只能存10件同样的商品");
                ajaxResult.setSuccess(false);
                return ajaxResult;
            }
            //数据库已有此类商品修改数量
            double totalprice = shoppingTrolley.getTotalprice()+shoppingTrolley1.getTotalprice();
            int commoditycount = shoppingTrolley.getCommoditycount()+shoppingTrolley1.getCommoditycount();
            if(shoppingTrolleyMapper.updateshoppingtrolley(totalprice,commoditycount,shoppingTrolley1.getId())>0){
                    ajaxResult.setMessage("添加成功");
            }else {
                ajaxResult.setMessage("添加失败");
                ajaxResult.setSuccess(false);
            }
        }
        return ajaxResult;
    }

    //删除购物车
    @Override
    public AjaxResult delShoppingtrolley(Integer[] shoppingtrolleyId) {
        AjaxResult ajaxResult = new AjaxResult();
        for (int i=0;i<shoppingtrolleyId.length;i++){
            System.out.println(shoppingtrolleyId[i]);
            if(shoppingTrolleyMapper.delShoppingtrolley(shoppingtrolleyId[i])>0){
                ajaxResult.setMessage("你的宝贝已成功删除");
            }else {
                ajaxResult.setMessage("网路开小差了");
                ajaxResult.setSuccess(false);
                return ajaxResult;
            }
        }
        return ajaxResult;
    }

    //修改商品数量
    @Override
    public int updateShoppingCount(ShoppingTrolley shoppingTrolley) {
        if(shoppingTrolleyMapper.updateshoppingtrolley
                (shoppingTrolley.getTotalprice(),shoppingTrolley.getCommoditycount(),shoppingTrolley.getId())>0){
            return 1;
        }else {
            return 0;
        }
    }

    //查询学生id和当前商品id的物品
    @Override
    public ShoppingTrolley queryshoppingtrolleyuidAndId(int uid, int id) {
        return shoppingTrolleyMapper.queryshoppingtrolleyuidAndId(uid,id);
    }

    //多个id查询购物车
    @Override
    public ShoppingTrolley queryshoppingtrolleyid(int id) {
        return shoppingTrolleyMapper.queryshoppingtrolleyid(id);
    }
}

package com.lwh.shoppingwebsite.service;

import com.lwh.shoppingwebsite.entity.CommodityCollect;

/**
 * @Author : lwh
 * @Create : 2022/2/17
 * @Version:2022-02 -17-1
 */
//商品收藏
public interface CommodityCollectService {
    CommodityCollect findCommodityCollectUidAndcid(Integer commodityId, int uid);//通过商品id和用户id查询当前用户时候收藏了此类商品
}

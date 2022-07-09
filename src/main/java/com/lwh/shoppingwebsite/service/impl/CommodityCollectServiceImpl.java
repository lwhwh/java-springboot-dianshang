package com.lwh.shoppingwebsite.service.impl;

import com.lwh.shoppingwebsite.dao.CommodityCollectMapper;
import com.lwh.shoppingwebsite.entity.CommodityCollect;
import com.lwh.shoppingwebsite.service.CommodityCollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author : lwh
 * @Create : 2022/2/17
 * @Version:2022-02 -17-1
 */
//商品收藏
@Service
public class CommodityCollectServiceImpl implements CommodityCollectService {
    @Autowired
    private CommodityCollectMapper commodityCollectMapper;

    //通过商品id和用户id查询当前用户时候收藏了此类商品
    @Override
    public CommodityCollect findCommodityCollectUidAndcid(Integer commodityId, int uid) {
        return commodityCollectMapper.findCommodityCollectUidAndcid(commodityId,uid);
    }
}

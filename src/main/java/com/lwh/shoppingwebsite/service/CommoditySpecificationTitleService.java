package com.lwh.shoppingwebsite.service;

import com.lwh.shoppingwebsite.entity.CommoditySpecificationTitle;

import java.util.List;

/**
 * @Author : lwh
 * @Create : 2022/2/13
 * @Version:2022-02 -13-1
 */
//商品规格标题

public interface CommoditySpecificationTitleService {

    List<CommoditySpecificationTitle> getcommdidtyId(Integer commodityId);//通过商品Id查询商品规格
}

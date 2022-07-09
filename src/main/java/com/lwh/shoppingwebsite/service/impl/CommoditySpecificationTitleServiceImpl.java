package com.lwh.shoppingwebsite.service.impl;

import com.lwh.shoppingwebsite.dao.CommoditySpecificationTitleMapper;
import com.lwh.shoppingwebsite.entity.CommoditySpecificationTitle;
import com.lwh.shoppingwebsite.service.CommoditySpecificationTitleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author : lwh
 * @Create : 2022/2/13
 * @Version:2022-02 -13-1
 */
//商品规格标题
@Service
public class CommoditySpecificationTitleServiceImpl implements CommoditySpecificationTitleService {
    @Autowired
    private CommoditySpecificationTitleMapper commoditySpecificationTitleMapper;

    //通过商品Id查询商品规格
    @Override
    public List<CommoditySpecificationTitle> getcommdidtyId(Integer commodityId) {
        return commoditySpecificationTitleMapper.getcommdidtyId(commodityId);
    }
}

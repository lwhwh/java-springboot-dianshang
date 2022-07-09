package com.lwh.shoppingwebsite.dao;

import com.lwh.shoppingwebsite.entity.CommodityCollect;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @Author : lwh
 * @Create : 2022/2/17
 * @Version:2022-02 -17-1
 */
/*
商品收藏
*/
@Repository
@Mapper
public interface CommodityCollectMapper {
    CommodityCollect findCommodityCollectUidAndcid(Integer commodityId,int uid);//通过商品id和用户id查询当前用户时候收藏了此类商品

    int addCommodityCollect(Integer commodityId, int uid);//添加一个收藏

    int delCommodityCollect(Integer commodityId, int uid);//删除一个收藏
}

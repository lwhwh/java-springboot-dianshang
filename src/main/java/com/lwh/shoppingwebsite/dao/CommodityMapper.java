package com.lwh.shoppingwebsite.dao;

import com.lwh.shoppingwebsite.entity.Commodity;
import com.lwh.shoppingwebsite.entity.CommodityImg;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author : lwh
 * @Create : 2022/1/29
 * @Version:2022-01 -29-1
 */
@Repository
@Mapper
public interface CommodityMapper {
    List<Commodity> queryAllproductclassifytwoid(Integer productclassifytwoid);//通过二级标题查询

    Commodity querycommodityId(Integer commodityId);//通过商品Id查询商品

    List<CommodityImg> findCommodityImgCommodityId(Integer commodityId);//通过商品id查询当前商品的列表

    int updatecollectcount(Integer commodityId,int collectcount);//修改收藏数量

    List<Commodity> queryproductclassifytwo(int productclassifytwoid,int id);//查询当前二级目录的商品数量

    int collectcount();//查询收藏大于0的数量

    List<Commodity> queryCollect(int i, int pageCount);//查询收藏大于0的
}

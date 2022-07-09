package com.lwh.shoppingwebsite.service;

import com.lwh.shoppingwebsite.entity.Commodity;
import com.lwh.shoppingwebsite.entity.CommodityImg;

import java.util.List;
import java.util.Map;

/**
 * @Author : lwh
 * @Create : 2022/1/29
 * @Version:2022-01 -29-1
 */
public interface CommodityService {
    List<Commodity> queryAllproductclassifytwoid(Integer productclassifytwoid);//通过二级标题查询商品

    Commodity querycommodityId(Integer commodityId);//通过商品Id查询商品

    List<CommodityImg> findCommodityImgCommodityId(Integer commodityId);////通过商品id查询当前商品的列表

    Commodity addCommodityCollect(Integer commodityId, int uid);//添加商品收藏

    Commodity delCommodityCollect(Integer commodityId, int uid);//取消商品收藏

    List<Commodity> queryproductclassifytwo(int productclassifytwoid,int id);//查询当前二级目录的商品数量

    Map<Integer,List<Commodity>> queryCommoditycollectcount();//查询收藏榜

}

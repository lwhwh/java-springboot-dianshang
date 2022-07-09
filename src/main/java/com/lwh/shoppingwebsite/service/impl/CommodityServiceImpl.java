package com.lwh.shoppingwebsite.service.impl;

import com.lwh.shoppingwebsite.dao.CommodityCollectMapper;
import com.lwh.shoppingwebsite.dao.CommodityMapper;
import com.lwh.shoppingwebsite.entity.Commodity;
import com.lwh.shoppingwebsite.entity.CommodityImg;
import com.lwh.shoppingwebsite.service.CommodityService;
import com.lwh.shoppingwebsite.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author : lwh
 * @Create : 2022/1/29
 * @Version:2022-01 -29-1
 */
@Service
public class CommodityServiceImpl implements CommodityService {
    @Autowired
    private CommodityMapper commodityMapper;
    @Autowired
    private CommodityCollectMapper commodityCollectMapper;
    //通过二级标题id查询
    @Override
    public List<Commodity> queryAllproductclassifytwoid(Integer productclassifytwoid) {
        return commodityMapper.queryAllproductclassifytwoid(productclassifytwoid);
    }

    //通过商品Id查询商品
    @Override
    public Commodity querycommodityId(Integer commodityId) {
        return commodityMapper.querycommodityId(commodityId);
    }

    //通过商品id查询当前商品的列表
    @Override
    public List<CommodityImg> findCommodityImgCommodityId(Integer commodityId) {
        return commodityMapper.findCommodityImgCommodityId(commodityId);
    }

    //添加商品收藏
    @Override
    public Commodity addCommodityCollect(Integer commodityId, int uid) {
        Commodity commodity = commodityMapper.querycommodityId(commodityId);
        Commodity commodity1=null;
        if(commodity!=null){
            int collectcount = (commodity.getCollectcount()+1);
            //修改收藏数量
            if (commodityMapper.updatecollectcount(commodityId,collectcount)>0){
                //添加一个收藏
                if(commodityCollectMapper.addCommodityCollect(commodityId,uid)>0){
                    commodity1= commodityMapper.querycommodityId(commodityId);
                }
            }
            return commodity1;
        }else {
            return commodity1;
        }
    }
    //取消商品收藏
    @Override
    public Commodity delCommodityCollect(Integer commodityId,int uid) {
        Commodity commodity = commodityMapper.querycommodityId(commodityId);
        Commodity commodity1=null;
        if(commodity!=null){
            int collectcount = (commodity.getCollectcount()-1);
            //修改收藏数量
            if (commodityMapper.updatecollectcount(commodityId,collectcount)>0){
                //删除一个收藏
                if(commodityCollectMapper.delCommodityCollect(commodityId,uid)>0){
                    commodity1= commodityMapper.querycommodityId(commodityId);
                }
            }
            return commodity1;
        }else {
            return commodity1;
        }
    }

    //查询当前二级目录的商品数量
    @Override
    public List<Commodity> queryproductclassifytwo(int productclassifytwoid,int id) {
        return commodityMapper.queryproductclassifytwo(productclassifytwoid,id);
    }

    //查询收藏榜
    @Override
    public Map<Integer,List<Commodity>> queryCommoditycollectcount() {
        Page page = new Page(5,commodityMapper.collectcount());

        List<Commodity> commodityList = new ArrayList<>();
        Map<Integer,List<Commodity>> map = new HashMap<>();

        for (int i=0;i<page.getPageNumber();i++){
            commodityList=commodityMapper.queryCollect(i*page.getPageCount(),page.getPageCount());//查询收藏大于0的
            map.put(i,commodityList);
        }

     /*   for (Integer key:map.keySet()){
            for (Commodity commodity:map.get(key)){
                System.out.println(commodity.toString());
            }
        }*/
        return map;
    }
}

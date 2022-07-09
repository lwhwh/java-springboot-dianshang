package com.lwh.shoppingwebsite.controller;

import com.lwh.shoppingwebsite.entity.*;
import com.lwh.shoppingwebsite.service.CommodityService;
import com.lwh.shoppingwebsite.util.AjaxResult;
import com.lwh.shoppingwebsite.util.Const;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Author : lwh
 * @Create : 2022/1/29
 * @Version:2022-01 -29-1
 */
@Controller
@RequestMapping("commodity")
@Api(tags = "/commodity",description = "这是一个商品控制器接口")
public class CommodityController {
    @Autowired
    private CommodityService commodityService;

    //通过二级标题查询
    @RequestMapping("/queryproductclassifytwoid")
    @ResponseBody
    private Object queryproductclassifytwoid(Integer productclassifytwoid){
        List<Commodity> list = commodityService.queryAllproductclassifytwoid(productclassifytwoid);
        return list;
    }

    //通过商品Id查询商品
    @RequestMapping("/querycommodityId")
    @ResponseBody
    private  Commodity getcommodityId(Integer commodityId){
        Commodity commodity=commodityService.querycommodityId(commodityId);
        return commodity;
    }

    //通过商品id查询当前商品的列表的图片路径
    @RequestMapping("/findCommodityImgCommodityId")
    @ResponseBody
    private Object findCommodityImgCommodityId(Integer commodityId){
        List<CommodityImg> list = commodityService.findCommodityImgCommodityId(commodityId);
        return list;
    }

     //添加商品收藏
    @RequestMapping("/addCommodityCollect")
    @ResponseBody
    private Object addCommodityCollect(Integer commodityId, HttpServletRequest request){
            User user = (User) request.getSession().getAttribute(Const.USER);
            Commodity commodity = commodityService.addCommodityCollect(commodityId,user.getId());
        return commodity;
    }

     //取消商品收藏
    @RequestMapping("/delCommodityCollect")
    @ResponseBody
    private Object delCommodityCollect(Integer commodityId, HttpServletRequest request){
            User user = (User) request.getSession().getAttribute(Const.USER);
            Commodity commodity = commodityService.delCommodityCollect(commodityId,user.getId());
        return commodity;
    }

    //随机查询当前二级标题的商品
    @RequestMapping("/queryCommodityBytwoId")
    @ResponseBody
    private Object queryCommodityBytwoId(Integer commodityId){
        Commodity commodity = commodityService.querycommodityId(commodityId);
        return commodityService.queryproductclassifytwo(commodity.getProductclassifytwoid(),commodity.getId()); //查询当前二级目录的商品数量
    }

  //查询收藏榜
    @RequestMapping("/queryCommoditycollectcount")
    @ResponseBody
    private Object queryCommoditycollectcount(){
        Map<Integer,List<Commodity>> map = commodityService.queryCommoditycollectcount();//查询收藏榜
        return map;
    }
}

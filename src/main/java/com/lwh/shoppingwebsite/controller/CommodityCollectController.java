package com.lwh.shoppingwebsite.controller;

import com.lwh.shoppingwebsite.entity.CommodityCollect;
import com.lwh.shoppingwebsite.entity.User;
import com.lwh.shoppingwebsite.service.CommodityCollectService;
import com.lwh.shoppingwebsite.util.AjaxResult;
import com.lwh.shoppingwebsite.util.Const;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author : lwh
 * @Create : 2022/2/17
 * @Version:2022-02 -17-1
 */
@RequestMapping("/commodityCollect")
@Controller
@Api(tags = "/commodityCollect",description = "这是一个商品收藏控制器接口")
public class CommodityCollectController {
    @Autowired
    private CommodityCollectService commodityCollectService;

    //通过商品id和用户id查询当前用户时候收藏了此类商品
    @RequestMapping("/findCommodityCollectUidAndcid")
    @ResponseBody
    private Object findCommodityCollectUidAndcid(Integer commodityId, HttpServletRequest request){
        CommodityCollect commodityCollect = null;
        User user =(User) request.getSession().getAttribute(Const.USER);
        if(null!=user){
             commodityCollect = commodityCollectService.findCommodityCollectUidAndcid(commodityId,user.getId());
          /*  if (commodityCollect!=null){
                System.out.println(commodityCollect.toString());
            }*/
        }
        return commodityCollect;
    }

    /*//添加商品收藏
    @RequestMapping("/addCommodityCollect")
    @ResponseBody
    private AjaxResult*/
}

package com.lwh.shoppingwebsite.controller;

import com.lwh.shoppingwebsite.entity.CommoditySpecificationName;
import com.lwh.shoppingwebsite.entity.CommoditySpecificationTitle;
import com.lwh.shoppingwebsite.service.CommoditySpecificationTitleService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.sound.midi.Soundbank;
import java.util.List;

/**
 * @Author : lwh
 * @Create : 2022/2/13
 * @Version:2022-02 -13-1
 */
//产品规格标题
@Controller
@RequestMapping("commodityspecificationtitle")
@Api(tags = "/commodityspecificationtitle",description = "这是一个产品规格标题控制器接口")
public class CommoditySpecificationTitleController {
    @Autowired
    private CommoditySpecificationTitleService commoditySpecificationTitleService;

    //通过商品Id查询商品规格
    @RequestMapping("getcommdidtyId")
    @ResponseBody
    private Object getCommoditySpecificationTitlecommdidtyId(Integer commodityId){
        List<CommoditySpecificationTitle> list = commoditySpecificationTitleService.getcommdidtyId(commodityId);
        return list;
    }
}

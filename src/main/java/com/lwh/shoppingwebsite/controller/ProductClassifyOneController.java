package com.lwh.shoppingwebsite.controller;

import com.lwh.shoppingwebsite.entity.ProductClassifyOne;
import com.lwh.shoppingwebsite.service.ProductClassifyOneService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author : lwh
 * @Create : 2022/1/21
 * @Version:2022-01 -21-1
 */
/*
产品分类一级
 */
@Controller
@RequestMapping("/productClassifyOne")
@Api(tags = "/productClassifyOne",description = "这是一个产品分类一级控制器接口")

public class ProductClassifyOneController {
    @Autowired
    private ProductClassifyOneService productClassifyOneService;

    //查询所有一级标题
    @RequestMapping("/queryAllProductClassifyOne")
    @ResponseBody
    private List<ProductClassifyOne> queryAllProductClassifyOne(){
        System.out.println("测试进来了！");
        List<ProductClassifyOne> list = productClassifyOneService.queryAllProductClassifyOne();
        return list;
    }

}

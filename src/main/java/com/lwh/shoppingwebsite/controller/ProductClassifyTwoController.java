package com.lwh.shoppingwebsite.controller;

import com.lwh.shoppingwebsite.entity.ProductClassifyOne;
import com.lwh.shoppingwebsite.entity.ProductClassifyTwo;
import com.lwh.shoppingwebsite.service.ProductClassifyTwoService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.view.document.AbstractXlsView;

import java.util.List;

/**
 * @Author : lwh
 * @Create : 2022/1/24
 * @Version:2022-01 -24-1
 */
@Controller
@RequestMapping("/productClassifyTwo")
@Api(tags = "/productClassifyTwo",description = "这是一个产品分类二级控制器接口")
public class ProductClassifyTwoController {
    @Autowired
    private ProductClassifyTwoService productClassifyTwoService;

    @RequestMapping("/queryProductTwoByproductOneId")
    @ResponseBody
    private Object queryAllProductClassifyOneId(Integer productclassifyoneid){
        List<ProductClassifyTwo> list = productClassifyTwoService.queryAllProductClassifyOneId(productclassifyoneid);
        return list;
    }
}

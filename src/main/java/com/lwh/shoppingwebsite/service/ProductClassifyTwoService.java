package com.lwh.shoppingwebsite.service;

import com.lwh.shoppingwebsite.entity.ProductClassifyTwo;

import java.util.List;

/**
 * @Author : lwh
 * @Create : 2022/1/24
 * @Version:2022-01 -24-1
 */
public interface ProductClassifyTwoService {
    List<ProductClassifyTwo> queryAllProductClassifyOneId(int productclassifyoneid);//通过一级分类id查询
}

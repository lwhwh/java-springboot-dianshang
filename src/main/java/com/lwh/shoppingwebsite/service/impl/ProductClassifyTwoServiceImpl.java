package com.lwh.shoppingwebsite.service.impl;

import com.lwh.shoppingwebsite.dao.ProductClassifyTwoMapper;
import com.lwh.shoppingwebsite.entity.ProductClassifyTwo;
import com.lwh.shoppingwebsite.service.ProductClassifyTwoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author : lwh
 * @Create : 2022/1/24
 * @Version:2022-01 -24-1
 */
@Service
public class ProductClassifyTwoServiceImpl implements ProductClassifyTwoService {
    @Autowired
    private ProductClassifyTwoMapper productClassifyTwoMapper;
    @Override
    //通过一级分类id查询
    public List<ProductClassifyTwo> queryAllProductClassifyOneId(int productclassifyoneid) {
        return productClassifyTwoMapper.findByProductClassifyOneId(productclassifyoneid);
    }
}

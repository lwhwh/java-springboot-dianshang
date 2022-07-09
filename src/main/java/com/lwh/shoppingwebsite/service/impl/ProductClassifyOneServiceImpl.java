package com.lwh.shoppingwebsite.service.impl;

import com.lwh.shoppingwebsite.dao.ProductClassifyOneMapper;
import com.lwh.shoppingwebsite.entity.ProductClassifyOne;
import com.lwh.shoppingwebsite.service.ProductClassifyOneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author : lwh
 * @Create : 2022/1/21
 * @Version:2022-01 -21-1
 */
/*
     产品分类一级service
 */
@Service
public class ProductClassifyOneServiceImpl implements ProductClassifyOneService {
    @Autowired
    private ProductClassifyOneMapper productClassifyOneMapper;

    //查询所有一级标题
    @Override
    public List<ProductClassifyOne> queryAllProductClassifyOne() {
        return productClassifyOneMapper.findAllProductClassifyOne();
    }
}

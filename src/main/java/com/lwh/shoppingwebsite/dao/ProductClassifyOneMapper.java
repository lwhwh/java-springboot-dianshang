package com.lwh.shoppingwebsite.dao;

import com.lwh.shoppingwebsite.entity.ProductClassifyOne;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author : lwh
 * @Create : 2022/1/21
 * @Version:2022-01 -21-1
 */
/*
 产品分类一级Dao
 */
@Repository
@Mapper
public interface ProductClassifyOneMapper {

    List<ProductClassifyOne> findAllProductClassifyOne();//查询全部的商品分类一级标题

}

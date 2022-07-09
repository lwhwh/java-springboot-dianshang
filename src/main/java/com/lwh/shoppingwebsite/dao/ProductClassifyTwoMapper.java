package com.lwh.shoppingwebsite.dao;

import com.lwh.shoppingwebsite.entity.ProductClassifyTwo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author : lwh
 * @Create : 2022/1/24
 * @Version:2022-01 -24-1
 */
@Repository
@Mapper
public interface ProductClassifyTwoMapper{

    List<ProductClassifyTwo> findByProductClassifyOneId(int productclassifyoneid);
}

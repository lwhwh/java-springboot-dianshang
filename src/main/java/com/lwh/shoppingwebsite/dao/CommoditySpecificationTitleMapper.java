package com.lwh.shoppingwebsite.dao;

import com.lwh.shoppingwebsite.entity.CommoditySpecificationTitle;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author : lwh
 * @Create : 2022/2/13
 * @Version:2022-02 -13-1
 */
//商品规格
@Repository
@Mapper
public interface CommoditySpecificationTitleMapper {

    List<CommoditySpecificationTitle> getcommdidtyId(Integer commodityId);
}

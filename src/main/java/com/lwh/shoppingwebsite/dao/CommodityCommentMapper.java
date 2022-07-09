package com.lwh.shoppingwebsite.dao;

/**
 * @Author : lwh
 * @Create : 2022/5/11
 * @Version:2022-05 -11-1
 */

import com.lwh.shoppingwebsite.entity.CommodityComment;
import com.lwh.shoppingwebsite.entity.CommodityCommentReply;
import com.lwh.shoppingwebsite.util.AjaxResult;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface CommodityCommentMapper {
    List<CommodityComment> queryCommentCommodityId(int commodityId);//通过商品id查询评论

    int addCommodityComment(CommodityComment commodityComment);//添加评论

    int delCommodityComment(Integer id);//删除评论

    
}

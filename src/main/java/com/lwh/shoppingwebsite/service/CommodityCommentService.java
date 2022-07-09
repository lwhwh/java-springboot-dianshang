package com.lwh.shoppingwebsite.service;

import com.lwh.shoppingwebsite.entity.CommodityComment;
import com.lwh.shoppingwebsite.util.AjaxResult;
import io.swagger.models.auth.In;

import java.util.List;

/**
 * @Author : lwh
 * @Create : 2022/5/11
 * @Version:2022-05 -11-1
 */
public interface CommodityCommentService {
    List<CommodityComment> queryCommentCommodityId(int commodityId); //通过商品id查询评论


    AjaxResult addCommodityComment(CommodityComment commodityComment);//添加评论

    AjaxResult delCommodityComment(Integer id);//删除评论
}

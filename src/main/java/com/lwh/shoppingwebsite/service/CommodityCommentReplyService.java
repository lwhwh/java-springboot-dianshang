package com.lwh.shoppingwebsite.service;

import com.lwh.shoppingwebsite.entity.CommodityCommentReply;
import com.lwh.shoppingwebsite.util.AjaxResult;
import org.springframework.stereotype.Service;

/**
 * @Author : lwh
 * @Create : 2022/5/18
 * @Version:2022-05 -18-1
 */
public interface CommodityCommentReplyService {
    CommodityCommentReply queryCommodityCommentReply(Integer replyid, Integer commoditycommentidreplyid);//通过回复id和id查询商品


    AjaxResult addCommodityCommentReply(CommodityCommentReply commodityCommentReply);//添加评论

    AjaxResult delComentReply(Integer replyid);//删除评论
}

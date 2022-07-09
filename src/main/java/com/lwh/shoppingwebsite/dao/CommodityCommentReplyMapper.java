package com.lwh.shoppingwebsite.dao;

import com.lwh.shoppingwebsite.entity.CommodityCommentReply;
import com.lwh.shoppingwebsite.util.AjaxResult;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @Author : lwh
 * @Create : 2022/5/18
 * @Version:2022-05 -18-1
 */
@Repository
@Mapper
public interface CommodityCommentReplyMapper {
    CommodityCommentReply queryCommodityCommentReply(Integer replyid, Integer commoditycommentidreplyid);//通过回复id和id查询商品

    int addCommodityCommentReply(CommodityCommentReply commodityCommentReply);//添加评论

    int delComentReply(Integer replyid);//删除评论

}

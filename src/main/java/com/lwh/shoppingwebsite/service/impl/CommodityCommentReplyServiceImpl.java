package com.lwh.shoppingwebsite.service.impl;

import com.lwh.shoppingwebsite.dao.CommodityCommentMapper;
import com.lwh.shoppingwebsite.dao.CommodityCommentReplyMapper;
import com.lwh.shoppingwebsite.entity.CommodityCommentReply;
import com.lwh.shoppingwebsite.service.CommodityCommentReplyService;
import com.lwh.shoppingwebsite.util.AjaxResult;
import org.aspectj.weaver.loadtime.Aj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @Author : lwh
 * @Create : 2022/5/18
 * @Version:2022-05 -18-1
 */
@Service
public class CommodityCommentReplyServiceImpl implements CommodityCommentReplyService {
    @Autowired
    private CommodityCommentReplyMapper commodityCommentReplyMapper;

    //通过回复id和id查询商品
    @Override
    public CommodityCommentReply queryCommodityCommentReply(Integer replyid, Integer commoditycommentidreplyid) {
        return commodityCommentReplyMapper.queryCommodityCommentReply(replyid,commoditycommentidreplyid);
    }

    //添加评论
    @Override
    public AjaxResult addCommodityCommentReply(CommodityCommentReply commodityCommentReply) {
        AjaxResult ajaxResult = new AjaxResult();
        commodityCommentReply.setCommentdate(new Date());
        if(commodityCommentReplyMapper.addCommodityCommentReply(commodityCommentReply)>0){
            ajaxResult.setMessage("回复成功");
        }else {
            ajaxResult.setMessage("回复失败");
            ajaxResult.setSuccess(false);
        }
        return ajaxResult;
    }

    //删除评论
    @Override
    public AjaxResult delComentReply(Integer replyid) {
        AjaxResult ajaxResult = new AjaxResult();
        if(commodityCommentReplyMapper.delComentReply(replyid)>0){
            ajaxResult.setMessage("删除成功");
        }else {
            ajaxResult.setMessage("删除失败");
            ajaxResult.setSuccess(false);
        }
        return ajaxResult;
    }
}

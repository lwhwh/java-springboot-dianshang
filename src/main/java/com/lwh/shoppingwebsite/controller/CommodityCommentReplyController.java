package com.lwh.shoppingwebsite.controller;

import com.lwh.shoppingwebsite.entity.CommodityCommentReply;
import com.lwh.shoppingwebsite.service.CommodityCommentReplyService;
import com.lwh.shoppingwebsite.util.AjaxResult;
import org.aspectj.weaver.loadtime.Aj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author : lwh
 * @Create : 2022/5/18
 * @Version:2022-05 -18-1
 */
//商品回复
@Controller
@RequestMapping("/commodityCommentReply")
public class CommodityCommentReplyController {
    @Autowired
    private CommodityCommentReplyService commodityCommentReplyService;

    //通过回复id和id查询商品-没有用到
    @RequestMapping("/queryCommodityCommentReply")
    @ResponseBody
    private CommodityCommentReply queryCommodityCommentReply(Integer replyid,Integer commoditycommentidreplyid){
        CommodityCommentReply commodityCommentReply = commodityCommentReplyService.queryCommodityCommentReply(replyid,commoditycommentidreplyid);
        return commodityCommentReply;
    }

    //添加回复评论
    @RequestMapping("/addCommodityCommentReply")
    @ResponseBody
    private AjaxResult addCommodityCommentReply(CommodityCommentReply commodityCommentReply){
        AjaxResult ajaxResult = commodityCommentReplyService.addCommodityCommentReply(commodityCommentReply);
        return ajaxResult;
    }

    //删除回复评论
    @RequestMapping("/delComentReply")
    @ResponseBody
    private AjaxResult delComentReply(Integer replyid){
        AjaxResult ajaxResult = commodityCommentReplyService.delComentReply(replyid);
        return ajaxResult;
    }
}

package com.lwh.shoppingwebsite.controller;

import com.lwh.shoppingwebsite.entity.CommodityComment;
import com.lwh.shoppingwebsite.entity.CommodityCommentReply;
import com.lwh.shoppingwebsite.service.CommodityCommentService;
import com.lwh.shoppingwebsite.util.AjaxResult;
import com.lwh.shoppingwebsite.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

/**
 * @Author : lwh
 * @Create : 2022/5/11
 * @Version:2022-05 -11-1
 */
//商品信息评论
@Controller
@RequestMapping("/commoditycomment")
public class CommodityCommentController {

    @Autowired
    private CommodityCommentService commodityCommentService;

    //通过商品id查询当前商品的评论
    @RequestMapping("/queryCommentCommodityId")
    @ResponseBody
    private List<CommodityComment> queryCommentCommodityId(int commodityId){
       List<CommodityComment> commodityComments = commodityCommentService.queryCommentCommodityId(commodityId);
        for (int i=0;i<commodityComments.size();i++){
            for (CommodityCommentReply commodityCommentReply:commodityComments.get(i).getCommodityCommentReplies()){
                System.out.println(commodityCommentReply.toString());
            }
        }
        return commodityCommentService.queryCommentCommodityId(commodityId);
    }

    //添加评论
    @RequestMapping("/addCommodityComment")
    @ResponseBody
    private AjaxResult addCommodityComment(CommodityComment commodityComment){
        commodityComment.setCommentdate(new Date());
        return commodityCommentService.addCommodityComment(commodityComment);
    }

    //删除评论
    @RequestMapping("/delCommodityComment")
    @ResponseBody
    private AjaxResult delCommodityComment(Integer id){

        return commodityCommentService.delCommodityComment(id);
    }
}

package com.lwh.shoppingwebsite.service.impl;

import com.lwh.shoppingwebsite.dao.CommodityCommentMapper;
import com.lwh.shoppingwebsite.entity.CommodityComment;
import com.lwh.shoppingwebsite.service.CommodityCommentService;
import com.lwh.shoppingwebsite.util.AjaxResult;
import org.aspectj.weaver.loadtime.Aj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author : lwh
 * @Create : 2022/5/11
 * @Version:2022-05 -11-1
 */
@Service
public class CommodityCommentServiceImpl implements CommodityCommentService {
    @Autowired
    private CommodityCommentMapper commodityCommentMapper;

    //通过商品id查询评论
    @Override
    public List<CommodityComment> queryCommentCommodityId(int commodityId) {
        return commodityCommentMapper.queryCommentCommodityId(commodityId);
    }

    //添加评论
    @Override
    public AjaxResult addCommodityComment(CommodityComment commodityComment) {
        AjaxResult ajaxResult = new AjaxResult();
        if (commodityCommentMapper.addCommodityComment(commodityComment)>0){
                ajaxResult.setMessage("评论成功");
        }else {
            ajaxResult.setMessage("添加失败");
            ajaxResult.setSuccess(false);
        }
        return ajaxResult;
    }

    //删除评论
    @Override
    public AjaxResult delCommodityComment(Integer id) {
        AjaxResult ajaxResult = new AjaxResult();
        if(commodityCommentMapper.delCommodityComment(id)>0){
            ajaxResult.setMessage("删除成功");
        }else {
            ajaxResult.setMessage("删除失败");
            ajaxResult.setSuccess(false);
        }
        return ajaxResult;
    }
}

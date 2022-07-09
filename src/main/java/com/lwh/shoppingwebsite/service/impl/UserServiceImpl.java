package com.lwh.shoppingwebsite.service.impl;

import com.lwh.shoppingwebsite.dao.CommodityMapper;
import com.lwh.shoppingwebsite.dao.ConsigneeInfoMapper;
import com.lwh.shoppingwebsite.dao.UserMapper;
import com.lwh.shoppingwebsite.entity.User;
import com.lwh.shoppingwebsite.service.UserService;
import com.lwh.shoppingwebsite.util.AccountUtil;
import com.lwh.shoppingwebsite.util.AjaxResult;
import com.lwh.shoppingwebsite.util.Const;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * @Author : lwh
 * @Create : 2022/2/16
 * @Version:2022-02 -16-1
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private ConsigneeInfoMapper consigneeInfoMapper;
    //添加用户
    @Override
    public AjaxResult addUser(User user) {
        user.setAccount(AccountUtil.getaccountUtli(new Date(),"yyMMddHHmmssSS"));
        User user1 = userMapper.queryPhone(user.getPhone());//查询手机号是否存在
        AjaxResult ajaxResult = new AjaxResult();
        if(user1!=null){
            ajaxResult.setMessage("手机号已经被注册过了！");
            ajaxResult.setSuccess(false);
            return ajaxResult;
        }
        if (userMapper.addUser(user)>0){
            User user2 = userMapper.findAccountAndPassword(user);
             int i=consigneeInfoMapper.addconsigneeInfo(user2);//添加收货地址
            ajaxResult.setMessage("注册成功！你的账号为："+user.getAccount());
        }else {
            ajaxResult.setMessage("注册失败！");
            ajaxResult.setSuccess(false);
        }
        return ajaxResult;
    }

    //登录
    @Override
    public AjaxResult login(User user, HttpServletRequest request) {
        AjaxResult ajaxResult = new AjaxResult();
        User user1 =userMapper.findAccountAndPassword(user);
        if(user1!=null){
            request.getSession().setAttribute(Const.USER, user1);
            System.out.println(user1.toString());
        }else {
            ajaxResult.setMessage("账号或密码错误！");
            ajaxResult.setSuccess(false);
        }
        return ajaxResult;
    }
}

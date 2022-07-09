package com.lwh.shoppingwebsite.controller;

import com.lwh.shoppingwebsite.entity.User;
import com.lwh.shoppingwebsite.service.UserService;
import com.lwh.shoppingwebsite.util.AjaxResult;
import com.lwh.shoppingwebsite.util.Const;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author : lwh
 * @Create : 2022/2/16
 * @Version:2022-02 -16-1
 */
@Controller
@Api(tags = "/user",description = "这是一个用户控制器接口")
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    //查询用户是否登录
    @RequestMapping("/homePageUser")
    @ResponseBody
    private User homePageUser(HttpServletRequest request){
        User user =(User) request.getSession().getAttribute(Const.USER);
        return user;
    }

    //注册用户
    @RequestMapping("/registerUser")
    @ResponseBody
    private AjaxResult registerUser(User user){
        AjaxResult ajaxResult = userService.addUser(user);
        return ajaxResult;
    }

    //登录
    @RequestMapping("login")
    @ResponseBody
    private AjaxResult login(User user,HttpServletRequest request){
        System.out.println("进来了！");
        AjaxResult ajaxResult = userService.login(user,request);
        return ajaxResult;
    }
}

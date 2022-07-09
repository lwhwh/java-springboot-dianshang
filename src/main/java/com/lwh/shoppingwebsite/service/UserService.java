package com.lwh.shoppingwebsite.service;

import com.lwh.shoppingwebsite.entity.User;
import com.lwh.shoppingwebsite.util.AjaxResult;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author : lwh
 * @Create : 2022/2/16
 * @Version:2022-02 -16-1
 */
public interface UserService {
    AjaxResult addUser(User user);//添加用户

    AjaxResult login(User user, HttpServletRequest request);//登录
}

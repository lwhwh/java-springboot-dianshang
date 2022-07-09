package com.lwh.shoppingwebsite.dao;

import com.lwh.shoppingwebsite.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @Author : lwh
 * @Create : 2022/2/16
 * @Version:2022-02 -16-1
 */
@Repository
@Mapper
public interface UserMapper {
    int addUser(User user); //添加用户

    User findAccountAndPassword(User user);//登录

    User queryPhone(String phone);//查询手机号是否存在
}

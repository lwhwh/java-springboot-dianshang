package com.lwh.shoppingwebsite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author : lwh
 * @Create : 2022/1/19
 * @Version:2022-01 -19-1
 */
@Controller
@RequestMapping("/clothing")
public class Clothing {

    @GetMapping("/clothingtitle")
    @ResponseBody
    public Object clothingtitle(){
        System.out.println(123);
        List<String> list = new ArrayList<>();
        for (int i=0;i<7;i++){
            list.add("服装"+i);
        }
        return list;
    }
}

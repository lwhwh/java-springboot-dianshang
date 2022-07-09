package com.lwh.shoppingwebsite.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author : lwh
 * @Create : 2021/12/15
 * @Version:2021-12 -15-1
 */
public class AccountUtil {
    public static String getaccountUtli(Date date, String format){
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(date)+(int)(Math.random()*9999);
    }
}

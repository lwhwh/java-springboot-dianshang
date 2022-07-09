package com.lwh.shoppingwebsite.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author : lwh
 * @Create : 2022/2/28
 * @Version:2022-02 -28-1
 */
public class OrderListNumber {
    public static String getaccountUtli(Date date, String format){
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(date)+(int)(Math.random()*99999);
    }
}

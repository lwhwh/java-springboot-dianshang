package com.lwh.shoppingwebsite.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author : lwh
 * @Create : 2022/5/14
 * @Version:2022-05 -14-1
 */
public class DateUtil {
    public static String getDate(Date date, String format){
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(date);
    }
}

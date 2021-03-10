package com.jiangnanyidianyu.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName Utils
 * @Author: Qinnn、
 * @Description: TODO
 * @Date: create in 2020/9/25 15:02
 */
public class Utils {

    public static String LongToDateStr(Long l)
    {
        Date date = new Date(1436255550710l);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String strResult = format.format(date);
        return strResult;
    }

}

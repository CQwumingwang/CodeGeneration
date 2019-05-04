package com.wmw.generation.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName DateUtils
 * @Description TODO 时间工具类
 * @Author wumingwang
 * @Date 2019/5/2 17:11
 * @Version 1.0
 */
public class DateUtils {

    /**
     * 当前时间字符串
     * @return
     */
    public static String nowStr(){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return df.format(new Date());
    }
}

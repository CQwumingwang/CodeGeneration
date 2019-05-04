package com.wmw.generation.utils;

import com.wmw.generation.Constants;


/**
 * @ClassName StringUtils
 * @Description TODO 字符串工具类
 * @Author wumingwang
 * @Date 2019/5/2 17:09
 * @Version 1.0
 */
public class StringUtils {
    /**
     * 下划线格式字符串转换为驼峰格式字符串
     *
     * @param param
     * @return
     */
    public static String separatorToCamel(String param) {
        if (param == null || "".equals(param.trim())) {
            return "";
        }
        int len = param.length();
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++) {
            char c = param.charAt(i);
            if (c == Constants.SEPARATOR) {
                if (++i < len) {
                    sb.append(Character.toUpperCase(param.charAt(i)));
                }
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    /**
     * 截取两个字符之间的字符串内容
     * @param str 字符串原文
     * @param strStart 开始字符串
     * @param strEnd 结束字符串
     * @return
     */
    public static String interceptStr(String str,String strStart,String strEnd){
        int strStartIndex = str.indexOf(strStart);
        int strEndIndex = str.indexOf(strEnd);
        return str.substring(strStartIndex, strEndIndex).substring(strStart.length());
    }


    /**
     * 首字母转小写
     * @param s
     * @return
     */
    public static String toLowerCaseFirstOne(String s){
        if(Character.isLowerCase(s.charAt(0))) {
            return s;
        } else {
            return (new StringBuilder()).append(Character.toLowerCase(s.charAt(0))).append(s.substring(1)).toString();
        }
    }


    /**
     * 首字母转大写
     * @param s
     * @return
     */
    public static String toUpperCaseFirstOne(String s){
        if(Character.isUpperCase(s.charAt(0))) {
            return s;
        } else {
            return (new StringBuilder()).append(Character.toUpperCase(s.charAt(0))).append(s.substring(1)).toString();
        }
    }

}

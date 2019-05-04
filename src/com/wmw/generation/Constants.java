package com.wmw.generation;

import java.io.File;

/**
 * @ClassName Constants
 * @Description TODO 常量
 * @Author wumingwang
 * @Date 2019/5/2 17:02
 * @Version 1.0
 */
public class Constants {

    public static String DB_IP = "";
    public static String DB_PORT = "";
    public static String DB_USER = "";
    public static String DB_PASSWORD = "";
    public static String DB_DATABASE = "";

    public static String AUTHOR = "";

    public static String TEMPLATE_PATH = System.getProperty("user.dir") + File.separator + "template" + File.separator;

    public static String PACKAGE_ENTITY = "";
    public static String PACKAGE_MAPPER_CLASS = "";
    public static String PACKAGE_MAPPER_XML = "";
    public static String PACKAGE_SERVICE = "";
    public static String PACKAGE_SERVICE_IMPL = "";

    public static boolean SERVICE_ADDTO_PACKAGE = false;

    /**
     * 下划线转驼峰命名
     */
    public static char SEPARATOR = '_';

    /**
     * 生成代码根路径
     */
    public static String DIRECTORY = File.separator + "generation" + File.separator;

}

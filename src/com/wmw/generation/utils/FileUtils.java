package com.wmw.generation.utils;

import com.wmw.generation.Constants;

import java.io.*;

/**
 * @ClassName FileUtils
 * @Description TODO 文件工具类
 * @Author wumingwang
 * @Date 2019/5/2 16:59
 * @Version 1.0
 */
public class FileUtils {

    /**
     * 以行为单位读取文件，常用于读面向行的格式化文件
     * @param fileName 文件全路径名
     * @return
     */
    public static String readFileByLines(String fileName) {
        StringBuilder sb = new StringBuilder();
        File file = new File(fileName);
        InputStreamReader in = null;
        BufferedReader reader = null;
        try {
            in = new InputStreamReader(new FileInputStream(file),"UTF-8");
            reader = new BufferedReader(in);
            String tempString = null;
            // 一次读入一行，直到读入null为文件结束
            while ((tempString = reader.readLine()) != null) {
                sb.append(tempString+System.getProperty("line.separator"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                }
            }
            if(in != null){
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return sb.toString();
    }

    /**
     * 写文件
     * @param content 文件内容
     * @param packageStr 包路径
     * @param fileName 文件名
     */
    public static void writeFile(String content,String packageStr,String fileName){
        FileWriter writer = null;
        try {
            String path = Constants.DIRECTORY+packageStr.replace(".",File.separator);
            File parten =new File(path);
            if(!parten.exists()){
                parten.mkdirs();
            }
            path = path+File.separator+fileName;
            File javaFile=new File(path);
            if(!javaFile.exists()){
                javaFile.createNewFile();
            }
            writer = new FileWriter(path);
            writer.write("");
            writer.write(content);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(writer != null){
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

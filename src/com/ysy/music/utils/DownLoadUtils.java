package com.ysy.music.utils;

import java.io.File;
import java.util.HashMap;

public class DownLoadUtils {
    public static void getFileList(File file, HashMap<String,String>fileMap){
        File[]files=file.listFiles();
        for(File f:files){
                String filename=f.getName();
                //拿到下划线的下标
                int index=filename.indexOf("-");//indexOf(String str, int index): 返回从 index 位置开始查找指定字符str在字符串中第一次出现处的起始索引
                //从-的后面开始截，获取后面的源文件的名称
                String realName=filename.substring(index+1);
                //存储
                fileMap.put(filename,realName);
            }
        }
    }


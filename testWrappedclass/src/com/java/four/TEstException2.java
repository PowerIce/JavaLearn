package com.java.four;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TEstException2 {
    public static void main(String[] args) {
        FileReader reader = null;
        try {
            reader = new FileReader("/Users/bing/Desktop/testTxt.txt");
            char temp = (char)reader.read();
            System.out.println("文件内容："+temp);
        }catch (FileNotFoundException e){
            System.out.println("没有找到该文件");
            e.printStackTrace();
        }catch (IOException e){
            System.out.println("文件读取错误");
        }finally {
            System.out.println("有无异常，依然执行");
            try {
                if(reader!=null){
                    reader.close();
                }
            }catch ( IOException e) {
                e.printStackTrace();
            }
        }
    }
}
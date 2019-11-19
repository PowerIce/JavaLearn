package com.java.test1;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;

public class TestFile {
    public static void main(String[] args) {

        File f = new File("/Users/bing/Desktop/TestHtml");
        File f2 = new File("");
        File f3 = new File(f2,"");
        File f4 = new File(f2,"");
        File f5 = new File(f2,"");
//        Desktop.getDesktop().open(f);
        f5.mkdir();//不加s如果父目录存在则创建成功；不存在则失败
        f5.mkdirs();//无论父目录是否存在都能创建并自动补全目录
        try {
            f4.createNewFile();
        }catch (IOException e){
            e.printStackTrace();
        }

        f4.delete();
        if(f.isFile()){
            System.out.println("是一个文件");
        }
        if(f2.isDirectory()){
            System.out.println("是一个目录");
        }
    }
}

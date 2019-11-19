package com.java.four;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestReadFile {
    public static void main(String[] args) {
        String str = null;
        try {
            str = new TestReadFile().openFile();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }  catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(str);
    }
//    String openFile(){
//        try {
//            System.out.println("aaa");
//            FileInputStream fis = new FileInputStream("/Users/bing/Desktop/testxt.txt");
//            int a = fis.read();
//            System.out.println("bbb");
//            return "step1";
//        }catch (FileNotFoundException e){
//            e.printStackTrace();
//            return "step2";
//        }catch (IOException e){
//            e.printStackTrace();
//            return "step3";
//        }finally {
//            System.out.println("finally");
////            return "ffff";
//        }
//        //1。先执行try，catch  给返回值赋值
//        //2。执行 finally
//        //3。执行return（只执行一次，finally最好不要加return）
//    }
    String openFile() throws FileNotFoundException,IOException{
        FileReader reader = new FileReader("/Users/bing/Desktop/testTxt.txt");
        char c = (char)reader.read();
        System.out.println(c);
        return ""+c;
    }
}

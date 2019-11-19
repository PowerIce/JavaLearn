package com.java.four;

import java.io.File;
import java.io.FileNotFoundException;

public class MyException extends Exception {
    public MyException(){

    }
    public MyException(String message){
        super(message);
    }

    public static void main(String[] args) {
        File f = new File(" /Users/bing/Desktop/testxt.txt");
//        if(!f.exists()){
//            try{
//                throw new FileNotFoundException("File can't be fond!");
//            }catch ( FileNotFoundException e){
//                e.printStackTrace();
//            }
//        }///手动抛出异常  theow
    }
}
class TestMyException {
    void test() throws Exception{

    }
    public static void main(String[] args) {
        try {
            new TestMyException().test();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
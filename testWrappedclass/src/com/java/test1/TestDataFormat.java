package com.java.test1;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDataFormat {
    public static void main(String[] args) {
        DateFormat df = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss,F:E  年:ww周,月W周");
        Date d = new Date(1571279036882L);
        String str = df.format(d);
        System.out.println(str);

        String Str2 = "1994-04-13";
        DateFormat df2 = new SimpleDateFormat("yyyy-MM-dd");
        try{
            Date d2 = df2.parse(Str2);
            System.out.println(d2);
        }catch (ParseException e){
            e.printStackTrace();
        }
    }
}

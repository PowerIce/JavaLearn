package com.java.Day5Package;

import com.java.Day2.User;

import java.util.Date;

public class Text {
    public static void main(String[] args) {
        User user = new User();
        String str;
        Date data = new Date();
        Date data2 = new Date();//避免重名  直接写明引用包名
        java.sql.Date data3 = new java.sql.Date(1579834745);
    }
}

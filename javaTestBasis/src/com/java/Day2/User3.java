package com.java.Day2;

public class User3 {
    int id;
    String name;
    String pwd;
    static String company;
    static {//不属于方法 仅仅是语句块
        System.out.println("执行类的初始化工作");
        company = "米因大数据";
        printCompany();
    }
    public static void printCompany(){
        //login()static静态方法无法调取对象的信息和属性
        System.out.println(company);
    }
    public static void main(String[] args) {
        User3 u3 = null;
    }
}

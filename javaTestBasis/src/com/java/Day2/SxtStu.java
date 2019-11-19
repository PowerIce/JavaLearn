package com.java.Day2;

public class SxtStu {
    //属性 fields
    int age;
    String name;
    int id;

    Computer comp;

    //方法
    void study(){
        System.out.println("我要学习"+comp.brand);
    }
    void play(){
        System.out.println("我要玩一会儿");
    }
    //程序执行的入口，必须存在
    public static void main(String[] args) {
        SxtStu stu = new SxtStu();
        stu.id = 1001;
        stu.name = "小白";
        stu.age = 25;
        Computer c1 = new Computer();
        c1.brand = "apple";
        stu.comp = c1;
        stu.play();
        stu.study();
    }
}
class Computer{
    String brand;
}

package com.java.Day7;

public class Human {
    private int age;
    String name;
    protected int height;//protected修饰之后这个属性在同包的所有地方都能使用    不同包只有子类才能使用
    void sayAge(){
        System.out.println(age);
    }
}

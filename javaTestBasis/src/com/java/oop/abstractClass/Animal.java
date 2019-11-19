package com.java.oop.abstractClass;

public abstract class Animal {//抽象类只能被继承  不被继承将毫无意义
    String str;
    public abstract void run();//声明抽象方法  子类必须重写
    public void breath(){
        System.out.println("呼吸！");
        run();
    }
}
class Cat extends Animal{
    @Override
    public void run() {
        System.out.println("猫步小跑");
    }
}
class Dog extends Animal{
    @Override
    public void run() {
        System.out.println("狗跑步");
    }
}
package com.java.oop.abstractClass;

public class TestAbstract {
    public static void main(String[] args) {
        Animal a = new Cat();//new Animal()  抽象类不能被创建实例对象  必须通过创建子类来引用方法
        a.breath();
    }
}

package com.java.Day6;

public class TestSuper2 {
    public static void main(String[] args) {
        System.out.println("开始创建一个Child对象");
        new ChildClass2();
    }
}

class FatherClass2{
    public FatherClass2(){
        System.out.println("创建FatherClass对象");
    }
}

class ChildClass2 extends FatherClass2{
    public ChildClass2(){
        super();
        System.out.println("创建ChildClass对象");
    }
}

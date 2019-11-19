package com.java.Day6;

public class TestOverride {
    public static void main(String[] args) {
        House hou = new House();
        hou.run();
        hou.whoIsPeg();
    }
}

class Vehicle {
    public void run() {
        System.out.println("跑");
    }

    public void stop() {
        System.out.println("停止");
    }

    public Person whoIsPsg() {
        return new Person();
    }
}

class House extends Vehicle {
    public void run() {
        System.out.println("马跑起来驾驾驾驾！");
    }

    public Student whoIsPeg() {
        return new Student();
    }
//    @Override  //重写的返回值要<=重写的类
//    public Object whoIsPeg(){
//        return new Student();
//    }
}

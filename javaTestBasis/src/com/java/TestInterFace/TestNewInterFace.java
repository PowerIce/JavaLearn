package com.java.TestInterFace;

public class TestNewInterFace {
    public static void main(String[] args) {
//        FlyAble f = new FlyAble();//接口不能实例  只能通过子类
        FlyAble f = new Stone();
        f.fly();
        Stone s = (Stone)f;
        System.out.println(s.weigth);
    }
}

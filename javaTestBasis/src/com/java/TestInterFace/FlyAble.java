package com.java.TestInterFace;

public interface FlyAble {
    int MAX_SPEED = 11000;
    int MIN_HEIGHT = 1;
    void fly();
}
interface Attack{
    void attack();
}
class Plane implements FlyAble{
    @Override
    public void fly() {
        System.out.println("飞机依靠发动机飞");
    }
}
class Man implements FlyAble{
    @Override
    public void fly() {
        System.out.println("跳起来模拟飞行");
    }
}
class Stone implements FlyAble,Attack{
    int weigth;
    @Override
    public void fly() {
        System.out.println("被人扔出去飞 ");
    }

    @Override
    public void attack() {
        System.out.println("石头攻击别人");
    }
}

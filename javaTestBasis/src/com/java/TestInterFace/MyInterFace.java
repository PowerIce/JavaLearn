package com.java.TestInterFace;

public interface MyInterFace {//写接口的时候不能用class，要写interface
    //接口中只有常量和抽象方法
    /*public static final 接口中常量定义时，都有修饰符*/String MAX_GREAD = "BOSS";
    int MAX_SPEED = 120;

    //接口中必须公开方法
    public void test01();

    public int test02(int a, int b);
}

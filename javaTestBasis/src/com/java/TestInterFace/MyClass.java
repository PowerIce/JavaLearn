package com.java.TestInterFace;

public class MyClass implements MyInterFace {
    @Override
    public void test01() {
        //MyInterFace.MAX_GREAD;
        System.out.println("test01");
    }

    @Override
    public int test02(int a, int b) {
        System.out.println("tets02()");
        return a + b;
    }
}

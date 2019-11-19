package com.java.TestInterFace;

public interface InterFaceA {
    void aaa();
}
interface InterFaceB{
    void bbb();
}
interface InterFaceC extends InterFaceA,InterFaceB{//接口之间可以多继承
    void ccc();
}
class TestClass implements InterFaceC{
    @Override
    public void aaa() {

    }

    @Override
    public void bbb() {

    }

    @Override
    public void ccc() {

    }
}
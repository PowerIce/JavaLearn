package com.java.CallBack;

public class MyFrame {
    public void paint(){
        System.out.println("把自己窗口画出来");
    }
}
//public abstract class MyFrame {//使用抽象类子类就必须重写方法
//    public abstract void paint();
//}
interface IMyFrame{
    void paint();
}
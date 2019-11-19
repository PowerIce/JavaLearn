package com.java.Day2;

public class TestThis {
    int a,b,c;
    TestThis(int a,int b){
        this.a = a;
        this.b = b;
    }
    TestThis(int a,int b,int c){
        this(a,b);//表示调用当前的构造器，而且只能放在构造器的第一句
        this.c = c;
    }
    void sing(){

    }
    void eat(){
        this.sing();
        System.out.println("调用this");
    }

    public static void main(String[] args) {
        TestThis th = new TestThis(2,3);
        th.eat();
    }
}

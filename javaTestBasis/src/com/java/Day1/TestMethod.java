package com.java.Day1;

public class TestMethod {
    public static void main(String[] args) {
        //通过对象调用普通方法
        TestMethod tm = new TestMethod();
        tm.printTxt();
        int c = tm.add(30,40,50) + 1000;
        System.out.println(c);
    }
    //无返回值加入 void
    void printTxt(){
        System.out.println("打印信息");
    }
    int add(int a,int b, int c){
        int sum = a+b+c;
        System.out.println(sum);
        return sum;
    }
}

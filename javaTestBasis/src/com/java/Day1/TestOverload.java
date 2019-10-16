package com.java.Day1;

public class TestOverload {
    public static void main(String[] args) {

        System.out.println(add(1,2));
        System.out.println(add(1,2,3));
        System.out.println(add(1.2,3));
        System.out.println(add(1,3.4));
    }

    //方法加入static可直接调用，不加static则要先new一下方法  例如：TestOverload tl = new TestOverload(); tl.add();
    public static int add(int n1,int n2){
        int sum = n1 + n2;
        return sum;
    }
    public static int add(int n1,int n2,int n3){
        int sum = n1 + n2 + n3;
        return sum;
    }
    public static double add(double n1,int n2){
        double sum = n1 + n2;
        return sum;
    }
    public static double add(int n1,double n2){
        double sum = n1 + n2;
        return sum;
    }
    /*
    //不构成重载的条件  1。返回的数据类型不同
    public double add(int n1,int n2){
        double sum = n1 + n2;
        return sum;
    }
    //不构成重载的条件  2。参数名称不同
    public double add(int n1,double n2){
        double sum = n1 + n2;
        return sum;
    }
     */
}

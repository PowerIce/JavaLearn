package com.java.test1;
/*
*
* 测试自动装箱与自动拆箱
* */
public class Test02 {
    public static void main(String[] args) {
        Integer a = 1000; //JDK5.0之后的方法  自动装箱    编译器自动改进成为 Integer a = new Integer(1000);
        Integer b = 1000;

        int c = new Integer(1500); //编译器改进：new Integer(1500).intValue()

        Integer d = 1234;
        Integer d2 = 1234;
        System.out.println(d == d2);
        System.out.println(d.equals(d2));
        System.out.println("------------------------");
        Integer f = 129;
        Integer f2 = 129;
        System.out.println(f == f2);
        System.out.println(f.equals(f2));
    }
}

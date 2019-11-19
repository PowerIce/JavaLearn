package com.java.Day6;

public class TestObject {
    public static void main(String[] args) {
//        Object obj;
        TestObject to = new TestObject();
        System.out.println(to.toString());
        Person2 p2 = new Person2("小张",17);

        System.out.println(p2.toString());
    }

    public String toString(){
        return "测试Object.toString方法";
    }
}
class Person2{
    int age;
    String name;
    @Override
    public String toString(){
        return "年龄："+age+"\n姓名："+name;
    }
    public Person2(String name,int age){
        this.name = name;
        this.age = age;
    }
}

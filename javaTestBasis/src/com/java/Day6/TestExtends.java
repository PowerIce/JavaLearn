package com.java.Day6;

public class TestExtends {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.rest();
        Student stu2 = new Student("小张",158,"vue");
        stu2.study2();

        System.out.println(stu2 instanceof Student);//判断对象是否是这个类  继承关系也可以
        System.out.println(stu2 instanceof Person);//判断对象是否是这个类  继承关系也可以
        System.out.println(stu2 instanceof Object);//判断对象是否是这个类  继承关系也可以
        System.out.println(new Person() instanceof Student);//判断对象是否是这个类  父级不能对比子级

    }
}
class Person{
    String name;
    int height;
    public void rest(){
        System.out.println("我要休息一会儿！");
    }
}
//class Student{//没有调用的时候默认继承java.lang.Object
//    String name;
//    int height;
//    String major;
//    public void study(){
//        System.out.println("我要学习");
//    }
//    public void rest(){
//        System.out.println("我要休息一会儿");
//    }
//}

//类的继承写法    java只能继承一个父类，接口是可以多继承的  c++可以写多个。
class Student extends Person{
    String major;

    public void study() {
        System.out.println("我要学习两个小时！");
        System.out.println(name+"要学两个小时"+major);
    }
    public void study2() {
        System.out.println(name+"要学两个小时"+major);
    }

    public Student(){

    }
    public Student(String name,int height,String major){
        this.name = name;
        this.height = height;
        this.major = major;
    }
}

package com.java.Day7;

public class TestEncapsulation {
    public static void main(String[] args) {
        Human h = new Human();
        h.sayAge();
        h.height = 180;
//        h.age = 10; 不能调取其他类的所有私有化东西

        Person4 p4 = new Person4();
        p4.setName("小何");
        p4.setAge(19);
        System.out.println(p4.getAge());
    }
}
//class Human{
//    private int age;
//    void sayAge(){
//        System.out.println(age);
//    }
//}
class Boy extends Human{
    void sayHello(){
//        System.out.println(age);子类也无法使用父类的私有属性和方法Test
    }
}

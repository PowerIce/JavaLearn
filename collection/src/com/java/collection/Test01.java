package com.java.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Date;

public class Test01 {
    public static void main(String[] args) {
        List list = new ArrayList();
        //ArrayList底层实现是数组  线程不安全 效率高 查询速度快 操作（增删改查）慢
        // LinkedList()底层实现是链表  线程不安全 效率高 与ArrayList相反
        //Vector：线程安全  效率低
        list.add("aaa");
        list.add(new Date());
        list.add(new Dog());
        list.add(1234);
        System.out.println(list.size());
        System.out.println(list.isEmpty());

//        list.remove("aaa");
//        System.out.println(list.size());


        List list2 =new ArrayList();
        list2.add("bbb");
        list2.add("CCC");
        list.add(list2);
//        System.out.println(list.size());


        //顺序操作
       String str = (String) list.get(0);
        System.out.println(str);
        list.set(1,"asd");
        list.remove(0);

    }
}
class Dog{

}

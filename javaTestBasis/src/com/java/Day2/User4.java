package com.java.Day2;

public class User4 {
    int id;
    String name;
    String pwd;

    public User4(int id,String name){
        this.id = id;
        this.name = name;
    }
    public void testParameterRransfer1(User4 u){
        u.name = "礼拜天";
    }
    public void testParameterRransfer2(User4 u){
        u = new User4(200,"礼拜五");//此处已经改变成为了新建对象的地址
        System.out.println(u.name+"改变地址");
    }

    public static void main(String[] args) {
        User4 u1 = new User4(101,"礼拜六");
        System.out.println(u1.name);
        u1.testParameterRransfer1(u1);
        System.out.println(u1.name);

        u1.testParameterRransfer2(u1);
        System.out.println(u1.name);
    }
}

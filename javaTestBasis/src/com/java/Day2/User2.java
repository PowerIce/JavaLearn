package com.java.Day2;

public class User2 {
    int id;
    String name;
    String pwd;
    static String company = "米因大数据";
    public User2(int id, String name){
        super();//构造方法的第一句就是super();编译器会自动补充
        this.id = id;
        this.name = name;
    }
    public void login(){
        printCompany();//对象中的普通方法可以调取static静态的方法和属性
        System.out.println("登录"+name);
    }
    public static void printCompany(){
        //login()static静态方法无法调取对象的信息和属性
        System.out.println(company);
    }
    public static void main(String[] args) {
        User2 u1 = new User2(101,"老李");
        User2.printCompany();
        User2.company = "less";
        u1.login();
        User2.printCompany();
    }
}

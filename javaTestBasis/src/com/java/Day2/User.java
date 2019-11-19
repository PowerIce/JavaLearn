package com.java.Day2;

public class User {
    int id;
    String name;
    String pwd;

    public User(){

    }
    public User(int id,String name){
        super();//构造方法的第一句就是super();编译器会自动补充
        this.id = id;
        this.name = name;
    }
    public User(int id,String name,String pwd){
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }

    public static void main(String[] args) {
        User u1 = new User();
        User u2 = new User(101,"晓结");
        User u3 = new User(101,"小结","qwer12345");
    }
}

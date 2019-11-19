package com.java.oop.polymorphism.myservet;

public class TestServlet {
    public static void main(String[] args) {
        HttpServlet s = new MyServlet();
        s.service();//此处调用MyServlet.doGet()
    }
}

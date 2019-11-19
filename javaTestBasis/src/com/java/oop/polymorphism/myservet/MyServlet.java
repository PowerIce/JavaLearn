package com.java.oop.polymorphism.myservet;

public class MyServlet extends HttpServlet{
    @Override
    public void daGet() {
        System.out.println("MyServlet.doGet()");
    }
}

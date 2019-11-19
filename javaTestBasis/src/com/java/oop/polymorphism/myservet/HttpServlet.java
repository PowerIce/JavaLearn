package com.java.oop.polymorphism.myservet;

public class HttpServlet {
    public void service(){
        System.out.println("httpServlet.service()");
        daGet();
    }
    public void daGet(){
        System.out.println("httpServlet.daGet()");
    }
    public void daPost(){
        System.out.println("httpServlet.daPost()");
    }
}

package com.java.four;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class TestException {
    public void method() throws IOException {

    }
}
class A extends TestException{
    public void method() throws IOException, FileNotFoundException{

    }
}
class B extends TestException{
    public void method(){

    }
}
//
class D extends TestException{
    public void method() throws FileNotFoundException{

    }
}
class E extends TestException{
    public void method() throws IOException, ArithmeticException{

    }
}
//class F extends TestException{
//    public void method() throws IOException, ParseException {
//
//    }
//}
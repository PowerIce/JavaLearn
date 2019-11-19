package com.java.eleven;

public class TestString {
    public static void main(String[] args) {
        String s1 = new String("QWER");
        String s2 = new String("QWER");
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);

        String s3 = "ASD";
        String s4 = "ASD";
        System.out.println(s3.equals(s4));
        System.out.println(s3 == s4);
    }
}

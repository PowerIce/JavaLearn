package com.java.Day1;
import  java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入名字");
        String name = scanner.nextLine();
        System.out.println("请输入你的爱好");
        String favor = scanner.nextLine();
        System.out.println("请输入你的名字");
        int age = scanner.nextInt();
        System.out.println(name);
        System.out.println(favor);
        System.out.println(age);
    }
}
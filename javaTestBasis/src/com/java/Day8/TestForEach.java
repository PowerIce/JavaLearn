package com.java.Day8;

public class TestForEach {
    public static void main(String[] args) {
        int[] a = new int[5];
        for(int i = 0;i < a.length;i++){
            a[i] = 100 * i;
        }
        for(int i = 0;i < a.length;i++){
            System.out.println(a[i]);
        }

        for(int m:a){
            System.out.println(m );
        }

        String[] s = {"小董","小韩","小张","小李","小陈","小郝"};

        for(String name:s){
            System.out.println(name);
        }

    }
}

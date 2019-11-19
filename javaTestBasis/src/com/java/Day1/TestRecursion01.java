package com.java.Day1;

public class TestRecursion01 {
    public static void main(String[] args) {
//        a();
        long d1 = System.currentTimeMillis();
        System.out.println(factorial(10));
        long d2 = System.currentTimeMillis();
        System.out.println(d2 - d1);

        factorialLoop(10);

    }
    static  int count = 0;
    static void a(){
        System.out.println("a");
        count++;
        if(count < 10){
            a();
        }else {
            return;
        }
    }
    static void b(){
        System.out.println("b");
    }
    static long factorial(int n){
         if(n == 1){
             return 1;
         }else {
             return n * factorial(n - 1);
         }
    }
    static long factorialLoop(int a){
         long d3 = System.currentTimeMillis();
         long result = 1;
         while (a > 1){
             result *= a *  (a - 1);
             a -= 2;
         }
         long d4 = System.currentTimeMillis();
        System.out.println("while循环耗时"+ (d4 - d3));
        return result;

    }

}

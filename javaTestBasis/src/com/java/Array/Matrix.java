package com.java.Array;

public class Matrix {
    public static void print(int [][] c){

    }
    public static void main(String[] args) {
        int [][] a = {
                {1,3},
                {2,4}
        };
        int [][] b = {
                {3,4},
                {5,6}
        };
        int [][] c = new int[2][2];
        c[0][0] = a[0][0]+b[0][0];
        c[0][1] = a[0][1]+b[0][1];
        for(int i = 0;i < c.length;i++){
            for(int j = 0;j < c.length;j++){
                c[i][j] = a[i][j]+b[i][j];
                System.out.println(c[i][j]);
            }
        }
        System.out.println(c);
    }
}

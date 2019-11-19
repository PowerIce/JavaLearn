package com.java.TestString;
/*StringBuilder线程不安全 效率高   StringBuffer线程安全 效率低*/
public class Test01 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();//初始长度为16
        StringBuilder sb1 = new StringBuilder(32);//初始长度为32
        StringBuilder sb2 = new StringBuilder("abcd");//初始长度为32 value[] = {"a","b","c","d",\u0000,\u0000,......}
        sb2.append("efg");
        sb2.append(true);
        System.out.println(sb2);

        System.out.println("##############");

        StringBuilder gh = new StringBuilder("a");
        for(int i = 0;i < 100;i++){
            gh.append(i);
        }
        System.out.println(gh);
    }
}

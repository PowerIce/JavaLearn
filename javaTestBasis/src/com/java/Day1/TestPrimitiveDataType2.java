package com.java.Day1;
import java.math.BigDecimal;

public class TestPrimitiveDataType2 {
    public static void main(String[] args) {
        float a = 3.14f;
        double b = 6.28;
        double c = 628E-2;

        System.out.println(c);

        float f = 0.1f;
        double d = 1.0/10;
        System.out.println(f == d);
        //比较浮点数的方法 java.math BigInteger和BigDecimal；

        BigDecimal bd = BigDecimal.valueOf(1.0);
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        System.out.println(bd);
        System.out.println(1.0-0.1-0.1-0.1-0.1-0.1);

        BigDecimal bd2 = BigDecimal.valueOf(0.1);
        BigDecimal bd3 = BigDecimal.valueOf(1.0/10);
        System.out.println(bd2.equals(bd3));

    }
}

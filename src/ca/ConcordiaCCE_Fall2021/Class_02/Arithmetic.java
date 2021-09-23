package ca.ConcordiaCCE_Fall2021.Class_02;

import java.math.BigDecimal;

public class Arithmetic {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;

        int c = a + b;
       // double d = a / b;
        double e = 5.0 / 2 *2;
        double f = (double)5 / 2;

        System.out.println(c);
        //System.out.println(d);
        System.out.println(e);
        System.out.println(f);

       // int x = 4;
       // long y = 22;
       // int z = x + (int)y;

        // Powers and Exponents

        double p = Math.pow(4.0, 2.0);

        System.out.println(p);

        double radius = 5;
        double circleArea = Math.pow(Math.PI * radius, 2.0);
        System.out.println(circleArea);

        BigDecimal costOfMeal = new BigDecimal("22.29");
        System.out.println(costOfMeal);




    }
}

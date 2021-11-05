package ca.ConcordiaCCE_Fall2021.Class_15;

import java.util.Arrays;

public class ArrayMethods {
    public static void main(String[] args) {

        int[] sample = new int[10];

        Arrays.fill(sample, 6);
        Arrays.fill(sample, 4, 7, 8);

        System.out.println(Arrays.toString(sample));

        //When using .equals with arrays use Arrays.equals(ex1, ex2) not ex1.equals(ex2)



    }
}

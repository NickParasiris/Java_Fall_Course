package ca.ConcordiaCCE_Fall2021.Class_13;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayChallenge {

    static int[] sampleSet = new int[10];

    public static void main(String[] args) {

        // 1: Display using all the elements in this array
        for (int x = 0; x < sampleSet.length; x++)
        {
            sampleSet[x] = (int)(Math.random() * 100);
//            System.out.println(sampleSet[x]);  Works
        }

        System.out.println("The elements in the array are:");
        System.out.println(Arrays.toString(sampleSet)); // Better


        // 2: Find out what is the highest and lowest number in the array.
        // then print them at the end

        System.out.println();

        int maxNum = sampleSet[0];
        int minNum = sampleSet[0];

        for (int a : sampleSet)
        {
            maxNum = Math.max(maxNum, a);
            minNum = Math.min(minNum, a);
        }

        System.out.println("Max number is " + maxNum);
        System.out.println("Min number is " + minNum);

        Arrays.sort(sampleSet);
        System.out.println("Max number is " + sampleSet[sampleSet.length - 1]);
        System.out.println("Min number is " + sampleSet[0]);
    }

}

package ca.ConcordiaCCE_Fall2021.Class_09;

import java.util.Scanner;

public class Exercise16_2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first number");
        int n1 = s.nextInt();
        System.out.println("Enter the second number");
        int n2 = s.nextInt();

        int answer = GCD(n1, n2);
        System.out.println("The Greatest common denominator of " + n1+ " and " + n2 + " is " + answer);
    }

    public static int GCD(int firstNum, int secondNum)
    {
        int start = Math.min(firstNum , secondNum);
        int end = 1;

        for (int x = start; x >= end; x--)
        {
            if (firstNum % x == 0 && secondNum % x == 0)
            {
                return x;
            }

        }
        return 0;
    }
}

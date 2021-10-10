package ca.ConcordiaCCE_Fall2021.Class_08;

import java.util.Scanner;

public class biggest_of_the_three {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        int firstNum = sc.nextInt();
        System.out.println("Now, enter the second number: ");
        int secondNum = sc.nextInt();
        System.out.println("Finally, enter the third number: ");
        int thirdNum = sc.nextInt();

        System.out.println(largestOfThree(firstNum, secondNum, thirdNum));
    }

    public static int largestOfThree(int first, int second, int third)
    {
        if (first > second && first > third)
        {
            return first;
        }

        if (second > third)
        {
            return second;
        }

        return third;
    }
}

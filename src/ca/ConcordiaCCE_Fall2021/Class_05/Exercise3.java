package ca.ConcordiaCCE_Fall2021.Class_05;

import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an integer.");
        int answer = sc.nextInt();

        boolean answer5 = answer % 5 == 0;
        boolean answerEven = answer % 2 == 0;

        if (answer5) {
            System.out.println("Hi5");
        }

        if (answerEven) {
            System.out.println("HiEven");
        }
    }
}

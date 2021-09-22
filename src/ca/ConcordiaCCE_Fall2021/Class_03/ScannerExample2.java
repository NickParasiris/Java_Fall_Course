package ca.ConcordiaCCE_Fall2021.Class_03;

import java.util.Scanner;

public class ScannerExample2 {
    public static void main(String[] args) {

        Scanner numberScanner = new Scanner(System.in);
        int firstNumber;
        int secondNumber;

        System.out.println("Please enter the first number.");
        firstNumber = numberScanner.nextInt();

        System.out.println("Now, please enter the second number.");
        secondNumber = numberScanner.nextInt();


        String Answer = "The two numbers added equal " + (firstNumber + secondNumber);
        System.out.println(Answer);

    }
}

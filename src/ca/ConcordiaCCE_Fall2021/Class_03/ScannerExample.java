package ca.ConcordiaCCE_Fall2021.Class_03;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {

        Scanner nameScanner = new Scanner(System.in);
        String firstName;
        String lastName;

        System.out.println("Please enter your first name.");
        firstName = nameScanner.nextLine();

        System.out.println("Now, please enter your last name.");
        lastName = nameScanner.nextLine();


        String fullName =("Hello, " + firstName + " " + lastName + ".");
        System.out.println(fullName);
    }
}

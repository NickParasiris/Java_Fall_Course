package ca.ConcordiaCCE_Fall2021.Class_06;

import java.util.Scanner;

public class q_to_quit {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a word, enter Q to quit:");
        String response;


        do {
            response = s.nextLine();
            if (!response.equalsIgnoreCase("Q")) {
                System.out.println("You entered " + response);
            }
        } while (!response.equalsIgnoreCase("Q"));


    }
}

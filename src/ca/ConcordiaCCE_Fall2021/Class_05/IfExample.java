package ca.ConcordiaCCE_Fall2021.Class_05;

import java.util.Scanner;
public class IfExample {
    public static void main(String[] args) {

        int votingAge = 18;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age here");
        int age = sc.nextInt();

        boolean canVote = age >= votingAge;
        int yearsToVote = (votingAge - age);
        boolean yearBefore = age == 17;


        if (canVote)  {
            System.out.println("You can vote!!");
        }

        else if (yearBefore) {
            System.out.println("Better luck next year");
        }

        else {
            System.out.println("Better luck in " + yearsToVote + " " + "years.");
        }

//        if (!canVote)
//        {
//            System.out.println("Better luck in " + yearsToVote + " " + "years.");
//        }






    }
}

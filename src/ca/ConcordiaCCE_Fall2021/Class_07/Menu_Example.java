package ca.ConcordiaCCE_Fall2021.Class_07;

import java.util.Scanner;

public class Menu_Example {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String response;
        String response2 = null;

        String mainMenusText = "Main Menu\n" +
                "A) Square a number\n" +
                "B) Math menu\n" +
                "Q) Quit program";

        String mathMenuText = "Math Menu\n" +
                "A) Negate a number\n" +
                "B) Double a number\n" +
                "Q) Quit to Main menu";

        String Prompt = "Selection >";


        while (true)
        {
            System.out.println(mainMenusText);
            System.out.println(Prompt);
            response = s.nextLine();
            System.out.println();

            if (response.equalsIgnoreCase("A"))
            {
                System.out.println("Ok, Square a number.");
                System.out.println("Enter a number to square >");
                response = s.nextLine();

                double num = Double.parseDouble(response);
                System.out.println("The number squared is: " + Math.pow(num, 2.0));
            }

            if (response.equalsIgnoreCase("B"))
            {
                while (true)
                {
                    System.out.println(mathMenuText);
                    System.out.println(Prompt);
                    response2 = s.nextLine();
                    System.out.println();


                    if (response2.equalsIgnoreCase("A"))
                    {
                        System.out.println("Enter a number to negate >");
                        double num2 = s.nextDouble();
                        double numNegate = num2 * -1;
                        System.out.println(numNegate);

                    }

                    if (response2.equalsIgnoreCase("B"))
                    {
                        System.out.println("Enter a number to double >");
                        double num3 = s.nextDouble();
                        double numDouble = num3 * 2;
                        System.out.println(numDouble);
                    }

                    if (response2.equalsIgnoreCase("Q"))
                    {
                        break;
                    }

                }
            }

            if (response.equalsIgnoreCase("Q"))
            {
                System.out.println("Thank you for using this program.");
                break;
            }
        }



    }
}

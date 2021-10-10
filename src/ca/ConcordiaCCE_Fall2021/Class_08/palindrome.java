package ca.ConcordiaCCE_Fall2021.Class_08;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {

//        String myString = "Hello";
//
//        int stringLength = myString.length();
//
//        String secondLetter = myString.substring(1, 2);
//
//        System.out.println(stringLength);
//
//        System.out.println(secondLetter);

        Scanner sc = new Scanner(System.in);
        String palindromeCheck = sc.nextLine();
        int palindromeLength = palindromeCheck.length();
        boolean isPalindrome = true;

        for (int x = 0; x < palindromeLength / 2; x++)
        {
            int rightChar = palindromeLength - x - 1;
            char left = palindromeCheck.charAt(x);
            char right = palindromeCheck.charAt(rightChar);

            if (left != right)
            {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome)
        {
            System.out.println("Is a palindrome.");
        } else
        {
            System.out.println("Is not a palindrome.");
        }





//        for (palindromeCheck = sc.nextLine();



    }
}

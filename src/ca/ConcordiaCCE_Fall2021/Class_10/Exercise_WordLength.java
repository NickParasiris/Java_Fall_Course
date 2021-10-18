package ca.ConcordiaCCE_Fall2021.Class_10;

import java.util.Scanner;

public class Exercise_WordLength {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Please enter a word or sentence.");
        String sentence = s.nextLine();

        String last = lastWord(sentence);
        int lastLength = lastWord(sentence).length();

        System.out.println(last);
        System.out.println("The length of the last word is " + lastLength);

    }

    public static String lastWord(String input)
    {
        input = input.trim();

        int start = 0;
        int end = input.length() - 1;

        for (int x = end; x >= 0; x--)
        {
            if (input.charAt(x) == ' ' || input.charAt(x) == start)
            {
                start = x + 1;
                break;
            }
        }

        return input.substring(start, end + 1);

    }
}

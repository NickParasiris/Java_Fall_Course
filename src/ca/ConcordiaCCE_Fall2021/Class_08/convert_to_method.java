package ca.ConcordiaCCE_Fall2021.Class_08;

import java.util.Scanner;

public class convert_to_method {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();

        int sumFromFunction = addThings(first, second);
        String response = "The sum of these numbers are ";

        System.out.println(response + sumFromFunction);
    }

    public static int addThings(int start, int end)
    {
        int sum = 0;

        for(int x = start; x <= end; x++)
        {
            sum += x;
        }

        return sum;
    }


}

package ca.ConcordiaCCE_Fall2021.Class_09;

import java.util.Scanner;

public class overloading2 {
    public static void main(String[] args) {

        System.out.println(addingMachine(2, 2.0));



    }

    public static double addingMachine(double x, double y)
    {
        double z = x + y;
        return z;
    }

    public static double addingMachine(int x, double y)
    {
        double z = x + y;
        return z;
    }

    public static int addingMachine(int x, int y)
    {
        int z = x + y;
        return z;
    }




}

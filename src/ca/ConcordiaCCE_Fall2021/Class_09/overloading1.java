package ca.ConcordiaCCE_Fall2021.Class_09;

public class overloading1 {
    public static void main(String[] args) {

        printSalutation();
        printSalutation("Salute!");
        //printSalutation(123);
        printSalutation("Hello", 8);

    }
    public static void printSalutation(String salute, int numberTimes)
    {
        for (int x = 0; x < numberTimes; x++)
        {
            System.out.println(salute);
        }
        System.out.println();
    }

    public static void printSalutation()
    {
        System.out.println("Hello");
    }

    public static void printSalutation(String salute)
    {
        System.out.println(salute);
    }
}

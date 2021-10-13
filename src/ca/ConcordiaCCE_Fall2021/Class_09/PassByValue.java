package ca.ConcordiaCCE_Fall2021.Class_09;

public class PassByValue {
    public static int increaseNumber(int n)
    {
        n++;

        return n;
    }

    public static void main(String[] args) {
        int n = 0;
        n = increaseNumber(n);
        System.out.println(n);

    }





}

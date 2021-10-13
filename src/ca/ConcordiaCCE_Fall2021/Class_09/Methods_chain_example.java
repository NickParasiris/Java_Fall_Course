package ca.ConcordiaCCE_Fall2021.Class_09;

public class Methods_chain_example {

    public static void main(String[] args) {
        System.out.println(A("Hello"));

    }

    public static String A(String val1)
    {
        return B(val1) + "A";
    }

    public static  String B(String val1)
    {
        return val1 + "B";
    }
}

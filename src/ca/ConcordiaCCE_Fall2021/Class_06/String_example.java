package ca.ConcordiaCCE_Fall2021.Class_06;

public class String_example {


    public static void main(String[] args) {

        String s1 = "ABC";
        String s2 = new String("ABC");

//        System.out.println(s1 == s2);

        boolean isEqual = s1.equals(s2);

        if (isEqual)
        {
            System.out.println("Strings are equal");
        }
        else
        {
            System.out.println("Strings are not equal");
        }


    }
}

package ca.ConcordiaCCE_Fall2021.Class_17;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegexPractice {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);

        System.out.println("""
                Password Rules:
                1. between 3 and 10 characters
                2. Must contain a capital letter
                3. Must contain a number
                4. Must contain a symbol
                Please enter the password here >""");

        String newPass = s.nextLine();

        boolean securePassword = true;

        List<String> verifications = new ArrayList<>();
        verifications.add(".*[A-Z].*");
        verifications.add(".*\\d.*");
        verifications.add(".*[\\*\\!\\^\\$\\@].*");
        verifications.add("^.{3,10}$");

        for (String x : verifications)
        {
            if(!newPass.matches(x))
            {
                securePassword = false;
                break;
            }
        }



//        if (!newPass.matches(".*[A-Z].*") ||
//                !newPass.matches(".*\\d.*") ||
//                !newPass.matches(".*[\\*\\!\\^\\$\\@].*") ||
//                !newPass.matches("^.{3,10}"))
//        {
//            securePassword = false;
//        }


        System.out.print("Your password is ");

        System.out.println(securePassword ? "SECURE" : "INSECURE");






    }


}

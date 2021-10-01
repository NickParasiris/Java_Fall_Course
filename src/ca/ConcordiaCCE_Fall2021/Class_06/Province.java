package ca.ConcordiaCCE_Fall2021.Class_06;

import java.util.Scanner;

public class Province {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your province code.");
        String provinceName;
        String provinceCode = sc.nextLine();

        //Teacher Code
        switch (provinceCode.toUpperCase().trim())
        {
            case "QC":
            case "PQ":
                provinceName = "Quebec";
                break;
            case "ON":
                provinceName = "Ontario";
                break;
            case "AB":
                provinceName = "Alberta";
                break;
            case "BC":
                provinceName = "British Colombia";
                break;
            default:
                provinceName = "Not Found";
        }
        System.out.println("The province you have entered is " + provinceName);

        //My code
//        switch (Province)
//        {
//            case "QC":
//            case "PQ":
//                System.out.println("Quebec");
//                break;
//            case "ON":
//                System.out.println("Ontario");
//                break;
//            case "AB":
//                System.out.println("Alberta");
//                break;
//            default:
//                System.out.println("Not Found");
//        }

    }
}

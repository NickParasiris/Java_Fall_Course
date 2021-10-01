package ca.ConcordiaCCE_Fall2021.Class_06;

import java.text.NumberFormat;

public class case_statement {
    public static void main(String[] args) {

        NumberFormat c = NumberFormat.getCurrencyInstance();

        double salary = 78000.00;
        char employeeType = 'M'; // M = Management, R = Regular, T = Temp
        double bonus = 0.0;

        switch (employeeType)
        {
            case 'R':
                bonus = .1;   //If you want 2 different employee types with the same bonus
                break;        //case 'R':
            case 'M':        //case 'M':
                bonus = .05; //bonus = .05;
                break;
            default:
                bonus = .01;
        }

        double finalSalary = bonus * salary;

        System.out.println("Bonus is equal to " + c.format(finalSalary));
    }
}

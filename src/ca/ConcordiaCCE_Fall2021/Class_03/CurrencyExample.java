package ca.ConcordiaCCE_Fall2021.Class_03;

import java.text.NumberFormat;

public class CurrencyExample {
    public static void main(String[] args) {

        //Currency
        double salary = 2310.211;

        NumberFormat n = NumberFormat.getCurrencyInstance();
        String formattedSalary = n.format(salary);
        System.out.println(formattedSalary);

        //Percentage
        double passingGrade = .6;

        NumberFormat p = NumberFormat.getPercentInstance();
        String formattedPercentage = p.format(passingGrade);
        System.out.println(formattedPercentage);



        //Numbers
        double gasLevel = 123456.1234;

        NumberFormat g = NumberFormat.getNumberInstance();
        g.setMaximumFractionDigits(3);
        String formattedGas = g.format(gasLevel);
        System.out.println(formattedGas);





    }
}

package ca.ConcordiaCCE_Fall2021.Class_04;

import java.text.NumberFormat;
import java.util.Scanner;

public class ItemPrices {
    public static void main(String[] args) {

        Scanner taxCalculator = new Scanner(System.in);

        double prices;
        int amountPurchased;
        //Added subTotal, totalPrice and formatted price to make the code more clean
        double subTotal;
        double totalPrice;
        String formattedPrice;
        //Changed the taxes to a variable
        double gst = .05;
        double qst = .09975;

        System.out.println("Enter price of your purchase.");
        prices = taxCalculator.nextDouble();

        System.out.println("Enter the amount that you purchased.");
        amountPurchased =  taxCalculator.nextInt();

        subTotal = (prices * amountPurchased);
        totalPrice = subTotal +(subTotal * qst) + (subTotal * gst);
        formattedPrice = NumberFormat.getCurrencyInstance().format(totalPrice);

        String Answer = "Your purchase comes to a total of " + (formattedPrice);
        System.out.println(Answer);










    }
}

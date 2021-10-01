package ca.ConcordiaCCE_Fall2021.Class_06;

public class enhanced_switch {
    public static void main(String[] args) {

        char productCode = 'X';
        String productName = null;


        switch (productCode)
        {
            case 'A', 'B' -> productName = "Apple";
            case 'X' -> productName = "X-Ray";
            case 'Y' -> productName = "Yeti";
            default ->  productName = null;
        }
        System.out.println("Your company is " + productName);
    }
}

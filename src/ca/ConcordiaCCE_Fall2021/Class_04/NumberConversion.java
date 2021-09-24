package ca.ConcordiaCCE_Fall2021.Class_04;

public class NumberConversion {
    public static void main(String[] args) {

        //Covert to a value
        String ageText = "22";
        int age = Integer.parseInt(ageText);



        //Convert to String
        int daysBeforeTest = 6;
        String daysText = Integer.toString(daysBeforeTest);

        // How to use Quotes in Strings
        String movie = "My favorite movie is \"Blade Runner\".";
        System.out.println(movie);

        String ex = "Back slash looks like \\.";
        System.out.println(ex);

        String twoLines = " Line one \n Line two \n Line three";
        System.out.println(twoLines);

        String tabs = "A\tB\tC\t";
        System.out.println(tabs);





    }
}

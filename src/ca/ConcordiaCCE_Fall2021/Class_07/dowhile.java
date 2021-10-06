package ca.ConcordiaCCE_Fall2021.Class_07;

public class dowhile {
    public static void main(String[] args) {

        //#1 While
        int counter1 = 0;
        while (counter1 <= 10)
        {
            System.out.println(counter1);
            counter1 += 2;
        }

        //#2 Do while
        int counter2 = 0;
        do {
        System.out.println(counter2);
            counter2 += 2;
        }
        while (counter2 <= 10);


        //#3 While with modulus
        int counter3 = 0;
        while (counter3 <= 10)
        {
            counter3++;
            if (counter3 % 2 == 0)
            {
                System.out.println(counter3);
            }
        }
    }
}

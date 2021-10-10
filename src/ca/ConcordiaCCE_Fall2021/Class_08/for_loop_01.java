package ca.ConcordiaCCE_Fall2021.Class_08;

public class for_loop_01 {
    public static void main(String[] args) {

        String spacing = "########################";

        for (int x = 5; x <= 15; x++)
        {
            System.out.println(x);
        }

        System.out.println(spacing);

        for (int z = 1; z <= 20; z += 2)
        {
            System.out.println(z);
        }

        System.out.println(spacing);

        for (int y = 5; y <=50; y += 5)
        {
            System.out.println(y);
        }

        System.out.println(spacing);

        for (int b = 20; b >= 10; b--)
        {
            System.out.println(b);
        }
    }
}

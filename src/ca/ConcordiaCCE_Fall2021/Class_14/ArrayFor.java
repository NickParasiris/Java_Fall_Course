package ca.ConcordiaCCE_Fall2021.Class_14;

public class ArrayFor {
    public static void main(String[] args) {

        String[] colours = new String[] {"Blue", "Red", "Yellow", "Green", "Black", "White"};

        for (int x = 0; x < colours.length; x++)
        {
            System.out.print(colours[x]);

            if (x < colours.length - 1)
            {
                System.out.print(", ");
            }
        }

        for (String c : colours)
        {
            System.out.print(c);
        }


    }
}

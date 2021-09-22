package ca.ConcordiaCCE_Fall2021.Class_03;

public class Ex5 {
    public static void main(String[] args) {

        float C1 = 30.00f;
        float F1 = 76.00f;

        float c1_in_f = 0.0f;
        float f1_in_c = 0.0f;

        c1_in_f = (9f / 5) * C1 + 32;
        f1_in_c = (F1 - 32f) / (9 / 5f);

        System.out.println("30C in F is:");
        System.out.println(c1_in_f);

        System.out.println("76F in C is:");
        System.out.println(f1_in_c);

    }
}

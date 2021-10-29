package ca.ConcordiaCCE_Fall2021.Class_13;

public class StudentManagerApp {
    public static void main(String[] args) {

        Student.SetLastId(10);

        Student st1 = new Student("Nick", "Parasiris", "PAR12345");
        Student st2 = new Student("Mark", "Zuc", "ZUC12345");

        System.out.println(st1.getId());
        System.out.println(st2.getId());


    }
}

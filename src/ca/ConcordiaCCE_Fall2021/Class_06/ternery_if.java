package ca.ConcordiaCCE_Fall2021.Class_06;

public class ternery_if {
    public static void main(String[] args) {

        double testGrade = 67.8;

//        if (testGrade >= 60.00)
//        {
//            System.out.println("Student Passed");
//        } else
//        {
//            System.out.println("Student didn't pass");
//        }

        String message = testGrade >= 60 ?
                "Student Passed" :
                "Student didn't pass";

        System.out.println(message);

        char employeeType = 'P';  // 'F'

        //Bonus is 3000 for par time and 6000 for all others

        double bonus = employeeType == 'P' ? 3000 : 6000;

        System.out.println(bonus);



    }
}


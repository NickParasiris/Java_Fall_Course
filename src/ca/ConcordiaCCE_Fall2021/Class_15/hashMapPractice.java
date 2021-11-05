package ca.ConcordiaCCE_Fall2021.Class_15;

import ca.ConcordiaCCE_Fall2021.Class_13.Student;

import java.util.HashMap;

public class hashMapPractice {
    public static void main(String[] args) {

        HashMap<String, String> provinces = new HashMap<>();

        provinces.put("QC", "Quebec");
        provinces.put("ON", "Ontario");
        provinces.put("NS", "Nova Scotia");

        System.out.println("The province for QC is " + provinces.get("QC"));

        for (String x : provinces.values())
        {
            System.out.println(x);
        }

        Student s1 = new Student("Nick", "Parasiris", "Para12345");
        Student s2 = new Student("Mark", "Zuc", "ZUC12345");
        Student s3 = new Student("Sara", "Mathew", "Math12345");

        HashMap<Integer, Student> studentList = new HashMap<>();

        studentList.put(s1.getId(), s1);
        studentList.put(s2.getId(), s2);
        studentList.put(s3.getId(), s3);

        Student targetStudent = studentList.get(2);
        System.out.println(targetStudent.toString());

    }
}

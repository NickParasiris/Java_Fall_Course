package ca.ConcordiaCCE_Fall2021.Class_15;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();

        myList.add("ONE");
        myList.add("a");
        myList.add("b");

        myList.add(1, "X");

        String myval = myList.get(1);
        System.out.println(myval);

        System.out.println(myList.indexOf("b"));

        System.out.println(myList);

    }
}

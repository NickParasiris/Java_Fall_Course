package ca.ConcordiaCCE_Fall2021.Class_09;

public class non_static {
    public static void main(String[] args) {

        Calculator c = new Calculator();

        Calculator c2 = new Calculator();

        c.x = 2;
        c.y = 3;

        c2.x = 7;
        c2.y = c.x;

        System.out.println(c.addNum());
        System.out.println(c2.addNum());
    }
}
// Encapsulation
// Inheritance
// Abstraction
// Polymorphism

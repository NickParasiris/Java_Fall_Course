package ca.ConcordiaCCE_Fall2021.Class_11;

public class UseCircle {
    public static void main(String[] args) {

        Circle c = new Circle(10, "blue", true);
        System.out.println(c.getArea());

        c.setRadius(20);
        System.out.println(c.getArea());

//        c.radius = 10;
//        c.colour = "blue";
//        c.isVisible = true;
//
//        Circle c2 = new Circle();
//        c2.radius = 20;
//        System.out.println(c2.getArea());
    }
}

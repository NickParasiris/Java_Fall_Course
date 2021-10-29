package ca.ConcordiaCCE_Fall2021.Class_11.ShapeEntities;

public class Circle extends Shape{

    private double radius;

    public Circle(String name, String colour, double radius) {
        super(name, colour);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.pow(Math.PI * this.radius, 2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}' + super.toString();
    }
}

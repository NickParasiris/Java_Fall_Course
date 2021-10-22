package ca.ConcordiaCCE_Fall2021.Class_11;

public class Circle {

    private double radius;
    private String colour;
    private boolean isVisible;

    public Circle(double r, String c, boolean v)
    {
        this.radius = r;
        this.colour = c;
        this.isVisible = v;
    }

    public Circle()
    {}

    //Getter for the radius

    public double getRadius()
    {
        return this.radius;
    }

    //Setter for radius

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public double getArea()
    {
        return Math.pow(Math.PI * radius, 2);
    }
}

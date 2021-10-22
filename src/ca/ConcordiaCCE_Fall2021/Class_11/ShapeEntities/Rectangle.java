package ca.ConcordiaCCE_Fall2021.Class_11.ShapeEntities;

public class Rectangle extends Square{

    private double height;

    public Rectangle(String name, String colour, double width, double height) {
        super(name, colour, width);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return this.width * this.height;
    }

}

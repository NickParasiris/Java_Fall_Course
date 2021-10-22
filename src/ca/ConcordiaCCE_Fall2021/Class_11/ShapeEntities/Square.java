package ca.ConcordiaCCE_Fall2021.Class_11.ShapeEntities;

public class Square extends Shape{

    protected double width;

    public Square(String name, String colour, double width) {
        super(name, colour);
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea(){
        return Math.pow(this.width, 2);
    }

}
package ca.ConcordiaCCE_Fall2021.Class_11.ShapeEntities;

public abstract class Shape {

    private String name;
    private String colour;

    public Shape(String name, String colour) {
        this.name = name;
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected abstract double getArea();
}

package ca.ConcordiaCCE_Fall2021.Class_11.ShapeEntities;

import java.util.Objects;

public abstract class Shape {

    private String name;
    private String colour;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Shape shape)) return false;
        return Objects.equals(getName(), shape.getName()) && Objects.equals(getColour(), shape.getColour());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getColour());
    }

    @Override
    public String toString()
    {
        return "I am a shape, my colour is " + this.colour + " and my name is " + this.name;
    }


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

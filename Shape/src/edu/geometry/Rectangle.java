package edu.geometry;

public class Rectangle implements Shape {

    //  Fields for length and Width
    private final double length;
    private final double width;


    //  Constructor for rectangle
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}
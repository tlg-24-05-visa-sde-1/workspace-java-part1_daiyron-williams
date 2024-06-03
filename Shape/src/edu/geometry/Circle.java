package edu.geometry;

public class Circle
implements Shape {

    // Field for radius
    private final double radius;

    //  Constructors
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(getRadius(), 2);   //  gets the area of a circle when the client gives the radius
    }

    public double getRadius() {
        return radius;
    }
}
package edu.geometry;

public class Triangle implements Shape {
    private final double side1;
    private final double side2;
    private final double angle;

    public Triangle(double side1, double side2, double angle) {
        this.side1 = side1;
        this.side2 = side2;
        this.angle = angle;
    }

    @Override
    public double getArea() {
        double angleInRadians = Math.toRadians(angle);
        return 0.5 * (side1 + side2 + angleInRadians);
    }

}
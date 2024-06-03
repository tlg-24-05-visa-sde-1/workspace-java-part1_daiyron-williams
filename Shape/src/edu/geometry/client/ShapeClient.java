package edu.geometry.client;

import edu.geometry.Circle;

public class ShapeClient {
    public static void main(String[] args) {

        Circle shape1 = new Circle(5.0);
        System.out.println("The area is " + shape1.getArea());
    }

}
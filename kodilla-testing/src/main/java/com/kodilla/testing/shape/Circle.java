package com.kodilla.testing.shape;

public class Circle implements Shape {

    private double radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public void getShapeName() {
        System.out.println("Circle");
    }

    public double getField() {
        double pi = 3.141592653589793238;
        return pi*radius*radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "circle";
    }
}

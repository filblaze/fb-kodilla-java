package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public void getShapeName() {
        System.out.println("Triangle");
    }

    public double getField() {
        return base*height/2;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "triangle";
    }
}

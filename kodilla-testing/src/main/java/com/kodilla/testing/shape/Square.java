package com.kodilla.testing.shape;

public class Square implements Shape {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    public void getShapeName() {
        System.out.println("Square");
    }

    public double getField() {
        return side*side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public String toString() {
        return "square";
    }

}

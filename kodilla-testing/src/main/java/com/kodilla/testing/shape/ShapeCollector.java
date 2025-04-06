package com.kodilla.testing.shape;

import java.util.*;

public class ShapeCollector {

    private List<Shape> shapeList = new ArrayList<>();

    public ShapeCollector() {
    }

    public void addFigure(Shape shape) {
        shapeList.add(shape);
    }

    public int getShapeCount() {
        return shapeList.size();
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if (shapeList.contains(shape)) {
            shapeList.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n) {
        Shape shape = null;
        if (n >= 0 && n < shapeList.size()) {
            shape = shapeList.get(n);
        }
        return shape;
    }

    public String showFigures() {
        String result = null;
        if (shapeList.size() > 0) {
            result = shapeList.toString();
        }
        return result;
    }
}

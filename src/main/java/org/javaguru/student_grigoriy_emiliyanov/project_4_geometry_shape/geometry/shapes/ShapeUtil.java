package org.javaguru.student_grigoriy_emiliyanov.project_4_geometry_shape.geometry.shapes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class ShapeUtil {
    private Random random = new Random();

    Circle createRandomCircle() {
        double radius = random.nextDouble();
        return new Circle("Circle " + radius, radius);
    }

    Square createRandomSquare() {
        double side = random.nextDouble();
        return new Square("Square " + side, side);
    }

    Rectangle createRandomRectangle() {
        double a = random.nextDouble();
        double b = random.nextDouble();
        return new Rectangle("Rectangle " + a + "x" + b, a, b);
    }

    Shape createRandomShape() {
//        целое число: 0 - круг, 1 - квадрат, 2 - прямоугольник).
        int choiceBound = 3;
        int choice = random.nextInt(choiceBound);
        if (choice == 0) return createRandomCircle();
        if (choice == 1) return createRandomSquare();
        return createRandomRectangle();
    }

    double calculateArea(Shape[] shapes) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.calculateArea();
        }
        return totalArea;
    }

    double calculatePerimeter(Shape[] shapes) {
        double totalPerimeter = 0;
        for (Shape shape : shapes) {
            totalPerimeter += shape.calculatePerimeter();
        }
        return totalPerimeter;
    }

    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }

    List<Shape> findEquals(List<Shape> allShapes, Shape shapeToCompare) {
        List<Shape> equalShapes = new ArrayList<>();
        for (Shape shape : allShapes) {
            if (shape.equals(shapeToCompare)) {
                equalShapes.add(shape);
            }
        }
        return equalShapes;
    }
}

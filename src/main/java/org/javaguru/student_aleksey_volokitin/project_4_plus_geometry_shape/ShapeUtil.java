package org.javaguru.student_aleksey_volokitin.project_4_plus_geometry_shape;


import java.util.ArrayList;
import java.util.Random;
import java.util.List;

class ShapeUtil {
    Circle createRandomCircle() {
        Random random = new Random();
        int randomRadius = random.nextInt(5) + 1;
        return new Circle("Random circle", randomRadius);
    }

    Square createRandomSquare() {
        Random random = new Random();
        int randomSide = random.nextInt(5) + 1;
        return new Square("Random square", randomSide);
    }

    Rectangle createRandomRectangle() {
        Random random = new Random();
        int randomSideA = random.nextInt(5) + 1;
        int randomSideB = random.nextInt(5) + 1;
        return new Rectangle("Random rectangle", randomSideA, randomSideB);
    }

    Shape createRandomShape() {
        Random rnd = new Random();
        int randomNumber = rnd.nextInt(3);
        if (randomNumber == 0) {
            return createRandomCircle();
        } else if (randomNumber == 1) {
            return createRandomSquare();
        } else {
            return createRandomRectangle();
        }
    }

    double calculateArea(Shape[] shapes) {
        double areaOfShapes = 0.0d;
        for (Shape shape : shapes) {
            areaOfShapes += shape.calculateArea();
        }
        return areaOfShapes;
    }

    List<Shape> findEquals(List<Shape> allShapes, Shape shapeToCompare) {
        List<Shape> equalShapes = new ArrayList<>();
        for (Shape shape: allShapes) {
            if(shape.equals(shapeToCompare)) {
                equalShapes.add(shapeToCompare);
            }
        }
        return equalShapes;
    }
    double calculatePerimeter(Shape[] shapes) {
        double perimeterOfShapes = 0.0d;
        for (Shape shape : shapes) {
            perimeterOfShapes += shape.calculatePerimeter();
        }
        return perimeterOfShapes;
    }

    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }

    Shape shape1 = new Circle("11", 4);
    Shape shape2 = new Circle("11", 5);
    boolean ww = shape1.equals(shape2);

}

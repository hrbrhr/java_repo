package org.javaguru.student_aleksey_volokitin.lesson_9_inheritance.homework.day_5_plus;

import java.util.Random;

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

    EquilateralTriangle createRandomEquilateralTriangle() {
        Random random = new Random();
        int randomSide = random.nextInt(5) + 1;
        return new EquilateralTriangle("Random equilateral triangle", randomSide);
    }

    Shape createRandomShape() {
        Random rnd = new Random();
        int randomNumber = rnd.nextInt(4);
        if (randomNumber == 0) {
            return createRandomCircle();
        } else if (randomNumber == 1) {
            return createRandomSquare();
        } else if (randomNumber == 2) {
            return createRandomRectangle();
        } else {
            return createRandomEquilateralTriangle();
        }
    }

    double calculateArea(Shape[] shapes) {
        double areaOfShapes = 0.0d;
        for (Shape shape: shapes) {
            areaOfShapes += shape.calculateArea();
        }
        return areaOfShapes;
    }

    double calculatePerimeter(Shape[] shapes) {
        double perimeterOfShapes = 0.0d;
        for (Shape shape: shapes) {
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
}

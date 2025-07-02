package org.javaguru.student_elena_tiutiunnikova.project_4_geometry_shape;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class ShapeUtil {

    private Random random = new Random();

    public Circle createRandomCircle() {
        double radius = Math.random();
        return new Circle("Circle", radius);
    };

    public Square createRandomSquare() {
        double lengthOfTheSide = Math.random();
        return  new Square("Square", lengthOfTheSide);
    };

    public Rectangle createRandomRectangle() {
        double lengthOfTheSideA = Math.random();
        double lengthOfTheSideB = Math.random();
        return new Rectangle("Rectangle", lengthOfTheSideA, lengthOfTheSideB);
    };

    public Shape createRandomShape(){
        int randomShape = random.nextInt(3);
        if (randomShape == 0) {
            return createRandomCircle();
        } else if (randomShape == 1) {
            return createRandomSquare();
        } else {
            return createRandomRectangle();
        }
    };

    public double calculateArea(Shape[] shapes) {
        double sumOfAreas = 0;
        for (Shape shape : shapes) {
          sumOfAreas = sumOfAreas + shape.calculateArea();
        }
        return sumOfAreas;
    }

    public double calculatePerimeter(Shape[] shapes) {
        double sumOfPerimeters = 0;
        for (Shape shape : shapes) {
            sumOfPerimeters = sumOfPerimeters + shape.calculatePerimeter();
        }
        return sumOfPerimeters;
    }

    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    List<Shape> findEquals(List<Shape> allShapes, Shape shapeToCompare) {
        List<Shape> result = new ArrayList<>();
        for (Shape shape : allShapes) {
            if (shape.equals(shapeToCompare)) {
                result.add(shape);
            }
        } return result;
    }

    public static void main(String[] args) {
        List<Shape> shapes = List.of(
                new Circle("A", 2.0),
                new Rectangle("B", 5.1, 10.5),
                new Square("C", 3.9)
        );

        ShapeUtil shapeUtil = new ShapeUtil();
        Shape shapeToCompare = new Circle("A", 2.0);
        List<Shape> matches = shapeUtil.findEquals(shapes, shapeToCompare);
        System.out.println(matches.size());
    }
}

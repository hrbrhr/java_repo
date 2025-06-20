package org.javaguru.mentor.project_4_geometry_shape.task_16.geometry.shapes;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

class ShapeUtil {

    private Random random = new Random();

    public Circle createRandomCircle() {
        double radius = random.nextDouble(10);
        return new Circle("Circle", radius);
    }

    public Square createRandomSquare() {
        double side = random.nextDouble(10);
        return new Square("Square", side);
    }

    public Rectangle createRandomRectangle() {
        double a = random.nextInt(10);
        double b = random.nextInt(10);
        return new Rectangle("Rectangle", a, b);
    }

    public Shape createRandomShape() {
        int randomNumber = random.nextInt(3);
        if (randomNumber == 0) {
            return createRandomCircle();
        } else if (randomNumber == 1) {
            return createRandomSquare();
        } else {
            return createRandomRectangle();
        }
    }

    public double calculateArea(Shape[] shapes){
        double areaSum = 0;
        for (Shape shape : shapes) {
            areaSum = areaSum + shape.calculateArea();
        }
        return areaSum;
    }

    public double calculatePerimeter(Shape[] shapes){
        double perimeterSum = 0;
        for (Shape shape : shapes) {
            perimeterSum = perimeterSum + shape.calculatePerimeter();
        }
        return perimeterSum;
    }

    public double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    public double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }

    public List<Shape> findEquals(List<Shape> allShapes,
                                  Shape shapeToCompare) {
        return allShapes.stream()
                .filter(shape -> shape.equals(shapeToCompare))
                .collect(Collectors.toList());
    }

}

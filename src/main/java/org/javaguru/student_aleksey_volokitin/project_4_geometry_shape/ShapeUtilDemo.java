package org.javaguru.student_aleksey_volokitin.project_4_geometry_shape;

import java.util.ArrayList;
import java.util.List;

class ShapeUtilDemo {
    public static void main(String[] args) {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape circle = shapeUtil.createRandomCircle();
        double circleArea = shapeUtil.calculateArea(circle);
        double circlePerimeter = shapeUtil.calculatePerimeter(circle);
        System.out.println("Share: " + circle.getTitle() +
                           ", radius: " + circle.getRadiusSide() +
                           ", area: " + circleArea +
                           ", perimeter: " + circlePerimeter);
        
        Shape randomShape = shapeUtil.createRandomShape();
        double shapeArea = shapeUtil.calculateArea(randomShape);
        double shapePerimeter = shapeUtil.calculatePerimeter(randomShape);
        System.out.println("Share: " + randomShape.getTitle() +
                           ", radius/side: " + randomShape.getRadiusSide() +
                           ", area: " + shapeArea +
                           ", perimeter: " + shapePerimeter);

        List<Shape> shapes = new ArrayList<>();
            shapes.add(new Square("Square1", 4.8));
            shapes.add(new Circle("Circle", 4.6));
            shapes.add(new Circle("Circle", 4.7));
            shapes.add(new Square("Square", 4.6));
            shapes.add(new Square("Square1", 4.8));

        //Shape circle1  = new Circle("Circle", 4.6);
        Shape square1  = new Square("Square1", 4.8);
        //List<Shape> equalsShapes = shapeUtil.findEquals(shapes, circle1);
        List<Shape> equalsShapes = shapeUtil.findEquals(shapes, square1);
        if(!equalsShapes.isEmpty()) {
            System.out.println("Equal shapes:");
            for(Shape shape:equalsShapes) {
                System.out.println("Title: " + shape.getTitle() +
                                   ", radius: " + shape.getRadiusSide());
            }
        }
        else {
            System.out.println("Equal shapes not found");
        }


    }
}

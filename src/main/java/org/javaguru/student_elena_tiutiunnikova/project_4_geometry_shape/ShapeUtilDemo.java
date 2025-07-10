package org.javaguru.student_elena_tiutiunnikova.project_4_geometry_shape;

class ShapeUtilDemo {
    public static void main(String[] args) {
        ShapeUtil shapeUtil = new ShapeUtil();

        Shape circle = shapeUtil.createRandomCircle();
        double circleArea = shapeUtil.calculateArea(circle);
        double circlePerimeter = shapeUtil.calculatePerimeter(circle);
        System.out.println("Circle Area = " + shapeUtil.calculateArea(circle));
        System.out.println("Circle Perimeter = " + shapeUtil.calculatePerimeter(circle));

        Shape square = shapeUtil.createRandomSquare();
        double squareArea = shapeUtil.calculateArea(square);
        double squarePerimeter = shapeUtil.calculatePerimeter(square);
        System.out.println("Square Area = " + squareArea);
        System.out.println("Square Perimeter = " + squarePerimeter);

        Shape rectangle = shapeUtil.createRandomRectangle();
        double rectangleArea = shapeUtil.calculateArea(rectangle);
        double rectanglePerimeter = shapeUtil.calculatePerimeter(rectangle);
        System.out.println("Rectangle Area = " + rectangleArea);
        System.out.println("Rectangle Perimeter = " + rectanglePerimeter);
    }

}

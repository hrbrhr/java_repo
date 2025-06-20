package org.javaguru.mentor.project_4_geometry_shape.task_14.geometry.shapes;

class ShapeUtilDemo {
    public static void main(String[] args) {
        ShapeUtil shapeUtil = new ShapeUtil();

        Shape circle = shapeUtil.createRandomCircle();
        double circleArea = shapeUtil.calculateArea(circle);
        double circlePerimeter = shapeUtil.calculatePerimeter(circle);
        System.out.println("Circle area = " + circleArea);
        System.out.println("Circle perimeter = " + circlePerimeter);

        Shape square = shapeUtil.createRandomSquare();
        double squareArea = shapeUtil.calculateArea(square);
        double squarePerimeter = shapeUtil.calculateArea(square);
        System.out.println("Square area = " + squareArea);
        System.out.println("Square perimeter = " + squarePerimeter);

        Shape rectangle = shapeUtil.createRandomRectangle();
        double rectangleArea = shapeUtil.calculateArea(rectangle);
        double rectanglePerimeter = shapeUtil.calculateArea(rectangle);
        System.out.println("Rectangle area = " + rectangleArea);
        System.out.println("Rectangle perimeter = " + rectanglePerimeter);
    }

}

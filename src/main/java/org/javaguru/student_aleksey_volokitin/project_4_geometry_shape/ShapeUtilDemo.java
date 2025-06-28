package org.javaguru.student_aleksey_volokitin.project_4_geometry_shape;

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

    }
}

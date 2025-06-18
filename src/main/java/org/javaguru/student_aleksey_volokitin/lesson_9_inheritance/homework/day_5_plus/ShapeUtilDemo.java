package org.javaguru.student_aleksey_volokitin.lesson_9_inheritance.homework.day_5_plus;

class ShapeUtilDemo {
    public static void main(String[] args) {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape circle = shapeUtil.createRandomCircle();
        System.out.println(circle.toString());
        
        Shape square = shapeUtil.createRandomSquare();
        System.out.println(square.toString());
        
        Shape rectangle = shapeUtil.createRandomRectangle();
        System.out.println(rectangle.toString());

        Shape equilateralTriangle = shapeUtil.createRandomEquilateralTriangle();
        System.out.println(equilateralTriangle.toString());
    }
}

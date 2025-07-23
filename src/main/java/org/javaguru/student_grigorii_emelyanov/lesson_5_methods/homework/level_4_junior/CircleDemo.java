package org.javaguru.student_grigorii_emelyanov.lesson_5_methods.homework.level_4_junior;

class CircleDemo {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("Area (r = 2.0) = " + circle.calculateArea(2.0));
        System.out.println("Area (r = 3.0) = " + circle.calculateArea(3.0));
        System.out.println("Area (r = 4.0) = " + circle.calculateArea(4.0));

        System.out.println("Perimeter (r = 2.0) = " + circle.calculatePerimeter(2.0));
        System.out.println("Perimeter (r = 3.0) = " + circle.calculatePerimeter(3.0));
        System.out.println("Perimeter (r = 4.0) = " + circle.calculatePerimeter(4.0));
    }
}

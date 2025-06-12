package org.javaguru.student_alexey_yakovlev.lesson_5.homework.level_4_junior.task_1;

class CalculateCircleApp {

    public static void main(String[] args) {
        CalculateCircle calculateCircle = new CalculateCircle();

        double radius1 = 2;
        double radius2 = 3;
        double radius3 = 4;

        System.out.println("Area: " + calculateCircle.calculateArea(radius1));
        System.out.println("Area: " + calculateCircle.calculateArea(radius2));
        System.out.println("Area: " + calculateCircle.calculateArea(radius3));

        System.out.println();

        System.out.println("Perimeter: " + calculateCircle.calculatePerimeter(radius1));
        System.out.println("Perimeter: " + calculateCircle.calculatePerimeter(radius2));
        System.out.println("Perimeter: " + calculateCircle.calculatePerimeter(radius3));
    }
}

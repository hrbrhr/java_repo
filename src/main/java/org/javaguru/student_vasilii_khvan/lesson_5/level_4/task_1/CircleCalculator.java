package org.javaguru.student_vasilii_khvan.lesson_5.level_4.task_1;

class CircleCalculator {

    double calcArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    double calcPerimeter(double radius) {
        return 2 * Math.PI * radius;
    }
}

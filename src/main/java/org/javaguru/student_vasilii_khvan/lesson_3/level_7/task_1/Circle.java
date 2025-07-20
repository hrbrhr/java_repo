package org.javaguru.student_vasilii_khvan.lesson_3.level_7.task_1;

class Circle {

    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * (radius * radius);
    }

}

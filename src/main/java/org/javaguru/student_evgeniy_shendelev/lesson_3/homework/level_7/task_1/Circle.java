package org.javaguru.student_evgeniy_shendelev.lesson_3.homework.level_7.task_1;

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    double calculateArea() {
        return Math.pow(radius, 2.0) * Math.PI;
    }
}

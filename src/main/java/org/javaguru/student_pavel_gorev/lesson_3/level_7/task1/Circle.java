package org.javaguru.student_pavel_gorev.lesson_3.level_7.task1;

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

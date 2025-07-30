package org.javaguru.student_grigoriy_emiliyanov.lesson_9_inheritance.homework.day_4;

class Circle extends Shape {
    private double radius;

    Circle(String title, double radius) {
        super(title);
        this.radius = radius;
    }
    @Override
    double calculateArea() {
        return 0;
    }

    @Override
    double calculatePerimeter() {
        return 0;
    }
}

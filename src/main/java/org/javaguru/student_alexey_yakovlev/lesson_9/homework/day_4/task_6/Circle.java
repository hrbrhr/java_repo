package org.javaguru.student_alexey_yakovlev.lesson_9.homework.day_4.task_6;

class Circle extends Shape {

    private double radius;

    Circle(String title, double radius) {
        super(title);
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double calculatePerimetr() {
        return 2 * Math.PI * radius;
    }
}

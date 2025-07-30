package org.javaguru.student_grigoriy_emiliyanov.lesson_9_inheritance.homework.day_4;

abstract class Shape {

    private String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();
    abstract double calculatePerimeter();
}

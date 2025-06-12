package org.javaguru.student_aleksey_volokitin.lesson_9_inheritance.homework.day_4_plus;

abstract class Shape {

    private String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();
    abstract double calculatePerimeter();

}

package org.javaguru.student_alexey_yakovlev.lesson_9.homework.day_4.task_3;

abstract class Shape {

    private String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();
    abstract double calculatePerimetr();
}

package org.javaguru.student_alexey_yakovlev.lesson_9.homework.day_4.task_6;

 class Square extends Shape {

    private double sideLength;

    public Square(String title, double sideLength) {
        super(title);
        this.sideLength = sideLength;
    }

    @Override
    double calculateArea() {
        return Math.pow(sideLength, 2);
    }

    @Override
    double calculatePerimetr() {
        return sideLength * 4;
    }

}

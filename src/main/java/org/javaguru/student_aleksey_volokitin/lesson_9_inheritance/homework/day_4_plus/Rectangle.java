package org.javaguru.student_aleksey_volokitin.lesson_9_inheritance.homework.day_4_plus;

class Rectangle extends Shape {

    private double sideA;
    private double sideB;

    Rectangle(String title, double sideA, double sideB) {
        super(title);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double calculateArea() {
        return (double) sideA * sideB;
    }

    public double calculatePerimeter() {
        return (double) 2 * (sideA + sideB);
    }
}
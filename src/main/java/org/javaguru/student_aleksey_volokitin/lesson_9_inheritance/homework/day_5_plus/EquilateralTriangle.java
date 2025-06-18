package org.javaguru.student_aleksey_volokitin.lesson_9_inheritance.homework.day_5_plus;

class EquilateralTriangle extends Shape {

    private double side;

    EquilateralTriangle(String title, double side) {
        super(title);
        this.side = side;
    }

    public double calculateArea() {
        return (side * side * Math.sqrt(3.0)) / (double) 4;
    }

    public double calculatePerimeter() {
        return (double) 3 * side;
    }

    @Override
    public String toString() {
        return "Equilateral triangle side: " + this.side +
                ", area: " + calculateArea() +
                ", perimeter: " + calculatePerimeter();
    }
}
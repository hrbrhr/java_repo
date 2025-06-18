package org.javaguru.student_aleksey_volokitin.lesson_9_inheritance.homework.day_5_plus;

class Square extends Shape {

    private double side;

    Square(String title, double side) {
        super(title);
        this.side = side;
    }

    public double calculateArea() {
        return (double) side * side;
    }

    public double calculatePerimeter() {
        return (double) 4 * side;
    }

    @Override
    public String toString() {
        return "Square side: " + this.side +
                ", area: " + calculateArea() +
                ", perimeter: " + calculatePerimeter();
    }
}
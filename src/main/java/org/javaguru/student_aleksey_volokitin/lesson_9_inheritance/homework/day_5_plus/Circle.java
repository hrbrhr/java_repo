package org.javaguru.student_aleksey_volokitin.lesson_9_inheritance.homework.day_5_plus;

class Circle extends Shape {

    private double radius;

    Circle(String title, double radius) {
        super(title);
        this.radius = radius;
    }

    public double calculateArea() {
        return (double) Math.PI * radius * radius;
    }

    public double calculatePerimeter() {
        return (double) 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle radius: " + this.radius +
               ", area: " + calculateArea() +
               ", perimeter: " + calculatePerimeter();
    }
}
package org.javaguru.student_grigoriy_emiliyanov.lesson_3_oop_first_look.homework.level_7_senior;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

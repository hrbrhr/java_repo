package org.javaguru.student_anastassija.lesson_6.homework.level_1;

class TriangleSquare {

    public double calculateSquare(int a, int b, int c) {
        double s = calculateSemiPerimeter(a, b, c);
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public double calculateSemiPerimeter(int a, int b, int c) {
        return (a + b + c) / (double) 2;
    }

}

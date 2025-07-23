package org.javaguru.student_grigorii_emelyanov.lesson_5_methods.lessoncode;

public class TriangleArea {
    private double semiPerimeter(int a, int b, int c) {
        return (a + b + c) / 2.0;
    }

    public double calculate(int a, int b, int c) {
        double s = semiPerimeter(a, b, c);
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}

package org.javaguru.student_elena_tiutiunnikova.lesson_6.homework.level_1_intern.task_1;

class TriangleSquare {

    public double calculateSquare(int a, int b, int c) {
        double s = calculateSemiPerimeter(a, b, c);
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public double calculateSemiPerimeter(int a, int b, int c) {
        return (a + b + c) / (double) 2;
    }

}

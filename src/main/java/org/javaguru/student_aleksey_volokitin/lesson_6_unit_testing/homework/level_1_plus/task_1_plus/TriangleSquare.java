package org.javaguru.student_aleksey_volokitin.lesson_6_unit_testing.homework.level_1_plus.task_1_plus;

class TriangleSquare {

    double calculateSquare(int a, int b, int c) {
        double s = calculateSemiPerimeter(a, b, c);
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    double calculateSemiPerimeter(int a, int b, int c) {
        return (a + b + c) / (double) 2;
    }

}

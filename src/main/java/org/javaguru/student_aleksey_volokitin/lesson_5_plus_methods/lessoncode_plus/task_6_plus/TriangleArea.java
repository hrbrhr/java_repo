package org.javaguru.student_aleksey_volokitin.lesson_5_plus_methods.lessoncode_plus.task_6_plus;

class TriangleArea {
    double calculateArea(int a, int b, int c) {
        double s = calculateSemiPerimeter(a, b, c);
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c)) * 1.0d;
        return area;
    }

    double calculateSemiPerimeter(int a, int b, int c) {
        return (a + b + c) / (double) 2;
    }
}

package org.javaguru.student_aleksey_volokitin.lesson_5_plus_methods.lessoncode_plus.task_7_plus;

class SquareEquation {
    double discriminant(int a, int b, int c) {
        return b * b - 4 * a * c;
    }

    double firstRoot(int a, int b, int c) {
        double D = discriminant(a, b, c);
        return (-b - Math.sqrt(D)) / (2 * a);
    }

    double secondRoot(int a, int b, int c) {
        double D = discriminant(a, b, c);
        return (-b + Math.sqrt(D)) / (2 * a);
    }
}

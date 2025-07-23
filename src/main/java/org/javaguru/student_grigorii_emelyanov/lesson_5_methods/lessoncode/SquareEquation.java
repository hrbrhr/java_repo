package org.javaguru.student_grigorii_emelyanov.lesson_5_methods.lessoncode;

class SquareEquation {
    int a;
    int b;
    int c;
    double discriminant;

    public SquareEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.discriminant = calculateDiscriminant();
    }

    double calculateDiscriminant() {
        return b * b - 4 * a * c;
    }

    boolean has2solutions() {
        return discriminant > 0;
    }

    boolean has1solution() {
        return discriminant == 0;
    }
    double getX1() {
        return (-1 * b + Math.sqrt(discriminant)) / (2 * a);
    }

    double getX2() {
        return (-1 * b - Math.sqrt(discriminant)) / (2 * a);

    }
}

package org.javaguru.student_grigoriy_emiliyanov.lesson_5_methods.lessoncode;

public class Calculator {
    boolean isEven(int number) {
        return number % 2 == 0;
    }
    boolean isOdd(int number) {
        return number % 2 != 0;
    }

    double findAverage(int a, int b) {
        return (a + b) / 2.0;
    }
}

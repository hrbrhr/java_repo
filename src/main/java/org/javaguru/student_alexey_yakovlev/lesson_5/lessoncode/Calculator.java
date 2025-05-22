package org.javaguru.student_alexey_yakovlev.lesson_5.lessoncode;

class Calculator {

    boolean isEven(int number) {
        return number % 2 == 0;
    }

    boolean isOdd(int number) {
        return number % 2 != 0;
    }

    int findAverage(int number1, int number2) {
        return (number1 + number2) / 2;
    }

    double findAverage2(int number1, int number2) {
        return  (number1 + number2) / (double)2;
    }

    int findMax(int number1, int number2) {
        if (number1 > number2) {
            return number1;
        } else {
            return number2;
        }
    }
}

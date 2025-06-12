package org.javaguru.student_aleksey_volokitin.lesson_5_plus_methods.lessoncode_plus.task_1_5_plus;

class Calculator {
    boolean isEven(int number) {
        if (number % 2 == 0) { return true; }
        else                 { return false; }
    }

    boolean isOdd(int number) {
        if (number % 2 != 0) { return true; }
        else                 { return false; }
    }
    double findAverage(int number1, int number2) {
        return (number1 + number2) / 2.0d;
    }

    int findMaxOfTwoNumbers(int number1, int number2) {
        if (number1 > number2) { return number1; }
        else                   { return number2; }
    }
    int findMaxOfThreeNumbers(int number1, int number2, int number3) {
        int maxOfTwoNumbers = findMaxOfTwoNumbers(number1, number2);
        return findMaxOfTwoNumbers(maxOfTwoNumbers, number3);
    }
}

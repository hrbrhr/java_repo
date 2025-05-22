package org.javaguru.student_alexey_yakovlev.lesson_5.lessoncode;

class MaxNumber {

    int findMax(int number1, int number2) {
        return (number1 > number2) ? number1 : number2;
    }

    int findMaxV2(int number1, int number2, int number3) {
        int max = findMax(number1, number2);
        return findMax(max, number3);
    }
}

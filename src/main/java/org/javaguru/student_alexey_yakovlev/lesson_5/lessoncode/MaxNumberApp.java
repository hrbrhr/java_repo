package org.javaguru.student_alexey_yakovlev.lesson_5.lessoncode;

class MaxNumberApp {

    public static void main(String[] args) {
        MaxNumber maxNumber = new MaxNumber();

        int number1 = 1;
        int number2 = 2;
        int number3 = 3;

        int max = maxNumber.findMaxV2(number1, number2, number3);

        System.out.println(max);


    }
}

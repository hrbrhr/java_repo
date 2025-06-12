package org.javaguru.student_anastassija.lesson_6;

class Calculator {
    boolean isEven(int number){
        return (number % 2) == 0;
        }

    boolean isOdd(int number){
        return (number % 2) != 0;
    }

    int findAverage1(int number1, int number2){
        return (number1 + number2) / 2;
        }

    double findAverage2(int number1, int number2){
        return (number1 + number2) / (double)2;//javnoe privedenie k tipu double
    }


    int findMax(int number1, int number2) {

        if (number1 > number2) {
            return number1;
        } else {
            return number2;
        }
        // return (number1 > number2) ? number1 : number2;
    }

    int findMax2(int number1, int number2, int number3) {

        if (number1 >= number2 && number1 >= number3 ) {
            return number1;
        }
        if (number2 >= number1 && number2 >= number3 ) {
            return number2;
        }
        else {
            return number3;
        }
    }

    int findMax2V2(int number1, int number2, int number3) {
        int max = findMax(number1, number2);
        return findMax(max, number3);
    }

}

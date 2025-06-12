package org.javaguru.student_evgenii_pashtaev.lesson_5.lessoncode;

class Number {

    boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    boolean isOdd(int number){
        if (number % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    double getMiddle(int number1, int number2){
        double middle = (double) (number1 + number2) / 2;
        return middle;
    }

    int getMax(int number1, int number2){
        if (number1 > number2) {
            return number1;
        }
        else {
            return number2;
        }
    }

    int getMaxTree(int number1, int number2, int number3){

        if (number1 >= number2 && number1 >= number3){
            return number1;
        }
        if (number2 >= number1 && number2 >= number3){
            return number2;
        }
        else {
            return number3;
        }
    }

    int getMaxTreeV2(int number1, int number2, int number3) {

        if (getMax(number1, number2) == number1 && number1 >= number3) {
            return number1;
        }
        if (getMax(number1, number2) == number2 && number2 >= number3) {
            return number2;
        } else {
            return number3;
        }
    }
    int getMaxTreeV3(int number1, int number2, int number3){
        int max = getMax(number1,number2);
        return getMax(max, number3);
    }
}

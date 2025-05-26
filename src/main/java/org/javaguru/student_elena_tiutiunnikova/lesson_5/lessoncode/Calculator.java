package org.javaguru.student_elena_tiutiunnikova.lesson_5.lessoncode;

class Calculator {
    boolean isEven(int number) {
        if ( number % 2 == 0 ) {
        return true;
        } else {
            return false;
        }
    }
    //еще вариант реализации без if: return ( number % 2) == 0 {}



    boolean isOdd(int number) {
        if ( number % 2 == 0 ) {
            return false;
        } else {
            return true;
        }
    }

    int averagev1 (int number1, int number2) {
        return (number1 + number2)/2;
    }

    double averagev2 (int number1, int number2) {
        return (number1 + number2)/ (double)2;
    }

    int findMaxNumber (int number1, int number2) {
        if (number1 > number2) {
            return number1;
        } else {
            return number2;
        }
        // return (number1 > number2) ? number1 : number2; -тернарный оператор
    }

    int findMax3Number (int number1, int number2, int number3) {
        int max = findMaxNumber(number1, number2);
        return findMaxNumber(max, number3);
       }





}



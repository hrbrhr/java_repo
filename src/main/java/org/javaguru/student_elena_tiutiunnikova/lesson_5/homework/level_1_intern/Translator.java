package org.javaguru.student_elena_tiutiunnikova.lesson_5.homework.level_1_intern;

class Translator {

    String translator3(int number) {
        if (number % 3 == 0) {
            return "Fizz";
        } else {
            return "" + number;
        }
    }

    String translator5(int number) {
        if (number % 5 == 0) {
            return "Buzz";
        } else {
            return "" + number;
        }
    }

    String translator4(int number) {
        if ((number % 3 == 0) && (number % 5 == 0)) {
            return "" + translator3(number) + translator5(number);
        } else if ((number % 3 == 0)) {
            return "" + translator3(number);
        } else {
            return "" + translator5(number);
        }
    }

}


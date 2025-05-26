package org.javaguru.student_elena_tiutiunnikova.lesson_5.homework.level_1_intern;

class Translator {

    String translator3 (int number) {
        if ( number % 3 == 0) {
            return "Fizz";
        } else {return "" + number;
        }
    }

    String translator5 (int number) {
        if ( number % 5 == 0) {
            return "Buzz";
        } else {return "" + number;
        }
    }
}

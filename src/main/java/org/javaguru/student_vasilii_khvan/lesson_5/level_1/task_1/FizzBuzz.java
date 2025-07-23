package org.javaguru.student_vasilii_khvan.lesson_5.level_1.task_1;

class FizzBuzz {

    boolean isFizz(int number) {
        return number % 3 == 0;
    }

    boolean isBuzz(int number) {
        return (number % 5) == 0;
    }

    String check(int number) {
        if (isFizz(number) && isBuzz(number)) {
            return "FizzBuzz";
        } else if (isFizz(number)) {
            return "Fizz";
        } else if (isBuzz(number)) {
            return "Buzz";
        } else {
            return "" + number;
        }
    }
}

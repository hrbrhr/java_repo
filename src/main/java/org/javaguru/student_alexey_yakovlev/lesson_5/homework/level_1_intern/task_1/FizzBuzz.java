package org.javaguru.student_alexey_yakovlev.lesson_5.homework.level_1_intern.task_1;

class FizzBuzz {

    String convertedNumberToString (int number) {
           if (isDividedIntoThree(number) && isDividedIntoFive(number)) {
               return "FizzBuzz";
           } else if (isDividedIntoThree(number)) {
               return "Fizz";
           } else if (isDividedIntoFive(number)) {
               return "Buzz";
           }
           return "" + number;
    }

    private boolean isDividedIntoThree(int number) {
        return number % 3 == 0;
    }

    private boolean isDividedIntoFive(int number) {
        return number % 5 == 0;
    }
}

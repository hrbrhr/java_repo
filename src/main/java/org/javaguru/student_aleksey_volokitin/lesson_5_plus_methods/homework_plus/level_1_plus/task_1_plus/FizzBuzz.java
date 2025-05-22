package org.javaguru.student_aleksey_volokitin.lesson_5_plus_methods.homework_plus.level_1_plus.task_1_plus;

class FizzBuzz {

    String convertToString(int inputNumber) {
        if (inputNumber == 0) {
            return "0";
        }
        else if ((inputNumber % 3 == 0) && (inputNumber % 5 == 0)){
            return "FizzBuzz";
        }
        else if (inputNumber % 3 == 0) {
            return "Fizz";
        }
        else if (inputNumber % 5 == 0) {
            return "Buzz";
        }
        else {
            return Integer.toString(inputNumber);
        }
    }
}

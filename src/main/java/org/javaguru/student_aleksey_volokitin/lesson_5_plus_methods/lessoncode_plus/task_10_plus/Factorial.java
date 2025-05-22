package org.javaguru.student_aleksey_volokitin.lesson_5_plus_methods.lessoncode_plus.task_10_plus;

class Factorial {
    int calculateFactorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
    int calculateFactorialWithRecursion(int number) {
        if ((number == 0) || (number == 1)){
            return 1;
        }
        return number * calculateFactorialWithRecursion(number - 1);
    }
}

package org.javaguru.student_aleksey_volokitin.lesson_6_plus_unit_testing.lessoncode_plus.task_4_plus;

class FizzBuzz {

    String convertingToString(int inputNumber) {

        if (isZero(inputNumber))              { return "0"; }
        else if (isDivisibleBy15(inputNumber)){ return "FizzBuzz"; }
        else if (isDivisibleBy3(inputNumber)) { return "Fizz"; }
        else if (isDivisibleBy5(inputNumber)) { return "Buzz"; }
        else                                  { return Integer.toString(inputNumber); }
    }
    private boolean isZero (int inputNumber) {
        if (inputNumber  == 0) return true;
        else                   return false;
    }
    private boolean isDivisibleBy3 (int inputNumber) {
        if (inputNumber % 3 == 0) return true;
        else                      return false;
    }
    private boolean isDivisibleBy5 (int inputNumber) {
        if (inputNumber % 5 == 0) return true;
        else                      return false;
    }
    private boolean isDivisibleBy15 (int inputNumber) {
        if (isDivisibleBy3(inputNumber) &&
            isDivisibleBy5(inputNumber)) return true;
        else                             return false;
    }
}

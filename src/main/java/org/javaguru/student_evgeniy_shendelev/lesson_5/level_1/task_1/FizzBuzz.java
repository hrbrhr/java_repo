package org.javaguru.student_evgeniy_shendelev.lesson_5.level_1.task_1;

class FizzBuzz {
    String detect(int a) {
        if (a % 3 == 0 && a % 5 == 0) {
            return "FizzBuzz";
        } else if (a % 3 == 0) {
            return "Fizz";
        } else if (a % 5 == 0) {
            return "Buzz";
        }
        return "" + a;
    }
}

package org.javaguru.student_aleksey_volokitin.lesson_6_plus_unit_testing.homework_plus.level_4_plus.task_2_plus;

class FactorialRecursion {
    public int factorial(int n) {
        if ((n == 0) || (n == 1)){
            return 1;
        }
        return n * factorial(n - 1);
    }
}

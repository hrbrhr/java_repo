package org.javaguru.student_aleksey_volokitin.lesson_6_unit_testing.homework.level_4.task_2;

class FactorialRecursion {

    public int factorial(int n) {

        if ((n == 0) || (n == 1)){
            return 1;
        }
        return n * factorial(n - 1);
    }

}

package org.javaguru.student_aleksey_volokitin.lesson_6_unit_testing.homework.level_4.task_1_plus;

class FactorialForLoop {

    public int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

}

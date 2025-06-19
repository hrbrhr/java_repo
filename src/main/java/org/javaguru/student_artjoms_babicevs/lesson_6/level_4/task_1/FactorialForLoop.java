package org.javaguru.student_artjoms_babicevs.lesson_6.level_4.task_1;

class FactorialForLoop {

    public int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

}

package org.javaguru.student_artjoms_babicevs.lesson_6.level_4.task_2;

class FactorialRecursion {

    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Negative numbers not allowed");
        }
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
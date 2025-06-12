package org.javaguru.student_elena_tiutiunnikova.lesson_6.homework.level_4_junior.task_2;

class FactorialRecursion {

    public int factorial(int n) {
        if (n == 1 || n == 0){
            return 1;
        }
        return n * factorial(n - 1);
    }
}

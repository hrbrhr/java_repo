package org.javaguru.student_alexey_yakovlev.lesson_6.homework.level_2_intern.task_2;

class MaxOfThreeNumbers {

    public int findMax(int num1, int num2, int num3) {
        int max = Math.max(num1, num2);
        return Math.max(max, num3);
    }

}

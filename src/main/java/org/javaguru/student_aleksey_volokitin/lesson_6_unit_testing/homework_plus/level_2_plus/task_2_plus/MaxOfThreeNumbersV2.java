package org.javaguru.student_aleksey_volokitin.lesson_6_unit_testing.homework_plus.level_2_plus.task_2_plus;

class MaxOfThreeNumbersV2 {

    public int findMax(int num1, int num2, int num3) {
        int max = Math.max(num1, num2);
        return Math.max(max, num3);
    }

}

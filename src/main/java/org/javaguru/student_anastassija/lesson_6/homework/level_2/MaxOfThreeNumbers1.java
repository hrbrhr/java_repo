package org.javaguru.student_anastassija.lesson_6.homework.level_2;

class MaxOfThreeNumbers1 {

    public int findMax(int num1, int num2, int num3) {
        int max = Math.max(num1, num2);
        return Math.max(max, num2);
    }

}

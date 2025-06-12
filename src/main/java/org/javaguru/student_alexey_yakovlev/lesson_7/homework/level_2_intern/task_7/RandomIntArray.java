package org.javaguru.student_alexey_yakovlev.lesson_7.homework.level_2_intern.task_7;

import java.util.Random;

class RandomIntArray {

    public int[] randomArray(int n) {
        int[] numbers = new int[n];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }
        return numbers;
    }

    public void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}

package org.javaguru.student_aleksey_volokitin.lesson_7_array_for.homework_plus.level_2_plus.task_7;

import java.util.Arrays;
import java.util.Random;

class RandomIntArray {
    Random random = new Random();
    private int randomArray[] = new int[10];
    void createArray() {
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(100);
        }
    }

    void printArray() {
        System.out.println(Arrays.toString(randomArray));
    }
}

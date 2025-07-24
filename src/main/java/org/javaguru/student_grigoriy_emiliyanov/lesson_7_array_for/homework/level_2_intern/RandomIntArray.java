package org.javaguru.student_grigoriy_emiliyanov.lesson_7_array_for.homework.level_2_intern;

import java.util.Arrays;
import java.util.Random;

public class RandomIntArray {
    public int[] create() {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }

    public void print(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}

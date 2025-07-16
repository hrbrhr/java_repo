package org.javaguru.student_evgeniy_shendelev.lesson_7.level_2.task_7;

import java.util.Random;

public class RandomIntArray {
    int[] createRandomIntArray() {
        int[] res = new int[10];
        Random random = new Random();
        for (int i = 0; i < res.length; i++) {
            res[i] = random.nextInt(11);
        }

        return res;
    }

    void printRandomIntArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + "-й элемент: " + arr[i]);
        }
    }
}

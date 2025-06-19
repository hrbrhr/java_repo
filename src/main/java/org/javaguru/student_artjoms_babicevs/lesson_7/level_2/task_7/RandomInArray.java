package org.javaguru.student_artjoms_babicevs.lesson_7.level_2.task_7;

import java.util.Random;

class RandomIntArray {

    public int[] createAndFillArray() {
        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101);
        }

        return array;
    }

    public void printArray(int[] array) {
        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}







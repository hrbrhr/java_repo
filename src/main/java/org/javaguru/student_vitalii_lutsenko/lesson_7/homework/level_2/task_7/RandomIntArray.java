package org.javaguru.student_vitalii_lutsenko.lesson_7.homework.level_2.task_7;

import java.util.Random;

  class RandomIntArray {

    public int[] createAndFillArray() {
      int[] array = new int[10];
      Random random = new Random();

      for (int i = 0; i < array.length; i = i +1) {
        array[i] = random.nextInt(101);
      }
      return array;
    }

    public void printArray(int[] array){
     for (int i = 0; i < array.length; i++) {
       System.out.println(array[i]);
     }
    }

  }

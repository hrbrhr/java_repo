package org.javaguru.student_elena_tiutiunnikova.lesson_7.homework.level_2_intern;
import java.util.Random;

class RandomIntArray {

       public int[] createRandomArray() {
              int[] array = new int[10];
              Random random = new Random();
              for (int i = 0; i < array.length; i++) {
                     array[i] = random.nextInt(100);
              }
              return array;
       }

       public void printRandomArray (int[] array) {
              for (int i = 0; i < array.length; i++) {
                     System.out.println(array[i]);
              }
       }
}

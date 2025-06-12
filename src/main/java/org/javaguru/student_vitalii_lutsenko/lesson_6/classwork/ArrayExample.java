package org.javaguru.student_vitalii_lutsenko.lesson_6.classwork;

import java.util.Random;

 class ArrayExample {

     public int[] createArray(int length) {
         return new int[length];
     }

     public void printArray(int[] array){

         for (int i = 1; i < array.length; i++) {
             System.out.println(array[i]);
         }


     }
     public int random(int max) {
         Random random = new Random();
         return random.nextInt(max);
     }
     public void randomArray (int [] numbers) {

         for (int i = 1; i < numbers.length; i++) {
             numbers[i] = random(10);
         }



     }





}

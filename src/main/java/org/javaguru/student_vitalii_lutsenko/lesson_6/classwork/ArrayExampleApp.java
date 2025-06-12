package org.javaguru.student_vitalii_lutsenko.lesson_6.classwork;

 class ArrayExampleApp {

     public static void main(String[] args) {
         ArrayExample arrayExample = new ArrayExample();

         int[] numbers1 = arrayExample.createArray(5);
         arrayExample.printArray(numbers1);
         arrayExample.randomArray(numbers1);
         arrayExample.printArray(numbers1);


         int[] numbers2 = arrayExample.createArray(4);
         arrayExample.printArray(numbers2);
         arrayExample.randomArray(numbers2);
         arrayExample.printArray(numbers2);


         int[] numbers3 = arrayExample.createArray(7);
         arrayExample.printArray(numbers3);
         arrayExample.randomArray(numbers3);
         arrayExample.printArray(numbers3);








     }



}

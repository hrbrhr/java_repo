package org.javaguru.student_anastassija.lesson_7.homework.Level_2;
import java.util.Random;

class RandomIntArray {


    public int[] createArrayAndFillIt() {
        int[] array = new int[10]; //создаётся массив целых чисел длиной 10 элементов
        Random random = new Random();
        for (int i = 0; i < array.length; i++){ ;
        array[i] = random.nextInt(100);//заполняется случайными числами в диапазоне от 0 до 100
    }
   return array;
}

//метод предназначенный для распечатки массива целых чисел на консоль
    public void printArray (int[] array){
       for ( int i = 0; i < array.length; i++)
       System.out.println(array[i]);
    }
}

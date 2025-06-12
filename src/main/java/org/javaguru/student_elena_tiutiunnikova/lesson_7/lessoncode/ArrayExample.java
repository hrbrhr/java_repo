package org.javaguru.student_elena_tiutiunnikova.lesson_7.lessoncode;
import java.util.Random;
class ArrayExample {

    public int[] createArray(int lenght) {
        return new int[lenght];
    }

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

//   метод будет заполнять массив рандомными как принт random

    public int random(int max) {
        Random random = new Random();
        return random.nextInt(max);
    }

    public void randomArray(int [] randomArray) {
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random(10);
        }
    }

}

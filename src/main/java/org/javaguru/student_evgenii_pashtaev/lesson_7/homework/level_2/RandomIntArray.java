package org.javaguru.student_evgenii_pashtaev.lesson_7.homework.level_2;
import java.util.Random;
public class RandomIntArray {

    public int[] createArray(){
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(0, 100);
        }
        return array;
    }

    public void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}

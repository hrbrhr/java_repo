package org.javaguru.student_anastassija.lesson_7;
import java.util.Random;

class ArrayEx {

    public int[] createArray(int length){
        return new int[length];
    }

    public void printArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
//zapolnit jaceiki vsego massiva randomnymi cislami
    public void fillArrayWithRandomNumbers(int[] numbers){
            for (int i = 0; i < numbers.length; i++){
                numbers[i] = random(10);
        }
    }
//primer metoda random
    public int random(int max){
        Random random = new Random();//sgenerit randomnye cisla
        return  random.nextInt(max);
    }

}

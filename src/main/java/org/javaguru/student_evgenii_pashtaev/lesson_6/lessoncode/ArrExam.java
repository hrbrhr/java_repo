package org.javaguru.student_evgenii_pashtaev.lesson_6.lessoncode;
import java.util.Random;
public class ArrExam {

    public static void main(String[] args) {
        int[] array = new int[10];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++){
            array[i] = rand.nextInt(10);
        }
    }
}

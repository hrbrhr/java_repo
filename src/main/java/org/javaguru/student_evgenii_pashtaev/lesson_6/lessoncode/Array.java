package org.javaguru.student_evgenii_pashtaev.lesson_6.lessoncode;

public class Array {

    public static void main(String[] args) {

        int[] array = new int[5];
        array[0] = 0;
        array[1] = 1;
        array[2] = 2;
        array[3] = 3;
        array[4] = 4;

        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }
}

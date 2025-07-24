package org.javaguru.student_grigoriy_emiliyanov.lesson_7_array_for.lessoncode;

class ArrayExample {
    int[] create(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = 0;
        }
        return array;
    }
}

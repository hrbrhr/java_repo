package org.javaguru.student_aleksey_volokitin.lesson_7_plus_array_for.lessoncode_plus;

class Task3ArrayByZero {

    int sumOfArrayElements() {
        int sumOfElements = 0;
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            sumOfElements += numbers[i];
        }
        return sumOfElements;
    }
}

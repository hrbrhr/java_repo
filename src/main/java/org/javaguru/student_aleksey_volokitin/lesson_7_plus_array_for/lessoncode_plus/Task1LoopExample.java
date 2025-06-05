package org.javaguru.student_aleksey_volokitin.lesson_7_plus_array_for.lessoncode_plus;

import java.util.Arrays;

class Task1LoopExample {
    public static void main(String[] args) {

        int numbers[] = new int[10];
        String resultString = "";
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
            int j = i + 1;
            resultString += j + " ";
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(resultString);
    }
}

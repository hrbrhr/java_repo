package org.javaguru.student_aleksey_volokitin.lesson_7_plus_array_for.lessoncode_plus;

class Task4SumOfMarks {

    int findSum(int[] marks) {
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }
        return sum;
    }
}

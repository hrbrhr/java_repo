package org.javaguru.student_aleksey_volokitin.lesson_7_plus_array_for.lessoncode_plus;

class Task6AverageMark {

    double findAverage(int[] marks) {
        int sumOfMarks = 0;
        for (int i = 0; i < marks.length; i++) {
            sumOfMarks += marks[i];
        }
        if(sumOfMarks > 0) {
            return sumOfMarks / (double) marks.length;
        }
        return 0.0d;
    }
}

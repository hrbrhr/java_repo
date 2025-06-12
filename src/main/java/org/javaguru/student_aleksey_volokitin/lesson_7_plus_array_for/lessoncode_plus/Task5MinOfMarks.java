package org.javaguru.student_aleksey_volokitin.lesson_7_plus_array_for.lessoncode_plus;

class Task5MinOfMarks {

    int findMin(int[] marks) {
        int minMark = Integer.MAX_VALUE;
        for (int i = 0; i < marks.length; i++) {
            if(marks[i] < minMark) {
                minMark = marks[i];
            }
        }
        if(minMark < Integer.MAX_VALUE) {
            return minMark;
        }
        return 0;
    }
}

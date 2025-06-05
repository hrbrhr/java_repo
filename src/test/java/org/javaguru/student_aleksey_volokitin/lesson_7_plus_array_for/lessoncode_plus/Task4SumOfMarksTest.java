package org.javaguru.student_aleksey_volokitin.lesson_7_plus_array_for.lessoncode_plus;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task4SumOfMarksTest {

    @Test
    void findSum() {

        int[] marks = {5, 4, 5, 3, 5, 2, 3, 5};

        Task4SumOfMarks task4SumOfMarks = new Task4SumOfMarks();
        int expectedResult = 32;
        int actualResult = task4SumOfMarks.findSum(marks);
        assertEquals(expectedResult, actualResult);
    }
}
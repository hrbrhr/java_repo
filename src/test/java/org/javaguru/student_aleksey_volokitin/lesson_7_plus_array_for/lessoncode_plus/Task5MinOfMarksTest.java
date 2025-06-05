package org.javaguru.student_aleksey_volokitin.lesson_7_plus_array_for.lessoncode_plus;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task5MinOfMarksTest {

    @Test
    void test1() {
        int[] marks = {5, 4, 5, 3, 5, 2, 3, 5};
        Task5MinOfMarks task5MinOfMarks = new Task5MinOfMarks();

        int expectedResult = 2;
        int actualResult = task5MinOfMarks.findMin(marks);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void test2() {
        int[] marks = {};
        Task5MinOfMarks task5MinOfMarks = new Task5MinOfMarks();

        int expectedResult = 0;
        int actualResult = task5MinOfMarks.findMin(marks);
        assertEquals(expectedResult, actualResult);
    }

}
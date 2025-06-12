package org.javaguru.student_aleksey_volokitin.lesson_7_plus_array_for.lessoncode_plus;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task3ArrayByZeroTest {

    @Test
    void sumOfArrayElements() {
        Task3ArrayByZero task3ArrayByZero = new Task3ArrayByZero();

        int expectedResult = 0;
        int actualResult = task3ArrayByZero.sumOfArrayElements();
        assertEquals(expectedResult, actualResult);
    }
}
package org.javaguru.student_aleksey_volokitin.lesson_7_plus_array_for.lessoncode_plus;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task6AverageMarkTest {

    @Test
    void test1FindAverage() {
        int[] marks = {5, 4, 5, 3, 5, 2, 3, 5, 5};
        Task6AverageMark task6AverageMark = new Task6AverageMark();

        double expected = 4.111111;
        double actual = task6AverageMark.findAverage(marks);
        assertEquals(expected, actual, 0.000001);
    }

    @Test
    void test2FindAverage() {
        int[] marks = {};
        Task6AverageMark task6AverageMark = new Task6AverageMark();

        double expected = 0.0;
        double actual = task6AverageMark.findAverage(marks);
        assertEquals(expected, actual, 0.000001);
    }
}
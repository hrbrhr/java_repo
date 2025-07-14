package org.javaguru.student_alexey_yakovlev.lesson_9.homework.day_4.task_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void calculateArea() {
        Square square = new Square("Square", 5);
        double realResult = square.calculateArea();
        assertEquals(realResult, 25);
    }

    @Test
    void calculatePerimetr() {
        Square square = new Square("Square", 5);
        double realResult = square.calculatePerimetr();
        assertEquals(realResult, 20);
    }
}
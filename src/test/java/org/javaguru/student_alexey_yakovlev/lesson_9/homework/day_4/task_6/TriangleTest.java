package org.javaguru.student_alexey_yakovlev.lesson_9.homework.day_4.task_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void calculateArea() {
        Triangle triangle = new Triangle("Triangle", 3, 4, 5, 5.5);
        double realResult = triangle.calculateArea();
        assertEquals(realResult, 8.25);
    }

    @Test
    void calculatePerimetr() {
        Triangle triangle = new Triangle("Triangle", 3, 4, 5, 5.5);
        double realResult = triangle.calculatePerimetr();
        assertEquals(realResult, 12);
    }
}
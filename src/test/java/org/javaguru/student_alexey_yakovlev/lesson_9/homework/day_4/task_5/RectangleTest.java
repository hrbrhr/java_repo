package org.javaguru.student_alexey_yakovlev.lesson_9.homework.day_4.task_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void calculateArea() {
        Rectangle rectangle = new Rectangle("Rectangle", 5, 3);
        double realResult = rectangle.calculateArea();
        assertEquals(realResult, 15);
    }

    @Test
    void calculatePerimetr() {
        Rectangle rectangle = new Rectangle("Rectangle", 5, 3);
        double realResult = rectangle.calculatePerimetr();
        assertEquals(realResult, 16);
    }
}
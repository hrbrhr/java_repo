package org.javaguru.student_alexey_yakovlev.lesson_9.homework.day_4.task_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void calculateArea() {
        Circle circle = new Circle("Circle", 5);
        double realResult = circle.calculateArea();
        double expectedResult = 78.539;

        assertTrue((realResult - expectedResult) <= 0.001 );
    }

    @Test
    void calculatePerimetr() {
        Circle circle = new Circle("Circle", 5);
        double realResult = circle.calculatePerimetr();
        double expectedResult = 31.415;

        assertTrue((realResult - expectedResult) <= 0.001);
    }
}
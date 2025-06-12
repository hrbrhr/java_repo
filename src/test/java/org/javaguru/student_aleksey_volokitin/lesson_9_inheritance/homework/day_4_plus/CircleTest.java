package org.javaguru.student_aleksey_volokitin.lesson_9_inheritance.homework.day_4_plus;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void test1CalculateAreaZeroValue() {
        Circle circle = new Circle("Circle", 0.0);
        double expectedResult = 0.0;
        double actualResult = circle.calculateArea();
        assertEquals(expectedResult, actualResult, 0.000001);
    }

    @Test
    void test2CalculateAreaIntValue() {
        Circle circle = new Circle("Circle", 5);
        double expectedResult = 78.539816;
        double actualResult = circle.calculateArea();
        assertEquals(expectedResult, actualResult, 0.000001);
    }

    @Test
    void test3CalculateAreaDoubleValue() {
        Circle circle = new Circle("Circle", 5.5);
        double expectedResult = 95.033177;
        double actualResult = circle.calculateArea();
        assertEquals(expectedResult, actualResult, 0.000001);
    }

    @Test
    void test4CalculatePerimeterZeroValue() {
        Circle circle = new Circle("Circle", 0);
        double expectedResult = 0.0;
        double actualResult = circle.calculatePerimeter();
        assertEquals(expectedResult, actualResult, 0.000001);
    }

    @Test
    void test5CalculatePerimeterIntValue() {
        Circle circle = new Circle("Circle", 5);
        double expectedResult = 31.415926;
        double actualResult = circle.calculatePerimeter();
        assertEquals(expectedResult, actualResult, 0.000001);
    }

    @Test
    void test6CalculatePerimeterDoubleValue() {
        Circle circle = new Circle("Circle", 5.5);
        double expectedResult = 34.557519;
        double actualResult = circle.calculatePerimeter();
        assertEquals(expectedResult, actualResult, 0.000001);
    }
}
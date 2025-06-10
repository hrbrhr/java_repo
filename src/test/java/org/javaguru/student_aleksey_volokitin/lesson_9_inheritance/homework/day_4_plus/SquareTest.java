package org.javaguru.student_aleksey_volokitin.lesson_9_inheritance.homework.day_4_plus;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SquareTest {

    @Test
    void test1CalculateAreaZeroValue() {
        Square square = new Square("Square", 0.0);
        double expectedResult = 0.0;
        double actualResult = square.calculateArea();
        assertEquals(expectedResult, actualResult, 0.000001);
    }

    @Test
    void test2CalculateArea() {
        Square square = new Square("Square", 5.7);
        double expectedResult = 32.49;
        double actualResult = square.calculateArea();
        assertEquals(expectedResult, actualResult, 0.000001);
    }

    @Test
    void test3CalculatePerimeterZeroValue() {
        Square square = new Square("Square", 0.0);
        double expectedResult = 0.0;
        double actualResult = square.calculatePerimeter();
        assertEquals(expectedResult, actualResult, 0.000001);
    }

    @Test
    void test4CalculatePerimeter() {
        Square square = new Square("Square", 5.7);
        double expectedResult = 22.8;
        double actualResult = square.calculatePerimeter();
        assertEquals(expectedResult, actualResult, 0.000001);
    }
}
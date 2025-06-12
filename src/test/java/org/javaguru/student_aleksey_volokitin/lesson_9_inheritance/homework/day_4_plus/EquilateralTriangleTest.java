package org.javaguru.student_aleksey_volokitin.lesson_9_inheritance.homework.day_4_plus;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EquilateralTriangleTest {

    @Test
    void test1CalculateAreaZeroValue() {
        EquilateralTriangle equilateralTriangle =
            new EquilateralTriangle("EquilateralTriangle", 0.0);
        double expectedResult = 0.0;
        double actualResult = equilateralTriangle.calculateArea();
        assertEquals(expectedResult, actualResult, 0.000001);
    }

    @Test
    void test2CalculateAreaIntValue() {
        EquilateralTriangle equilateralTriangle =
            new EquilateralTriangle("EquilateralTriangle", 3);
        double expectedResult = 3.897114;
        double actualResult = equilateralTriangle.calculateArea();
        assertEquals(expectedResult, actualResult, 0.000001);
    }

    @Test
    void test3CalculateAreaDoubleValue() {
        EquilateralTriangle equilateralTriangle =
            new EquilateralTriangle("EquilateralTriangle", 3.3);
        double expectedResult = 4.715508;
        double actualResult = equilateralTriangle.calculateArea();
        assertEquals(expectedResult, actualResult, 0.000001);
    }

    @Test
    void test4CalculatePerimeterZeroValue() {
        EquilateralTriangle equilateralTriangle =
            new EquilateralTriangle("EquilateralTriangle", 0);
        double expectedResult = 0.0;
        double actualResult = equilateralTriangle.calculatePerimeter();
        assertEquals(expectedResult, actualResult, 0.000001);
    }

    @Test
    void test5CalculatePerimeterIntValue() {
        EquilateralTriangle equilateralTriangle =
            new EquilateralTriangle("EquilateralTriangle", 3);
        double expectedResult = 9.0;
        double actualResult = equilateralTriangle.calculatePerimeter();
        assertEquals(expectedResult, actualResult, 0.000001);
    }

    @Test
    void test6CalculatePerimeterDoubleValue() {
        EquilateralTriangle equilateralTriangle =
                new EquilateralTriangle("EquilateralTriangle", 3.3);
        double expectedResult = 9.9;
        double actualResult = equilateralTriangle.calculatePerimeter();
        assertEquals(expectedResult, actualResult, 0.000001);
    }
}
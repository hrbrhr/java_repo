package org.javaguru.student_aleksey_volokitin.lesson_9_inheritance.homework.day_4_plus;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTest {

    @Test
    void test1CalculateAreaZeroValue() {
        Rectangle rectangle = new Rectangle("Rectangle", 0, 0);
        double expectedResult = 0.0;
        double actualResult = rectangle.calculateArea();
        assertEquals(expectedResult, actualResult, 0.000001);
    }

    @Test

    void test2CalculateAreaDoubleValue() {
        Rectangle rectangle = new Rectangle("Rectangle", 2.2, 3.3);
        double expectedResult = 7.26;
        double actualResult = rectangle.calculateArea();
        assertEquals(expectedResult, actualResult, 0.000001);
    }

    @Test
    void test3CalculatePerimeterZeroValue() {
        Rectangle rectangle = new Rectangle("Rectangle", 0, 0);
        double expectedResult = 0.0;
        double actualResult = rectangle.calculatePerimeter();
        assertEquals(expectedResult, actualResult, 0.000001);
    }

    @Test
    void test4CalculatePerimeterIntValue() {
        Rectangle rectangle = new Rectangle("Rectangle", 2, 3.3);
        double expectedResult = 10.6;
        double actualResult = rectangle.calculatePerimeter();
        assertEquals(expectedResult, actualResult, 0.000001);
    }

    @Test
    void test6CalculatePerimeterDoubleValue() {
        Rectangle rectangle = new Rectangle("Rectangle", 2.2, 3.4);
        double expectedResult = 11.2;
        double actualResult = rectangle.calculatePerimeter();
        assertEquals(expectedResult, actualResult, 0.000001);
    }
}
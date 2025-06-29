package org.javaguru.student_aleksey_volokitin.project_4_geometry_shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTest {

    @Test
    void test1CalculateArea() {
        Rectangle rectangle = new Rectangle("Rectangle", 4, 5);
        assertEquals(rectangle.calculateArea(), 20.0, 0.000001);
    }

    @Test
    void test2CalculateArea() {
        Rectangle rectangle = new Rectangle("Rectangle", 4.1, 5.2);
        assertEquals(rectangle.calculateArea(), 21.32, 0.000001);
    }

    @Test
    void test3CalculateArea() {
        Rectangle rectangle = new Rectangle("Rectangle", 4.2, 5.5);
        assertEquals(rectangle.calculateArea(), 23.1, 0.000001);
    }


    @Test
    void test4CalculatePerimeter() {
        Rectangle rectangle = new Rectangle("Rectangle", 4, 5);
        assertEquals(rectangle.calculatePerimeter(), 18.0, 0.000001);
    }

    @Test
    void test5CalculatePerimeter() {
        Rectangle rectangle = new Rectangle("Rectangle", 4.11, 5.12);
        assertEquals(rectangle.calculatePerimeter(), 18.46, 0.000001);
    }

    @Test
    void test6CalculatePerimeter() {
        Rectangle rectangle = new Rectangle("Rectangle", 4.16, 5.22);
        assertEquals(rectangle.calculatePerimeter(), 18.76, 0.000001);
    }
}
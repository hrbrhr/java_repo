package org.javaguru.student_aleksey_volokitin.project_4_geometry_shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void test1CalculateArea() {
        Circle circle = new Circle("Circle", 5);
        assertEquals(circle.calculateArea(), 78.539816, 0.000001);
    }

    @Test
    void test2CalculateArea() {
        Circle circle = new Circle("Circle", 2.5);
        assertEquals(circle.calculateArea(), 19.634954, 0.000001);
    }

    @Test
    void test3CalculatePerimeter() {
        Circle circle = new Circle("Circle", 5.0);
        assertEquals(circle.calculatePerimeter(), 31.415926, 0.000001);
    }

    @Test
    void test4CalculatePerimeter() {
        Circle circle = new Circle("Circle", 2.34);
        assertEquals(circle.calculatePerimeter(), 14.702653, 0.000001);
    }
}
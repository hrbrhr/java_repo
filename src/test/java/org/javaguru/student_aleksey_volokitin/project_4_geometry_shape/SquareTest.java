package org.javaguru.student_aleksey_volokitin.project_4_geometry_shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void test1CalculateArea() {
        Square square = new Square("Square", 5);
        assertEquals(square.calculateArea(), 25.0, 0.000001);
    }

    @Test
    void test2CalculateArea() {
        Square square = new Square("Square", 2.1);
        assertEquals(square.calculateArea(), 4.41, 0.000001);
    }

    @Test
    void test3CalculateArea() {
        Square square = new Square("Square", 2.2);
        assertEquals(square.calculateArea(), 4.84, 0.000001);
    }


    @Test
    void test4CalculatePerimeter() {
        Square square = new Square("Square", 5);
        assertEquals(square.calculatePerimeter(), 20.0, 0.000001);
    }

    @Test
    void test5CalculatePerimeter() {
        Square square = new Square("Square", 2.11);
        assertEquals(square.calculatePerimeter(), 8.44, 0.000001);
    }

    @Test
    void test6CalculatePerimeter() {
        Square square = new Square("Square", 2.22);
        assertEquals(square.calculatePerimeter(), 8.88, 0.000001);
    }
}
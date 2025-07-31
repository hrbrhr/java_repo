package org.javaguru.student_grigoriy_emiliyanov.project_4_geometry_shape.geometry.shapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    @Test
    public void shouldCalculateArea() {
        double side = 5.3;
        Square square = new Square("Square 1", side);
        double expected = side * side;
        assertEquals(expected, square.calculateArea(), 0.0001);
    }

    @Test
    public void shouldCalculatePerimeter() {
        double side = 5.3;
        Square square = new Square("Square 1", side);
        double expected = 4 * side;
        assertEquals(expected, square.calculatePerimeter(), 0.0001);
    }
}
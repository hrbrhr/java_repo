package org.javaguru.mentor.project_4_geometry_shape.task_10.geometry.shapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SquareTest {

    @Test
    public void shouldCalculateArea() {
        Square square = new Square("A", 1);
        assertEquals(square.calculateArea(), 1.0, 0.01);
    }

    @Test
    public void shouldCalculatePerimeter() {
        Square square = new Square("A", 1);
        assertEquals(square.calculatePerimeter(), 4.0, 0.01);
    }

}
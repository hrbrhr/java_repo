package org.javaguru.student_elena_tiutiunnikova.project_4_geometry_shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void calculateArea() {
        Square square = new Square("Square1", 2.5);
        assertEquals(square.calculateArea(), 6.25, 0.01);
    }

    @Test
    void calculatePerimetr() {
        Square square = new Square("Square1", 2.5);
        assertEquals(square.calculatePerimeter(), 10, 0.01);
    }

}
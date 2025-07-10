package org.javaguru.student_elena_tiutiunnikova.project_4_geometry_shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void calculateArea() {
        Rectangle rectangle = new Rectangle(
                "Rectangle1", 2.5, 3.0);
        assertEquals(rectangle.calculateArea(), 7.5, 0.01);
    }

    @Test
    void calculatePerimeter() {
        Rectangle rectangle = new Rectangle(
                "Rectangle1", 2.5, 3.0);
        assertEquals(rectangle.calculatePerimeter(), 11.0, 0.01);
    }
}
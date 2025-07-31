package org.javaguru.student_grigoriy_emiliyanov.project_4_geometry_shape.geometry.shapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test
    public void shouldCalculateArea() {
        double a = 5.5;
        double b = 3.3;
        Rectangle rectangle = new Rectangle("Rect1", a, b);
        double expected = a * b;
        assertEquals(expected, rectangle.calculateArea(), 0.0001);
    }

    @Test
    public void shouldCalculatePerimeter() {
        double a = 5.5;
        double b = 3.3;
        Rectangle rectangle = new Rectangle("Rect1", a, b);
        double expected = 2 * (a + b);
        assertEquals(expected, rectangle.calculatePerimeter(), 0.0001);
    }
}
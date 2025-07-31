package org.javaguru.student_grigoriy_emiliyanov.project_4_geometry_shape.geometry.shapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CircleTest {
    @Test
    public void shouldCalculateArea() {
        double radius = 5.5;
        Circle circle = new Circle("circle 1", radius);
        double expected = Math.PI * radius * radius;
        assertEquals(expected, circle.calculateArea(), 0.0001);
    }

    @Test
    public void  shouldCalculatePerimeter() {
        double radius = 5.5;
        Circle circle = new Circle("circle 1", radius);
        double expected = 2 * Math.PI * radius;
        assertEquals(expected, circle.calculatePerimeter(), 0.0001);
    }

}
package org.javaguru.student_elena_tiutiunnikova.project_4_geometry_shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    public void calculateArea () {
        Circle circle = new Circle("Circle1", 2.5);
        assertEquals(circle.calculateArea(), 19.63, 0.01);
    }

    @Test
    public void calculatePerimetr () {
        Circle circle = new Circle("Circle2", 2.5);
        assertEquals(circle.calculatePerimeter(), 15.708, 0.001);
    }

}
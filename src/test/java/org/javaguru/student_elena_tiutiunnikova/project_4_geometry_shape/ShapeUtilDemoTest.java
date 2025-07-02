package org.javaguru.student_elena_tiutiunnikova.project_4_geometry_shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeUtilDemoTest {

    @Test
    public void shouldCalculateAreaForMassiveOfShapes () {
        Shape[] shapes = {
                new Circle("A", 2.0),
                new Rectangle("B", 5.1, 10.5),
                new Square("C", 3.9)
        };
        ShapeUtil shapeUtil = new ShapeUtil();
        double sumOfAreas = shapeUtil.calculateArea(shapes);
        assertEquals(sumOfAreas, 81.33, 0.01);
    }

    @Test
    public void shouldCalculatePerimeterForMassiveOfShapes () {
        Shape [] shapes = {
                new Circle("A", 2.0),
                new Rectangle("B", 5.1, 10.5),
                new Square("C", 3.9)
        };
        ShapeUtil shapeUtil = new ShapeUtil();
        double sumOfPerimeter = shapeUtil.calculatePerimeter(shapes);
        assertEquals(sumOfPerimeter, 59.37, 0.01);
    }

}
package org.javaguru.student_grigoriy_emiliyanov.project_4_geometry_shape.geometry.shapes;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShapeUtilTest {
    @Test
    public void shouldCalculateArea() {
        Shape[] shapes = {
                new Circle("Circle 1", 5.0),
                new Square("Square 1", 2.2),
                new Rectangle("Rect 1", 2.5, 3.0)
        };
        ShapeUtil shapeUtil = new ShapeUtil();
        assertEquals(90.879812, shapeUtil.calculateArea(shapes), 0.0001);
    }

    @Test
    public void shouldCalculatePerimeter() {
        Shape[] shapes = {
                new Circle("Circle 1", 5.0),
                new Square("Square 1", 2.2),
                new Rectangle("Rect 1", 2.5, 3.0)
        };
        ShapeUtil shapeUtil = new ShapeUtil();
        assertEquals(51.215926, shapeUtil.calculatePerimeter(shapes), 0.0001);
    }

    @Test
    public void shouldFindEqualShapes() {
        List<Shape> shapes = List.of(
                new Circle("A", 1.0),
                new Circle("B", 1.0),
                new Circle("A", 1.0),
                new Rectangle("A", 1.0, 2.0),
                new Square("A", 1.0)
        );
        Shape circleToFind = new Circle("A", 1.0);
        ShapeUtil shapeUtil = new ShapeUtil();
        List<Shape> expected = List.of(
                new Circle("A", 1.0),
                new Circle("A", 1.0)
        );
        assertEquals(expected, shapeUtil.findEquals(shapes, circleToFind) );
    }
}
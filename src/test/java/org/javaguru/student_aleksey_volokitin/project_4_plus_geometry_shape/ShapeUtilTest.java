package org.javaguru.student_aleksey_volokitin.project_4_plus_geometry_shape;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShapeUtilTest {

    @Test
    void test1_calculateArea() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = {
                new Circle("Circle", 4.5),
                new Square("Square", 3.72),
                new Rectangle("Rectangle", 4.13, 8.76),
                new Circle("Circle", 7.71)
        };
        assertEquals(300.383599, shapeUtil.calculateArea(shapes), 0.000001);
    }

    @Test
    void test2_calculateArea() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = {
                new Circle("Circle", 0.5),
                new Square("Square", 1.72),
                new Rectangle("Rectangle", 5.13, 4.73),
                new Circle("Circle", 3.71)
        };
        assertEquals(71.249894, shapeUtil.calculateArea(shapes), 0.000001);
    }

    @Test
    void test3_calculatePerimeter() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = {
                new Circle("Circle", 4.5),
                new Square("Square", 3.72),
                new Rectangle("Rectangle", 4.13, 8.76),
                new Circle("Circle", 7.71)
        };
        assertEquals(117.377693, shapeUtil.calculatePerimeter(shapes), 0.000001);
    }

    @Test
    void test4_calculatePerimeter() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = {
                new Circle("Circle", 0.5),
                new Square("Square", 1.72),
                new Rectangle("Rectangle", 5.13, 4.73),
                new Circle("Circle", 3.71)
        };
        assertEquals(53.052210, shapeUtil.calculatePerimeter(shapes), 0.000001);
    }

    @Test
    void test5_findEqualsClearArrayLists() {
        ShapeUtil shapeUtil = new ShapeUtil();
        List<Shape> shapes = new ArrayList<>();
        Shape square1 = new Square("Square1", 4.8);

        List<Shape> expectedEqualShapes = new ArrayList<>();
        List<Shape> actualEqualShapes = shapeUtil.findEquals(shapes, square1);

        assertEquals(expectedEqualShapes, actualEqualShapes);
    }

    @Test
    void test6_findEquals() {
        ShapeUtil shapeUtil = new ShapeUtil();
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Square("Square1", 4.8));
        shapes.add(new Circle("Circle", 4.6));
        shapes.add(new Circle("Circle", 4.7));
        shapes.add(new Square("Square", 4.6));
        shapes.add(new Square("Square1", 4.8));
        Shape square2 = new Square("Square1", 4.8);

        List<Shape> expectedEqualShapes = new ArrayList<>();
        expectedEqualShapes.add(new Square("Square1", 4.8));
        expectedEqualShapes.add(new Square("Square1", 4.8));
        List<Shape> actualEqualShapes = shapeUtil.findEquals(shapes, square2);

        assertEquals(expectedEqualShapes, actualEqualShapes);
    }

    @Test
    void test7_findEquals() {
        ShapeUtil shapeUtil = new ShapeUtil();
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Square("Square1", 4.8));
        shapes.add(new Circle("Circle", 4.6));
        shapes.add(new Circle("Circle", 4.7));
        shapes.add(new Square("Square", 4.9));
        shapes.add(new Square("Square1", 4.8));
        Shape square = new Square("Square", 4.6);

        List<Shape> expectedEqualShapes = new ArrayList<>();
        List<Shape> actualEqualShapes = shapeUtil.findEquals(shapes, square);

        assertEquals(expectedEqualShapes, actualEqualShapes);
    }

    @Test
    void test8_findEquals() {
        ShapeUtil shapeUtil = new ShapeUtil();
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Square("Square1", 4.8));
        shapes.add(new Circle("Circle", 4.6));
        shapes.add(new Circle("Circle", 4.7));
        shapes.add(new Square("Square", 4.6));
        shapes.add(new Square("Square1", 4.8));
        Shape square = new Square("Square", 4.6);

        List<Shape> expectedEqualShapes = new ArrayList<>();
        expectedEqualShapes.add(new Square("Square", 4.6));
        List<Shape> actualEqualShapes = shapeUtil.findEquals(shapes, square);

        assertEquals(expectedEqualShapes, actualEqualShapes);
    }

    @Test
    void test9_findEquals() {
        ShapeUtil shapeUtil = new ShapeUtil();
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Square("Square1", 4.8));
        shapes.add(new Circle("Circle", 4.6));
        shapes.add(new Circle("Circle", 4.7));
        shapes.add(new Square("Square", 4.6));
        shapes.add(new Square("Square1", 4.8));
        Shape rectangle = new Rectangle("Rectangle", 4.6, 4.8);

        List<Shape> expectedEqualShapes = new ArrayList<>();
        List<Shape> actualEqualShapes = shapeUtil.findEquals(shapes, rectangle);

        assertEquals(expectedEqualShapes, actualEqualShapes);
    }

    @Test
    void test10_findEquals() {
        ShapeUtil shapeUtil = new ShapeUtil();
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Square("Square1", 4.8));
        shapes.add(new Circle("Circle", 4.6));
        shapes.add(new Rectangle("Rectangle", 5.3, 4.4));
        shapes.add(new Circle("Circle", 4.7));
        shapes.add(new Square("Square", 4.6));
        shapes.add(new Square("Square1", 4.8));
        Shape rectangle = new Rectangle("Rectangle", 5.3, 4.4);

        List<Shape> expectedEqualShapes = new ArrayList<>();
        expectedEqualShapes.add(new Rectangle("Rectangle", 5.3, 4.4));
        List<Shape> actualEqualShapes = shapeUtil.findEquals(shapes, rectangle);
        assertEquals(expectedEqualShapes, actualEqualShapes);
    }

    @Test
    void test11_findEquals() {
        ShapeUtil shapeUtil = new ShapeUtil();
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Square("Square1", 4.8));
        shapes.add(new Circle("Circle", 4.6));
        shapes.add(new Rectangle("Rectangle", 4.4, 5.3));
        shapes.add(new Circle("Circle", 4.7));
        shapes.add(new Square("Square", 4.6));
        shapes.add(new Square("Square1", 4.8));
        Shape square1 = new Rectangle("Rectangle", 4.1, 5.3);

        List<Shape> expectedEqualShapes = new ArrayList<>();
        expectedEqualShapes.add(new Rectangle("Rectangle", 4.4, 5.3));
        List<Shape> actualEqualShapes = shapeUtil.findEquals(shapes, square1);

        assertNotEquals(expectedEqualShapes, actualEqualShapes);
    }

    @Test
    void test12_findEquals() {
        ShapeUtil shapeUtil = new ShapeUtil();
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Square("Square1", 4.8));
        shapes.add(new Circle("Circle", 4.6));
        shapes.add(new Rectangle("Rectangle", 4.4, 5.3));
        shapes.add(new Circle("Circle", 4.7));
        shapes.add(new Square("Square", 4.6));
        shapes.add(new Square("Square1", 4.8));
        Shape square1 = new Rectangle("Rectangle1", 4.4, 5.3);

        List<Shape> expectedEqualShapes = new ArrayList<>();
        expectedEqualShapes.add(new Rectangle("Rectangle", 4.4, 5.3));
        List<Shape> actualEqualShapes = shapeUtil.findEquals(shapes, square1);

        assertNotEquals(expectedEqualShapes, actualEqualShapes);
    }

    @Test
    void test13_findEquals() {
        ShapeUtil shapeUtil = new ShapeUtil();
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Rectangle("Rectangle", 5.4, 5.3));
        shapes.add(new Square("Square1", 4.8));
        shapes.add(new Circle("Circle", 4.6));
        shapes.add(new Rectangle("Rectangle", 4.4, 5.3));
        shapes.add(new Circle("Circle", 4.7));
        shapes.add(new Square("Square", 4.6));
        shapes.add(new Rectangle("Rectangle", 4.4, 5.3));
        shapes.add(new Square("Square1", 4.8));
        Shape square1 = new Rectangle("Rectangle", 4.4, 5.3);

        List<Shape> expectedEqualShapes = new ArrayList<>();
        expectedEqualShapes.add(new Rectangle("Rectangle", 4.4, 5.3));
        List<Shape> actualEqualShapes = shapeUtil.findEquals(shapes, square1);

        assertNotEquals(expectedEqualShapes, actualEqualShapes);
    }

    @Test
    void test14_findEquals() {
        ShapeUtil shapeUtil = new ShapeUtil();
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Rectangle("Rectangle", 5.4, 5.3));
        shapes.add(new Square("Square1", 4.8));
        shapes.add(new Circle("Circle", 4.6));
        shapes.add(new Rectangle("Rectangle", 4.4, 5.3));
        shapes.add(new Circle("Circle", 4.7));
        shapes.add(new Square("Square", 4.6));
        shapes.add(new Rectangle("Rectangle", 4.4, 5.3));
        shapes.add(new Square("Square1", 4.8));
        Shape square1 = new Rectangle("Rectangle", 4.4, 5.3);

        List<Shape> expectedEqualShapes = new ArrayList<>();
        expectedEqualShapes.add(new Rectangle("Rectangle", 4.4, 5.3));
        expectedEqualShapes.add(new Rectangle("Rectangle", 4.4, 5.3));
        List<Shape> actualEqualShapes = shapeUtil.findEquals(shapes, square1);

        assertEquals(expectedEqualShapes, actualEqualShapes);
    }
}
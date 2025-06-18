package org.javaguru.student_aleksey_volokitin.lesson_9_inheritance.homework.day_5_plus;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeUtilTest {

    @Test
    void test1calculateArea() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle("Circle", 4);
        shapes[1] = new Square("Square", 4);
        shapes[2] = new Rectangle("Rectangle", 4, 5);
        shapes[3] = new EquilateralTriangle("Equilateral Triangle", 4);

        double expectedArea = 93.193685;
        double actualAreaOfShapes =  shapeUtil.calculateArea(shapes);

        assertEquals(expectedArea, actualAreaOfShapes, 0.000001);
    }

    @Test
    void test2calculateArea() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle("Circle", 6);
        shapes[1] = new Square("Square", 6);
        shapes[2] = new Rectangle("Rectangle", 6, 9);
        shapes[3] = new EquilateralTriangle("Equilateral Triangle", 6);

        double expectedArea = 218.685792;
        double actualAreaOfShapes =  shapeUtil.calculateArea(shapes);

        assertEquals(expectedArea, actualAreaOfShapes, 0.000001);
    }

    @Test
    void test3calculatePerimeter() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle("Circle", 4);
        shapes[1] = new Square("Square", 4);
        shapes[2] = new Rectangle("Rectangle", 4, 5);
        shapes[3] = new EquilateralTriangle("Equilateral Triangle", 4);

        double expectedPerimeter = 71.132741;
        double actualPerimeterOfShapes =  shapeUtil.calculatePerimeter(shapes);

        assertEquals(expectedPerimeter, actualPerimeterOfShapes, 0.000001);
    }

    @Test
    void test4calculatePerimeter() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle("Circle", 6);
        shapes[1] = new Square("Square", 6);
        shapes[2] = new Rectangle("Rectangle", 6, 9);
        shapes[3] = new EquilateralTriangle("Equilateral Triangle", 6);

        double expectedPerimeter = 109.699111;
        double actualPerimeterOfShapes =  shapeUtil.calculatePerimeter(shapes);

        assertEquals(expectedPerimeter, actualPerimeterOfShapes, 0.000001);
    }

}
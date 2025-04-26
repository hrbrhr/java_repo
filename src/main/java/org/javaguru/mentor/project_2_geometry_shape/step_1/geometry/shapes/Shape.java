package org.javaguru.mentor.project_2_geometry_shape.step_1.geometry.shapes;

abstract class Shape {

    private String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();

}

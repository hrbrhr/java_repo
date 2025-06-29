package org.javaguru.student_elena_tiutiunnikova.project_4_geometry_shape;

abstract class Shape {

    private String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();
    abstract double calculatePerimeter();

}

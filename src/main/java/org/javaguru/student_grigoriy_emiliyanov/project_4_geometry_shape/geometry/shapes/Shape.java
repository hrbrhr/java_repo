package org.javaguru.student_grigoriy_emiliyanov.project_4_geometry_shape.geometry.shapes;

abstract class Shape {

    private String title;

    Shape(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    abstract double calculateArea();
    abstract double calculatePerimeter();

    @Override
    public String toString() {
        return '{' + getClass().getSimpleName() + "@" +
                "title='" + title + '\'' +
                '}';
    }
}

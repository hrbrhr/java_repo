package org.javaguru.student_aleksey_volokitin.project_4_plus_geometry_shape;

abstract class Shape {

    private String title;

    Shape(String title) { this.title = title; }

    public String getTitle() { return title; }

    abstract double calculateArea();
    abstract double calculatePerimeter();
    abstract String getRadiusSide();
    //abstract boolean equals();

}

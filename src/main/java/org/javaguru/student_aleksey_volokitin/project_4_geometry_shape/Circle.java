package org.javaguru.student_aleksey_volokitin.project_4_geometry_shape;

import java.util.Objects;

class Circle extends Shape {

    private double radius;

    public Circle(String title, double radius) {
        super(title);
        this.radius = radius;
    }

    @Override
    double calculateArea() { return Math.PI * radius * radius; }

    @Override
    double calculatePerimeter() { return (double) 2 * Math.PI * radius; }

    @Override
    String getRadiusSide() { return radius + ""; }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if (!(o instanceof Circle circle)) return false;
        return this.getTitle().equals(((Circle) o).getTitle()) && Double.compare(radius, circle.radius) == 0;
    }
}

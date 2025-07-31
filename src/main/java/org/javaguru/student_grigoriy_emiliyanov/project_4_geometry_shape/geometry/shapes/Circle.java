package org.javaguru.student_grigoriy_emiliyanov.project_4_geometry_shape.geometry.shapes;

import java.util.Objects;

class Circle extends Shape {
    private double radius;

    public Circle(String title, double radius) {
        super(title);
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Circle circle)) return false;
        return Double.compare(radius, circle.radius) == 0 && getTitle().equals(circle.getTitle());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(radius);
    }
}

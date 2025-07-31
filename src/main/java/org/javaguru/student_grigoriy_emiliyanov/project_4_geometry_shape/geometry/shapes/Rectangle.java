package org.javaguru.student_grigoriy_emiliyanov.project_4_geometry_shape.geometry.shapes;

import java.util.Objects;

class Rectangle extends Shape {
    private double a;
    private double b;

    public Rectangle(String title, double a, double b) {
        super(title);
        this.a = a;
        this.b = b;
    }

    @Override
    double calculateArea() {
        return a * b;
    }

    @Override
    double calculatePerimeter() {
        return 2 * (a + b);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Rectangle rectangle)) return false;
        return Double.compare(a, rectangle.a) == 0 && Double.compare(b, rectangle.b) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }
}

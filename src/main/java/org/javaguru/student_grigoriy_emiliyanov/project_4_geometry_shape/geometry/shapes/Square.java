package org.javaguru.student_grigoriy_emiliyanov.project_4_geometry_shape.geometry.shapes;

import java.util.Objects;

class Square extends Shape {
    private double side;

    public Square(String title, double side) {
        super(title);
        this.side = side;
    }

    @Override
    double calculateArea() {
        return side * side;
    }

    @Override
    double calculatePerimeter() {
        return 4 * side;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Square square)) return false;
        return Double.compare(side, square.side) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(side);
    }
}

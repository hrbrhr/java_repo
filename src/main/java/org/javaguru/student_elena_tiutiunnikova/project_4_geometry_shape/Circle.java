package org.javaguru.student_elena_tiutiunnikova.project_4_geometry_shape;

import org.javaguru.student_anastassija.lesson_2.level_4.task1.Print;

class Circle extends Shape {

    private double radius;

    Circle(String title, double radius) {
        super(title);
        this.radius = radius;
    }

    @Override
    double calculateArea() {
            return radius = Math.PI * radius * radius;
        }
    @Override
    double calculatePerimeter() {
            return radius = 2 * Math.PI * radius * radius;
        }

}

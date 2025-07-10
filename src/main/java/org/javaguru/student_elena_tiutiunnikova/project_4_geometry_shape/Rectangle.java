package org.javaguru.student_elena_tiutiunnikova.project_4_geometry_shape;

class Rectangle extends Shape {

    double lengthOfTheSideA;
    double lengthOfTheSideB;

    Rectangle (String title, double lengthOfTheSideA, double lengthOfTheSideB) {
        super(title);
        this.lengthOfTheSideA = lengthOfTheSideA;
        this.lengthOfTheSideB = lengthOfTheSideB;
    }

    @Override
    double calculateArea () {
        return lengthOfTheSideB * lengthOfTheSideA;
    }

    @Override
    double calculatePerimeter () {
        return 2 * (lengthOfTheSideA + lengthOfTheSideB);
    }
}

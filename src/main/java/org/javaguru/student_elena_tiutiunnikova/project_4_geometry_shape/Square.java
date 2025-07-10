package org.javaguru.student_elena_tiutiunnikova.project_4_geometry_shape;

class Square extends Shape {

    private double lengthOfTheSide;

    Square (String title, double lengthOfTheSide) {
        super(title);
        this.lengthOfTheSide = lengthOfTheSide;
    }

    @Override
    double calculateArea () {
        return lengthOfTheSide * lengthOfTheSide;
    }

    @Override
    double calculatePerimeter () {
        return 4.0 * lengthOfTheSide;
    }

}

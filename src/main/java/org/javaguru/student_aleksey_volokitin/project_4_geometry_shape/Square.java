package org.javaguru.student_aleksey_volokitin.project_4_geometry_shape;

class Square extends Shape {

    private double side;

    public Square(String title, double side) {
        super(title);
        this.side = side;
    }

    public double getSide() { return side; }

    @Override
    double calculateArea() { return (double) side * side; }

    @Override
    double calculatePerimeter() { return (double) 4 * side; }

    @Override
    String getRadiusSide() { return side + ""; }

}

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

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if (!(o instanceof Square square)) return false;
        return this.getTitle().equals(((Square) o).getTitle()) && Double.compare(side, square.side) == 0;
    }

}

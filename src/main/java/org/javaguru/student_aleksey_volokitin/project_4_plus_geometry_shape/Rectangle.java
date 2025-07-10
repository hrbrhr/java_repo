package org.javaguru.student_aleksey_volokitin.project_4_plus_geometry_shape;

class Rectangle extends Shape {

    private double sideA;
    private double sideB;

    public Rectangle(String title, double sideA, double sideB) {
        super(title);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getSideA() { return sideA; }
    public double getSideB() { return sideB; }

    @Override
    double calculateArea() { return (double) sideA * sideB; }

    @Override
    double calculatePerimeter() { return (double) 2 * (sideA + sideB); }

    @Override
    String getRadiusSide() { return sideA + ", " + sideB; }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if (!(o instanceof Rectangle rectangle)) return false;
        return this.getTitle().equals(((Rectangle) o).getTitle())
            && Double.compare(sideA, rectangle.sideA) == 0
            && Double.compare(sideB, rectangle.sideB) == 0;
    }

}

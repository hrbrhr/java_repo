package org.javaguru.student_grigoriy_emiliyanov.lesson_9_inheritance.lessoncode;

class Circle extends AbstractShape {
    private final double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public void print() {
        String s = "Circle{" +
                "name=" + getName() +
                ", " +
                "radius=" + radius +
                '}';
        System.out.println(s);
    }
}

package org.javaguru.student_grigoriy_emiliyanov.lesson_9_inheritance.lessoncode;

class Rectangle extends AbstractShape {
    private double width;
    private double height;

    public Rectangle(String name, double width, double height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    public double perimeter() {
        return 2 * width * height;
    }

    public double area() {
        return width * height;
    }

    @Override
    public void print() {
        String s = "Rectangle{" +
                "name=" + getName() +
                ", " +
                "width=" + width +
                ", " +
                ", height=" + height +
                '}';
        System.out.println(s);
    }
}

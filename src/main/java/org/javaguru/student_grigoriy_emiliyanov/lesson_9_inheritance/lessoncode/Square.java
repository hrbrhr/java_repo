package org.javaguru.student_grigoriy_emiliyanov.lesson_9_inheritance.lessoncode;

class Square extends AbstractShape {
    private final double side;

    public Square(String name, double side) {
        super(name);
        this.side = side;
    }

    public double perimeter() {
        return 4 * side;
    }

    public double area() {
        return side * side;
    }

    @Override
    public void print() {
        String s =  "Square{" +
                "name=" + getName() +
                ", " +
                "side=" + side +
                '}';
        System.out.println(s);
    }
}

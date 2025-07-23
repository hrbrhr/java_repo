package org.javaguru.student_grigoriy_emiliyanov.lesson_5_methods.lessoncode;

class SquareEquationApp {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = -2;

        SquareEquation squareEquation = new SquareEquation(a, b, c);
        if (squareEquation.has2solutions()) {
            System.out.println("Equation has 2 solutions: ");
            System.out.println("x1 = " + squareEquation.getX1());
            System.out.println("x2 = " + squareEquation.getX2());
        } else if (squareEquation.has1solution()) {
            System.out.println("Equation has 1 solution: ");
            System.out.println("x1 = " + squareEquation.getX1());
        } else {
            System.out.println("Equation has no real solutions");
        }
    }
}

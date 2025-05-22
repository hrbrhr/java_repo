package org.javaguru.student_aleksey_volokitin.lesson_5_plus_methods.lessoncode_plus.task_7_plus;

class SquareEquationApp {
    public static void main(String[] args) {
        SquareEquation squareEquation = new SquareEquation();
        int a = 1;
        int b = -4;
        int c = -5;

        double root1 = squareEquation.firstRoot(a, b, c);
        double root2 = squareEquation.secondRoot(a, b, c);

        System.out.println(root1);
        System.out.println(root2);
    }
}

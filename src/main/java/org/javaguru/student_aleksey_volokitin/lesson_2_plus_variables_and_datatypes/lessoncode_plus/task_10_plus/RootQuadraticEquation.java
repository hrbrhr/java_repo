package org.javaguru.student_aleksey_volokitin.lesson_2_plus_variables_and_datatypes.lessoncode_plus.task_10_plus;

class RootQuadraticEquation {
    public static void main(String[] args) {
        // Квадратное уравнение a * x^2 + b * x + c = 0
        // Дискриминант D = b * b - 4 * a * c
        // x1 = (-b - sqrt(D)) / (2 * a)
        // x2 = (-b + sqrt(D)) / (2 * a)

        int a = 5;
        int b = 25;
        int c = 0;

        double D = b * b - 4 * a * c;
        double x1 = (-1.0 * b - Math.sqrt(D)) / (2 * a);
        double x2 = (-1.0 * b + Math.sqrt(D)) / (2 * a);
        System.out.println("X1 = " + x1);
        System.out.println("X2 = " + x2);

    }
}

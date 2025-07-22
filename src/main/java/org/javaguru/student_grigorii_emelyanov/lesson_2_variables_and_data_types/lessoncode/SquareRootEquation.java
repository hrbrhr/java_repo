package org.javaguru.student_grigorii_emelyanov.lesson_2_variables_and_data_types.lessoncode;

import java.util.Scanner;

//Задача "Корни квадратного уравнения":
//        Напишите программу, которая находит корни квадратного уравнения.
// a * x^2 + b * x + c = 0
class SquareRootEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input coefficient a:");
        int a = scanner.nextInt();
        System.out.println("Input coefficient b:");
        int b = scanner.nextInt();
        System.out.println("Input coefficient c:");
        int c = scanner.nextInt();
        double discriminant = b * b - 4 * a * c;
        double x1 = (-1 * b + Math.sqrt(discriminant)) / (2 * a);
        double x2 = (-1 * b - Math.sqrt(discriminant)) / (2 * a);
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
    }
}

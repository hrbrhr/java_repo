package org.javaguru.student_grigoriy_emiliyanov.lesson_2_variables_and_data_types.lessoncode;

import java.util.Scanner;

//Задача "Площадь треугольника":
//        Напишите программу, которая запрашивает
//        у пользователя три стороны треугольника,
//        а затем вычисляет и выводит его площадь.
class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a:");
        int a = scanner.nextInt();
        System.out.println("Input b:");
        int b = scanner.nextInt();
        System.out.println("Input c:");
        int c = scanner.nextInt();
        double p = (a + b + c) / 2.0;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("Area is: " + area);
    }
}

package org.javaguru.student_grigoriy_emiliyanov.lesson_2_variables_and_data_types.homework.level_3_junior;

import java.util.Scanner;

//Напишите программу, которая запрашивает у пользователя
//        радиус круга (вещественное число) и печатает на консоль
//        периметр и площадь круга.
//
//        Test Data:
//        Radius = 7.5
//
//        Expected Output
//        Perimeter is = 47.12388980384689
//        Area is = 176.71458676442586
class CircleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input circle radius: ");
        double radius = scanner.nextDouble();
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;
        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);
    }
}

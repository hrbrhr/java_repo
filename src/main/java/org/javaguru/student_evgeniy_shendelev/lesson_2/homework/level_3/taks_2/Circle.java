package org.javaguru.student_evgeniy_shendelev.lesson_2.homework.level_3.taks_2;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Напиши величину радиуса, десятичные отделяй запятой");
        double radius = scanner.nextDouble();
        double area = Math.pow(radius, 2L) * Math.PI;
        double perimeter = 2L * Math.PI * radius;

        System.out.printf("Perimeter is %.3f\n", perimeter);
        System.out.printf("Area is %.3f\n", area);

    }
}

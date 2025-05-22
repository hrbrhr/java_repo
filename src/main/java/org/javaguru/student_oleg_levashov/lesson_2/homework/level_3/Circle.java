package org.javaguru.student_oleg_levashov.lesson_2.homework.level_3;

import java.util.Scanner;

class Circle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите радиус круга:");
        double radius = scanner.nextDouble();

        final double pi = 3.14;

        double perimeter = 2 * pi * radius;
        double area = pi * radius * radius;

        System.out.println("Периметр круга равен " + perimeter);
        System.out.println("Площадь круга равна " + area);


    }
}

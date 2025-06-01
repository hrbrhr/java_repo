package org.javaguru.student_pavel_gorev.lesson_2.level_3.task2;

import java.util.Scanner;

class CircleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрос радиуса у пользователя
        System.out.print("Radius = ");
        double radius = scanner.nextDouble();

        // Вычисление периметра и площади
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        // Вывод результатов
        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);

        scanner.close();
    }
}

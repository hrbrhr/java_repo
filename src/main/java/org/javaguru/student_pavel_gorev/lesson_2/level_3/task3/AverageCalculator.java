package org.javaguru.student_pavel_gorev.lesson_2.level_3.task3;

import java.util.Scanner;

class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрос трёх целых чисел
        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        System.out.print("Введите третье число: ");
        int num3 = scanner.nextInt();

        // Вычисление среднего арифметического
        double average = (num1 + num2 + num3) / 3.0;

        // Вывод результата
        System.out.println("Среднее арифметическое: " + average);

        scanner.close();
    }
}

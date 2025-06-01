package org.javaguru.student_pavel_gorev.lesson_2.level_3.task1;

import java.util.Scanner;

class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрос числа у пользователя
        System.out.print("Input a number: ");
        int number = scanner.nextInt();

        // Вывод таблицы умножения
        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }

        scanner.close();
    }
}

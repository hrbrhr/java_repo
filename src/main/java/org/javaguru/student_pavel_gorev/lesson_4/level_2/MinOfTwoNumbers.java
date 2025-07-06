package org.javaguru.student_pavel_gorev.lesson_4.level_2;

import java.util.Scanner;

class MinOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        if (num1 < num2) {
            System.out.println("Наименьшее число: " + num1);
        } else if (num2 < num1) {
            System.out.println("Наименьшее число: " + num2);
        } else {
            System.out.println("Числа равны.");
        }

        scanner.close();
    }
}


package org.javaguru.student_pavel_gorev.lesson_4.level_3;

import java.util.Scanner;

class MaxOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        System.out.print("Введите третье число: ");
        int num3 = scanner.nextInt();

        int max; // переменная для хранения наибольшего числа

        if (num1 >= num2 && num1 >= num3) {
            max = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            max = num2;
        } else {
            max = num3;
        }

        System.out.println("Наибольшее число: " + max);

        scanner.close();
    }
}

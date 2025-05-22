package org.javaguru.student_alexey_yakovlev.lesson_4.homework.level_2_intern.task_3;

import java.util.Scanner;

class EqualNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите два целых числа для сравнения: ");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if (num1 == num2) {
            System.out.printf("Numbers %d and %d are equals\n", num1, num2);
        } else if (num1 != num2) {
            System.out.printf("Numbers %d and %d are different\n", num1, num2);
        }
    }
}

package org.javaguru.student_alexey_yakovlev.lesson_4.homework.level_2_intern.task_1;

import java.util.Scanner;

class MaxNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите два целых числа для сравнения: ");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.printf("Число %d больше числа %d\n", num1, num2);
        } else if (num2 > num1) {
            System.out.printf("Число %d больше числа %d\n", num2, num1);
        } else {
            System.out.printf("Числа %d b %d равны", num1, num2);
        }
    }
}

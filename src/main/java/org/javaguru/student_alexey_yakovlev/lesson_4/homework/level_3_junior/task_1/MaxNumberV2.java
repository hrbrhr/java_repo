package org.javaguru.student_alexey_yakovlev.lesson_4.homework.level_3_junior.task_1;

import java.util.Scanner;

class MaxNumberV2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите три целых числа для сравнения: ");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if (num1 == num2 && num2 == num3 && num1 == num3) {
            System.out.println("All numbers are equal");
        }

        int maxOfTwo = 0;
        if (num1 > num2) {
            maxOfTwo = num1;
        } else {
            maxOfTwo = num2;
        }

        if (maxOfTwo > num3) {
            System.out.println("Max number = " + maxOfTwo);
        } else {
            System.out.println("Max number = " + num3);
        }
    }
}

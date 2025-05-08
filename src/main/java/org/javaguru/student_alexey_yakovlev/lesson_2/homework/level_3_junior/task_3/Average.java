package org.javaguru.student_alexey_yakovlev.lesson_2.homework.level_3_junior.task_3;

import java.util.Scanner;

class Average {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите три целых числа: ");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        double result = ((double) (num1 + num2 + num3) / 3);

        System.out.println(result);
    }
}

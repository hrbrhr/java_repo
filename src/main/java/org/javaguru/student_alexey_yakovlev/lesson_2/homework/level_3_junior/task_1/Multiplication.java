package org.javaguru.student_alexey_yakovlev.lesson_2.homework.level_3_junior.task_1;

import java.util.Scanner;

class Multiplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое число: ");
        int n = scanner.nextInt();
        //int n = 8;

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }
    }
}

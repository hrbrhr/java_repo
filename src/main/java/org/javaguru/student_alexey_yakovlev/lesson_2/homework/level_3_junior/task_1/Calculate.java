package org.javaguru.student_alexey_yakovlev.lesson_2.homework.level_3_junior.task_1;

import java.util.Scanner;

class Calculate {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число от 1 до 10 включительно: ");
        int num = scanner.nextInt();

        int i = 1;
        while (i < 11) {
            System.out.println(num + " x " + i + " = " + num * i);
            i++;
        }
    }
}

package org.javaguru.student_alexey_yakovlev.lesson_2.homework.level_3_junior.task_3;

import java.util.Scanner;

class Average {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите три целых числа: ");

        int sum = 0;
        int count = 0;

        for (int i = 1; i <= 3; i++) {
            sum += scanner.nextInt();
            count++;
        }
        double arithmeticAverage = (double) sum / count;
        System.out.println("Среднее арифметическое = " + arithmeticAverage);
    }
}

package org.javaguru.student_vasilii_khvan.lesson_2.homework.level_3;

import java.util.Scanner;

class Task_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        double avg = (double) (num1 + num2 + num3) / 3;
        System.out.println("Среднее арифметическое = " + avg);
    }
}

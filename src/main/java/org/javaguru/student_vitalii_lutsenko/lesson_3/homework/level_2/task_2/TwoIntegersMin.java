package org.javaguru.student_vitalii_lutsenko.lesson_3.homework.level_2.task_2;

import java.util.Scanner;

class TwoIntegersMin {

    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number1: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter number2: ");
        int number2 = scanner.nextInt();

        if (number1 > number2) {
            System.out.println(number2);
        } else {
            System.out.println(number1);
        }
    }
}

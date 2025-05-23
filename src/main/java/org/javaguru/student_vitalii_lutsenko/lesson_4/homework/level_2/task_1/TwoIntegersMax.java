package org.javaguru.student_vitalii_lutsenko.lesson_4.homework.level_2.task_1;

import java.util.Scanner;

class TwoIntegersMax {

    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number1: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter number2: ");
        int number2 = scanner.nextInt();

        if (number1 > number2) {
            System.out.println(number1);
        } else {
            System.out.println(number2);
        }
    }

}

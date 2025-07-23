package org.javaguru.student_grigoriy_emiliyanov.lesson_4_if_statement.homework.level_2_intern;

import java.util.Scanner;

public class EqualsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number 1:");
        int number1 = scanner.nextInt();
        System.out.println("Enter your number 2:");
        int number2 = scanner.nextInt();
        if (number1 == number2) {
            System.out.println("Numbers are equal");
        } else {
            System.out.println("Numbers are different");
        }
    }
}

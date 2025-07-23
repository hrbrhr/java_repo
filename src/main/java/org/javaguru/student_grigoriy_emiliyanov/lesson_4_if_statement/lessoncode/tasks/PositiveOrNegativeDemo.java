package org.javaguru.student_grigoriy_emiliyanov.lesson_4_if_statement.lessoncode.tasks;

import java.util.Scanner;

public class PositiveOrNegativeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your integer number: ");
        int number = scanner.nextInt();
        boolean isNegative = number < 0;
        boolean isZero = number == 0;
        boolean isPositive = number > 0;

        System.out.println("Your number is negative: " + isNegative);
        System.out.println("Your number is zero : " + isZero);
        System.out.println("Your number is positive: " + isPositive);
    }
}

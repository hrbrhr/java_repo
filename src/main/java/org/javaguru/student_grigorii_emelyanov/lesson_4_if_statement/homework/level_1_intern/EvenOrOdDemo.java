package org.javaguru.student_grigorii_emelyanov.lesson_4_if_statement.homework.level_1_intern;

import java.util.Scanner;

public class EvenOrOdDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your integer:");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("Your number is even.");
        } else {
            System.out.println("Your number is odd.");
        }
    }
}

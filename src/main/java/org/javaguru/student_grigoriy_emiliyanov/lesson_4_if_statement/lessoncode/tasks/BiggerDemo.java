package org.javaguru.student_grigoriy_emiliyanov.lesson_4_if_statement.lessoncode.tasks;

import java.util.Scanner;

public class BiggerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first number");
        int number1 = scanner.nextInt();
        System.out.println("Enter your second number");
        int number2 = scanner.nextInt();
        if (number1 > number2) {
            System.out.println("Biggest number is :" + number1);
        } else {
            System.out.println("Biggest number is :" + number2);
        }
    }
}

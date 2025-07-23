package org.javaguru.student_grigoriy_emiliyanov.lesson_4_if_statement.lessoncode.tasks;

import java.util.Scanner;

public class PositiveNumberDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you integer number");
        int number = scanner.nextInt();
        if (number > 0) {
            System.out.println("Number is positive!!!");
        }
    }

}

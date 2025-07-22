package org.javaguru.student_grigorii_emelyanov.lesson_4_if_statement.lessoncode.tasks;

import java.util.Scanner;

public class DiscountDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your purchasing sum:");
        int sum = scanner.nextInt();
        double discount = 0;
        if (sum > 5000) {
            discount = 0.1;
        }
        if (sum > 10000) {
            discount = 0.2;
        }
        double sumToPay = (1 - discount) * sum;
        System.out.println("Sum to pay with discount: " + sumToPay);
    }
}

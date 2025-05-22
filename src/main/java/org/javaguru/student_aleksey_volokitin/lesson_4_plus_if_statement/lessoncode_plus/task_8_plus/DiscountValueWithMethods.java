package org.javaguru.student_aleksey_volokitin.lesson_4_plus_if_statement.lessoncode_plus.task_8_plus;

import java.util.Scanner;

class DiscountValueWithMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter purchase amount: ");
        int purchaseAmount = scanner.nextInt();
        double resultSum = 0.0d;

        if (isDiscount0Percent(purchaseAmount)) {
            resultSum = purchaseAmount * 1.0d;
        }
        if (isDiscount10Percent(purchaseAmount)) {
            resultSum = purchaseAmount * 0.9d;
        }
        if (isDiscount20Percent(purchaseAmount)) {
            resultSum = purchaseAmount * 0.8d;
        }
        System.out.println(resultSum);
    }

    private static boolean isDiscount0Percent(double purchaseAmount) {
        return (purchaseAmount >= 0) && (purchaseAmount <= 5000);
    }

    private static boolean isDiscount10Percent(double purchaseAmount) {
        return (purchaseAmount > 5000) && (purchaseAmount <= 10000);
    }

    private static boolean isDiscount20Percent(double purchaseAmount) {
        return purchaseAmount > 10000;
    }
}

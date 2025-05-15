package org.javaguru.student_aleksey_volokitin.lesson_4_plus_if_statement.lessoncode_plus.task_8_plus;

import java.util.Scanner;

class DiscountValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter purchase amount: ");
        int purchaseAmount = scanner.nextInt();
        double resultSum = 0.0d;

        boolean isDiscount0Percent = (purchaseAmount >= 0) && (purchaseAmount <= 5000);
        boolean isDiscount10Percent = (purchaseAmount > 5000) && (purchaseAmount <= 10000);
        boolean isDiscount20Percent = purchaseAmount > 10000;

        if (isDiscount0Percent) {
            resultSum = purchaseAmount * 1.0d;
        }
        if (isDiscount10Percent) {
            resultSum = purchaseAmount * 0.9d;
        }
        if (isDiscount20Percent) {
            resultSum = purchaseAmount * 0.8d;
        }
        System.out.println(resultSum);
    }
}

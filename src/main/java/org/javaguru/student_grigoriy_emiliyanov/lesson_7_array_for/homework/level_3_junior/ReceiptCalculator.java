package org.javaguru.student_grigoriy_emiliyanov.lesson_7_array_for.homework.level_3_junior;

import java.util.Arrays;

class ReceiptCalculator {
    public static void main(String[] args) {
        ReceiptCalculator calculator = new ReceiptCalculator();
        Receipt[] casse = new Receipt[5];
        casse[0] = new Receipt(1, 123.0);
        casse[1] = new Receipt(2, 321.0);
        casse[2] = new Receipt(3, 123.0);
        casse[3] = new Receipt(4, 12.0);
        casse[4] = new Receipt(5, 32.50);
        double average = calculator.findAverage(casse);
        System.out.println("Average is " + average);
        double sum = calculator.findSum(casse);
        System.out.println("Total sum is: " + sum);
    }

    public double findAverage(Receipt[] casse) {
        if (casse.length == 0) {
            return 0;
        }
        return findSum(casse) / casse.length;
    }

    public double findSum(Receipt[] casse) {
        double sum = 0;
        for (Receipt receipt : casse) {
            sum += receipt.getTotal();
        }
        return sum;
    }
}

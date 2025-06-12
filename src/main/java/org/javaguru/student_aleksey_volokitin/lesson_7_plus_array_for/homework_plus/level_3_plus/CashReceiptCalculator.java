package org.javaguru.student_aleksey_volokitin.lesson_7_plus_array_for.homework_plus.level_3_plus;

class CashReceiptCalculator {
    double calculateTotalSum (CashReceipt cashReceipts[]) {
        double totalSum = 0.0d;
        for (CashReceipt cashReceipt: cashReceipts) {
            totalSum += cashReceipt.getSumPurchase();
        }
        return totalSum;
    }
    double calculateAverageSum (CashReceipt cashReceipts[]) {
        if (cashReceipts.length > 0) {
            return calculateTotalSum(cashReceipts) / (double) cashReceipts.length;
        }
        else {
            return 0.0d;
        }
    }
}


package org.javaguru.student_alexey_yakovlev.lesson_7.homework.level_3_junior.task_1;

class CashReceiptApp {

    public double calculateTotalSum(CashReceipt[] cashReceipts) {
        double totalSum = 0;
        for (int i = 0; i < cashReceipts.length; i++) {
            CashReceipt cashReceipt = cashReceipts[i];
            totalSum += cashReceipt.getSumPurchase();
        }
        return totalSum;
    }

    public double calculateAverageReceiptSum(CashReceipt[] cashReceipts) {
        if (cashReceipts.length == 0) {
            return 0;
        } else {
            double totalSum = calculateTotalSum(cashReceipts);
            return totalSum / cashReceipts.length;
        }
    }
}

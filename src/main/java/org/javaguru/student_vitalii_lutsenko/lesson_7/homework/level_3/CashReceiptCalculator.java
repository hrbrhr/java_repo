package org.javaguru.student_vitalii_lutsenko.lesson_7.homework.level_3;

class CashReceiptCalculator {

    public double calculateTotalSalesSum(CashReceipt[] receipts) {
        double totalPurchaseAmount = 0.0;
        for (int i = 0; i < receipts.length; i++) {
            CashReceipt receipt = receipts[i];
            totalPurchaseAmount += receipt.getAmount();
        }
        return totalPurchaseAmount;
    }

    public double calculateAverageReceiptSum(CashReceipt[] receipts) {
        if (receipts.length == 0) {
            return 0.0;
        } else {
            double totalPurchaseAmount = calculateTotalSalesSum(receipts);
            return totalPurchaseAmount / receipts.length;
        }
    }


}

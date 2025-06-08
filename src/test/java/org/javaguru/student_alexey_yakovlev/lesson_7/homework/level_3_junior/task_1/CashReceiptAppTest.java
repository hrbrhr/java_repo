package org.javaguru.student_alexey_yakovlev.lesson_7.homework.level_3_junior.task_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashReceiptAppTest {

    @Test
    void calculateTotalSumZero() {
        CashReceipt[] cashReceipts = {};
        CashReceiptApp cashReceiptApp = new CashReceiptApp();
        double totalSum = cashReceiptApp.calculateTotalSum(cashReceipts);

        assertTrue(totalSum == 0);
    }

    @Test
    void calculateTotalSum() {
        CashReceipt[] cashReceipts = {
                new CashReceipt("N1", 1.0),
                new CashReceipt("N1", 2.5),
        };
        CashReceiptApp cashReceiptApp = new CashReceiptApp();
        double totalSum = cashReceiptApp.calculateTotalSum(cashReceipts);

        assertTrue((totalSum - 3.5) < 0.0001);
    }

    @Test
    void calculateAverageReceiptSumZero() {
        CashReceipt[] cashReceipts = {};
        CashReceiptApp cashReceiptApp = new CashReceiptApp();
        double averageReceiptSum = cashReceiptApp.calculateAverageReceiptSum(cashReceipts);

        assertTrue(averageReceiptSum == 0);
    }

    @Test
    void calculateAverageReceiptSum() {
        CashReceipt[] cashReceipts = {
                new CashReceipt("N1", 1),
                new CashReceipt("N1", 3)
        };
        CashReceiptApp cashReceiptApp = new CashReceiptApp();
        double averageReceiptSum = cashReceiptApp.calculateAverageReceiptSum(cashReceipts);

        assertTrue((averageReceiptSum - 2) < 0.0001);
    }

}
package org.javaguru.student_aleksey_volokitin.lesson_7_array_for.homework_plus.level_3_plus;

class CashReceiptCalculatorApp {
    public static void main(String[] args) {
        CashReceipt cashReceipts[] = { new CashReceipt(1, 99.99),
                                       new CashReceipt(2, 55.55),
                                       new CashReceipt(3, 324.90),
                                       new CashReceipt(4, 123.23),
                                       new CashReceipt(5, 458.74)};
        CashReceiptCalculator cashReceiptCalculator = new CashReceiptCalculator();

        System.out.println(cashReceiptCalculator.calculateTotalSum(cashReceipts));
        System.out.println(cashReceiptCalculator.calculateAverageSum(cashReceipts));
    }

}

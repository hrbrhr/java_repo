package org.javaguru.student_aleksey_volokitin.lesson_7_plus_array_for.homework_plus.level_3_plus;

class CashReceiptCalculatorTest {
    public static void main(String[] args) {
        CashReceiptCalculatorTest cashReceiptCalculatorTest = new CashReceiptCalculatorTest();
        cashReceiptCalculatorTest.testFindTotalSumWhenZero();
        cashReceiptCalculatorTest.testFindTotalSum();
        cashReceiptCalculatorTest.testFindAverageSumWhenZero();
        cashReceiptCalculatorTest.testFindAverageSum();
    }
    // тест при отсутствии кассовых чеков
    void testFindTotalSumWhenZero() {
        CashReceipt[] cashReceipts = {};
        CashReceiptCalculator calculator = new CashReceiptCalculator();
        String testTitle = "Test 1: find total sum if no cash receipts are issued";
        double expectedResult = 0.0d;
        double result = calculator.calculateTotalSum(cashReceipts);
        printResultsOfTests(expectedResult, result, testTitle);
    }

    void testFindTotalSum() {
        CashReceipt cashReceipts[] = { new CashReceipt(1, 99.99),
                                       new CashReceipt(2, 55.55),
                                       new CashReceipt(3, 324.90),
                                       new CashReceipt(4, 123.23),
                                       new CashReceipt(5, 458.74)};;
        CashReceiptCalculator calculator = new CashReceiptCalculator();
        String testTitle = "Test 2: find total sum";
        double expectedResult = 1062.409999;
        double result = calculator.calculateTotalSum(cashReceipts);
        printResultsOfTests(expectedResult, result, testTitle);
    }

    void testFindAverageSumWhenZero() {
        CashReceipt[] cashReceipts = {};
        CashReceiptCalculator calculator = new CashReceiptCalculator();
        String testTitle = "Test 3: find average sum if no cash receipts are issued";
        double expectedResult = 0.0d;
        double result = calculator.calculateAverageSum(cashReceipts);
        printResultsOfTests(expectedResult, result, testTitle);
    }

    void testFindAverageSum() {
        CashReceipt cashReceipts[] = { new CashReceipt(1, 99.99),
                                       new CashReceipt(2, 55.55),
                                       new CashReceipt(3, 324.90),
                                       new CashReceipt(4, 123.23),
                                       new CashReceipt(5, 458.74)};
        CashReceiptCalculator calculator = new CashReceiptCalculator();
        String testTitle = "Test 4: find average sum";
        double expectedResult = 212.481999;
        double result = calculator.calculateAverageSum(cashReceipts);
        printResultsOfTests(expectedResult, result, testTitle);
    }

    void printResultsOfTests(double expectedResult, double result, String testTitle) {
        double thresholdValue = 0.000001d;
        if (Math.abs(expectedResult - result) < thresholdValue) {
            System.out.println(testTitle + " - OK");
        }
        else {
            System.out.println(testTitle + " - FAIL");
        }
        System.out.println(expectedResult - result);
    }
}

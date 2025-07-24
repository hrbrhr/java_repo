package org.javaguru.student_grigoriy_emiliyanov.lesson_7_array_for.homework.level_3_junior;

class ReceiptCalculatorTest {
    public static void main(String[] args) {
        ReceiptCalculatorTest suite = new ReceiptCalculatorTest();
        suite.testAverageZero();
        suite.testAverage();
        suite.testSumZero();
        suite.testSum();
    }

    private void testAverageZero() {
        ReceiptCalculator calculator = new ReceiptCalculator();
        Receipt[] casse = new Receipt[0];
        double expected = 0.0;
        checkExpect(expected, calculator.findAverage(casse), "should find + " + expected + " when " + casse.length + " receipts");
    }

    private void testAverage() {
        ReceiptCalculator calculator = new ReceiptCalculator();
        Receipt[] casse = new Receipt[3];
        casse[0] = new Receipt(1, 10.50);
        casse[1] = new Receipt(2, 15.0);
        casse[2] = new Receipt(3, 20.50);
        double expected = 15.333;
        checkExpect(expected, calculator.findAverage(casse), "should find + " + expected + " when " + casse.length + " receipts");

    }


    private void testSumZero() {
        ReceiptCalculator calculator = new ReceiptCalculator();
        Receipt[] casse = new Receipt[0];
        double expected = 0.0;
        checkExpect(expected, calculator.findSum(casse), "should find + " + expected + " when " + casse.length + " receipts");
    }

    private void testSum() {
        ReceiptCalculator calculator = new ReceiptCalculator();
        Receipt[] casse = new Receipt[3];
        casse[0] = new Receipt(1, 10.50);
        casse[1] = new Receipt(2, 15.0);
        casse[2] = new Receipt(3, 20.50);
        double expected = 46.0;
        checkExpect(expected, calculator.findSum(casse), "should find + " + expected + " when " + casse.length + " receipts");
    }


    private void checkExpect(double expected, double real, String testCaseName) {
        double epsilon = 0.001;
        if (Math.abs(expected - real) < epsilon) {
            System.out.println(testCaseName + ": TEST OK!");
        } else {
            System.out.println(testCaseName + ": TEST FAIL! expected = " + expected + " but realResult = " + real);
        }
    }
}

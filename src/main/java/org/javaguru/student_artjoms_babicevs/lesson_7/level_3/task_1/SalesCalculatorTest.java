package org.javaguru.student_artjoms_babicevs.lesson_7.level_3.task_1;

class SalesCalculatorTest {

    public static void main(String[] args) {
        SalesCalculatorTest test = new SalesCalculatorTest();
        test.testTotalSales();
        test.testAverageSales();
        test.testWithEmptyArray();
    }

    public void testTotalSales() {
        Receipt[] receipts = {
                new Receipt(1, 100.00),
                new Receipt(2, 50.00),
                new Receipt(3, 150.00)
        };
        SalesCalculator salesCalculator = new SalesCalculator();
        double result = salesCalculator.calculateTotalSales(receipts);
        checkResult(result, 300.0, "testTotalSales");
    }

    public void testAverageSales() {
        Receipt[] receipts = {
                new Receipt(1, 100.0),
                new Receipt(2, 50.0),
                new Receipt(3, 150.0)
        };
        SalesCalculator calculator = new SalesCalculator();
        double result = calculator.calculateAverageSale(receipts);
        checkResult(result, 100.0, "testAverageSales");
    }

    public void testWithEmptyArray() {
        Receipt[] receipts = {};
        SalesCalculator calculator = new SalesCalculator();
        double total = calculator.calculateTotalSales(receipts);
        double average = calculator.calculateAverageSale(receipts);
        checkResult(total, 0.0, "testWithEmptyArray - Total");
        checkResult(average, 0.0, "testWithEmptyArray - Average");
    }

    private void checkResult(double actual, double expected, String testName) {
        double epsilon = 0.0001;
        if (Math.abs(actual - expected) < epsilon) {
            System.out.println(testName + ": TEST OK!");
        } else {
            System.out.println(testName + ": TEST FAIL! Expected = " + expected + ", Actual = " + actual);
        }
    }
}
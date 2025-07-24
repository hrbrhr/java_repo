package org.javaguru.student_grigoriy_emiliyanov.lesson_7_array_for.homework.level_6_senior;

class StocksAnalyzerTest {

    public static void main(String[] args) {
        StocksAnalyzerTest suite = new StocksAnalyzerTest();
        suite.testFindTotalValue();
        suite.testFindAverageRIP();
    }

    private void testFindTotalValue() {
        StocksAnalyzer analyzer = new StocksAnalyzer();
        Stock[] stocks = {
                new Stock("ABC", 10000.0, 10.0),
                new Stock("XYZ", 10000.0, 10.0)
        };
        double expected = 20000.0;
        checkExpect(expected, analyzer.findTotalValue(stocks), "should find total value");
    }

    private void testFindAverageRIP() {
        StocksAnalyzer analyzer = new StocksAnalyzer();
        Stock[] stocks = {
                new Stock("ABC", 10000.0, 10.0),
                new Stock("XYZ", 5000.0, 20.0)
        };
        double expected = 13.333;
        checkExpect(expected, analyzer.findAverageRIP(stocks), "should find total value");
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

package org.javaguru.student_aleksey_volokitin.lesson_7_array_for.homework_plus.level_6_plus.list;

class StockAnalyserTest {
    private double threshold = 0.000001;
    public static void main(String[] args) {
        StockAnalyserTest stockAnalyserTest = new StockAnalyserTest();
        stockAnalyserTest.test1();
        stockAnalyserTest.test2();
        stockAnalyserTest.test3();
        stockAnalyserTest.test4();
    }

    void test1 () {
        StockAnalyser stockAnalyser = new StockAnalyser();
        double expectedResult = 0.0;
        double realResult = stockAnalyser.findSumAssetValues();
        String testTitle = "Test 1 - find sum asset values";
        checkResult(expectedResult, realResult, testTitle);
    }

    void test2 () {
        StockAnalyser stockAnalyser = new StockAnalyser();
        stockAnalyser.addStock("Lukoil", 1000.56, 15.5);
        stockAnalyser.addStock("Sberbank", 3500.33, 12.5);
        stockAnalyser.addStock("VTB", 678.12, 16.3);

        double expectedResult = 5179.01;
        double realResult = stockAnalyser.findSumAssetValues();
        String testTitle = "Test 2 - find sum asset values";
        checkResult(expectedResult, realResult, testTitle);
    }

    void test3 () {
        StockAnalyser stockAnalyser = new StockAnalyser();

        double expectedResult = 0.0;
        double realResult = stockAnalyser.averageReturnInPercents();
        String testTitle = "Test 3 - find average return in percents";
        checkResult(expectedResult, realResult, testTitle);
    }

    void test4 () {
        StockAnalyser stockAnalyser = new StockAnalyser();
        stockAnalyser.addStock("Lukoil", 1000.56, 15.5);
        stockAnalyser.addStock("Sberbank", 3500.33, 12.5);
        stockAnalyser.addStock("VTB", 678.12, 16.3);

        double expectedResult = 14.766666;
        double realResult = stockAnalyser.averageReturnInPercents();
        String testTitle = "Test 4 - find average return in percents";
        checkResult(expectedResult, realResult, testTitle);
    }

    void checkResult(double expectedResult, double realResult, String testTitle) {
        if (Math.abs(expectedResult - realResult) < threshold) {
            System.out.println(testTitle + " - OK");
        } else {
            System.out.println(testTitle + " - FAIL");
        }
    }
}

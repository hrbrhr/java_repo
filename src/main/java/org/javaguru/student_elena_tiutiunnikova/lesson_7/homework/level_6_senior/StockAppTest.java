package org.javaguru.student_elena_tiutiunnikova.lesson_7.homework.level_6_senior;

class StockAppTest {
    public static void main(String[] args) {
        StockAppTest test = new StockAppTest();
        test.testTotalValueOfStock();
        test.testZeroValueOfStock();
        test.testAverageReturnOnInvestmentPortfolio();
        test.testZeroAverageReturnOnInvestmentPortfolio();
    }

    private void testForm (double realResult, double expectedResult, String nameOfTest) {
        double threshold = 0.000001d;
        if (Math.abs(realResult - expectedResult) < threshold) {
            System.out.println(nameOfTest + " is OK");
        } else {
            System.out.println(nameOfTest + " is FAIL");
        }
    }

    public void testTotalValueOfStock () {
        StockApp stockApp = new StockApp();
        Stock[] stocks = {
                new Stock("Apple", 250.05, 10),
                new Stock("Coca&Cola", 150.95, 5),
        };
        double realResult = stockApp.totalValueOfStocks(stocks);
        testForm(realResult, 401.0, "Test Total Value Of Stock");
    }

    public void testZeroValueOfStock () {
        StockApp stockApp = new StockApp();
        Stock[] stocks = {};
        double realResult = stockApp.totalValueOfStocks(stocks);
        testForm(realResult, 0.0, "Test Zero Value Of Stock");
    }

    //401 0,623 (6,236)1,882 = 8,118
    public void testAverageReturnOnInvestmentPortfolio () {
        StockApp stockApp = new StockApp();
        Stock[] stocks = {
                new Stock("Apple", 250.05, 10),
                new Stock("Coca&Cola", 150.95, 5)};
        double realResult = stockApp.averageReturnOnInvestmentPortfolio(stocks);
        testForm(realResult, 8.117830, "Test Average Return On Investment Portfolio");
    }

    public void testZeroAverageReturnOnInvestmentPortfolio () {
        StockApp stockApp = new StockApp();
        Stock[] stocks = {};
        double realResult = stockApp.averageReturnOnInvestmentPortfolio(stocks);
        testForm(realResult, 0.0, "Test Average Return On Investment Portfolio");
    }

}

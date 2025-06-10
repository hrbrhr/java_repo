package org.javaguru.student_artjoms_babicevs.lesson_7.level_6.task_1;

 class PortfolioAnalyserTest {

     public static void main(String[] args) {
         PortfolioAnalyserTest test = new PortfolioAnalyserTest();
         test.testEmptyPortfolio();
         test.testSingleStock();
         test.testMultipleStocks();
     }

     void testEmptyPortfolio() {
         PortfolioAnalyser analyser = new PortfolioAnalyser();
         Stock[] stocks = {};
         checkDoubleResult(analyser.calculateTotalAssetValue(stocks), 0.0, "Empty Portfolio - Total Value");
         checkDoubleResult(analyser.calculateAverageReturnInPercents(stocks), 0.0, "Empty Portfolio - Avg Return");
     }

     void testSingleStock() {
         PortfolioAnalyser analyser = new PortfolioAnalyser();
         Stock[] stocks = {
                 new Stock("AAPL", 1500.0, 7.0)
         };
         checkDoubleResult(analyser.calculateTotalAssetValue(stocks), 1500.0, "Single Stock - Total Value");
         checkDoubleResult(analyser.calculateAverageReturnInPercents(stocks), 7.0, "Single Stock - Avg Return");
     }

     void testMultipleStocks() {
         PortfolioAnalyser analyser = new PortfolioAnalyser();
         Stock[] stocks = {
                 new Stock("AAPL", 1000.0, 6.0),
                 new Stock("GOOG", 2000.0, 9.0),
                 new Stock("MSFT", 1500.0, 12.0)
         };
         checkDoubleResult(analyser.calculateTotalAssetValue(stocks), 4500.0, "Multiple Stocks - Total Value");
         checkDoubleResult(analyser.calculateAverageReturnInPercents(stocks), 9.0, "Multiple Stocks - Avg Return");
     }

     void checkDoubleResult(double actual, double expected, String testName) {
         if (Math.abs(actual - expected) < 0.0001) {
             System.out.println(testName + ": TEST OK");
         } else {
             System.out.println(testName + ": TEST FAIL — Expected: " + expected + ", Actual: " + actual);
         }
     }
 }
package org.javaguru.student_artjoms_babicevs.lesson_7.level_6.task_1;

 class PortfolioAnalyser {

     public double calculateTotalAssetValue(Stock[] stocks) {
         if (stocks == null || stocks.length == 0) {
             return 0.0;
         }
         double total = 0.0;
         for (Stock stock : stocks) {
             total += stock.getAssetValue();
         }
         return total;
     }
     public double calculateAverageReturnInPercents(Stock[] stocks) {
         if (stocks == null || stocks.length == 0) {
             return 0.0;
         }
         double totalReturn = 0.0;
         for (Stock stock : stocks) {
             totalReturn += stock.getReturnInPercents();
         }
         return totalReturn / stocks.length;
     }
 }



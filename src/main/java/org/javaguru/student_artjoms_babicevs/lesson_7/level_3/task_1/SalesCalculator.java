package org.javaguru.student_artjoms_babicevs.lesson_7.level_3.task_1;

class SalesCalculator {

  public double calculateTotalSales(Receipt[] receipts) {
      double total = 0.0;
      for (Receipt receipt : receipts) {
          total += receipt.getAmount();
      }
      return total;
  }
      public double calculateAverageSale(Receipt[] receipts) {
          if (receipts.length == 0) {
              return 0.0;
          }
          return calculateTotalSales(receipts) / receipts.length;
      }


  }
package org.javaguru.student_vitalii_lutsenko.lesson_7.homework.level_3;

 class CashReceiptApp {

     public static void main(String[] args) {
         CashReceipt[] receipts = {
                 new CashReceipt("#101", 25.50),
                 new CashReceipt("#102", 10.00),
                 new CashReceipt("#103", 40.25)
         };

         CashReceiptCalculator calculator = new CashReceiptCalculator();
         double total = calculator.calculateTotalSalesSum(receipts);
         double average = calculator.calculateAverageReceiptSum(receipts);

         System.out.println("Total sales: " + total);
         System.out.println("Average check: " + average);
     }


}

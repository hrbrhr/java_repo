package org.javaguru.student_artjoms_babicevs.lesson_7.level_3.task_1;

 class Receipt {

     private final int receiptNumber;
     private final double amount;


     public Receipt(int receiptNumber, double amount) {
         this.receiptNumber = receiptNumber;
         this.amount = amount;

     }
     public int getReceiptNumber() {
         return receiptNumber;
     }
     public double getAmount() {
     return amount;

     }
}

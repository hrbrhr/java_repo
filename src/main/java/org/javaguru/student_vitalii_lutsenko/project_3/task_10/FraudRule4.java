package org.javaguru.student_vitalii_lutsenko.project_3.task_10;

class FraudRule4 implements FraudRule {

     public boolean isFraud(Transaction transaction) {

         Trader trader = transaction.getTrader();
         return (trader.getCountry().equals("Jamaica"));
     }

}

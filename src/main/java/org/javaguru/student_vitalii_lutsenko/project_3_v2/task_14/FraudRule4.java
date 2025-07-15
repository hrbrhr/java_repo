package org.javaguru.student_vitalii_lutsenko.project_3_v2.task_14;

class FraudRule4 implements FraudRule {

     public boolean isFraud(Transaction transaction) {
         Trader trader = transaction.getTrader();
         return (trader.getCountry().equals("Jamaica"));
     }

}

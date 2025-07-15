package org.javaguru.student_vitalii_lutsenko.project_3_v2.task_14;

class FraudRule3 implements FraudRule {

     @Override
     public boolean isFraud(Transaction transaction) {
         Trader trader = transaction.getTrader();
         return (trader.getCity().equals("Sydney"));
     }
 }

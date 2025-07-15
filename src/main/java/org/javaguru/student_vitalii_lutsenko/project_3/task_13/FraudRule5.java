package org.javaguru.student_vitalii_lutsenko.project_3.task_13;

class FraudRule5 implements FraudRule {

    public boolean isFraud(Transaction transaction) {
     Trader trader = transaction.getTrader();
     return(trader.getCountry().equals("Germany") && transaction.getAmount()>1000);
    }



 }

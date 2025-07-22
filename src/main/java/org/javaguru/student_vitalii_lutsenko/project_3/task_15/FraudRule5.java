package org.javaguru.student_vitalii_lutsenko.project_3.task_15;

class FraudRule5 implements FraudRule {

    public boolean isFraud(Transaction transaction) {
     Trader trader = transaction.getTrader();
     return(trader.getCountry().equals("Germany") && transaction.getAmount()>1000);
    }

    @Override
    public String getRuleName(){
        return "FraudRule5";
    }

 }

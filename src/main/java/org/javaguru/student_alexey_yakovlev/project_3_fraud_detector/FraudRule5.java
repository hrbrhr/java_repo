package org.javaguru.student_alexey_yakovlev.project_3_fraud_detector;

class FraudRule5 implements FraudRule {

    @Override
    public boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();
        return trader.getCountry().equals("Germany") && transaction.getAmount() > 1000;
    }

    @Override
    public String getRuleName() {
        return "FraudRule5";
    }

}

package org.javaguru.student_alexey_yakovlev.project_3_fraud_detector;

class FraudRule4 implements FraudRule {

    @Override
    public boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();
        return trader.getCountry().equals("Jamaica");
    }
}

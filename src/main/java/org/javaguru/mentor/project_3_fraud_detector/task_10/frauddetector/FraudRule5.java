package org.javaguru.mentor.project_3_fraud_detector.task_10.frauddetector;

class FraudRule5 implements FraudRule {
    @Override
    public boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();
        return trader.getCountry().equals("Germany")
                && transaction.getAmount() > 1000;
    }
}

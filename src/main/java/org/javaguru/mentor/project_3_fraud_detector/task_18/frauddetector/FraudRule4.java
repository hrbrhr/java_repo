package org.javaguru.mentor.project_3_fraud_detector.task_18.frauddetector;

class FraudRule4 implements FraudRule {
    @Override
    public boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();
        return trader.getCountry().equals("Jamaica");
    }

    @Override
    public String getRuleName() {
        return "FraudRule4";
    }

}

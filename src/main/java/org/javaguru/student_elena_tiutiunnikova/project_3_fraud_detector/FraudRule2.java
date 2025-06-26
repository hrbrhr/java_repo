package org.javaguru.student_elena_tiutiunnikova.project_3_fraud_detector;

class FraudRule2 implements FraudRule {

    @Override
    public boolean isFraud (Transaction transaction) {
        Trader trader = transaction.getTrader();
        return transaction.getAmount() >= 1000000;
    }

    public String getRuleName() {
        return "FraudRule2";
    }

}

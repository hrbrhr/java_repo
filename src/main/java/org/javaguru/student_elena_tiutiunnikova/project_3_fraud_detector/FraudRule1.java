package org.javaguru.student_elena_tiutiunnikova.project_3_fraud_detector;

class FraudRule1 implements FraudRule {

    @Override
    public boolean isFraud (Transaction transaction) {
        Trader trader = transaction.getTrader();
        return trader.getFullName().equals("Pocemon");
    }

    @Override
    public String getRuleName() {
        return "FraudRule1";
    }

}

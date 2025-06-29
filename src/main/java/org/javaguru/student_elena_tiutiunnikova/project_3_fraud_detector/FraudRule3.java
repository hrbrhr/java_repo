package org.javaguru.student_elena_tiutiunnikova.project_3_fraud_detector;

class FraudRule3 implements FraudRule {

    @Override
    public boolean isFraud (Transaction transaction) {
        Trader trader = transaction.getTrader();
        return trader.getCity().equals("Sydney");
    }

    public String getRuleName() {
        return "FraudRule3";
    }

}

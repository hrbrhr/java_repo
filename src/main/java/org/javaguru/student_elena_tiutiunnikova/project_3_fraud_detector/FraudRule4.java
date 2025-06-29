package org.javaguru.student_elena_tiutiunnikova.project_3_fraud_detector;

class FraudRule4 implements FraudRule {

    @Override
    public boolean isFraud (Transaction transaction) {
        Trader trader = transaction.getTrader();
        return trader.getCountry().equals("Jamaica");
    }

    public String getRuleName() {
        return "FraudRule4";
    }

}

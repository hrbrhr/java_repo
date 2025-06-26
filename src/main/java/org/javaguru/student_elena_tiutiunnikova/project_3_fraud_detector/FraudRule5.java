package org.javaguru.student_elena_tiutiunnikova.project_3_fraud_detector;

class FraudRule5 implements FraudRule {

    @Override
    public boolean isFraud (Transaction transaction) {
        Trader trader = transaction.getTrader();
        return (trader.getCountry().equals("Germany") && transaction.getAmount() > 1000);
    }
}

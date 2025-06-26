package org.javaguru.student_alexey_yakovlev.project_3_fraud_detector;

class FraudRule3 implements FraudRule{

    @Override
    public boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();
        return trader.getCity().equals("Sydney");
    }
}

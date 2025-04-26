package org.javaguru.mentor.project_1_fraud_detector.task_13.frauddetector;

class FraudRule4 {

    boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();
        return trader.getCountry().equals("Jamaica");
    }

}

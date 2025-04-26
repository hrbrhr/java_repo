package org.javaguru.mentor.project_1_fraud_detector.task_12.frauddetector;

class FraudRule1 {

    boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();
        return trader.getFullName().equals("Pokemon");
    }

}

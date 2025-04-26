package org.javaguru.mentor.project_1_fraud_detector.task_14.frauddetector;

class FraudRule5 {

    boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();
        return trader.getCountry().equals("Germany")
                && transaction.getAmount() > 1000;
    }

}

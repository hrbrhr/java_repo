package org.javaguru.mentor.project_1_fraud_detector.task_13.frauddetector;

class FraudRule2 {

    boolean isFraud(Transaction transaction) {
        return transaction.getAmount() > 1000000;
    }

}

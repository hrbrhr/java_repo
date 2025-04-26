package org.javaguru.mentor.project_1_fraud_detector.task_16.frauddetector;

class FraudDetector {

    boolean isFraud(Transaction transaction) {
        return new FraudRule1().isFraud(transaction)
                || new FraudRule2().isFraud(transaction)
                || new FraudRule3().isFraud(transaction)
                || new FraudRule4().isFraud(transaction)
                || new FraudRule5().isFraud(transaction)
                || new FraudRule6().isFraud(transaction);
    }

}

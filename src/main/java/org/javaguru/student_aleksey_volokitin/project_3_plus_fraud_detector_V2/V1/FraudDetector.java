package org.javaguru.student_aleksey_volokitin.project_3_plus_fraud_detector_V2.V1;

class FraudDetector {
    boolean isFraud(Transaction transaction) {

        return new FraudRule1().isFraud(transaction) ||
               new FraudRule2().isFraud(transaction) ||
               new FraudRule3().isFraud(transaction) ||
               new FraudRule4().isFraud(transaction) ||
               new FraudRule5().isFraud(transaction) ||
               new FraudRule6().isFraud(transaction);
    }
}

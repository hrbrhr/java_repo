package org.javaguru.student_aleksey_volokitin.project_3_plus_fraud_detector_interface;

class FraudDetector {
    boolean isFraud(Transaction transaction) {
        FraudRule rule1 = new FraudRule1();
        FraudRule rule2 = new FraudRule2();
        FraudRule rule3 = new FraudRule3();
        FraudRule rule4 = new FraudRule4();
        FraudRule rule5 = new FraudRule5();

        return rule1.isFraud(transaction) ||
               rule2.isFraud(transaction) ||
               rule3.isFraud(transaction) ||
               rule4.isFraud(transaction) ||
               rule5.isFraud(transaction);
    }
}

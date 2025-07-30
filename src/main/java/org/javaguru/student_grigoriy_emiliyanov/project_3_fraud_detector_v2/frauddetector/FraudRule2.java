package org.javaguru.student_grigoriy_emiliyanov.project_3_fraud_detector_v2.frauddetector;

class FraudRule2 extends FraudRule {
    @Override
    boolean isViolated(Transaction transaction) {
        return transaction.getAmount() > 1_000_000;
    }
}

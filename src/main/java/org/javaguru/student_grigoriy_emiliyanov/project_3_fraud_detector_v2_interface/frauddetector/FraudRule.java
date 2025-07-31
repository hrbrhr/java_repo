package org.javaguru.student_grigoriy_emiliyanov.project_3_fraud_detector_v2_interface.frauddetector;

abstract class FraudRule {
    abstract boolean isViolated(Transaction transaction);

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}

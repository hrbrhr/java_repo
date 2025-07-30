package org.javaguru.student_grigoriy_emiliyanov.project_3_fraud_detector_v2.frauddetector;

abstract class FraudRule {
    abstract boolean isViolated(Transaction transaction);
}

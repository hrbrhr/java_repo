package org.javaguru.student_aleksey_volokitin.project_3_plus_fraud_detector_interface;

class FraudDetectionResult {
    private boolean fraud;
    private String ruleName;

    public FraudDetectionResult(boolean fraud, String ruleName) {
        this.fraud = fraud;
        this.ruleName = ruleName;
    }

    public boolean isFraud() {
        return fraud;
    }

    public String ruleName() {
        return ruleName;
    }
}

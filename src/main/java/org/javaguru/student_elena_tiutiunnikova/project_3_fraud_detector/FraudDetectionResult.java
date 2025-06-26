package org.javaguru.student_elena_tiutiunnikova.project_3_fraud_detector;

class FraudDetectionResult {

    private boolean fraud;
    private String ruleName;

    public FraudDetectionResult (boolean fraud, String ruleName) {
        this.fraud = fraud;
        this.ruleName = ruleName;
    }

    public boolean isFraud () {return fraud;}
    public String getRuleName () {return ruleName;}
}

package org.javaguru.student_grigoriy_emiliyanov.project_3_fraud_detector_v2_interface.frauddetector;

import java.util.Objects;

public class FraudCheckResult {
    private boolean isFraud;
    private String ruleName;

    public FraudCheckResult(boolean isFraud, String ruleName) {
        this.isFraud = isFraud;
        this.ruleName = ruleName;
    }

    public boolean isFraud() {
        return isFraud;
    }

    public String getRuleName() {
        return ruleName;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof FraudCheckResult that)) return false;
        return isFraud == that.isFraud && Objects.equals(ruleName, that.ruleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isFraud, ruleName);
    }
}

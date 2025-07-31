package org.javaguru.student_grigoriy_emiliyanov.project_3_fraud_detector_v2_interface.frauddetector;

import java.util.List;

class FraudDetector {
    private final List<FraudRule> fraudRules = List.of(
            new FraudRule1(),
            new FraudRule2(),
            new FraudRule3(),
            new FraudRule4(),
            new FraudRule5(),
            new FraudRule6()
    );

    FraudCheckResult isFraud(Transaction transaction) {
        for (FraudRule fraudRule : fraudRules) {
            if (fraudRule.isViolated(transaction)) return new FraudCheckResult(true, fraudRule.toString());
        }
        return new FraudCheckResult(false, null);
    }
}

package org.javaguru.student_grigoriy_emiliyanov.project_3_fraud_detector_v2.frauddetector;

import java.util.List;

class FraudDetector {
    private final List<FraudRule> fraudRules = List.of(
            new FraudRule1(),
            new FraudRule2(),
            new FraudRule3()
    );

    boolean isFraud(Transaction transaction) {
        for (FraudRule fraudRule : fraudRules) {
            if (fraudRule.isViolated(transaction)) return true;
        }
        return false;
    }

}

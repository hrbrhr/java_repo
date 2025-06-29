package org.javaguru.student_aleksey_volokitin.project_3_plus_fraud_detector_interface;

import java.util.List;

class FraudDetector {
    List<FraudRule> fraudRules = List.of(
            new FraudRule1(),
            new FraudRule2(),
            new FraudRule3(),
            new FraudRule4(),
            new FraudRule5()
    );

    FraudDetectionResult isFraud(Transaction transaction) {
        for (FraudRule fraudRule : fraudRules) {
            if (fraudRule.isFraud(transaction)) {
                String ruleName = fraudRule.ruleName();
                return new FraudDetectionResult(true, ruleName);
            }
        }

        return new FraudDetectionResult(false, null);
    }
}

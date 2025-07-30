package org.javaguru.student_grigoriy_emiliyanov.project_3_fraud_detector_v2.frauddetector;

class FraudRule1 extends FraudRule {
    boolean isViolated(Transaction transaction) {
        String traderName = transaction.getTrader().getFullName();
        return traderName.equals("Pokemon");
    }
}

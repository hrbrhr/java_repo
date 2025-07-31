package org.javaguru.student_grigoriy_emiliyanov.project_3_fraud_detector_v2_interface.frauddetector;

class FraudRule2 extends FraudRule {
    private final int BIG_AMOUNT_LIMIT = 1_000_000;

    @Override
    boolean isViolated(Transaction transaction) {
        return transaction.getAmount() > BIG_AMOUNT_LIMIT;
    }
}

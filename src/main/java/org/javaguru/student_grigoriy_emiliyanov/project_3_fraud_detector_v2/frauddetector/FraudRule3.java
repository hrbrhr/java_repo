package org.javaguru.student_grigoriy_emiliyanov.project_3_fraud_detector_v2.frauddetector;

class FraudRule3 extends FraudRule {

    @Override
    boolean isViolated(Transaction transaction) {
        return transaction.getTrader().getCity().equals("Sydney");
    }
}

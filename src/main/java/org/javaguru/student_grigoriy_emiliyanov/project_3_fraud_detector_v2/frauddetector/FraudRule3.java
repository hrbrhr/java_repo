package org.javaguru.student_grigoriy_emiliyanov.project_3_fraud_detector_v2.frauddetector;

class FraudRule3 extends FraudRule {
    private final String FRAUDER_CITY = "Sydney";

    @Override
    boolean isViolated(Transaction transaction) {
        String tradersCity = transaction.getTrader().getCity();
        return tradersCity.equalsIgnoreCase(FRAUDER_CITY);
    }
}

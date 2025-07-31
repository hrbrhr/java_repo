package org.javaguru.student_grigoriy_emiliyanov.project_3_fraud_detector_v2.frauddetector;

class FraudRule4 extends FraudRule {
    private final String FRAUDER_COUNTRY = "Jamaica";
    @Override
    boolean isViolated(Transaction transaction) {
        String tradersCity = transaction.getTrader().getCountry();
        return tradersCity.equalsIgnoreCase(FRAUDER_COUNTRY);
    }
}

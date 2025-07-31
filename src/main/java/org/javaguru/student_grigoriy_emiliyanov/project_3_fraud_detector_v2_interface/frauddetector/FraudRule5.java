package org.javaguru.student_grigoriy_emiliyanov.project_3_fraud_detector_v2_interface.frauddetector;

class FraudRule5 extends FraudRule {
    private final String FRAUDER_COUNTRY = "Germany";
    private final int AMOUNT_LIMIT = 1_000;

    @Override
    boolean isViolated(Transaction transaction) {
        String tradersCountry = transaction.getTrader().getCountry();
        int transactionAmount = transaction.getAmount();
        return tradersCountry.equalsIgnoreCase(FRAUDER_COUNTRY) && transactionAmount > AMOUNT_LIMIT;
    }
}

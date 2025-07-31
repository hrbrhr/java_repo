package org.javaguru.student_grigoriy_emiliyanov.project_3_fraud_detector_v2_interface.frauddetector;

class FraudRule1 extends FraudRule {
    private final String FRAUDER_NAME_1 = "Pokemon";
    private final String FRAUDER_NAME_2 = "DJ";

    boolean isViolated(Transaction transaction) {
        String traderName = transaction.getTrader().getFullName();
        return traderName.equalsIgnoreCase(FRAUDER_NAME_1) ||
                traderName.equalsIgnoreCase(FRAUDER_NAME_2);
    }
}

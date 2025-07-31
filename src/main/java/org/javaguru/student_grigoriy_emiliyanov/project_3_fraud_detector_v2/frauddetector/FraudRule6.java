package org.javaguru.student_grigoriy_emiliyanov.project_3_fraud_detector_v2.frauddetector;

import java.util.Locale;

class FraudRule6 extends FraudRule {
    private final String NAME_PREFIX = "Lol";
    private final String FRAUD_COUNTRY = "Japan";

    @Override
    boolean isViolated(Transaction transaction) {
        Trader trader = transaction.getTrader();
        return trader.getFullName().toLowerCase().startsWith(NAME_PREFIX.toLowerCase()) &&
                trader.getCountry().equalsIgnoreCase(FRAUD_COUNTRY);
    }
}

package org.javaguru.student_aleksey_volokitin.project_3_fraud_detector_new;

class FraudDetector {
    boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();

        // Rule 1
        if (trader.getFullName().equalsIgnoreCase("Pokemon")) {
            return true;
        }
        else {
            return false;
        }
    }
}

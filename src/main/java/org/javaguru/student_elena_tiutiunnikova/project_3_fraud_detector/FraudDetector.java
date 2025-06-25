package org.javaguru.student_elena_tiutiunnikova.project_3_fraud_detector;

class FraudDetector {

    boolean isFraud(Transaction transaction) {

        Trader trader = transaction.getTrader();
        if (trader.getFullName().equals("Pocemon")) {
            return true;
        } else {
            return false;
        }

    }


}

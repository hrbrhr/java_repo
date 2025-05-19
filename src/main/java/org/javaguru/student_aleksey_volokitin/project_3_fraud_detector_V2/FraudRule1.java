package org.javaguru.student_aleksey_volokitin.project_3_fraud_detector_V2;

class FraudRule1 {
    boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();
        // Rule 1: трейдер по имени "Pokemon" является мошенником, все его транзакции должны быть отклонены.

        return  (trader.getFullName().equalsIgnoreCase("Pokemon")) ||
                (trader.getFullName().equalsIgnoreCase("DJ"));
    }
}

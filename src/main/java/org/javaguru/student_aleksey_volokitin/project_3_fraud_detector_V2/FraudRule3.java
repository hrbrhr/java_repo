package org.javaguru.student_aleksey_volokitin.project_3_fraud_detector_V2;

class FraudRule3 {
    boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();

        // Rule 3: все транзакции трейдеров из города "Sydney" должны быть отклонены.
        return trader.getCity().equalsIgnoreCase("Sidney");
    }
}

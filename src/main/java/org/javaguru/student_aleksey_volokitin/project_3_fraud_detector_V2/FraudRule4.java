package org.javaguru.student_aleksey_volokitin.project_3_fraud_detector_V2;

class FraudRule4 {
    boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();

        // Rule 4: все транзакции от трейдеров из страны Ямайка должны быть отклонены.
        return trader.getCountry().equalsIgnoreCase("Jamaica");
    }
}

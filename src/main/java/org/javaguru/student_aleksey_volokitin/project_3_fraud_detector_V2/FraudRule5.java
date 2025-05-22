package org.javaguru.student_aleksey_volokitin.project_3_fraud_detector_V2;

class FraudRule5 {
    boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();

        // Rule 5: все транзакции трейдеров из Германии на сумму больше 1000 должны быть отклонены.
        return (trader.getCountry().equalsIgnoreCase("Germany")) && (transaction.getAmount() > 1000);
    }
}

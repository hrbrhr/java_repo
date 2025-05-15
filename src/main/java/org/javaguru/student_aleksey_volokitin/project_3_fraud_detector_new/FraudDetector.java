package org.javaguru.student_aleksey_volokitin.project_3_fraud_detector_new;

class FraudDetector {
    boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();

        // Rule 1: трейдер по имени "Pokemon" является мошенником, все его транзакции должны быть отклонены.
        if (trader.getFullName().equalsIgnoreCase("Pokemon")) {
            return true;
        }
        // Rule 2: все транзакции на сумму больше 1000000 должны быть отклонены
        else if (transaction.getAmount() > 1000000) {
            return true;
        }
        // Rule 3: все транзакции трейдеров из города "Sydney" должны быть отклонены.
        else if (trader.getCity().equalsIgnoreCase("Sidney")) {
            return true;
        }
        // Rule 4: все транзакции от трейдеров из страны Ямайка должны быть отклонены.
        else if (trader.getCountry().equalsIgnoreCase("Jamaica")) {
            return true;
        }
        else {
            return false;
        }


    }
}

package org.javaguru.student_aleksey_volokitin.project_3_plus_fraud_detector_V2.V2;

class FraudRule2 {
    boolean isFraud(Transaction transaction) {

        // Rule 2: все транзакции на сумму больше 1000000 должны быть отклонены
        return transaction.getAmount() > 1000000;
        }
}

package org.javaguru.student_aleksey_volokitin.project_3_fraud_detector_V2;

class FraudRule6 {
    boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();

        // Rule 6: всех трейдеров имя которых начинается на "LOL-" из страны "Japan" признавать мошенниками,
        // все их транзакции должны быть отклонены.
        String originalTraderFullName = trader.getFullName();
        String modifiedTraderFullName;

        if (originalTraderFullName.length() >= 4) {
            modifiedTraderFullName = originalTraderFullName.substring(0, 4);
        }
        else {
            modifiedTraderFullName = originalTraderFullName;
        }

        return (modifiedTraderFullName.equalsIgnoreCase("LOL-")) &&
               (trader.getCountry().equalsIgnoreCase("Japan"));
    }
}

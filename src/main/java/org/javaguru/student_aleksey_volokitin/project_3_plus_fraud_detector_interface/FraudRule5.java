package org.javaguru.student_aleksey_volokitin.project_3_plus_fraud_detector_interface;

import java.util.ArrayList;
import java.util.List;

class FraudRule5 implements FraudRule {

    public boolean isFraud(Transaction transaction) {
        List<Rule5Data> rule5DataList = List.of(
            new Rule5Data("LOL-", "Japan"),
            new Rule5Data("INT-", "France"),
            new Rule5Data("COS-", "UK")
        );
        // Rule 5: если префикс имени трейдера совпадает с префиксом из ограничивающего списка rule5DataList
        // и превышению максимальной суммы транзакции, все их транзакции должны быть отклонены.

        boolean result = false;
        Trader trader = transaction.getTrader();

        for (int i = 0; i < rule5DataList.size(); i++) {
            Rule5Data rule5Data = rule5DataList.get(i);
            String originalFullNameOfTrader = trader.getFullName();
            String modifiedTraderFullName;
            String country = rule5Data.getCountry();

            if (originalFullNameOfTrader.length() >= 4) {
                modifiedTraderFullName = originalFullNameOfTrader.substring(0, 4);
            }
            else {
                modifiedTraderFullName = originalFullNameOfTrader;
            }

            if ((rule5Data.getStartNameOfTrader().equalsIgnoreCase(modifiedTraderFullName)) &&
                    (trader.getCountry().equalsIgnoreCase(country))) {
                result = true;
            }
        }
        return result;
    }

    public String ruleName() {
        return "Fraud rule 5";
    }
}

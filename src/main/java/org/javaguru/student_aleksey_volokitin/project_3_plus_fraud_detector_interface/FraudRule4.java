package org.javaguru.student_aleksey_volokitin.project_3_plus_fraud_detector_interface;

import java.util.ArrayList;
import java.util.List;

class FraudRule4 implements FraudRule {

    private List<Rule4Data> rule4DataList;

    public boolean isFraud(Transaction transaction) {
        // задаем названия стран и максимальные суммы транзакций, которые считаются мошенническими
        List<Rule4Data> rule4DataList = List.of(
            new Rule4Data("Jamaica", 100),
            new Rule4Data("USA", 50000),
            new Rule4Data("UK", 100000)
        );
        // Rule 4: если страна совпадает со страной из ограничивающего списка rule4DataList
        // по названию страны и превышению максимальной суммы транзакции, все их транзакции должны быть отклонены.

        boolean result = false;
        Trader trader = transaction.getTrader();

        for (int i = 0; i < rule4DataList.size(); i++) {
            Rule4Data rule4Data = rule4DataList.get(i);
            String country = rule4Data.getCountry();
            int maxThresholdValue = rule4Data.getMaxThresholdValue();
            if ((trader.getCountry().equalsIgnoreCase(country)) && (transaction.getAmount() > maxThresholdValue)) {
                result = true;
            }
        }
        return result;
    }

    public String ruleName() {
        return "Fraud rule 4";
    }
}

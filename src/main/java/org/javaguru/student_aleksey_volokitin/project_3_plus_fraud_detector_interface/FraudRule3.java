package org.javaguru.student_aleksey_volokitin.project_3_plus_fraud_detector_interface;

import java.util.List;

class FraudRule3 implements FraudRule {

    @Override
    public boolean isFraud(Transaction transaction) {
        // задаем названия городов и максимальные суммы транзакций, которые считаются мошенническими
        List<Rule3Data> rule3DataList = List.of(
                new Rule3Data("Sidney", 0),
                new Rule3Data("London", 1000),
                new Rule3Data("California", 10000)
        );
        // Rule 3: если город совпадает с городом из ограничивающего списка rule3DataList
        // по названию города и превшению максимальной суммы транзакции, все их транзакции должны быть отклонены.

        boolean result = false;
        Trader trader = transaction.getTrader();

        for (int i = 0; i < rule3DataList.size(); i++) {
            Rule3Data rule3Data = rule3DataList.get(i);
            String city = rule3Data.getCity();
            int maxThresholdValue = rule3Data.getMaxThresholdValue();
            if ((trader.getCity().equalsIgnoreCase(city)) && (transaction.getAmount() > maxThresholdValue)) {
                result = true;
            }
        }
        return result;
    }

    public String ruleName() {
        return "Fraud rule 3";
    }
}

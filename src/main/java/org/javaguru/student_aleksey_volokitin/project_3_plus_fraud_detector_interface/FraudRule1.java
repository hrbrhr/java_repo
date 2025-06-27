package org.javaguru.student_aleksey_volokitin.project_3_plus_fraud_detector_interface;

import java.util.List;

class FraudRule1 implements FraudRule {

    @Override
    public boolean isFraud(Transaction transaction) {
        // задаем имена трейдеров и максимальные суммы транзакций, которые считаются мошенническими
        List<Rule1Data> rule1DataList = List.of(
            new Rule1Data("Pokemon", 0),
            new Rule1Data("DJ", 0),
            new Rule1Data("Aleks", 100000),
            new Rule1Data("Dmitry", 1000)
        );
        // Rule 1: если трейдер совпадает с трейдерами из ограничивающего списка rule1DataList
        // по имени и превышению максимальной суммы транзакции, все их транзакции должны быть отклонены.

        boolean result = false;
        Trader trader = transaction.getTrader();

        for (int i = 0; i < rule1DataList.size(); i++) {
            Rule1Data rule1Data = rule1DataList.get(i);
            String fullNameOfTrader = rule1Data.getFullNameOfTrader();
            int maxThresholdValue = rule1Data.getMaxThresholdAmount();
            if ((trader.getFullName().equalsIgnoreCase(fullNameOfTrader)) &&
               (transaction.getAmount() > maxThresholdValue)) {
                result = true;
            }
        }
        return result;
    }

    public String ruleName() {
        return "Fraud rule 1";
    }
}

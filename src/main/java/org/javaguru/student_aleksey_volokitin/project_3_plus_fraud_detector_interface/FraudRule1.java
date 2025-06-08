package org.javaguru.student_aleksey_volokitin.project_3_plus_fraud_detector_interface;

import java.util.ArrayList;
import java.util.List;

class FraudRule1 implements FraudRule {

    private List<Rule1Data> rule1DataList;
    public FraudRule1() {
        this.rule1DataList = new ArrayList<>();
    }
    public void addRule1Data(String fullNameOfTrader, int maxThresholdValue) {
        Rule1Data rule1Data = new Rule1Data(fullNameOfTrader, maxThresholdValue);
        rule1DataList.add(rule1Data);
    }
    @Override
    public boolean isFraud(Transaction transaction) {
        boolean result = false;
        Trader trader = transaction.getTrader();
        // задаем имена трейдеров и максимальные суммы транзакций, которые считаются мошенническими
        rule1DataList.add(new Rule1Data("Pokemon", 0));
        rule1DataList.add(new Rule1Data("DJ", 0));
        rule1DataList.add(new Rule1Data("Aleks", 100000));
        rule1DataList.add(new Rule1Data("Dmitry", 1000));
        // Rule 1: если трейдер совпадает с трейдерами из ограничивающего списка Rule1Data
        // по имени и максимальной сумме транзакции, все их транзакции должны быть отклонены.

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
}

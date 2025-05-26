package org.javaguru.student_aleksey_volokitin.project_3_plus_fraud_detector_V2.V2;

import java.util.ArrayList;
import java.util.List;

class FraudRule1 {

    private List<Rule1Data> rule1DataList;
    public FraudRule1() {
        this.rule1DataList = new ArrayList<>();
    }
    public void addRule1Data(String fullNameOfTrader, int maxThresholdValue) {
        Rule1Data rule1Data = new Rule1Data(fullNameOfTrader, maxThresholdValue);
        rule1DataList.add(rule1Data);
    }
    boolean isFraud(Transaction transaction) {
        boolean result = false;
        Trader trader = transaction.getTrader();
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

package org.javaguru.student_aleksey_volokitin.project_3_plus_fraud_detector_V2.V2;

import java.util.ArrayList;
import java.util.List;

class FraudRule3 {

    private List<Rule3Data> rule3DataList;
    public FraudRule3() {
        this.rule3DataList = new ArrayList<>();
    }
    public void addRule3Data(String city, int maxThresholdValue) {
        Rule3Data rule3Data = new Rule3Data(city, maxThresholdValue);
        rule3DataList.add(rule3Data);
    }

    boolean isFraud(Transaction transaction) {
        boolean result = false;
        Trader trader = transaction.getTrader();

        // Rule 3: все транзакции трейдеров из городов из списка должны быть отклонены.
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
}

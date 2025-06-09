package org.javaguru.student_aleksey_volokitin.project_3_plus_fraud_detector_interface;

import java.util.ArrayList;
import java.util.List;

class FraudRule4 implements FraudRule {

    private List<Rule4Data> rule4DataList;
    public FraudRule4() {
        this.rule4DataList = new ArrayList<>(); }
    public void addRule4Data(String country, int maxThresholdValue) {
        Rule4Data rule4Data = new Rule4Data(country, maxThresholdValue);
        rule4DataList.add(rule4Data);
    }

    public boolean isFraud(Transaction transaction) {
        boolean result = false;
        Trader trader = transaction.getTrader();
        rule4DataList.add(new Rule4Data("Jamaica", 100));
        rule4DataList.add(new Rule4Data("USA", 50000));
        rule4DataList.add(new Rule4Data("UK", 100000));
        // Rule 4: все транзакции от трейдеров из страны из списка должны быть отклонены.

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
}

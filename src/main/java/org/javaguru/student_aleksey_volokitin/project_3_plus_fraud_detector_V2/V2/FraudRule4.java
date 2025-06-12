package org.javaguru.student_aleksey_volokitin.project_3_plus_fraud_detector_V2.V2;

import java.util.ArrayList;
import java.util.List;

class FraudRule4 {

    private List<Rule4Data> rule4DataList;
    public FraudRule4() {
        this.rule4DataList = new ArrayList<>(); }
    public void addRule4Data(String country, int maxThresholdValue) {
        Rule4Data rule4Data = new Rule4Data(country, maxThresholdValue);
        rule4DataList.add(rule4Data);
    }

    boolean isFraud(Transaction transaction) {
        boolean result = false;
        Trader trader = transaction.getTrader();

        // Rule 4: все транзакции от трейдеров из страны bp списка должны быть отклонены.
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

package org.javaguru.student_aleksey_volokitin.project_3_plus_fraud_detector_interface;

import java.util.ArrayList;
import java.util.List;

class FraudRule5 implements FraudRule {

    private List<Rule5Data> rule5DataList;
    public FraudRule5() {
        this.rule5DataList = new ArrayList<>(); }
    public void addRule5Data(String fullNameOfTrader, String country) {
        Rule5Data rule5Data = new Rule5Data(fullNameOfTrader, country);
        rule5DataList.add(rule5Data);
    }

    public boolean isFraud(Transaction transaction) {
        boolean result = false;
        Trader trader = transaction.getTrader();
        rule5DataList.add(new Rule5Data("LOL-", "Japan"));
        rule5DataList.add(new Rule5Data("INT-", "France"));
        rule5DataList.add(new Rule5Data("COS-", "UK"));
        // Rule 5: всех трейдеров имя которых начинается на "LOL-" из страны "Japan"
        // признавать мошенниками, все их транзакции должны быть отклонены.

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
}

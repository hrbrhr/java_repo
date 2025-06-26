package org.javaguru.student_elena_tiutiunnikova.project_3_fraud_detector;

import java.util.List;

class FraudDetector {

    private List<FraudRule> fraudRules = List.of(
        new FraudRule1(),
        new FraudRule2(),
        new FraudRule3(),
        new FraudRule4(),
        new FraudRule5()
    );

    FraudDetectionResult isFraud(Transaction transaction) {
        for (FraudRule fraudRule : fraudRules) {
            if (fraudRule.isFraud(transaction)) {
                String ruleName = fraudRule.getRuleName();
                return new FraudDetectionResult(true, ruleName);
            }
        }
        return new FraudDetectionResult(false, null);
    }
}

//    private boolean findFraudByNameOfTrader (Transaction transaction) {
//        Trader trader = transaction.getTrader();
//        return trader.getFullName().equals("Pocemon");
//    }
//
//    private boolean findFraudByAmountOfTransaction (Transaction transaction) {
//        Trader trader = transaction.getTrader();
//        return transaction.getAmount() >= 1000000;
//    }
//
//    private boolean findFraudByCityOfTrader (Transaction transaction) {
//        Trader trader = transaction.getTrader();
//        return trader.getCity().equals("Sydney");
//    }
//
//    private boolean findFraudByCountryOfTrader (Transaction transaction) {
//        Trader trader = transaction.getTrader();
//        return trader.getCountry().equals("Jamaica");
//    }
//
//    private boolean findFraudByCountryAndAmount (Transaction transaction) {
//        Trader trader = transaction.getTrader();
//        return (trader.getCountry().equals("Germany") && transaction.getAmount() > 1000);
//    }



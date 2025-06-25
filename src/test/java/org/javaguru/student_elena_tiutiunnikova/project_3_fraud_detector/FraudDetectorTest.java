package org.javaguru.student_elena_tiutiunnikova.project_3_fraud_detector;

import static org.junit.jupiter.api.Assertions.*;

class FraudDetectorTest {

    FraudDetector fraudDetector = new FraudDetector();

    public void testTraderPocemonShouldBeFraud () {
        Trader trader = new Trader("Pocemon", "Minsk");
        Transaction transaction = new Transaction(trader, 1);
        assertTrue(fraudDetector.isFraud(transaction));
    }

    public void testOtherTraderShouldNotBeFraud () {
        Trader trader = new Trader("Mouse", "Minsk");
        Transaction transaction = new Transaction(trader, 1);
        assertTrue(fraudDetector.isFraud(transaction));
    }

}
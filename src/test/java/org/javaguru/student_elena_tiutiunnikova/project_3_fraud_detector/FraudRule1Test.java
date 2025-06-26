package org.javaguru.student_elena_tiutiunnikova.project_3_fraud_detector;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FraudRule1Test {

    FraudRule1 fraudRule1 = new FraudRule1();

    @Test
    public void testTraderPocemonShouldBeFraud () {
        Trader trader = new Trader("Pocemon", "Tokyo", "Japan");
        Transaction transaction = new Transaction(trader, 10);
        assertTrue(fraudRule1.isFraud(transaction));
    }

    @Test
    public void testOtherTraderShouldNotBeFraud () {
        Trader trader = new Trader("Mouse", "Minsk", "Belarus");
        Transaction transaction = new Transaction(trader, 10);
        assertFalse(fraudRule1.isFraud(transaction));
    }

}
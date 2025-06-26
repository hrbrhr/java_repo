package org.javaguru.student_elena_tiutiunnikova.project_3_fraud_detector;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FraudRule3Test {

    FraudRule3 fraudRule3 = new FraudRule3();

    @Test
    public void testCitySydneyShouldBeFraud () {
        Trader trader = new Trader("Mouse", "Minsk", "Belarus");
        Transaction transaction = new Transaction(trader, 1000);
        assertTrue(fraudRule3.isFraud(transaction));
    }

    @Test
    public void testOtherCitiesShouldNotBeFraud () {
        Trader trader = new Trader("Mouse", "Minsk", "Belarus");
        Transaction transaction = new Transaction(trader, 1000);
        assertFalse(fraudRule3.isFraud(transaction));
    }

}
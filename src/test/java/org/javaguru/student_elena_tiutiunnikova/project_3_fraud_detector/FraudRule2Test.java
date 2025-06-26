package org.javaguru.student_elena_tiutiunnikova.project_3_fraud_detector;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FraudRule2Test {

    FraudRule2 fraudRule2 = new FraudRule2();

    @Test
    public void testSumOver1mlnShouldBeFraud () {
        Trader trader = new Trader("Mouse", "Minsk", "Belarus");
        Transaction transaction = new Transaction(trader, 1000001);
        assertTrue(fraudRule2.isFraud(transaction));
    }

    @Test
    public void testSumUnder1mlnShouldNotBeFraud () {
        Trader trader = new Trader("Mouse", "Minsk", "Belarus");
        Transaction transaction = new Transaction(trader, 999999);
        assertFalse(fraudRule2.isFraud(transaction));
    }

}
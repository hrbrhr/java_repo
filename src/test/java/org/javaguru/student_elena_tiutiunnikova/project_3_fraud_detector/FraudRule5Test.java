package org.javaguru.student_elena_tiutiunnikova.project_3_fraud_detector;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FraudRule5Test {

    FraudRule5 fraudRule5 = new FraudRule5();

    @Test
    public void testCountryGermanyUnder1000ShouldBeFraud () {
        Trader trader = new Trader("Mouse", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 1001);
        assertTrue(fraudRule5.isFraud(transaction));
    }

    @Test
    public void testCountryGermanyLess1000ShouldNotBeFraud () {
        Trader trader = new Trader("Mouse", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 1000);
        assertFalse(fraudRule5.isFraud(transaction));
    }

}
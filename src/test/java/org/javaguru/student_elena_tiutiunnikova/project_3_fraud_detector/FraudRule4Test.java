package org.javaguru.student_elena_tiutiunnikova.project_3_fraud_detector;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FraudRule4Test {

    FraudRule4 fraudRule4 = new FraudRule4();

    @Test
    public void testCountryJamaicaShouldBeFraud () {
        Trader trader = new Trader("Mouse", "Minsk", "Jamaica");
        Transaction transaction = new Transaction(trader, 1000);
        assertTrue(fraudRule4.isFraud(transaction));
    }

    @Test
    public void testOtherCountriesShouldNotBeFraud () {
        Trader trader = new Trader("Mouse", "Minsk", "Belarus");
        Transaction transaction = new Transaction(trader, 1000);
        assertFalse(fraudRule4.isFraud(transaction));
    }

}
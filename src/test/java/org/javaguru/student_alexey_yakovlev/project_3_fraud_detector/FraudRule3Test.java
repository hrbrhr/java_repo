package org.javaguru.student_alexey_yakovlev.project_3_fraud_detector;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FraudRule3Test {

    private FraudRule3 fraudRule3 = new FraudRule3();

    @Test
    public void shouldBeFraud() {
        Trader trader = new Trader("Ivan", "Sydney", "Italy");
        Transaction transaction = new Transaction(trader, 1000);
        assertTrue(fraudRule3.isFraud(transaction));
    }

    @Test
    public void shouldNotBeFraud() {
        Trader trader = new Trader("Ivan","Kingston", "Germany");
        Transaction transaction = new Transaction(trader, 1000);
        assertFalse(fraudRule3.isFraud(transaction));
    }
}
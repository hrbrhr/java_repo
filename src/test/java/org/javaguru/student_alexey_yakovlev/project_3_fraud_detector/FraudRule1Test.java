package org.javaguru.student_alexey_yakovlev.project_3_fraud_detector;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FraudRule1Test {

    private FraudRule1 fraudRule1 = new FraudRule1();

    @Test
    public void shouldBeFraud() {
        Trader trader = new Trader("Pokemon", "Kingston", "Germany");
        Transaction transaction = new Transaction(trader, 1000);
        assertTrue(fraudRule1.isFraud(transaction));
    }

    @Test
    public void shouldNotBeFraud() {
        Trader trader = new Trader("Ivan","Kingston", "Germany");
        Transaction transaction = new Transaction(trader, 1000);
        assertFalse(fraudRule1.isFraud(transaction));
    }
}
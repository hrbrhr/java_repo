package org.javaguru.student_alexey_yakovlev.project_3_fraud_detector;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FraudRule2Test {

    private FraudRule2 fraudRule2 = new FraudRule2();

    @Test
    public void shouldBeFraud() {
        Trader trader = new Trader("Ivan", "Rome", "Italy");
        Transaction transaction = new Transaction(trader, 1000001);
        assertTrue(fraudRule2.isFraud(transaction));
    }

    @Test
    public void shouldNotBeFraud_1000000() {
        Trader trader = new Trader("Ivan","Rome", "Italy");
        Transaction transaction = new Transaction(trader, 1000000);
        assertFalse(fraudRule2.isFraud(transaction));
    }

    @Test
    public void shouldNotBeFraud() {
        Trader trader = new Trader("Ivan","Rome", "Italy");
        Transaction transaction = new Transaction(trader, 10);
        assertFalse(fraudRule2.isFraud(transaction));
    }
}
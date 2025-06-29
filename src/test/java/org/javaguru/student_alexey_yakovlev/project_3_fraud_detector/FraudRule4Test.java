package org.javaguru.student_alexey_yakovlev.project_3_fraud_detector;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FraudRule4Test {

    private FraudRule4 fraudRule4 = new FraudRule4();

    @Test
    public void shouldBeFraud() {
        Trader trader = new Trader("Ivan", "Sydney", "Jamaica");
        Transaction transaction = new Transaction(trader, 1000);
        assertTrue(fraudRule4.isFraud(transaction));
    }

    @Test
    public void shouldNotBeFraud() {
        Trader trader = new Trader("Ivan","Kingston", "Italy");
        Transaction transaction = new Transaction(trader, 1000);
        assertFalse(fraudRule4.isFraud(transaction));
    }
}
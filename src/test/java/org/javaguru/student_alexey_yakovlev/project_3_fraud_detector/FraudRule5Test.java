package org.javaguru.student_alexey_yakovlev.project_3_fraud_detector;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FraudRule5Test {
    private FraudRule5 fraudRule5 = new FraudRule5();

    @Test
    public void shouldBeFraud() {
        Trader trader = new Trader("Ivan", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 1001);
        assertTrue(fraudRule5.isFraud(transaction));
    }

    @Test
    public void shouldNotBeFraud_1000() {
        Trader trader = new Trader("Ivan", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 1000);
        assertFalse(fraudRule5.isFraud(transaction));
    }

    @Test
    public void shouldNotBeFraud_LessThan_1000() {
        Trader trader = new Trader("Ivan", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 100);
        assertFalse(fraudRule5.isFraud(transaction));
    }

    @Test
    public void shouldNotBeFraud_OtherCountry() {
        Trader trader = new Trader("Ivan", "Berlin", "Italy");
        Transaction transaction = new Transaction(trader, 1001);
        assertFalse(fraudRule5.isFraud(transaction));
    }
}
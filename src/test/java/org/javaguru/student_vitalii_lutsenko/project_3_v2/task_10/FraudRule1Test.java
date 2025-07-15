package org.javaguru.student_vitalii_lutsenko.project_3_v2.task_10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FraudRule1Test {

    private final FraudRule1 fraudRule1 = new FraudRule1();
    @Test
    public void withFraud() {
        Trader trader = new Trader("Pokemon","Berlin","Germany");
        Transaction transaction = new Transaction(trader,1001);
        assertTrue(fraudRule1.isFraud(transaction));

    }
    @Test
    public void withoutFraud() {
        Trader trader = new Trader("Mercedes","Berlin","Germany");
        Transaction transaction = new Transaction(trader,1001);
        assertFalse(fraudRule1.isFraud(transaction));

    }
}
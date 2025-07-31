package org.javaguru.student_grigoriy_emiliyanov.project_3_fraud_detector_v2.frauddetector;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FraudRule2Test {
    @Test
    public void shouldDetectAmountOverMillion() {
        FraudRule2 fraudRule2 = new FraudRule2();
        Trader leo = new Trader("Leonardo", "NY", "USA");
        Transaction transaction = new Transaction(leo, 1_000_001);
        assertTrue(fraudRule2.isViolated(transaction));
    }

    @Test
    public void shouldNotDetectAmountMillion() {
        FraudRule2 fraudRule2 = new FraudRule2();
        Trader leo = new Trader("Leonardo", "NY", "USA");
        Transaction transaction = new Transaction(leo, 1_000_000);
        assertFalse(fraudRule2.isViolated(transaction));
    }

    @Test
    public void shouldNotDetectAmountBellowMillion() {
        FraudRule2 fraudRule2 = new FraudRule2();
        Trader leo = new Trader("Leonardo", "NY", "USA");
        Transaction transaction = new Transaction(leo, 999_999);
        assertFalse(fraudRule2.isViolated(transaction));
    }
}
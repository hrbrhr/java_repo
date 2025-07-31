package org.javaguru.student_grigoriy_emiliyanov.project_3_fraud_detector_v2.frauddetector;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FraudRule5Test {
    @Test
    public void shouldDetectCountryGermanyAndAmountOver1000() {
        FraudRule5 fraudRule5 = new FraudRule5();
        Trader hans = new Trader("Hans", "Berlin", "Germany");
        Transaction transaction = new Transaction(hans, 1001);
        assertTrue(fraudRule5.isViolated(transaction));
    }

    @Test
    public void shouldNotDetectCountryGermanyAndAmount1000() {
        FraudRule5 fraudRule5 = new FraudRule5();
        Trader hans = new Trader("Hans", "Berlin", "Germany");
        Transaction transaction = new Transaction(hans, 1000);
        assertFalse(fraudRule5.isViolated(transaction));
    }

    @Test
    public void shouldNotDetectCountryGermanyAndBellow1000() {
        FraudRule5 fraudRule5 = new FraudRule5();
        Trader hans = new Trader("Hans", "Berlin", "Germany");
        Transaction transaction = new Transaction(hans, 999);
        assertFalse(fraudRule5.isViolated(transaction));
    }

    @Test
    public void shouldNotDetectCountryOtherThanGermanyAndOver1000() {
        FraudRule5 fraudRule5 = new FraudRule5();
        Trader hans = new Trader("Hans", "Vienne", "Austria");
        Transaction transaction = new Transaction(hans, 1001);
        assertFalse(fraudRule5.isViolated(transaction));
    }
}
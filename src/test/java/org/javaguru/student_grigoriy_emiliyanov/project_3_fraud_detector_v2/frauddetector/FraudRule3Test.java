package org.javaguru.student_grigoriy_emiliyanov.project_3_fraud_detector_v2.frauddetector;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FraudRule3Test {
    @Test
    public void shouldDetectCitySydney() {
        FraudRule3 fraudRule3 = new FraudRule3();
        Trader leo = new Trader("Leonardo", "Sydney", "Australia");
        Transaction transaction = new Transaction(leo, 999_999);
        assertTrue(fraudRule3.isViolated(transaction));
    }

    @Test
    public void shouldNotDetectOtherCityThanSydney() {
        FraudRule3 fraudRule3 = new FraudRule3();
        Trader leo = new Trader("Leonardo", "Paris", "France");
        Transaction transaction = new Transaction(leo, 999_999);
        assertFalse(fraudRule3.isViolated(transaction));
    }

}
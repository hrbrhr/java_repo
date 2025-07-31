package org.javaguru.student_grigoriy_emiliyanov.project_3_fraud_detector_v2.frauddetector;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FraudRule4Test {
    @Test
    public void shouldDetectCountryJamaica() {
        FraudRule4 fraudRule4 = new FraudRule4();
        Trader leo = new Trader("Leonardo", "Paris", "Jamaica");
        Transaction transaction = new Transaction(leo, 999_999);
        assertTrue(fraudRule4.isViolated(transaction));
    }

    @Test
    public void shouldNotDetectOtherCountryThanJamaica() {
        FraudRule4 fraudRule4 = new FraudRule4();
        Trader leo = new Trader("Leonardo", "Paris", "France");
        Transaction transaction = new Transaction(leo, 999_999);
        assertFalse(fraudRule4.isViolated(transaction));
    }

}
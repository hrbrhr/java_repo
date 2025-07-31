package org.javaguru.student_grigoriy_emiliyanov.project_3_fraud_detector_v2.frauddetector;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FraudRule6Test {
    @Test
    public void shouldDetectCountryJapanAndNameStartingWithLOL() {
        FraudRule6 fraudRule6 = new FraudRule6();
        Trader loloto = new Trader("loloto", "Some city", "Japan");
        Transaction transaction = new Transaction(loloto, 1001);
        assertTrue(fraudRule6.isViolated(transaction));
    }

    @Test
    public void shouldNotDetectCountryJapanAndNameNotStartingWithLOL() {
        FraudRule6 fraudRule6 = new FraudRule6();
        Trader loto = new Trader("loto", "Some city", "Japan");
        Transaction transaction = new Transaction(loto, 1001);
        assertFalse(fraudRule6.isViolated(transaction));
    }

    @Test
    public void shouldNotDetectCountryOtherThanJapanAndNameStartingWithLOL() {
        FraudRule6 fraudRule6 = new FraudRule6();
        Trader lolita = new Trader("lolita", "Some city", "Russia");
        Transaction transaction = new Transaction(lolita, 1001);
        assertFalse(fraudRule6.isViolated(transaction));
    }
}
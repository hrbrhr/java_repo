package org.javaguru.student_grigoriy_emiliyanov.project_3_fraud_detector_v2.frauddetector;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FraudDetectorTest {

    @Test
    public void rule1shouldDetectTraderPokemon() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader pokemon = new Trader("Pokemon", "NY");
        Transaction transaction = new Transaction(pokemon, 1000);
        assertTrue(fraudDetector.isFraud(transaction));
    }

    @Test
    public void rule1shouldNotDetectOtherThanPokemon() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader leo = new Trader("Leonardo", "NY");
        Transaction transaction = new Transaction(leo, 1000);
        assertFalse(fraudDetector.isFraud(transaction));
    }

    @Test
    public void rule2shouldDetectOverMillion() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader leo = new Trader("Leonardo", "NY");
        Transaction transaction = new Transaction(leo, 1_000_001);
        assertTrue(fraudDetector.isFraud(transaction));
    }

    @Test
    public void rule2shouldNotDetectMillion() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader leo = new Trader("Leonardo", "NY");
        Transaction transaction = new Transaction(leo, 1_000_000);
        assertFalse(fraudDetector.isFraud(transaction));
    }

    @Test
    public void rule2shouldNotDetectBellowMillion() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader leo = new Trader("Leonardo", "NY");
        Transaction transaction = new Transaction(leo, 999_999);
        assertFalse(fraudDetector.isFraud(transaction));
    }

    @Test
    public void rule3shouldDetectSydney() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader leo = new Trader("Leonardo", "Sydney");
        Transaction transaction = new Transaction(leo, 999_999);
        assertTrue(fraudDetector.isFraud(transaction));
    }

    @Test
    public void rule3shouldNotDetectOtherThanSydney() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader leo = new Trader("Leonardo", "Paris");
        Transaction transaction = new Transaction(leo, 999_999);
        assertFalse(fraudDetector.isFraud(transaction));
    }
}

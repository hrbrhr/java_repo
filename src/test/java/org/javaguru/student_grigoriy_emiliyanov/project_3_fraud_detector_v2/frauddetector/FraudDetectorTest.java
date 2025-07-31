package org.javaguru.student_grigoriy_emiliyanov.project_3_fraud_detector_v2.frauddetector;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FraudDetectorTest {

    @Test
    public void rule1ShouldDetectTraderPokemon() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader pokemon = new Trader("Pokemon", "NY", "USA");
        Transaction transaction = new Transaction(pokemon, 1000);
        assertTrue(fraudDetector.isFraud(transaction));
    }

    @Test
    public void rule1ShouldDetectTraderDJ() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader pokemon = new Trader("DJ", "NY", "USA");
        Transaction transaction = new Transaction(pokemon, 1000);
        assertTrue(fraudDetector.isFraud(transaction));
    }

    @Test
    public void rule1ShouldNotDetectOtherThanPokemonAndDJ() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader leo = new Trader("Leonardo", "NY", "USA");
        Transaction transaction = new Transaction(leo, 1000);
        assertFalse(fraudDetector.isFraud(transaction));
    }

    @Test
    public void rule2ShouldDetectAmountOverMillion() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader leo = new Trader("Leonardo", "NY", "USA");
        Transaction transaction = new Transaction(leo, 1_000_001);
        assertTrue(fraudDetector.isFraud(transaction));
    }

    @Test
    public void rule2ShouldNotDetectAmountMillion() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader leo = new Trader("Leonardo", "NY", "USA");
        Transaction transaction = new Transaction(leo, 1_000_000);
        assertFalse(fraudDetector.isFraud(transaction));
    }

    @Test
    public void rule2ShouldNotDetectAmountBellowMillion() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader leo = new Trader("Leonardo", "NY", "USA");
        Transaction transaction = new Transaction(leo, 999_999);
        assertFalse(fraudDetector.isFraud(transaction));
    }

    @Test
    public void rule3ShouldDetectCitySydney() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader leo = new Trader("Leonardo", "Sydney", "Australia");
        Transaction transaction = new Transaction(leo, 999_999);
        assertTrue(fraudDetector.isFraud(transaction));
    }

    @Test
    public void rule3ShouldNotDetectOtherCityThanSydney() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader leo = new Trader("Leonardo", "Paris", "France");
        Transaction transaction = new Transaction(leo, 999_999);
        assertFalse(fraudDetector.isFraud(transaction));
    }

    @Test
    public void rule4ShouldDetectCountryJamaica() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader leo = new Trader("Leonardo", "Paris", "Jamaica");
        Transaction transaction = new Transaction(leo, 999_999);
        assertTrue(fraudDetector.isFraud(transaction));
    }

    @Test
    public void rule4ShouldNotDetectOtherCountryThanJamaica() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader leo = new Trader("Leonardo", "Paris", "France");
        Transaction transaction = new Transaction(leo, 999_999);
        assertFalse(fraudDetector.isFraud(transaction));
    }

    @Test
    public void rule5ShouldDetectCountryGermanyAndAmountOver1000() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader hans = new Trader("Hans", "Berlin", "Germany");
        Transaction transaction = new Transaction(hans, 1001);
        assertTrue(fraudDetector.isFraud(transaction));
    }

    @Test
    public void rule5ShouldNotDetectCountryGermanyAndAmount1000() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader hans = new Trader("Hans", "Berlin", "Germany");
        Transaction transaction = new Transaction(hans, 1000);
        assertFalse(fraudDetector.isFraud(transaction));
    }

    @Test
    public void rule5ShouldNotDetectCountryGermanyAndBellow1000() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader hans = new Trader("Hans", "Berlin", "Germany");
        Transaction transaction = new Transaction(hans, 999);
        assertFalse(fraudDetector.isFraud(transaction));
    }

    @Test
    public void rule5ShouldNotDetectCountryOtherThanGermanyAndOver1000() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader hans = new Trader("Hans", "Vienne", "Austria");
        Transaction transaction = new Transaction(hans, 1001);
        assertFalse(fraudDetector.isFraud(transaction));
    }

    @Test
    public void rule6ShouldDetectCountryJapanAndNameStartingWithLOL() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader loloto = new Trader("loloto", "Some city", "Japan");
        Transaction transaction = new Transaction(loloto, 1001);
        assertTrue(fraudDetector.isFraud(transaction));
    }

    @Test
    public void rule6ShouldNotDetectCountryJapanAndNameNotStartingWithLOL() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader loto = new Trader("loto", "Some city", "Japan");
        Transaction transaction = new Transaction(loto, 1001);
        assertFalse(fraudDetector.isFraud(transaction));
    }
}

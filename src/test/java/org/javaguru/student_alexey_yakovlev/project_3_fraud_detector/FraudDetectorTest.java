package org.javaguru.student_alexey_yakovlev.project_3_fraud_detector;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FraudDetectorTest {

    FraudDetector fraudDetector = new FraudDetector();

    @Test
    public void shouldBeFraudTransactionFromTraderPokemon() {
        Trader trader = new Trader("Pokemon", "Rome", "Italy");
        Transaction transaction = new Transaction(trader, 1000);
        FraudDetectionResult result = fraudDetector.isFraud(transaction);
        assertTrue(result.isFraud());
        assertEquals(result.getRuleName(), "FraudRule1");
    }

    @Test
    public void shouldNotBeFraudTransactionFromOtherTraderThenPokemon() {
        Trader trader = new Trader("Ivan", "Rome", "Italy");
        Transaction transaction = new Transaction(trader, 1000);
        FraudDetectionResult result = fraudDetector.isFraud(transaction);
        assertFalse(result.isFraud());
        assertNull(result.getRuleName());
    }

    @Test
    public void shouldBeFraudTransactionWithAmountMoreThen1000000() {
        Trader trader = new Trader("Ivan", "Rome", "Italy");
        Transaction transaction = new Transaction(trader, 1000001);
        FraudDetectionResult result = fraudDetector.isFraud(transaction);
        assertTrue(result.isFraud());
        assertEquals(result.getRuleName(), "FraudRule2");
    }

    @Test
    public void shouldBeFraudIfTraderFromSydney() {
        Trader trader = new Trader("Ivan", "Sydney", "Italy");
        Transaction transaction = new Transaction(trader, 1000);
        FraudDetectionResult result = fraudDetector.isFraud(transaction);
        assertTrue(result.isFraud());
        assertEquals(result.getRuleName(), "FraudRule3");
    }

    @Test
    public void shouldBeFraudIfTraderFromJamaica() {
        Trader trader = new Trader("Ivan", "Kingston", "Jamaica");
        Transaction transaction = new Transaction(trader, 1000);
        FraudDetectionResult result = fraudDetector.isFraud(transaction);
        assertTrue(result.isFraud());
        assertEquals(result.getRuleName(), "FraudRule4");
    }

    @Test
    public void shouldBeFraudIfTraderFromGermanyAndAmountMoreThan1000() {
        Trader trader = new Trader("Ivan", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 1001);
        FraudDetectionResult result = fraudDetector.isFraud(transaction);
        assertTrue(result.isFraud());
        assertEquals(result.getRuleName(), "FraudRule5");
    }

    @Test
    public void shouldBeValidTransaction() {
        Trader trader = new Trader("Ivan", "Rome", "Italy");
        Transaction transaction = new Transaction(trader, 1000);
        FraudDetectionResult result = fraudDetector.isFraud(transaction);
        assertFalse(result.isFraud());
        assertNull(result.getRuleName());
    }


}
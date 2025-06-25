package org.javaguru.student_alexey_yakovlev.project_3_fraud_detector;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FraudDetectorTest {

    FraudDetector fraudDetector = new FraudDetector();

    @Test
    public void shouldBeFraudTransactionFromTraderPokemon() {
        Trader trader = new Trader("Pokemon", "Rome");
        Transaction transaction = new Transaction(trader, 1000);
        assertTrue(fraudDetector.isFraud(transaction));
    }

    @Test
    public void shouldNotBeFraudTransactionFromOtherTraderThenPokemon() {
        Trader trader = new Trader("Alex", "Rome");
        Transaction transaction = new Transaction(trader, 1000);
        assertFalse(fraudDetector.isFraud(transaction));
    }

    @Test
    public void shouldBeFraudTransactionWithAmountMoreThen1000000() {
        Trader trader = new Trader("Ivan", "Rome");
        Transaction transaction = new Transaction(trader, 1000001);
        assertTrue(fraudDetector.isFraud(transaction));
    }

    @Test
    public void shouldBeValidTransaction() {
        Trader trader = new Trader("Ivan", "Rome");
        Transaction transaction = new Transaction(trader, 1000);
        assertFalse(fraudDetector.isFraud(transaction));
    }

    @Test
    public void shouldBeFraudIfTraderFromSydney() {
        Trader trader = new Trader("Ivan", "Sydney");
        Transaction transaction = new Transaction(trader, 1000);
        assertTrue(fraudDetector.isFraud(transaction));
    }


}
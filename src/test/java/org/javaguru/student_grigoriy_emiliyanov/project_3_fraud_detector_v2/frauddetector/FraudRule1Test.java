package org.javaguru.student_grigoriy_emiliyanov.project_3_fraud_detector_v2.frauddetector;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FraudRule1Test {
    @Test
    public void shouldDetectTraderPokemon() {
        FraudRule1 fraudRule1 = new FraudRule1();
        Trader pokemon = new Trader("Pokemon", "NY", "USA");
        Transaction transaction = new Transaction(pokemon, 1000);
        assertTrue(fraudRule1.isViolated(transaction));
    }

    @Test
    public void shouldDetectTraderDJ() {
        FraudRule1 fraudRule1 = new FraudRule1();
        Trader pokemon = new Trader("DJ", "NY", "USA");
        Transaction transaction = new Transaction(pokemon, 1000);
        assertTrue(fraudRule1.isViolated(transaction));
    }

    @Test
    public void shouldNotDetectOtherThanPokemonAndDJ() {
        FraudRule1 fraudRule1 = new FraudRule1();
        Trader leo = new Trader("Leonardo", "NY", "USA");
        Transaction transaction = new Transaction(leo, 1000);
        assertFalse(fraudRule1.isViolated(transaction));
    }
}
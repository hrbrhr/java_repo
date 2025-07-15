package org.javaguru.student_vitalii_lutsenko.project_3.task_13;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FraudDetectorTest {

    private final FraudDetector fraudDetector = new FraudDetector();

    @Test
    void notFraudNameDifferentPokemon(){
        Trader trader = new Trader("Latish","Riga","Latvia");
        Transaction transaction = new Transaction(trader, 55555);
        FraudDetectionResult result = fraudDetector.isFraud(transaction);
        assertFalse(result.isFraud());
        assertNull(result.getRuleName());

    }
    @Test
    void nameTestWithoutPokemon(){
        Trader trader = new Trader("Latish","Riga","Latvia");
        Transaction transaction = new Transaction(trader,1000);
        FraudDetectionResult result = fraudDetector.isFraud(transaction);
        assertFalse(result.isFraud());
        assertNull(result.getRuleName());
    }
    @Test
    void nameTestWithPokemon(){
        Trader trader = new Trader("Pokemon","Riga","Latvia");
        Transaction transaction = new Transaction(trader,10000);
        FraudDetectionResult result = fraudDetector.isFraud(transaction);
        assertTrue(result.isFraud());
        assertEquals(result.getRuleName(), "FraudRule1");
    }
    @Test
    void amountTestUpTo1m(){
        Trader trader = new Trader("Latish","Riga","latvia");
        Transaction transaction = new Transaction(trader,1000009);
        FraudDetectionResult result = fraudDetector.isFraud(transaction);
        assertTrue(result.isFraud());
        assertEquals(result.getRuleName(),"FraudRule2");
    }
    @Test
    void amountTestOver1m(){
        Trader trader = new Trader("Latish","Riga","Latvia");
        Transaction transaction = new Transaction(trader,999999);
        FraudDetectionResult result = fraudDetector.isFraud(transaction);
        assertFalse(result.isFraud());
        assertNull(result.getRuleName());
    }
    @Test
    void cityTestWithSydney(){
        Trader trader = new Trader("Latish","Sydney","Latvia");
        Transaction transaction = new Transaction(trader,100);
        FraudDetectionResult result = fraudDetector.isFraud(transaction);
        assertTrue(result.isFraud());
        assertEquals(result.getRuleName(), "FraudRule3");
    }
    @Test
    void cityTestWithoutSydney(){
        Trader trader = new Trader("Latish","Saldus","Latvia");
        Transaction transaction = new Transaction(trader,100);
        FraudDetectionResult result = fraudDetector.isFraud(transaction);
        assertFalse(result.isFraud());
        assertNull(result.getRuleName());
    }


}
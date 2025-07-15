package org.javaguru.student_vitalii_lutsenko.project_3.task_11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FraudDetectorTest {

   private final FraudDetector fraudDetector = new FraudDetector();

    @Test
     void notFraudNameDifferentPokemon(){
        Trader trader = new Trader("Latish","Riga","Latvia");
        Transaction transaction = new Transaction(trader, 55555);
        assertFalse(fraudDetector.isFraud(transaction));
    }
    @Test
    void nameTestWithoutPokemon(){
        Trader trader = new Trader("Latish","Riga","Latvia");
        Transaction transaction = new Transaction(trader,10000);
        assertFalse(fraudDetector.isFraud(transaction));
    }
    @Test
    void nameTestWithPokemon(){
        Trader trader = new Trader("Pokemon","Riga","Latvia");
        Transaction transaction = new Transaction(trader,10000);
        assertTrue(fraudDetector.isFraud(transaction));
    }
    @Test
    void amountTestUpTo1m(){
        Trader trader = new Trader("Latish","Riga","latvia");
        Transaction transaction = new Transaction(trader,1000009);
        assertTrue(fraudDetector.isFraud(transaction));
    }
    @Test
    void amountTestOver1m(){
        Trader trader = new Trader("Latish","Riga","Latvia");
        Transaction transaction = new Transaction(trader,999999);
        assertFalse(fraudDetector.isFraud(transaction));
    }
    @Test
    void cityTestWithSydney(){
        Trader trader = new Trader("Latish","Sydney","Latvia");
        Transaction transaction = new Transaction(trader,100);
        assertTrue(fraudDetector.isFraud(transaction));
    }
    @Test
    void cityTestWithoutSydney(){
        Trader trader = new Trader("Latish","Saldus","Latvia");
        Transaction transaction = new Transaction(trader,100);
        assertFalse(fraudDetector.isFraud(transaction));
    }



}
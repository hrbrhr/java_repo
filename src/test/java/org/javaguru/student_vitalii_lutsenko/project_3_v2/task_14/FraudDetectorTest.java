package org.javaguru.student_vitalii_lutsenko.project_3_v2.task_14;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FraudDetectorTest {

    private final FraudDetector fraudDetector = new FraudDetector();

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
    void amountTestUpTo1000k(){
        Trader trader = new Trader("Latish","Riga","Latvia");
        Transaction transaction = new Transaction(trader,1000009);
        assertTrue(fraudDetector.isFraud(transaction));
    }
    @Test
    void amountTestOver1000k(){
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

    @org.junit.jupiter.api.Test
    void countryTestFromJamaica() {
        Trader trader = new Trader("Rastaman","Kingston","Jamaica");
        Transaction transaction = new Transaction(trader,20000);
        assertTrue(fraudDetector.isFraud(transaction));

    }
    @Test
    void countryTestWithoutJamaica() {
        Trader trader = new Trader("Rastaman","Kingston","Bali");
        Transaction transaction = new Transaction(trader,20000);
        assertFalse(fraudDetector.isFraud(transaction));
    }
    @Test
    void countryGermanyAndAmountUpTo1k () {
        Trader trader = new Trader("Freek","Berlin","Germany");
        Transaction transaction = new Transaction(trader,1001);
        assertTrue(fraudDetector.isFraud(transaction));
    }
    @Test
    void countryGermanyAndAmountOver1k () {
        Trader trader = new Trader("Freek","Berlin","Germany");
        Transaction transaction = new Transaction(trader,999);
        assertFalse(fraudDetector.isFraud(transaction));
    }

}


package org.javaguru.student_elena_tiutiunnikova.project_3_fraud_detector;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FraudDetectorTest {

    FraudDetector fraudDetector = new FraudDetector();

    @Test
    public void testTraderPocemonShouldBeFraud () {
        Trader trader = new Trader("Pocemon", "Tokyo", "Japan");
        Transaction transaction = new Transaction(trader, 10);
        assertTrue(fraudDetector.isFraud(transaction).isFraud());
    }

    @Test
    public void testOtherTraderShouldNotBeFraud () {
        Trader trader = new Trader("Mouse", "Minsk", "Belarus");
        Transaction transaction = new Transaction(trader, 10);
        assertFalse(fraudDetector.isFraud(transaction).isFraud());
    }

    @Test
    public void testSumOver1mlnShouldBeFraud () {
        Trader trader = new Trader("Mouse", "Minsk", "Belarus");
        Transaction transaction = new Transaction(trader, 1000001);
        assertTrue(fraudDetector.isFraud(transaction).isFraud());
    }

    @Test
    public void testSumUnder1mlnShouldNotBeFraud () {
        Trader trader = new Trader("Mouse", "Minsk", "Belarus");
        Transaction transaction = new Transaction(trader, 999999);
        assertFalse(fraudDetector.isFraud(transaction).isFraud());
    }

    @Test
    public void testCitySydneyShouldBeFraud () {
        Trader trader = new Trader("Mouse", "Minsk", "Belarus");
        Transaction transaction = new Transaction(trader, 1000);
        assertFalse(fraudDetector.isFraud(transaction).isFraud());
    }

    @Test
    public void testOtherCitiesShouldNotBeFraud () {
        Trader trader = new Trader("Mouse", "Minsk", "Belarus");
        Transaction transaction = new Transaction(trader, 1000);
        assertFalse(fraudDetector.isFraud(transaction).isFraud());
    }

    @Test
    public void testCountryJamaicaShouldBeFraud () {
        Trader trader = new Trader("Mouse", "Minsk", "Jamaica");
        Transaction transaction = new Transaction(trader, 1000);
        assertTrue(fraudDetector.isFraud(transaction).isFraud());
    }

    @Test
    public void testOtherCountriesShouldNotBeFraud () {
        Trader trader = new Trader("Mouse", "Minsk", "Belarus");
        Transaction transaction = new Transaction(trader, 1000);
        assertFalse(fraudDetector.isFraud(transaction).isFraud());
    }

    @Test
    public void testCountryGermanyUnder1000ShouldBeFraud () {
        Trader trader = new Trader("Mouse", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 1001);
        assertTrue(fraudDetector.isFraud(transaction).isFraud());
    }

    @Test
    public void testCountryGermanyLess1000ShouldNotBeFraud () {
        Trader trader = new Trader("Mouse", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 1000);
        assertFalse(fraudDetector.isFraud(transaction).isFraud());
    }

}
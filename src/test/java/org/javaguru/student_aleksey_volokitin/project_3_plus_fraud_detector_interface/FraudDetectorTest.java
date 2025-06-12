package org.javaguru.student_aleksey_volokitin.project_3_plus_fraud_detector_interface;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FraudDetectorTest {

    // Rule 1:
    // Транзакции имен трейдеров из списка и суммой выше порогового значения должны быть отклонены:
    //    - Имя трейдера "Pokemon", пороговая сумма 0.
    //    - Имя трейдера "Aleks",   пороговая сумма 100000.
    //    - Имя трейдера "Dmitry",  пороговая сумма 1000.
    //
    // Rule 2:
    // Все транзакции на сумму больше 1000000 должны быть отклонены.
    //
    // Rule 3:
    // Транзакции трейдеров из городов из списка и суммой выше порогового значения должны быть отклонены:
    //    - Город "Sidney",     пороговая сумма 0.
    //    - Город "London",     пороговая сумма 1000.
    //    - Город "California", пороговая сумма 10000.
    //
    // Rule 4: все транзакции от трейдеров из страны из списка должны быть отклонены:
    //    - Страна "Jamaica", пороговая сумма 100.
    //    - Страна "USA",     пороговая сумма 50000.
    //    - Старна "UK",      пороговая сумма 100000.
    //
    // Rule 5: всех трейдеров имя которых начинается на "LOL-" из страны "Japan"
    //    признавать мошенниками, все их транзакции должны быть отклонены.
    //    - Имя трейдера начинается на "LOL-", страна "Japan";
    //    - Имя трейдера начинается на "INT-", страна "France";
    //    - Имя трейдера начинается на "COS-", страна "UK";

    @Test
    void rule1test1() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Pokemon", "Chita", "Russia");
        Transaction transaction = new Transaction(trader, 1000);

        boolean expectedResult = true;
        boolean actualResult = fraudDetector.isFraud(transaction);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void rule1test2() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("dJ", "Vladivostok", "Russia");
        Transaction transaction = new Transaction(trader, 10);

        boolean expectedResult = true;
        boolean actualResult = fraudDetector.isFraud(transaction);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void rule1test3() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Aleks", "Chita", "Russia");
        Transaction transaction = new Transaction(trader, 500);

        boolean expectedResult = false;
        boolean actualResult = fraudDetector.isFraud(transaction);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void rule1test4() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Aleks", "Chita", "Russia");
        Transaction transaction = new Transaction(trader, 100000);

        boolean expectedResult = false;
        boolean actualResult = fraudDetector.isFraud(transaction);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void rule1test5() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Aleks", "Chita", "Russia");
        Transaction transaction = new Transaction(trader, 100001);

        boolean expectedResult = true;
        boolean actualResult = fraudDetector.isFraud(transaction);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void rule1test6() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Dmitry", "Chita", "Russia");
        Transaction transaction = new Transaction(trader, 1000);

        boolean expectedResult = false;
        boolean actualResult = fraudDetector.isFraud(transaction);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void rule1test7() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Dmitry", "Chita", "Russia");
        Transaction transaction = new Transaction(trader, 1001);

        boolean expectedResult = true;
        boolean actualResult = fraudDetector.isFraud(transaction);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void rule2test1() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Sergey", "Moscow", "Russia");
        Transaction transaction = new Transaction(trader, 1000000);

        boolean expectedResult = false;
        boolean actualResult = fraudDetector.isFraud(transaction);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void rule2test2() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Sergey", "Moscow", "Russia");
        Transaction transaction = new Transaction(trader, 1000001);

        boolean expectedResult = true;
        boolean actualResult = fraudDetector.isFraud(transaction);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void rule3test1() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Kostya", "Sidney", "Australia");
        Transaction transaction = new Transaction(trader, 1);

        boolean expectedResult = true;
        boolean actualResult = fraudDetector.isFraud(transaction);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void rule3test2() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Mark", "London", "UK");
        Transaction transaction = new Transaction(trader, 1000);

        boolean expectedResult = false;
        boolean actualResult = fraudDetector.isFraud(transaction);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void rule3test3() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Mark", "London", "UK");
        Transaction transaction = new Transaction(trader, 1001);

        boolean expectedResult = true;
        boolean actualResult = fraudDetector.isFraud(transaction);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void rule3test4() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("John", "cAlifornia", "USA");
        Transaction transaction = new Transaction(trader, 10000);

        boolean expectedResult = false;
        boolean actualResult = fraudDetector.isFraud(transaction);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void rule3test5() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("John", "cAlifornia", "USA");
        Transaction transaction = new Transaction(trader, 10001);

        boolean expectedResult = true;
        boolean actualResult = fraudDetector.isFraud(transaction);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void rule4test1() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("John", "Jakarta", "Jamaica");
        Transaction transaction = new Transaction(trader, 10);

        boolean expectedResult = false;
        boolean actualResult = fraudDetector.isFraud(transaction);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void rule4test2() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("John", "Jakarta", "Jamaica");
        Transaction transaction = new Transaction(trader, 101);

        boolean expectedResult = true;
        boolean actualResult = fraudDetector.isFraud(transaction);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void rule4test3() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("John", "New York", "USA");
        Transaction transaction = new Transaction(trader, 50000);

        boolean expectedResult = false;
        boolean actualResult = fraudDetector.isFraud(transaction);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void rule4test5() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("John", "New York", "USA");
        Transaction transaction = new Transaction(trader, 50001);

        boolean expectedResult = true;
        boolean actualResult = fraudDetector.isFraud(transaction);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void rule4tes6() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Mike", "Birmingham", "UK");
        Transaction transaction = new Transaction(trader, 100000);

        boolean expectedResult = false;
        boolean actualResult = fraudDetector.isFraud(transaction);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void rule4tes7() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Mike", "Birmingham", "UK");
        Transaction transaction = new Transaction(trader, 100001);

        boolean expectedResult = true;
        boolean actualResult = fraudDetector.isFraud(transaction);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void rule5tes1() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("lolyori", "Tokyo", "Japan");
        Transaction transaction = new Transaction(trader, 10000);

        boolean expectedResult = false;
        boolean actualResult = fraudDetector.isFraud(transaction);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void rule5tes2() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("lol-yori", "Tokyo", "Japan");
        Transaction transaction = new Transaction(trader, 10000);

        boolean expectedResult = true;
        boolean actualResult = fraudDetector.isFraud(transaction);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void rule5tes3() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("lol-ori", "Paris", "France");
        Transaction transaction = new Transaction(trader, 10000);

        boolean expectedResult = false;
        boolean actualResult = fraudDetector.isFraud(transaction);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void rule5tes4() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("iNt-ori", "Paris", "France");
        Transaction transaction = new Transaction(trader, 10000);

        boolean expectedResult = true;
        boolean actualResult = fraudDetector.isFraud(transaction);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void rule5tes5() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("COS-ori", "Birmingham", "France");
        Transaction transaction = new Transaction(trader, 10000);

        boolean expectedResult = false;
        boolean actualResult = fraudDetector.isFraud(transaction);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void rule5tes6() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("COS-ori", "Birmingham", "UK");
        Transaction transaction = new Transaction(trader, 10000);

        boolean expectedResult = true;
        boolean actualResult = fraudDetector.isFraud(transaction);
        assertEquals(expectedResult, actualResult);
    }
}